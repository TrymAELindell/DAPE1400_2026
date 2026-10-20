// Reference solution for exercise 35 (Del 2): the pizza from the task.
public class Pizza {
    private String name;
    private int diameter;

    public Pizza(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String toString() {
        return "Pizza " + name + " (" + diameter + " cm)";
    }
}
