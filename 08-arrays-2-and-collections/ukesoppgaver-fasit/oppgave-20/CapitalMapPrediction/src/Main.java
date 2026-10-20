import java.util.HashMap;

// Reference solution for exercise 20 (Del 2).
//
// Koden fra oppgaven, gjort kjørbar. Den skriver ut false, null og 2.
// remove("Denmark") fjerner hele paret, så containsKey svarer false og get
// returnerer null.
public class Main {
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
