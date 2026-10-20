// Reference solution for exercise 19: compare dates with == and with equals.
public class Main {
    public static void main(String[] args) {
        Date first = new Date(17, 5, 2021);
        Date second = new Date(17, 5, 2021);
        Date third = new Date(1, 3, 2015);

        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println(first.equals(third));
    }
}
