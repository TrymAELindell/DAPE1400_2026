public class Passenger {
    private String name;
    private Animal pet;

    public Passenger(String name) {
        this.name = name;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    // I aggregation er det greit å returnere del-objektet direkte. Kjæledyret er ikke
    // innkapslet i passasjeren, men et uavhengig objekt som lasterommet også har.
    public Animal getPet() {
        return this.pet;
    }
}
