import javax.swing.JOptionPane;

// Reference solution for exercise 7.
public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Hva heter du?");
        String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");
        int age;
        try {
            age = Integer.parseInt(ageInput);
        } catch (Exception e) {
            age = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — alderen er satt til 0");
        }

        // Assumes the person has already had their birthday this year.
        int currentYear = 2026;
        int pensionAge = 67;

        int birthYear = currentYear - age;
        int pensionYear = birthYear + pensionAge;

        String story = name + " er i dag " + age + " år. "
                + name + " er født i " + birthYear + ". "
                + "I " + pensionYear + " er " + name + " " + pensionAge
                + " år og da vil " + name + " være pensjonist.";
        JOptionPane.showMessageDialog(null, story);
    }
}
