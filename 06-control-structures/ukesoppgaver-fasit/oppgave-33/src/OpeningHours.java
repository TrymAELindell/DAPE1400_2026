// Reference solution for exercise 33: the snippet from the handout, runnable. The switch
// expression returns the value of the case that matches; default is only
// used when nothing matches.
public class OpeningHours {
    public static void main(String[] args) {
        String day = "lørdag";
        int openingHour = switch (day) {
            case "søndag" -> 12;
            case "lørdag" -> 10;
            default -> 8;
        };
        System.out.println("Butikken åpner klokka " + openingHour);
    }
}
