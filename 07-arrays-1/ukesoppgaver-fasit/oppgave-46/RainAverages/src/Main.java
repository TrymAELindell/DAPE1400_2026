// Reference solution for exercise 46.
//
// Denne løsningen lagrer målingene i en todimensjonal array med én rad per
// stasjon. Én loop regner da ut gjennomsnittet for hver stasjon med den
// samme koden. En annen god løsning er tre separate arrayer, én per stasjon.
// Koden for gjennomsnittet må da kjøre tre ganger, én gang for hvert
// arraynavn. En fjerde stasjon betyr ny kode.
public class Main {
    public static void main(String[] args) {
        String[] stations = {"Blindern", "Bergen", "Tromsø"};
        double[][] rainfall = {
            {2.0, 0.0, 5.5, 1.5, 0.0, 3.0, 2.0},
            {8.0, 12.5, 6.0, 9.5, 15.0, 7.0, 12.0},
            {1.0, 3.5, 0.0, 2.5, 4.0, 0.0, 3.0}
        };

        for (int station = 0; station < rainfall.length; station++) {
            double sum = 0;
            for (double measurement : rainfall[station]) {
                sum += measurement;
            }
            double average = sum / rainfall[station].length;
            System.out.println(stations[station] + ": " + average + " mm i snitt");
        }
    }
}
