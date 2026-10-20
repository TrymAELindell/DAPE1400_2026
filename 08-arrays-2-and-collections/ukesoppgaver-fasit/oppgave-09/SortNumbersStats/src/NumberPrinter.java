import java.util.ArrayList;

// Reference solution for exercise 9: print a list of integers on one line after a heading.
public class NumberPrinter {

    public static void printOnOneLine(String heading, ArrayList<Integer> list) {
        System.out.print(heading);
        for (int number : list) {
            System.out.print(" " + number);
        }
        System.out.println();
    }
}
