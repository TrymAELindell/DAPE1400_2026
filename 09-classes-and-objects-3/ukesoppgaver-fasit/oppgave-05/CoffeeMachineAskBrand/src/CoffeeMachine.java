import javax.swing.JOptionPane;

// Reference solution for exercise 5: an overloaded constructor that asks the user for the brand.
public class CoffeeMachine {
    private String brand;

    public CoffeeMachine(String brand) {
        this.brand = brand;
    }

    public CoffeeMachine() {
        this.brand = JOptionPane.showInputDialog("Hvilket merke er kaffemaskinen?");
    }

    public String brew() {
        return "En kopp filterkaffe fra " + brand;
    }

    public String brew(String coffeeType) {
        return "En kopp " + coffeeType + " fra " + brand;
    }

    public String brew(int cups) {
        return cups + " kopper filterkaffe fra " + brand;
    }

    public String brew(String coffeeType, int cups) {
        return cups + " kopper " + coffeeType + " fra " + brand;
    }
}
