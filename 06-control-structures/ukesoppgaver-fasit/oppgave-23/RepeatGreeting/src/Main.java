import static javax.swing.JOptionPane.showInputDialog;

// Reference solution for exercise 23.
//
// Hilsenen skrives ut før betingelsen blir testet første gang, så den vises
// alltid minst én gang.
public class Main {
    public static void main(String[] args) {
        String answer;
        do {
            System.out.println("Hei!");
            answer = showInputDialog("En gang til? (j/n)");
        } while (answer.equals("j"));
    }
}
