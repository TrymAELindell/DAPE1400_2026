import static javax.swing.JOptionPane.*;

// Reference solution for exercise 1.
public class Main {
    public static void main(String[] args) {
        String input = showInputDialog("Skriv inn alderen din:");
        int age;
        try {
            age = Integer.parseInt(input);
        } catch (Exception e) {
            age = 0;
            showMessageDialog(null, "Du skrev ikke inn et heltall — alderen er satt til 0");
        }

        if (age >= 18 && age <= 20) {
            showMessageDialog(null,
                    "Du er myndig, men kan ikke kjøpe alkohol med mer enn 22 % på polet");
        } else {
            showMessageDialog(null,
                    "Du er enten umyndig, eller så kan du kjøpe hva du vil på polet");
        }
    }
}
