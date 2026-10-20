import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {

        while(true) {
            boolean validInput = false;
            int countdownFrom = 0;
            do {
                String countdownFromInput = showInputDialog("Angi nedtellings tall");
                try {
                    countdownFrom = Integer.parseInt(countdownFromInput);
                    validInput = true;

                } catch (Exception e) {
                    showMessageDialog(null, "input var ikke ett tall, prøv igjen");
                }
            } while(!validInput);


            for(int counter = countdownFrom; counter > 0; counter--) {
                showMessageDialog(null, counter);
            }

            showMessageDialog(null, "Launching Rocket!");


        }



    }
}
