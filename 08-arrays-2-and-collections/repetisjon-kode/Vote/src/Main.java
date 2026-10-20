public class Main {
    public static void main(String[] args) {
        // Lager et objekt som holder på alle stemmene
        VoteResults voteResults = new VoteResults();
        // Lager to stemmer. Vi må bruke konstruktøren (String, String, double),
        // for klassen har ingen annen konstruktør.
        Vote vote1 = new Vote("I'd rather dance with you", "Kings of Convenience", 8.2);
        Vote vote2 = new Vote("Elastic heart", "Sia", 8.6);
        // addVote legger en stemme til i samlingen av stemmer.
        voteResults.addVote(vote1);
        // nrOfVotes forteller hvor mange stemmer som er lagt inn.
        int currentNrOfVotes = voteResults.nrOfVotes();
        // Vi tester antall stemmer. Vi forventer 1, for vi har lagt inn én stemme.
        System.out.println("Current number of votes:"+currentNrOfVotes);
        // Legger inn en stemme til
        voteResults.addVote(vote2);
        // Kaller nrOfVotes igjen
        currentNrOfVotes = voteResults.nrOfVotes();
        // Vi tester antall stemmer igjen. Vi forventer 2, for vi har lagt inn en stemme til.
        System.out.println("Current number of votes:"+currentNrOfVotes);
        // Vi tester printAllVotes. Vi forventer å se informasjon om begge stemmene.
        voteResults.printAllVotes();
        // Vi tester highestScore, som returnerer stemmen med høyest score.
        Vote vote = voteResults.highestScore();
        System.out.println("Highest score:");
        vote.printInfo();
    }

}
