// Reference solution for exercise 47.
//
// Denne løsningen bruker en todimensjonal array med én rad per student.
// Oppgaven leser dataene langs radene og nedover kolonnene. De to indeksene
// dekker begge retningene. En annen god løsning er én array per student.
// Gjennomsnittet for en kolonne må da nevne hver array, én etter én. Den
// koden vokser med hver ny student.
public class Main {
    public static void main(String[] args) {
        String[] students = {"Sara", "Piotr", "Ingrid"};
        int[][] scores = {
            {8, 9, 7, 10},
            {6, 8, 9, 9},
            {10, 10, 8, 8}
        };

        for (int student = 0; student < scores.length; student++) {
            int sum = 0;
            for (int score : scores[student]) {
                sum += score;
            }
            System.out.println(students[student] + ": " + sum + " poeng totalt");
        }

        for (int assignment = 0; assignment < scores[0].length; assignment++) {
            int sum = 0;
            for (int student = 0; student < scores.length; student++) {
                sum += scores[student][assignment];
            }
            double average = (double) sum / scores.length;
            System.out.println("Innlevering " + (assignment + 1) + ": " + average + " i snitt");
        }
    }
}
