// Reference solution for exercise 33 (Del 2): the flight from the task.
public class Flight {
    private String flightNumber;
    private String destination;
    private int delayMinutes;

    public Flight(String flightNumber, String destination, int delayMinutes) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.delayMinutes = delayMinutes;
    }

    public String toString() {
        if (delayMinutes == 0) {
            return flightNumber + " til " + destination + ": i rute";
        }
        return flightNumber + " til " + destination + ": " + delayMinutes + " min forsinket";
    }
}
