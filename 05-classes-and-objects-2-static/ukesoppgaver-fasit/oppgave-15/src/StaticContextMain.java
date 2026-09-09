// Reference solution for exercise 15, the discovery drill.
//
// The version the task asks the student to try declares an ordinary field
//     private int counter = 0;
// and reads it straight from main, which gives
// "non-static variable counter cannot be referenced from a static
// context": main is static and has no object, so a field that lives in
// objects is out of its reach.
//
// This file shows the two ways out. The explanation is the Fasit.
public class StaticContextMain {
    // Way out 1: make the field static, so it lives on the class that
    // main itself belongs to.
    private static int counter = 0;

    // Way out 2: keep an ordinary field, and give main an object to
    // reach it through.
    private int instanceCounter = 0;

    public static void main(String[] args) {
        counter++;
        System.out.println("Statisk teller: " + counter);

        StaticContextMain program = new StaticContextMain();
        program.instanceCounter++;
        System.out.println("Vanlig teller, gjennom et objekt: " + program.instanceCounter);
    }
}
