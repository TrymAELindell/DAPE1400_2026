// Reference solution for exercise 31: the snippet from the handout, runnable. Without
// braces, only the first statement belongs to the if — the second runs
// unconditionally, whatever the indentation suggests.
public class BracelessIf {
    public static void main(String[] args) {
        int temperature = 12;
        if (temperature > 15)
            System.out.println("Det er varmt ute");
            System.out.println("Ta med solbriller");
        System.out.println("Ha en fin dag");
    }
}
