import java.util.ArrayList;

// Reference solution for exercise 26 (Del 2): the fixed loop.
public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(new Plant("Monstera"));
        plants.add(new Cactus("Kaktusen"));

        for (Plant plant : plants) {
            plant.water();
            // prick finnes bare i Cactus. Gjennom en Plant-referanse må vi sjekke
            // typen og caste før vi kan kalle den.
            if (plant instanceof Cactus) {
                Cactus cactus = (Cactus) plant;
                cactus.prick();
            }
        }
    }
}
