// Reference solution for exercise 29 (Del 2): two offices share one printer.
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(500);
        Office sales = new Office("Salg", printer);
        Office storage = new Office("Lager", printer);
        sales.printReport(120);
        storage.printReport(30);
        System.out.println(sales);
        System.out.println(storage);
    }
}
