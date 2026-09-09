import static javax.swing.JOptionPane.*;

// Reference solution for exercise 4: three outcomes with an else-if chain.
public class DrivingAgeMedicalCheck {
    public static void main(String[] args) {
        int medicalCheckAge = 70;

        String input = showInputDialog("Skriv inn alderen din:");
        int age = Integer.parseInt(input);

        if (age < 18) {
            showMessageDialog(null, "Du er for ung til å ta førerkort for bil");
        } else if (age < medicalCheckAge) {
            showMessageDialog(null,
                    "Du kan ta førerkort for bil, og du trenger ikke legeattest");
        } else {
            showMessageDialog(null,
                    "Du er absolutt gammel nok til å kjøre bil, men må ha legeattest");
        }
    }
}
