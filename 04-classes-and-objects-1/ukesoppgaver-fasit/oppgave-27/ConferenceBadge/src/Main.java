// Reference solution for exercise 27.
//
// The program prints four fixed lines once, for one guest, so plain println
// statements are the whole job. A class with fields, a constructor and a
// print method would also produce this output. But for a single badge with
// values that never change, that is three extra parts with no reuse. The
// class becomes useful when there is a second guest with the same shape.
// That is exactly the situation in exercise 28.
public class Main {
    public static void main(String[] args) {
        System.out.println("JavaDagen");
        System.out.println("Ada Lovelace");
        System.out.println("Analytical Engines AS");
        System.out.println("Foredragsholder");
    }
}
