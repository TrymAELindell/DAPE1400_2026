// Reference solution for exercise 2: four variants of brew, one per parameter list.
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

    public String brew(int cups) {
        return cups + " kopper filterkaffe fra " + brand;
    }

    public String brew(String coffeeType, int cups) {
        return cups + " kopper " + coffeeType + " fra " + brand;
    }
}
