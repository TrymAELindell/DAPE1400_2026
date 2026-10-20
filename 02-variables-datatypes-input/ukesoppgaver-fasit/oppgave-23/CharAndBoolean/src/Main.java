// Reference solution for exercise 23 — the snippet the exercise asks about.
public class Main {
    public static void main(String[] args) {
        char first = 'O';
        char last = 'O';
        boolean ofAge = true;

        // A char is stored as its character code, so + adds two numbers here.
        System.out.println(first + last);          // 158

        // The empty string makes the whole expression text, so + concatenates.
        System.out.println("" + first + last);     // OO

        System.out.println("Myndig: " + ofAge);    // Myndig: true
    }
}
