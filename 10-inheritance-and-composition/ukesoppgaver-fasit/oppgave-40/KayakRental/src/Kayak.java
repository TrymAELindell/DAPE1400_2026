// Reference solution for exercise 40 (Del 3): a kayak that knows if it is rented and counts its rentals.
public class Kayak {
    private String name;
    private boolean isRented;
    private int rentalCount;

    public Kayak(String name) {
        this.name = name;
        this.isRented = false;
        this.rentalCount = 0;
    }

    public boolean rentOut() {
        if (isRented) {
            return false;
        }
        isRented = true;
        rentalCount++;
        return true;
    }

    public void registerReturn() {
        isRented = false;
    }

    public int getRentalCount() {
        return rentalCount;
    }

    public String getName() {
        return name;
    }
}
