// Reference solution for exercise 40 (Del 3).
public class Main {
    public static void main(String[] args) {
        // En array passer her. Uka har alltid sju målinger, og programmet må gå
        // gjennom dem to ganger, først for gjennomsnittet og så for å telle dagene.
        // Sju vanlige variabler ville også virket. Men da må summen og alle de sju
        // sammenlikningene skrives for hånd.
        // En ArrayList ville også virket, men den gir ingenting ekstra når antallet
        // aldri endrer seg.
        int[] temperatures = {4, 7, 5, 9, 11, 8, 6};

        int sum = 0;
        for (int temperature : temperatures) {
            sum += temperature;
        }
        double average = (double) sum / temperatures.length;

        int warmerDays = 0;
        for (int temperature : temperatures) {
            if (temperature > average) {
                warmerDays++;
            }
        }

        System.out.println("Gjennomsnitt: " + average);
        System.out.println("Dager over gjennomsnittet: " + warmerDays);
    }
}
