// Reference solution for exercise 31 (Del 2): with the leak closed, 40 degrees is rejected.
public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.setTemperature(40);
        System.out.println(aquarium.getTemperature());
    }
}
