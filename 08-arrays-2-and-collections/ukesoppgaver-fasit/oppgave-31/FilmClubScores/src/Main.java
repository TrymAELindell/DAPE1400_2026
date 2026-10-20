import javax.swing.JOptionPane;

// Reference solution for exercise 31 (Del 4): score collection for
// Ingrid's film club — reads the scores, tolerates invalid input, and
// shows the average per film and the winner of the evening.
public class Main {

    public static void main(String[] args) {
        // Assumption: Ingrid first enters how many members are scoring and
        // how many films were shown; the counts vary per evening.
        int nrOfMembers = UserInput.readIntBetween("Hvor mange medlemmer gir poeng?", 1, 100);
        int nrOfFilms = UserInput.readIntBetween("Hvor mange filmer ble vist?", 1, 10);

        // Assumption: the laptop is passed around once per film, so all
        // members score film 1 before anyone scores film 2.
        int[][] scores = new int[nrOfMembers][nrOfFilms];
        for (int film = 0; film < nrOfFilms; film++) {
            for (int member = 0; member < nrOfMembers; member++) {
                scores[member][film] = UserInput.readIntBetween(
                        "Film " + (film + 1) + " — poeng fra medlem " + (member + 1) + " (0-9):", 0, 9);
            }
        }

        double[] averages = ScoreTable.calculateColumnAverages(scores);
        int winner = ScoreTable.findWinnerIndex(averages);

        String result = "";
        for (int film = 0; film < averages.length; film++) {
            result += "Film " + (film + 1) + ": " + averages[film] + " — ";
        }
        result += "Kveldens vinner er film " + (winner + 1);

        JOptionPane.showMessageDialog(null, result);
    }
}
