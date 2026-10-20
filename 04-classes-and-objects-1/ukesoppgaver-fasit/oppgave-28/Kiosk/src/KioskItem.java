// Reference solution for exercise 28.
//
// Three items have the same three fields and the same printout. A class
// keeps each item's values together and writes the printing only once. Nine
// loose variables and three copies of the println block (module 02's tools)
// would produce the same output. The cost is that nothing in the code ties
// a price to its product. You must also make every change to the layout in
// three places. Exercise 27 was the case where the choice goes the other
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
