// Reference solution for exercise 14: a phone has its own battery.
public class Phone {
    private String model;
    private Battery battery;

    public Phone(String model) {
        this.model = model;
        this.battery = new Battery();
    }

    public void call(int minutes) {
        battery.drain(minutes * 2);
    }

    public int getBatteryLevel() {
        return battery.getLevel();
    }

    public String toString() {
        return model + " (batteri " + getBatteryLevel() + " %)";
    }
}
