// Reference solution for exercise 35: the fixed version. The bug was writing to the
// for-each loop variable, which is a copy; the fix writes to scores[i].
public class ScoreIncreaseFixed {
    public static void main(String[] args) {
        int[] scores = {55, 70, 90};

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scores[i] + 5;
        }

        System.out.println(scores[0]);
    }
}
