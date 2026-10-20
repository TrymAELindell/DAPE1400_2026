import javax.swing.JOptionPane;

// Reference solution for exercise 15.
public class Main {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Skriv inn alderen din (heltall)");

        int age;
        try {
            age = Integer.parseInt(ageInput);
        } catch (Exception e) {
            age = 0;
            JOptionPane.showMessageDialog(null,
                    "Du skrev ikke inn et heltall — alderen er satt til 0");
        }

        JOptionPane.showMessageDialog(null, "Min alder er " + age + " år.");
    }
}
