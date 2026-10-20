public class Vote {
    // Fieldene er private, slik at vi får encapsulation.
    private String songTitle;
    private String artist;
    private double score;

    // A Vote needs a songTitle, an artist and a score.
    public Vote(String songTitle, String artist, double score) {
        this.songTitle = songTitle;
        this.artist = artist;
        this.score = score;
    }
    // Tre gettere, én for hvert field.
    public String getSongTitle() {
        return songTitle;
    }

    public String getArtist() {
        return artist;
    }

    public double getScore() {
        return score;
    }

    /**
     * Prints all the fields of the vote.
     */
    public void printInfo(){
        System.out.println("Songtitle:"
                + songTitle
                + ", Artist:"+artist
                + ", Score:"+score);
    }

}
