import java.util.HashMap;

// Reference solution for exercise 27: the temperatures and the lookup.
public class TemperatureRegister {

    // En HashMap passer her. Hvert spørsmål er «hva hører til denne
    // byen?», og HashMap-en svarer direkte på det spørsmålet. Metoden
    // containsKey håndterer en ukjent by i ett kall. To parallelle arrayer
    // virker også, én med byer og én med temperaturer, koblet sammen med
    // indeks. Men da trenger hvert oppslag et søk som er skrevet for hånd.
    // Og byen og temperaturen hører bare sammen så lenge begge arrayene
    // endres sammen, for hånd.
    public static HashMap<String, Integer> createTemperatureMap() {
        HashMap<String, Integer> temperatureByCity = new HashMap<>();
        temperatureByCity.put("Oslo", 4);
        temperatureByCity.put("Bergen", 7);
        temperatureByCity.put("Trondheim", 2);
        temperatureByCity.put("Tromsø", -3);
        return temperatureByCity;
    }

    public static String describeCity(HashMap<String, Integer> temperatureByCity, String city) {
        if (temperatureByCity.containsKey(city)) {
            return "I " + city + " er det " + temperatureByCity.get(city) + " grader";
        }
        return "Har ingen måling for " + city;
    }
}
