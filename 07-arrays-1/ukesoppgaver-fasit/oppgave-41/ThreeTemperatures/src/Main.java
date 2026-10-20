// Reference solution for exercise 41.
//
// Denne løsningen bruker tre vanlige double-variabler. Tre faste verdier
// trenger bare to addisjoner og to sammenlikninger. En annen god løsning er
// en array med en loop, som er ukas mønster. Med bare tre verdier gir loopen
// mer kode, men ingen gevinst. Arrayen er det beste valget først når
// antallet verdier vokser.
public class Main {
    public static void main(String[] args) {
        double morning = -3.0;
        double midday = 4.5;
        double evening = 1.5;

        double average = (morning + midday + evening) / 3;

        double highest = morning;
        if (midday > highest) {
            highest = midday;
        }
        if (evening > highest) {
            highest = evening;
        }

        System.out.println("Gjennomsnitt: " + average);
        System.out.println("Høyest: " + highest);
    }
}
