// Reference solution for exercise 1: a coffee machine with an overloaded brew method.
public class CoffeeMachine {
    private String brand;

    public CoffeeMachine(String brand) {
        this.brand = brand;
    }

    public String brew() {
        return "En kopp filterkaffe fra " + brand;
    }

    public String brew(String coffeeType) {
        return "En kopp " + coffeeType + " fra " + brand;
    }
}
