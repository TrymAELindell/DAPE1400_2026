import java.util.ArrayList;

// Reference solution for exercise 41 (Del 4): the day's overview for the kennel.
public class Main {
    public static void main(String[] args) {
        // We assume that the dogs can be registered in the code for now. The brief
        // does not say how they are typed in, only what the overview must show.
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Bella", "Kari", true, 3));
        dogs.add(new Dog("Rex", "Ove", false, 2));

        int total = 0;
        for (Dog dog : dogs) {
            System.out.println(dog);
            total += dog.calculateStayPrice();
        }
        System.out.println("Til sammen: " + total + " kr");
    }
}
