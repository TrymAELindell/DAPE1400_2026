public class Baggage {
    private final double MAX_WEIGHT = 32; // kg
    private Dimensions dimensions;

    public Baggage(double length, double height, double width, double weight) {
        if (weight <= MAX_WEIGHT) {
            this.dimensions = new Dimensions(length, height, width, weight);
        } else {
            System.out.println("Maksvekten er overskredet. Fjern noe av innholdet i bagasjen.");
        }
    }

    public double getWeight() {
        return this.dimensions.getWeight();
    }

    public boolean setWeight(double newWeight) {
        if (newWeight <= this.MAX_WEIGHT) {
            this.dimensions.setWeight(newWeight);
            return true;
        } else {
            System.out.println("Den nye vekten er over maksvekten.");
            return false;
        }
    }
}
