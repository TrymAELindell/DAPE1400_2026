// Reference solution for exercise 32: the snippet from the handout, runnable. The left side
// of && guards the division: when participants > 0 is false, the right
// side is never evaluated, so dividing by zero never happens.
public class ShortCircuitGuard {
    public static void main(String[] args) {
        int participants = 0;
        int totalScore = 480;
        if (participants > 0 && totalScore / participants > 50) {
            System.out.println("Høyt snitt");
        } else {
            System.out.println("Ingen deltakere ennå");
        }
    }
}
