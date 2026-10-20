import javax.swing.JOptionPane;

// Reference solution for exercise 28.
public class Main {
    public static void main(String[] args) {
        String coffeeInput = JOptionPane.showInputDialog("Liker du kaffe? (ja/nei)");
        String teaInput = JOptionPane.showInputDialog("Liker du te? (ja/nei)");

        boolean likesCoffee = coffeeInput.equals("ja");
        boolean likesTea = teaInput.equals("ja");

        System.out.println("Liker kaffe: " + likesCoffee);
        System.out.println("Liker ikke kaffe: " + !likesCoffee);
        System.out.println("Liker både kaffe og te: " + (likesCoffee && likesTea));
        System.out.println("Liker kaffe eller te: " + (likesCoffee || likesTea));
    }
}
