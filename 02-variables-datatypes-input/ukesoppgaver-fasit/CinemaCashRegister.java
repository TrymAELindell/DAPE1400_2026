import javax.swing.JOptionPane;

// Reference solution for extra exercise 2.
public class CinemaCashRegister {
    public static void main(String[] args) {
        String adultCountInput = JOptionPane.showInputDialog("Hvor mange voksenbilletter?");
        String childCountInput = JOptionPane.showInputDialog("Hvor mange barnebilletter?");

        int adultCount = Integer.parseInt(adultCountInput);
        int childCount = Integer.parseInt(childCountInput);

        // Ticket counts are whole numbers, but the prices are doubles: the
        // child price is 10% off the adult price, which need not be whole.
        double adultPrice = 150.0;
        double childPrice = adultPrice * 0.9;

        double totalPrice = adultCount * adultPrice + childCount * childPrice;
        System.out.println("Totalsum: " + totalPrice + " kr");
    }
}
