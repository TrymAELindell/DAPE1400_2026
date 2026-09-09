// Reference solution for exercise 28.
//
// Three items with the same three fields and the same printout: a class
// keeps each item's values together and the printing written once. Nine
// loose variables and three copies of the println block (module 02's tools)
// would produce the same output - at the cost that nothing in the code ties
// a price to its product, and every change to the layout has to be made in
// three places. Exercise 27 was the case where that trade goes the other
// way.
public class KioskItem {
    private String name;
    private int price;
    private int stock;

    public KioskItem(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void printItemInfo() {
        System.out.println("Vare: " + this.name);
        System.out.println("Pris: " + this.price + " kr");
        System.out.println("På lager: " + this.stock);
    }
}
