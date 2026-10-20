// Reference solution for exercise 42 (Del 3): print the area of each room and the total.
public class Main {
    public static void main(String[] args) {
        double total = 0;

        double room1 = AreaCalculator.computeArea(4.0);
        System.out.println("Kvadratisk rom, 4.0 m: " + room1 + " kvm");
        total += room1;

        double room2 = AreaCalculator.computeArea(3.0, 5.0);
        System.out.println("Rektangulært rom, 3.0 x 5.0 m: " + room2 + " kvm");
        total += room2;

        double room3 = AreaCalculator.computeArea(2.5);
        System.out.println("Kvadratisk rom, 2.5 m: " + room3 + " kvm");
        total += room3;

        double room4 = AreaCalculator.computeArea(4.0, 6.0);
        System.out.println("Rektangulært rom, 4.0 x 6.0 m: " + room4 + " kvm");
        total += room4;

        System.out.println("Totalt: " + total + " kvm");
    }
}
