// Reference solution for exercise 38: the program from the handout, runnable. break
// rowLoop leaves the outer loop, so the first free seat wins.
public class FirstFreeSeat {
    public static void main(String[] args) {
        boolean[][] seats = {
            {true, true},
            {true, false},
            {false, false}
        };

        String found = "ingen ledige plasser";

        rowLoop:
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                if (!seats[row][col]) {
                    found = "rad " + row + ", plass " + col;
                    break rowLoop;
                }
            }
        }

        System.out.println(found);
    }
}
