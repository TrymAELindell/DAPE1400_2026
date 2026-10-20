import java.util.HashMap;

// Reference solution for exercise 29: counts one vote at a time.
public class VoteCounter {

    public static void addVote(HashMap<String, Integer> votesByCandidate, String candidate) {
        if (votesByCandidate.containsKey(candidate)) {
            votesByCandidate.put(candidate, votesByCandidate.get(candidate) + 1);
        } else {
            votesByCandidate.put(candidate, 1);
        }
    }
}
