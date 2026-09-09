// Reference solution for exercise 20 (discovery drill). An object array starts
// as null references, so the second line crashes on purpose.
public class NullElements {
    public static void main(String[] args) {
        String[] names = new String[3];

        System.out.println(names[0]);
        System.out.println(names[0].toUpperCase());
    }
}
