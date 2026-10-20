public class Animal {
    private Dimensions dimensions;

    public Animal(double length, double height, double width, double weight) {
        this.dimensions = new Dimensions(length, height, width, weight);
    }

    public double getWeight() {
        return dimensions.getWeight();
    }
}
