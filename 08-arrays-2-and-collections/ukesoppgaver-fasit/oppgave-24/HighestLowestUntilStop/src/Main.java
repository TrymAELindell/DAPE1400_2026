import javax.swing.JOptionPane;

// Reference solution for exercise 24 (Del 3): the highest and lowest of
// the integers the user enters, until -1 ends the input.
public class Main {

    public static void main(String[] args) {
        // To variabler som holder styr på verdiene, i en do-while-loop fra
        // modul 06, passer her. Jobben trenger bare den største og den minste
        // verdien så langt, så ingenting annet er verdt å ta vare på. En
        // ArrayList, med Collections.max og Collections.min til slutt, virker
        // også. Men den lagrer hvert tall, og jobben ser aldri på de tallene
        // igjen. Listen gir en generell løsning som denne jobben ikke bruker.
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        boolean anyNumberEntered = false;

        int number = 0;
        do {
            String input = JOptionPane.showInputDialog("Skriv inn et heltall (-1 avslutter):");
            try {
                number = Integer.parseInt(input);
                if (number != -1) {
                    anyNumberEntered = true;
                    if (number > highest) {
                        highest = number;
                    }
                    if (number < lowest) {
                        lowest = number;
                    }
                }
            } catch (Exception e) {
                // number keeps its old value, which is not -1, so the loop asks again.
                JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — prøv igjen");
            }
        } while (number != -1);

        if (anyNumberEntered) {
            System.out.println("Størst: " + highest);
            System.out.println("Minst: " + lowest);
        }
    }
}
