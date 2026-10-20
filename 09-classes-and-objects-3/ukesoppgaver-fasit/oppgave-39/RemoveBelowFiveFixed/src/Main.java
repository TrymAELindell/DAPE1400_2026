import java.util.ArrayList;

// Reference solution for exercise 39 (Del 2): remove every number below 5 from the list.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(3);
        scores.add(8);
        scores.add(2);
        scores.add(1);
        scores.add(9);

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < 5) {
                scores.remove(i);
                // remove rykker resten av lista én indeks fram. i-- gjør at
                // elementet som rykket fram, også blir sjekket.
                i--;
            }
        }

        for (int score : scores) {
            System.out.println(score);
        }
    }
}
