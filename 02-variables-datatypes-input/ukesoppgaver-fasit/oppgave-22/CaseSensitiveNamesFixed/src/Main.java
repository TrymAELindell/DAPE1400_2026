// Reference solution for exercise 22: the corrected program. The original
// declared lastname but used lastName, and Java treats those as two
// different names, so the program did not compile.
public class Main {
    public static void main(String[] args) {
        String firstName = "Ole";
        String lastName = "Olsen";
        System.out.println("Hei " + firstName + " " + lastName);
    }
}
