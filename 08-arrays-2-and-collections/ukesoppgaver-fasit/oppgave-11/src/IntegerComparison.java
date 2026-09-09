// Reference solution for exercise 11 (discovery drill): == between two Integer objects compares
// references, not content, so two separate objects holding 1000 give
// false. Content equality between wrapper objects is checked with equals,
// exactly as for String.
public class IntegerComparison {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
