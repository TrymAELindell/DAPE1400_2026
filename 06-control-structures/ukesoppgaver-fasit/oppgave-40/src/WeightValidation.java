import static javax.swing.JOptionPane.showInputDialog;

// Reference solution for exercise 40: the snippet from the handout, runnable. The loop reads
// a weight and asks again until the answer is inside 0.1-20 kg — the
// validation pattern from the chapter.
public class WeightValidation {
    public static void main(String[] args) {
        double weight;
        do {
            String input = showInputDialog("Skriv inn vekta i kg (0,1–20):");
            weight = Double.parseDouble(input);
        } while (weight < 0.1 || weight > 20);

        System.out.println("Registrert vekt: " + weight + " kg");
    }
}
