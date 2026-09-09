import java.util.ArrayList;

// Reference solution for exercise 17 (Del 2): the snippet from the handout, runnable. Prints 2 and
// Nora — add(1, ...) shifts elements backward, set(0, ...) replaces in
// place, and remove("Jonas") removes by value.
public class NameListPrediction {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Siri");
        names.add("Jonas");
        names.add(1, "Nora");     // [Siri, Nora, Jonas]
        names.set(0, "Emil");     // [Emil, Nora, Jonas]
        names.remove("Jonas");    // [Emil, Nora]

        System.out.println(names.size());
        System.out.println(names.get(1));
    }
}
