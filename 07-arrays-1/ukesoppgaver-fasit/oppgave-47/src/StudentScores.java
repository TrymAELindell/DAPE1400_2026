// Reference solution for exercise 47.
//
// Fasit comment (the choice): this solution uses a two-dimensional
// array with one row per student, because the task reads the data
// along the rows and down the columns, and the two indexes serve both
// directions. Another good solution is one array per student; the
// column average must then name every array in step, and that code
// grows with each new student.
public class StudentScores {
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
