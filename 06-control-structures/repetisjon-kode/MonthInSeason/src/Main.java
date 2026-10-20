import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        String month = showInputDialog("Hvilken måned er det?");

        switch (month) {
            case "desember", "januar", "februar" -> {
                System.out.println(month + " er en vintermåned");
            }
            case "mars", "april", "mai" -> {
                System.out.println(month + " er en vårmåned");
            }
            case "juni", "juli", "august" -> {
                System.out.println(month + " er en sommermåned");
            }
            case "september", "oktober", "november" -> {
                System.out.println(month + " er en høstmåned");
            }
        }
    }
}
