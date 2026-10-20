import static javax.swing.JOptionPane.*;

public class Main {
    public static void main (String[] args) {

        String month = showInputDialog("Hvilke måned er det nå?");
        month = month.toLowerCase();
        month = month.strip();

        String season = switch(month) {
           case "desember", "januar", "februar" -> "vinter";
           case "april", "mars", "mai" -> "vår";
           case "juni", "juli", "august" -> "sommer";
           case "september", "oktober", "november" -> "høst";
           default -> "Error";

        };

        if (season.equals("Error")) {
            showMessageDialog(null, "Du har ikke gitt en måned som input");
        } else {
            showMessageDialog(null, month + " er en " + season + " måned");
        }




    }
}
