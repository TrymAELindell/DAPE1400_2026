import java.util.ArrayList;

// Reference solution for exercise 42 (Del 4): Randi's register at Gjøvik Bil og MC.
public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> registry = new ArrayList<>();

        // We assume that the vehicles can be entered in the code for now. The brief
        // does not say how they are typed in, only that the whole register prints.
        registry.add(new Car("Volvo T5", new Date(1, 3, 2015), "DP23456", 450));
        registry.add(new Motorcycle("Ducati Monster", new Date(4, 10, 2016), "DR4567"));

        for (Vehicle vehicle : registry) {
            System.out.println(vehicle);
            System.out.println("-----");
        }
    }
}
