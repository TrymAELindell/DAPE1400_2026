// Reference solution for exercise 2: call all four variants of brew.
public class Main {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine("Java Beans");
        System.out.println(machine.brew());
        System.out.println(machine.brew("cappuccino"));
        System.out.println(machine.brew(3));
        System.out.println(machine.brew("cappuccino", 2));
    }
}
