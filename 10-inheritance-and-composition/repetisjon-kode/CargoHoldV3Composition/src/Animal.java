public class Animal {
    private Dimensions dimensions;

    public Animal(double length, double height, double width, double weight) {
        if (length > 0 && height > 0 && width > 0 && weight > 0) {
            this.dimensions = new Dimensions(length, height, width, weight);
        } else {
            System.out.println("ADVARSEL: alle dimensjoner må være positive tall");
        }
    }

    // Getteren fra CargoHoldV2Composition er fjernet. Den ga ut en referanse til
    // del-objektet, og da var del-objektet ikke lenger innkapslet.
    // public Dimensions getDimensions() { return this.dimensions; }

    public double getWeight() {
        return dimensions.getWeight();
    }

    public double getVolume() {
        return dimensions.getVolume();
    }
}
