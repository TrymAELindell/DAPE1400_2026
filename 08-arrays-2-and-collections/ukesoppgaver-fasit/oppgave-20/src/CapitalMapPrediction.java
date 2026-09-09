import java.util.HashMap;

// Reference solution for exercise 20 (Del 2): the snippet from the handout, runnable. Prints
// false, null and 2 — remove(key) removes the whole pair, containsKey
// then answers false, and get on a missing key returns null.
public class CapitalMapPrediction {
    public static void main(String[] args) {
        HashMap<String, String> capitalByCountry = new HashMap<>();
        capitalByCountry.put("Norway", "Oslo");
        capitalByCountry.put("Denmark", "Copenhagen");
        capitalByCountry.put("Sweden", "Stockholm");

        capitalByCountry.remove("Denmark");

        System.out.println(capitalByCountry.containsKey("Denmark"));
        System.out.println(capitalByCountry.get("Denmark"));
        System.out.println(capitalByCountry.size());
    }
}
