// Reference solution for exercise 15: fill the kettle three times.
public class Main {
    public static void main(String[] args) {
        Kettle kettle = new Kettle();
        kettle.fill(0.5);
        System.out.println("Vann: " + kettle.getWaterLevel() + " liter");
        kettle.fill(1.0);
        System.out.println("Vann: " + kettle.getWaterLevel() + " liter");
        kettle.fill(0.5);
        System.out.println("Vann: " + kettle.getWaterLevel() + " liter");
    }
}
