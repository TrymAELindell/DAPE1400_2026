import java.util.ArrayList;

public class VoteResults {
    // Alle stemmene ligger i en ArrayList.
    private ArrayList<Vote> allVotes;

    // Konstruktøren oppretter lista.
    public VoteResults() {
        allVotes = new ArrayList<>();
    }

    /**
     * Method for adding a Vote to allVotes
     */
    public void addVote(Vote vote){
        allVotes.add(vote);
    }

    /**
     * Method for returning how many votes are in allVotes
     */
    public int nrOfVotes(){
        return allVotes.size();
    }

    /**
     * Prints information about all votes.
     */
    public void printAllVotes(){
        // Loopen går gjennom alle stemmene, og hvert Vote-objekt skriver ut seg selv.
        for (Vote vote : allVotes) {
            vote.printInfo();
        }
    }

    /**
     * Returns the vote with the highest score.
     */
    public Vote highestScore(){
        double highestScore = 0;
        Vote highestVote = null;
        for (Vote vote : allVotes) {
            if(vote.getScore()>highestScore){
                highestVote = vote;
                highestScore = vote.getScore();
            }
        }
        return highestVote;
    }

}
