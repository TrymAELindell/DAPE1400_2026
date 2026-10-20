import java.util.HashMap;

// Reference solution for exercise 21 (Del 2).
//
// Den rettede versjonen av koden med bugen. Oppslaget brukte keyen
// "gardermoen" med liten g, men paret var lagret under "Gardermoen". Keyene
// må være helt like, så get returnerte null.
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> airportInCountryMap = new HashMap<>();
        airportInCountryMap.put("Gardermoen", "Norway");
        airportInCountryMap.put("Gatwick", "United Kingdom");

        String country = airportInCountryMap.get("Gardermoen");
        System.out.println(country);
    }
}
