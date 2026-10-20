// Reference solution for exercise 37 (Del 3): a van has its own load limit.
public class Van {
    private String name;
    private LoadLimit limit;

    public Van(String name, int maxKg) {
        this.name = name;
        this.limit = new LoadLimit(maxKg);
    }

    public void load(int kg) {
        if (limit.add(kg)) {
            System.out.println(name + ": " + kg + " kg lagt inn, totalt " + limit.getCurrentKg() + " kg");
        } else {
            System.out.println(name + ": " + kg + " kg avvist, maks er " + limit.getMaxKg() + " kg");
        }
    }
}
