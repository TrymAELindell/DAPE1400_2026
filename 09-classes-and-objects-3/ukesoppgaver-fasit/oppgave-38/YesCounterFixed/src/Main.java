// Reference solution for exercise 38 (Del 2): count the yes answers so far.
public class Main {
    public static void main(String[] args) {
        String[] answers = {"ja", "nei", "ja", "ja"};

        // yesCount er flyttet ut av loopkroppen. Der startet den på 0 igjen i
        // hver iterasjon.
        int yesCount = 0;
        for (String answer : answers) {
            if (answer.equals("ja")) {
                yesCount++;
            }
            System.out.println("Ja-svar så langt: " + yesCount);
        }
    }
}
