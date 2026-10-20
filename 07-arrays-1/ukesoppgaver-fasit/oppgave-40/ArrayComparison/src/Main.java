import java.util.Arrays;

// Reference solution for exercise 40.
//
// Denne løsningen bruker Arrays.equals. Regelen i oppgaven er samme
// lengde, samme verdier og samme rekkefølge, og det er akkurat det
// Arrays.equals sjekker. En annen god løsning er en for-loop som
// sammenlikner lengdene og deretter hvert par av elementer. Hvis den loopen
// stopper ett steg for tidlig eller for sent, gir den feil svar uten noen
// feilmelding.
public class Main {
    public static void main(String[] args) {
        int[] first = {2, 5, 1, 8, 2};
        int[] second = {2, 5, 1, 8, 2};

        if (Arrays.equals(first, second)) {
            System.out.println("Rekkene er like");
        } else {
            System.out.println("Rekkene er ikke like");
        }
    }
}
