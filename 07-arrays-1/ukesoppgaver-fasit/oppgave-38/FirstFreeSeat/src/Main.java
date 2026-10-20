// Reference solution for exercise 38.
//
// Programmet fra oppgaven, gjort kjørbart. break rowLoop går ut av den
// ytre loopen, så det første ledige setet vinner.
public class Main {
    public static void main(String[] args) {
        boolean[][] seats = {
            {true, true},
            {true, false},
            {false, false}
        };

        String found = "ingen ledige plasser";

        rowLoop:
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                if (!seats[row][col]) {
                    found = "rad " + row + ", plass " + col;
                    break rowLoop;
                }
            }
        }

        System.out.println(found);
    }
}
