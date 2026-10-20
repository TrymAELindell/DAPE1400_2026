import java.util.HashMap;

// Reference solution for exercise 26: the postal codes and the lookup.
public class PostalCodeRegister {

    // En HashMap passer her. Jobben er å slå opp fra én verdi til en
    // annen, og det er akkurat det key–verdi-par er til for. Alternativet er
    // to parallelle lister, med indexOf på postnumrene og get på stedene. Det
    // virker også, men ingenting i koden viser at de to listene hører
    // sammen. Programmereren må holde dem i takt. HashMap-en viser direkte
    // hva som hører sammen, og slår opp med ett kall. Postnumrene er
    // strenger, ikke tall. Som int ville 0150 mistet nullen foran.
    public static HashMap<String, String> createPostalCodeMap() {
        HashMap<String, String> placeByPostalCode = new HashMap<>();
        placeByPostalCode.put("0150", "Oslo");
        placeByPostalCode.put("5003", "Bergen");
        placeByPostalCode.put("7010", "Trondheim");
        placeByPostalCode.put("9008", "Tromsø");
        return placeByPostalCode;
    }

    public static String describePostalCode(HashMap<String, String> placeByPostalCode, String postalCode) {
        if (placeByPostalCode.containsKey(postalCode)) {
            return postalCode + " er i " + placeByPostalCode.get(postalCode);
        } else {
            return "Finner ikke postnummer " + postalCode;
        }
    }
}
