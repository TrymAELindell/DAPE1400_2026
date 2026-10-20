import javax.swing.JOptionPane;

// Reference solution for exercise 10.
public class Main {
    public static void main(String[] args) {
        String numberInput = JOptionPane.showInputDialog("Skriv inn et tall mellom 0 og 1000");
        int number;
        try {
            number = Integer.parseInt(numberInput);
        } catch (Exception e) {
            number = 0;
            JOptionPane.showMessageDialog(null, "Du skrev ikke inn et heltall — tallet er satt til 0");
        }

        // number % 10 gives the last digit; number / 10 cuts it off.
        // Doing this repeatedly picks the number apart digit by digit:
        int ones = number % 10;                // 751 % 10  = 1
        int tens = number / 10 % 10;           // 751 / 10  = 75, 75 % 10 = 5
        int hundreds = number / 100 % 10;      // 751 / 100 = 7,  7 % 10  = 7

        int digitSum = hundreds + tens + ones;

        // 1000 is the one allowed input with four digits, so it gets its
        // own branch — for every other input the digits above suffice.
        if (number == 1000) {
            JOptionPane.showMessageDialog(null, "1 + 0 + 0 + 0 = 1");
        } else {
            JOptionPane.showMessageDialog(null,
                    hundreds + " + " + tens + " + " + ones + " = " + digitSum);
        }
    }
}
