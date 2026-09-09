// Reference solution for exercise 28: three objects of the same class, one
// print method.
public class KioskMain {
    public static void main(String[] args) {
        KioskItem coffee = new KioskItem("Kaffe", 25, 40);
        KioskItem bun = new KioskItem("Bolle", 30, 12);
        KioskItem twist = new KioskItem("Twist", 45, 8);

        coffee.printItemInfo();
        System.out.println();
        bun.printItemInfo();
        System.out.println();
        twist.printItemInfo();
    }
}
