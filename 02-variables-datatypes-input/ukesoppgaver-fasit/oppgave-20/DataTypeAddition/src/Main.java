// Reference solution for exercise 20 — the snippet the exercise asks about.
public class Main {
    public static void main(String[] args) {
        int number1 = 23;
        int number2 = 5;
        System.out.println(number1 + number2);   // 28 - both sides are numbers

        String text1 = "23";
        String text2 = "5";
        System.out.println(text1 + text2);       // 235 - both sides are text
        System.out.println(text1 + number2);     // 235 - text on the left wins
    }
}
