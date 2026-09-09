import javax.swing.JOptionPane;

// Reference solution for exercise 31 (Del 4): score collection for
// Ingrid's film club — reads the scores, tolerates invalid input, and
// shows the average per film and the winner of the evening.
public class FilmClubScores {

    public static boolean isValidScore(int score) {
        return score >= 0 && score <= 9;
    }

    // Asks until the user enters a valid integer within [min, max].
    private static int readIntBetween(String prompt, int min, int max) {
        while (true) {
            String input = JOptionPane.showInputDialog(prompt);
            try {
                int value = Integer.parseInt(input);
                if (value >= min && value <= max) {
                    return value;
                }
                JOptionPane.showMessageDialog(null, "Tallet må være mellom " + min + " og " + max);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Du må skrive inn et heltall");
            }
        }
    }

    public static int winnerIndex(double[] averages) {
        // Assumption: if two films tie for the best average, the first of
        // them counts as the winner of the evening.
        int winner = 0;
        for (int film = 1; film < averages.length; film++) {
            if (averages[film] > averages[winner]) {
                winner = film;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        // Assumption: Ingrid first enters how many members are scoring and
        // how many films were shown; the counts vary per evening.
        int nrOfMembers = readIntBetween("Hvor mange medlemmer gir poeng?", 1, 100);
        int nrOfFilms = readIntBetween("Hvor mange filmer ble vist?", 1, 10);

        // Assumption: the laptop is passed around once per film, so all
        // members score film 1 before anyone scores film 2.
        int[][] scores = new int[nrOfMembers][nrOfFilms];
        for (int film = 0; film < nrOfFilms; film++) {
            for (int member = 0; member < nrOfMembers; member++) {
                scores[member][film] = readIntBetween(
                        "Film " + (film + 1) + " — poeng fra medlem " + (member + 1) + " (0-9):", 0, 9);
            }
        }

        double[] averages = MovieScoreAverages.columnAverages(scores);
        int winner = winnerIndex(averages);

        String result = "";
        for (int film = 0; film < averages.length; film++) {
            result += "Film " + (film + 1) + ": " + averages[film] + " — ";
        }
        result += "Kveldens vinner er film " + (winner + 1);

        JOptionPane.showMessageDialog(null, result);
    }
}
