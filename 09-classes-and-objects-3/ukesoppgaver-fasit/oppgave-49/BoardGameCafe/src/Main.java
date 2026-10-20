import javax.swing.JOptionPane;

// Reference solution for exercise 49 (Del 4): the game shelf for Kari's board game café, Terningkast.
public class Main {
    public static void main(String[] args) {
        // Assumption: the shelf only needs to live while the program runs.
        // Kari did not ask for anything to be stored between days.
        Shelf shelf = new Shelf();

        String choice = JOptionPane.showInputDialog(
                "1: nytt spill\n2: lån ut\n3: lever tilbake\n4: vis hylla\n5: avslutt");
        while (choice != null && !choice.equals("5")) {
            if (choice.equals("1")) {
                shelf.addGame(JOptionPane.showInputDialog("Hva heter spillet?"));
            } else if (choice.equals("2")) {
                String name = JOptionPane.showInputDialog("Hvilket spill?");
                try {
                    // Assumption: a table is known by its number only. Kari says nothing
                    // else about the tables, and a number is what she writes on her note today.
                    int tableNumber = Integer.parseInt(JOptionPane.showInputDialog("Hvilket bord?"));
                    JOptionPane.showMessageDialog(null, shelf.lendGame(name, tableNumber));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Bordnummeret må være et heltall");
                }
            } else if (choice.equals("3")) {
                String name = JOptionPane.showInputDialog("Hvilket spill kom tilbake?");
                JOptionPane.showMessageDialog(null, shelf.returnGame(name));
            } else if (choice.equals("4")) {
                JOptionPane.showMessageDialog(null, shelf);
            }
            choice = JOptionPane.showInputDialog(
                    "1: nytt spill\n2: lån ut\n3: lever tilbake\n4: vis hylla\n5: avslutt");
        }
    }
}
