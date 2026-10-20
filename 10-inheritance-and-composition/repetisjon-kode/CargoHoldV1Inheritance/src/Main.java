import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Fieldene og metodene som alle dyrene deler, ligger nå i superklassen Animal.
        // Cat, Dog og Parrot arver dem i stedet for å gjenta koden.

        // Alle dyretypene er subklasser av Animal, så de kan ligge i én ArrayList<Animal>.
        ArrayList<Animal> animalCargoHold = new ArrayList<Animal>();

        animalCargoHold.add(new Dog(70, 40, 30, 35));
        animalCargoHold.add(new Cat(40, 25, 20, 10));
        animalCargoHold.add(new Parrot(20, 10, 10, 3));

        // Én liste gir én loop for total vekt og totalt volum.
        double totalPetCargoWeight = 0;
        double totalPetCargoVolume = 0;

        for (Animal animal : animalCargoHold) {
            totalPetCargoWeight += animal.getWeight();
            totalPetCargoVolume += animal.getVolume();
        }

        System.out.println("Dyrelasterommet inneholder totalt " + totalPetCargoWeight + " kg");
        System.out.println("og et volum på " + totalPetCargoVolume + " cm3");

        // Animal har metoden makeSound, så vi kan kalle den på alle objektene i listen.
        // Subklassene overskriver metoden, og det er subklassens versjon som kjører.
        for (Animal animal : animalCargoHold) {
            animal.makeSound();
        }

        // En metode som bare finnes i subklassen, kan vi ikke kalle via en Animal-referanse:
        // {
        //     Animal dogAnimal = animalCargoHold.get(0);
        //     dogAnimal.sniffOutTarget("Tryms sokker");   // KOMPILERINGSFEIL
        // }
        // Vi må først caste objektet tilbake til subklassen.

        { // den frittstående blokka lar oss bruke variabelnavnene på nytt nedenfor
            Animal dogAnimal = animalCargoHold.get(0);
            Dog dog = (Dog) dogAnimal;
            dog.sniffOutTarget("Tryms sokker");
        }

        // Er objektet ikke en Dog, gir castingen en ClassCastException.
        // Med instanceof sjekker vi typen først, så vi caster bare når det er trygt.
        for (Animal animal : animalCargoHold) {
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.sniffOutTarget("Tryms sokker");
            } else if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.tipGlassOffTable();
            } else if (animal instanceof Parrot) {
                Parrot parrot = (Parrot) animal;
                parrot.askForBiscuit();
            } else {
                animal.makeSound();
            }
        }
    }
}
