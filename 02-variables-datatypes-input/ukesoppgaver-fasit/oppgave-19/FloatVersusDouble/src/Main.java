/* Reference solution for exercise 19. It stores the same number as a float
   and as a double and prints both. double is the sensible default in this
   course: it keeps roughly twice as many digits, and the memory a float
   saves does not matter in programs of this size. */
public class Main {
    public static void main(String[] args) {
        float lessPrecise = 1.123456789123456789f;
        double morePrecise = 1.123456789123456789;

        System.out.println("float:  " + lessPrecise);    // 8 digits survive
        System.out.println("double: " + morePrecise);    // 17 digits survive
    }
}
