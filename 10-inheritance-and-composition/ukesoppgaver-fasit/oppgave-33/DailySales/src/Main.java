import java.util.ArrayList;

// Reference solution for exercise 33 (Del 3): the highest sale and the average.
public class Main {
    public static void main(String[] args) {
        // En ArrayList med én loop passer her. Kafeen har et nytt antall salg hver dag,
        // og en ArrayList tar imot så mange salg som dagen gir.
        // En array ville også virket for de seks salgene i dag. Men en array har en fast
        // størrelse, så den må lages på nytt med riktig lengde hver dag.
        // Seks vanlige variabler ville låst programmet til nøyaktig seks salg. Da må også
        // hver sammenligning og summen skrives for hånd.
        ArrayList<Integer> sales = new ArrayList<>();
        sales.add(42);
        sales.add(55);
        sales.add(38);
        sales.add(55);
        sales.add(63);
        sales.add(47);

        int highest = sales.get(0);
        int sum = 0;
        for (int sale : sales) {
            if (sale > highest) {
                highest = sale;
            }
            sum += sale;
        }
        double average = (double) sum / sales.size();

        System.out.println("Høyeste salg: " + highest + " kr");
        System.out.println("Gjennomsnitt: " + average + " kr");
    }
}
