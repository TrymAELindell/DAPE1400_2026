public class PlaneV0 {
    // To keep track of which seats are taken in a plane,
    // we could make one boolean variable per seat.
    // This quickly becomes unmanageable — imagine a plane with 150 seats.
    // It is also inflexible: changing the number of seats means rewriting the class.

    public boolean seat0Taken;
    public boolean seat1Taken;
    public boolean seat2Taken;
}
