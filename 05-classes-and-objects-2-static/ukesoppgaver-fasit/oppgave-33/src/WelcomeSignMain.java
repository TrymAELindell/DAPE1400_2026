// Reference solution for exercise 33.
//
// Four fixed lines, printed once, for one evening that has already been
// planned: four println statements in main are the whole job. A class
// with fields would also produce this output, and a static utility method
// would too - and both buy machinery that nothing here reuses. The week's
// new keyword is the tempting answer precisely because it is the week's
// topic; static earns its place when a value is shared between objects or
// a method is called from several places, and this program has neither an
// object nor a second caller. What would it have cost? A reader would
// have to open a second class to find four literal strings.
public class WelcomeSignMain {
    public static void main(String[] args) {
        System.out.println("Velkommen til Fagkvelden");
        System.out.println("Solveig Aune");
        System.out.println("Aune Regnskap AS");
        System.out.println("Kveldens vert");
    }
}
