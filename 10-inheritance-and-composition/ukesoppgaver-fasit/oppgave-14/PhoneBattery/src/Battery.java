// Reference solution for exercise 14: the Battery class, given in the handout.
public class Battery {
    private int level;

    public Battery() {
        this.level = 100;
    }

    public int getLevel() {
        return level;
    }

    public void drain(int percent) {
        level = level - percent;
        if (level < 0) {
            level = 0;
        }
    }
}
