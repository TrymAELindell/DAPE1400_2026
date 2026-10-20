import java.util.ArrayList;

// Reference solution for exercise 12: the day price for each kind of bicycle.
public class Main {
    public static void main(String[] args) {
        ArrayList<Bicycle> bicycles = new ArrayList<>();
        bicycles.add(new Bicycle("DBS", 200));
        bicycles.add(new ElectricBike("Merida", 300, 80));
        bicycles.add(new CargoBike("Butchers", 350, 60, 100));

        for (Bicycle bicycle : bicycles) {
            System.out.println(bicycle);
        }
    }
}
