// Reference solution for exercise 35.
//
// Den rettede versjonen. Bugen var å skrive til loop-variabelen i
// for-each-loopen, som er en kopi, og rettingen skriver til scores[i].
public class Main {
    public static void main(String[] args) {
        int[] scores = {55, 70, 90};

        for (int i = 0; i < scores.length; i++) {
            scores[i] = scores[i] + 5;
        }

        System.out.println(scores[0]);
    }
}
