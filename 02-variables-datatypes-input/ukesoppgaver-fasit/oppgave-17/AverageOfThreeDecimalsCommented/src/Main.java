import javax.swing.JOptionPane;

/* Reference solution for exercise 17: the program from exercise 13, now
   commented. It reads three decimal numbers from the user, adds them up and
   calculates the average, and shows both results in a message dialog and in
   the terminal. */
public class Main {
    public static void main(String[] args) {
        String input1 = JOptionPane.showInputDialog("Skriv inn det første desimaltallet");
        String input2 = JOptionPane.showInputDialog("Skriv inn det andre desimaltallet");
        String input3 = JOptionPane.showInputDialog("Skriv inn det tredje desimaltallet");

        double number1;
        double number2;
        double number3;
        try {
            // The dialog always hands back a String, so the values have to be
            // converted before they can be added up.
            number1 = Double.parseDouble(input1);
            number2 = Double.parseDouble(input2);
            number3 = Double.parseDouble(input3);
        } catch (Exception e) {
            number1 = 0;
            number2 = 0;
            number3 = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn tall — verdiene er satt til 0");
        }

        double sum = number1 + number2 + number3;
        double average = sum / 3.0;

        String output = "Summen av de tre tallene er " + sum
                + "\nGjennomsnittet er " + average;
        JOptionPane.showMessageDialog(null, output);
        System.out.println(output);
    }
}
