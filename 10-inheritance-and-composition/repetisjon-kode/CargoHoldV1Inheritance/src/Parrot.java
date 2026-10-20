public class Parrot extends Animal {
    public Parrot(double length, double height, double width, double weight) {
        super(length, height, width, weight);
    }

    public void makeSound() {
        System.out.println("Skvak!");
    }

    public void askForBiscuit() {
        makeSound();
        System.out.println("Kan jeg få en kjeks?");
    }
}
