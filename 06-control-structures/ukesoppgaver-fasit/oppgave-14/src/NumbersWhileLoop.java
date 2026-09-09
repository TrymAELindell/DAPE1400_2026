// Reference solution for exercise 14: with while, the counter is declared before
// the loop and updated at the end of the loop body.
public class NumbersWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 9) {
            System.out.println(i);
            i++;
        }
    }
}
