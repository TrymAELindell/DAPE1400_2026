import java.util.Arrays;

// Reference solution for exercise 23 (Del 3).
public class Main {
    public static void main(String[] args) {
        // En array med Arrays.sort passer her. De fem verdiene er et fast
        // antall som aldri vokser eller krymper, så arrayen fra modul 07 er alt
        // jobben trenger. En ArrayList med Collections.sort ville også virket,
        // men den gir ingenting ekstra. Hovedgrunnen til å bruke en liste er en
        // størrelse som endrer seg, og denne størrelsen endrer seg aldri.
        // Ulempen er koden med wrapper-klasser rundt vanlige int-verdier.
        int[] numbers = {42, 7, 19, 3, 25};

        Arrays.sort(numbers);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
