// Reference solution for exercise 10: print a bicycle and an electric bike.
public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("DBS", 200);
        ElectricBike electricBike = new ElectricBike("Merida", 300, 80);
        System.out.println(bicycle);
        System.out.println(electricBike);
    }
}
