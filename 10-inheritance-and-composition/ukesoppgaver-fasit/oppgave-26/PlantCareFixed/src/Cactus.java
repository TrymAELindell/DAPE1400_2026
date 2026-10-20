// Reference solution for exercise 26 (Del 2): only a cactus can prick.
public class Cactus extends Plant {
    public Cactus(String name) {
        super(name);
    }

    public void prick() {
        System.out.println("Au!");
    }
}
