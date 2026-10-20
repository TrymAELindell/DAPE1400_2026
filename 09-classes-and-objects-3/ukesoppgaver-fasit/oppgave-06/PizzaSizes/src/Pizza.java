// Reference solution for exercise 6: a pizza with two constructors.
public class Pizza {
    private String name;
    private int diameter;

    public Pizza(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    // The restaurant's usual size is 30 cm.
    public Pizza(String name) {
        this.name = name;
        this.diameter = 30;
    }

    public String getDescription() {
        return name + ", " + diameter + " cm";
    }
}
