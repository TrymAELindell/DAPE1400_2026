// Reference solution for exercise 1: call both variants of brew.
public class Main {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine("Java Beans");
        System.out.println(machine.brew());
        System.out.println(machine.brew("cappuccino"));
    }
}
