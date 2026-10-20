import java.util.Random;

/**
 * Renders an ASCII-art space rocket launching in the terminal.
 *
 * Usage:
 *     Rocket rocket = new Rocket();
 *     rocket.launch();
 *
 * The animation uses ANSI escape codes to redraw the screen. These work in
 * most real terminals (macOS Terminal, iTerm2, Linux terminals, Windows
 * Terminal), but usually not in IDE consoles such as IntelliJ's or Eclipse's.
 */
public class Rocket {

    private static final String[] BODY = {
            "    /\\    ",
            "   /  \\   ",
            "  |    |  ",
            "  | () |  ",
            "  | () |  ",
            "  |    |  ",
            " /|    |\\ ",
            "/_|____|_\\"
    };

    // Three flame frames that are cycled to make the exhaust flicker.
    private static final String[][] FLAMES = {
            {
                    "   (  )   ",
                    "    )(    ",
                    "    ''    "
            },
            {
                    "   )  (   ",
                    "   ( )(   ",
                    "    ..    "
            },
            {
                    "  ( )( )  ",
                    "   )  (   ",
                    "    ::    "
            }
    };

    // Smoke clouds on the launch pad, from none to heavy.
    private static final String[] SMOKE = {
            "",
            " (  ) ",
            "~( ~  ) (~ )~",
            "(~ ( ~  ~) (~ ) ~)"
    };

    private static final String CLEAR_SCREEN = "\033[2J";
    private static final String CURSOR_HOME = "\033[H";
    private static final String HIDE_CURSOR = "\033[?25l";
    private static final String SHOW_CURSOR = "\033[?25h";

    private final int width;
    private final int height;
    private final char[][] sky;

    /** Creates a rocket that draws on a 60 x 24 character screen. */
    public Rocket() {
        this(60, 24);
    }

    /** Creates a rocket that draws on a screen of the given size (in characters). */
    public Rocket(int width, int height) {
        if (width < BODY[0].length() + 2 || height < BODY.length + 6) {
            throw new IllegalArgumentException("Screen is too small for the rocket.");
        }
        this.width = width;
        this.height = height;
        this.sky = createSky(new Random(42));
    }

    /** Runs the launch sequence: ignition followed by liftoff. */
    public void launch() {
        // Clear once at the start; after that every frame is drawn over the
        // previous one in place, which avoids flicker and scrolling.
        System.out.print(HIDE_CURSOR + CLEAR_SCREEN + CURSOR_HOME);
        try {
            ignition();
            liftoff();
            drawFrame(-100, null, "The rocket has reached orbit!", ground(0));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            System.out.print("\n" + SHOW_CURSOR);
            System.out.flush();
        }
    }

    // ---------------------------------------------------------------
    // Launch phases
    // ---------------------------------------------------------------

    private int restingTop() {
        // The rocket's bottom sits just above the ground row.
        return height - 1 - BODY.length;
    }

    private void ignition() throws InterruptedException {
        for (int frame = 0; frame < 12; frame++) {
            int smoke = 1 + frame / 6;  // smoke builds up
            drawFrame(restingTop(), FLAMES[frame % FLAMES.length], "Ignition!", ground(smoke));
            Thread.sleep(120);
        }
    }

    private void liftoff() throws InterruptedException {
        int start = restingTop();
        int end = -(BODY.length + FLAMES[0].length);  // fully off the top of the screen
        int step = 0;

        for (int top = start; top > end; top--) {
            String caption = step < 3
                    ? "LIFTOFF!"
                    : "Altitude: " + (step * 100) + " m";
            int smoke = step < 8 ? 3 : step < 14 ? 2 : step < 20 ? 1 : 0;  // smoke clears

            drawFrame(top, FLAMES[step % FLAMES.length], caption, ground(smoke));

            // The rocket accelerates: each frame is shown a little shorter.
            Thread.sleep(Math.max(30, 200 - step * 12));
            step++;
        }
    }

    // ---------------------------------------------------------------
    // Drawing
    // ---------------------------------------------------------------

    private void drawFrame(int rocketTop, String[] flames, String caption, String ground) {
        char[][] canvas = new char[height][];
        for (int row = 0; row < height; row++) {
            canvas[row] = sky[row].clone();
        }

        int left = (width - BODY[0].length()) / 2;
        drawLines(canvas, BODY, rocketTop, left, false);
        if (flames != null) {
            drawLines(canvas, flames, rocketTop + BODY.length, left, true);
        }
        drawCentered(canvas, height - 1, ground);
        drawCentered(canvas, 0, caption);

        // Jump back to the top-left corner and overwrite the previous frame.
        // No newline after the last row, so the terminal never scrolls.
        StringBuilder out = new StringBuilder(CURSOR_HOME);
        for (int row = 0; row < height; row++) {
            out.append(canvas[row]);
            if (row < height - 1) {
                out.append('\n');
            }
        }
        System.out.print(out);
        System.out.flush();
    }

    /** Copies lines onto the canvas, skipping anything outside the screen. */
    private void drawLines(char[][] canvas, String[] lines, int top, int left, boolean transparent) {
        for (int i = 0; i < lines.length; i++) {
            int row = top + i;
            if (row < 0 || row >= height) {
                continue;
            }
            for (int j = 0; j < lines[i].length(); j++) {
                int col = left + j;
                char c = lines[i].charAt(j);
                if (col < 0 || col >= width || (transparent && c == ' ')) {
                    continue;
                }
                canvas[row][col] = c;
            }
        }
    }

    private void drawCentered(char[][] canvas, int row, String text) {
        int left = (width - text.length()) / 2;
        drawLines(canvas, new String[] { text }, row, left, false);
    }

    /** The ground line, with a smoke cloud of the given size (0 = none) in the middle. */
    private String ground(int smokeLevel) {
        char[] line = "=".repeat(width).toCharArray();
        String smoke = SMOKE[Math.min(smokeLevel, SMOKE.length - 1)];
        int left = (width - smoke.length()) / 2;
        for (int i = 0; i < smoke.length(); i++) {
            line[left + i] = smoke.charAt(i);
        }
        return new String(line);
    }

    /** Builds a starry background. Row 0 (caption) and the ground row stay empty. */
    private char[][] createSky(Random random) {
        char[][] result = new char[height][width];
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                boolean skyRow = row > 1 && row < height - 3;
                boolean star = skyRow && random.nextInt(35) == 0;
                result[row][col] = star ? (random.nextBoolean() ? '.' : '*') : ' ';
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new Rocket().launch();
    }
}