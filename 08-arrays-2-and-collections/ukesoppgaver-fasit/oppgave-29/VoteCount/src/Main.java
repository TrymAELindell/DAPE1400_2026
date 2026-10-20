import java.util.HashMap;
import javax.swing.JOptionPane;

// Reference solution for exercise 29 (Del 3): count votes per candidate
// until the user enters "ferdig".
public class Main {

    public static void main(String[] args) {
        // En HashMap fra kandidat til antall passer her. Verken kandidatene
        // eller antallet stemmer er kjent fra starten. Metodene put og get
        // bygger opp tellingen etter hvert som nye navn dukker opp. En
        // ArrayList som holder hver stemme, virker også, med en loop til slutt
        // som teller stemmene for hvert navn. Men da må programmet først finne
        // ut hvilke forskjellige navn listen inneholder. Det er en hel ekstra
        // loop som HashMap-en aldri trenger.
        HashMap<String, Integer> votesByCandidate = new HashMap<>();

        String vote = JOptionPane.showInputDialog("Hvem stemmer du på? (ferdig avslutter)");
        while (!vote.equals("ferdig")) {
            VoteCounter.addVote(votesByCandidate, vote);
            vote = JOptionPane.showInputDialog("Hvem stemmer du på? (ferdig avslutter)");
        }

        for (String candidate : votesByCandidate.keySet()) {
            System.out.println(candidate + ": " + votesByCandidate.get(candidate));
        }
    }
}
