import static javax.swing.JOptionPane.showInputDialog;

// Reference solution for exercise 7: a switch that returns a value. The
// default branch returns 0, which the if below translates into the error
// message.
//
// Switchen følger samme mønster som ukedagseksempelet i kapitlet.
public class Main {
    public static void main(String[] args) {
        String monthName = showInputDialog("Skriv inn et månedsnavn:");

        int monthNumber = switch (monthName) {
            case "januar"    -> 1;
            case "februar"   -> 2;
            case "mars"      -> 3;
            case "april"     -> 4;
            case "mai"       -> 5;
            case "juni"      -> 6;
            case "juli"      -> 7;
            case "august"    -> 8;
            case "september" -> 9;
            case "oktober"   -> 10;
            case "november"  -> 11;
            case "desember"  -> 12;
            default          -> 0;
        };

        if (monthNumber == 0) {
            System.out.println(monthName + " er ikke et månedsnavn");
        } else {
            System.out.println(monthName + " er måned nummer " + monthNumber);
        }
    }
}
