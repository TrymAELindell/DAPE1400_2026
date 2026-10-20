import java.util.ArrayList;

// Reference solution for exercise 11: all three kinds of bicycle in one list.
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
