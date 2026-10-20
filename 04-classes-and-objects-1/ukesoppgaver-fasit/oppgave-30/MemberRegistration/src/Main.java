import javax.swing.JOptionPane;

// Reference solution for exercise 30: two registrations from dialogs; the
// constructor decides what gets stored.
public class Main {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Navn på nytt medlem:");
        String memberNr1 = JOptionPane.showInputDialog("Medlemsnummer (seks siffer):");
        Member member1 = new Member(name1, memberNr1);

        String name2 = JOptionPane.showInputDialog("Navn på nytt medlem:");
        String memberNr2 = JOptionPane.showInputDialog("Medlemsnummer (seks siffer):");
        Member member2 = new Member(name2, memberNr2);
    }
}
