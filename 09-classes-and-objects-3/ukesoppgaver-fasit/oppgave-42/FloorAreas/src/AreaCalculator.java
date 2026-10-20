// Reference solution for exercise 42 (Del 3): the area of a square or a rectangular room.
public class AreaCalculator {

    // To overloadede metoder som begge heter computeArea, passer her. Det er
    // den samme jobben, å regne ut et areal, bare med ett eller to mål inn.
    // To metoder med forskjellige navn, som computeSquareArea og
    // computeRectangleArea, ville også virket. Men da må den som kaller dem,
    // huske to navn for én jobb.
    // Én metode med bredde og lengde ville også virket, men da må hvert
    // kvadratiske rom få den samme siden to ganger.
    public static double computeArea(double side) {
        return side * side;
    }

    public static double computeArea(double width, double length) {
        return width * length;
    }
}
