// Reference solution for exercise 21 — the snippet the exercise asks about.
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // = means "is set to", and the right-hand side is evaluated first,
        // so a gets the value 3. The two variables stay independent.
        a = b;
        b = 10;

        System.out.println(a + " " + b);   // 3 10
    }
}
