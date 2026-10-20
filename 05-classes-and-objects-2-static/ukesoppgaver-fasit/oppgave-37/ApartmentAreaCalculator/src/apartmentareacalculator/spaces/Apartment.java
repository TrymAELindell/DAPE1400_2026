package apartmentareacalculator.spaces;

// Reference solution for exercise 37.
public class Apartment {
    private Room entrance;
    private Room kitchen;
    private Room livingRoom;
    private Room bedroom;
    private Room bathroom;

    public Apartment(Room entrance, Room kitchen, Room livingRoom, Room bedroom, Room bathroom) {
        this.entrance = entrance;
        this.kitchen = kitchen;
        this.livingRoom = livingRoom;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
    }

    public double getTotalArea() {
        // Written out in full rather than with +=: the compound operators
        // arrive in module 06, and this is module 05 code (P4).
        double totalArea = 0;
        totalArea = totalArea + this.entrance.getArea();
        totalArea = totalArea + this.kitchen.getArea();
        totalArea = totalArea + this.livingRoom.getArea();
        totalArea = totalArea + this.bedroom.getArea();
        totalArea = totalArea + this.bathroom.getArea();
        return totalArea;
    }
}
