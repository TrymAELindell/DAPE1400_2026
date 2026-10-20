// Reference solution for exercise 33.
//
// The program prints four fixed lines once, for one evening that is already
// planned. Four println statements in main are the whole job. A class with
// fields would also produce this output, and so would a static utility
// method. Both add structure that nothing here uses again. The keyword
// static is tempting exactly because it is this week's topic. It is useful
// when a value is shared between objects or a method is called from several
// places. This program has neither an object nor a second caller. What
// would it have cost? A reader would have to open a second class to find
// four fixed strings.
public class Main {
    public static void main(String[] args) {
        System.out.println("Velkommen til Fagkvelden");
        System.out.println("Solveig Aune");
        System.out.println("Aune Regnskap AS");
        System.out.println("Kveldens vert");
    }
}
