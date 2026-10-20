// Reference solution for exercise 32.
//
// Koden fra oppgaven, gjort kjørbar. Når participants > 0 er usann, blir
// høyre side av && aldri evaluert, så divisjonen med null skjer aldri.
public class Main {
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
