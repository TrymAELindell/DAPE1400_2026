import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Cat, Dog og Parrot har nesten den samme koden, så en endring må gjøres i alle tre
        // klassene. CargoHoldV1Inheritance løser dette med inheritance.

        // Hver dyretype trenger også sin egen liste og sin egen loop.
        // En ny dyretype betyr enda en liste og enda en loop.

        ArrayList<Dog> dogCargo = new ArrayList<Dog>();
        dogCargo.add(new Dog(10, 20, 30, 10));
        dogCargo.add(new Dog(20, 5, 10, 20));

        ArrayList<Cat> catCargo = new ArrayList<Cat>();
        catCargo.add(new Cat(30, 20, 10, 5));

        ArrayList<Parrot> parrotCargo = new ArrayList<Parrot>();
        parrotCargo.add(new Parrot(10, 4, 4, 2));

        double totalPetCargoWeight = 0;
        double totalPetCargoVolume = 0;

        for (Dog dog : dogCargo) {
            totalPetCargoWeight += dog.getWeight();
            totalPetCargoVolume += dog.getVolume();
        }

        for (Cat cat : catCargo) {
            totalPetCargoWeight += cat.getWeight();
            totalPetCargoVolume += cat.getVolume();
        }

        for (Parrot parrot : parrotCargo) {
            totalPetCargoWeight += parrot.getWeight();
            totalPetCargoVolume += parrot.getVolume();
        }

        System.out.println("Dyrelasterommet inneholder totalt " + totalPetCargoWeight + " kg");
        System.out.println("og et volum på " + totalPetCargoVolume + " cm3");
    }
}
