public class SeatBookingMain {
    public static void main(String[] args) {

        // An important principle in object-oriented programming (OOP) is that we want to
        // isolate the functionality of the classes we write so that each has few
        // responsibilities. In our earlier implementations of the Plane class we did not
        // follow this principle very well, because Plane had two responsibilities: it had
        // to hold seats, and it had to find and book free seats.
        // Here we could instead split these two responsibilities.
        // Plane will then only have the role of holding seats and telling us whether a
        // seat is taken or not.
        // The responsibility of finding a free seat can be given to another class we call
        // SeatBooker. SeatBooker takes a Plane object as input parameter to a method
        // (e.g. bookSeatInPlane(Plane plane)), finds a free seat, and sets it to taken.
        // Note also that since the bookSeatInPlane method only operates on the plane
        // object and does not use any other variables, we can make the method static so
        // that we do not need to create an object of the SeatBooker class to use it.

        // When we split up responsibilities this way, our code becomes like Lego bricks
        // that we can more easily reuse for other functionality.
        // We also make it less likely that our code develops dependencies that become
        // hard to handle when we make changes, because each class has isolated
        // responsibilities.

        // The code below creates a Plane object
        Plane plane = new Plane(10);

        // Here we use SeatBooker's static method inside a while loop to book every seat
        // in the plane.
        // Note that we make use of bookSeatInPlane being static: we do not spend a line
        // of code creating a SeatBooker object.
        // We also make use of bookSeatInPlane returning a boolean telling us whether we
        // managed to book a seat in the plane.
        // This lets us put the booking directly into the check of the while loop. We
        // could also have written other logic around this. This is why you will often see
        // methods return a boolean telling us whether the method managed to do what we
        // asked it to.
        while (SeatBooker.bookSeatInPlane(plane)) {}


    }
}
