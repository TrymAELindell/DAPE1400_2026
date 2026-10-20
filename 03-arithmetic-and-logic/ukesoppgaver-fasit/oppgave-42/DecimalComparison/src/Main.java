// Reference solution for exercise 42 - the program the exercise asks about.
public class Main {
    public static void main(String[] args) {
        double sum = 0.1 + 0.2;
        System.out.println(sum);          // 0.30000000000000004
        // == demands an exact match, and the sum lands just above 0.3.
        System.out.println(sum == 0.3);   // false
    }
}
