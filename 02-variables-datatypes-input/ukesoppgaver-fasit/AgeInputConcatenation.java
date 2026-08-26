import javax.swing.JOptionPane;

// Reference solution for exercise 24. The first print is the snippet the
// exercise asks about; the second is the correction from the answer.
public class AgeInputConcatenation {
    public static void main(String[] args) {
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");

        // The dialog hands back a String, so + appends the character 1
        // instead of adding one: input 20 prints "Om ett år er du 201 år".
        System.out.println("Om ett år er du " + ageInput + 1 + " år");

        // Converted first, the addition is real arithmetic. The parentheses
        // keep the + from being read as concatenation.
        int age = Integer.parseInt(ageInput);
        System.out.println("Om ett år er du " + (age + 1) + " år");
    }
}
