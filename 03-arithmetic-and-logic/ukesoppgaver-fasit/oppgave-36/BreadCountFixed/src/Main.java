// Reference solution for exercise 36 - the corrected program.
// The bug: (int) doughDl casts only the value right behind it, so the
// division became int / double, which gives a double - and a double does not
// fit in an int. The parentheses make the division happen first.
public class Main {
    public static void main(String[] args) {
        double doughDl = 11;
        double doughPerBread = 2.5;
        int breadCount = (int) (doughDl / doughPerBread);
        System.out.println("Du kan bake " + breadCount + " brød");   // 4
    }
}
