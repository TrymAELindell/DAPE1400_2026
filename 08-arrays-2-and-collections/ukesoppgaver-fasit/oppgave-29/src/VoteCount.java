import java.util.HashMap;
import javax.swing.JOptionPane;

// Reference solution for exercise 29 (Del 3): count votes per candidate
// until the user enters "ferdig".
public class VoteCount {

    // A HashMap from candidate to count fits here: neither the candidates
    // nor the number of votes is known up front, and put/get grow the
    // tally as new names appear. An ArrayList holding every vote also
    // works — count each distinct name with a loop at the end — but then
    // the program must first work out which distinct names the list
    // contains, a whole extra pass the map never needs.
    public static void addVote(HashMap<String, Integer> votesByCandidate, String candidate) {
        if (votesByCandidate.containsKey(candidate)) {
            votesByCandidate.put(candidate, votesByCandidate.get(candidate) + 1);
        } else {
            votesByCandidate.put(candidate, 1);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> votesByCandidate = new HashMap<>();

        String vote = JOptionPane.showInputDialog("Hvem stemmer du på? (ferdig avslutter)");
        while (!vote.equals("ferdig")) {
            addVote(votesByCandidate, vote);
            vote = JOptionPane.showInputDialog("Hvem stemmer du på? (ferdig avslutter)");
        }

        for (String candidate : votesByCandidate.keySet()) {
            System.out.println(candidate + ": " + votesByCandidate.get(candidate));
        }
    }
}
