// Reference solution for exercise 41 (Del 4): a dog staying at Solveig's kennel.
public class Dog {
    private String name;
    private String ownerName;
    // We assume that Solveig decides if a dog is small or large when it arrives.
    // She did not say which size counts as small, so the program only stores her answer.
    private boolean isSmall;
    private int nights;

    public Dog(String name, String ownerName, boolean isSmall, int nights) {
        this.name = name;
        this.ownerName = ownerName;
        this.isSmall = isSmall;
        this.nights = nights;
    }

    // We assume that "hva oppholdet koster" means the whole stay, not one night.
    // That is the amount she needs for the day's earnings.
    public int calculateStayPrice() {
        int pricePerNight;
        if (isSmall) {
            pricePerNight = 250;
        } else {
            pricePerNight = 400;
        }
        return pricePerNight * nights;
    }

    public String toString() {
        return name + " (eier " + ownerName + "): " + calculateStayPrice() + " kr";
    }
}
