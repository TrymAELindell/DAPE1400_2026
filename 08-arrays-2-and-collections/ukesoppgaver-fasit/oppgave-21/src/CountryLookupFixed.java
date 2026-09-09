import java.util.HashMap;

// Reference solution for exercise 21 (Del 2): the fixed version of the buggy snippet. The lookup
// used the key "gardermoen" with a lowercase g, but the pair was stored
// under "Gardermoen" — keys are compared exactly, so get returned null.
public class CountryLookupFixed {
    public static void main(String[] args) {
        HashMap<String, String> airportInCountryMap = new HashMap<>();
        airportInCountryMap.put("Gardermoen", "Norway");
        airportInCountryMap.put("Gatwick", "United Kingdom");

        String country = airportInCountryMap.get("Gardermoen");
        System.out.println(country);
    }
}
