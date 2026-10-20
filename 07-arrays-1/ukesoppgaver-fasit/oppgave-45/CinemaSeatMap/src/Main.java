// Reference solution for exercise 45.
//
// Denne løsningen bruker en todimensjonal boolean-array. De to indeksene i
// sold[row][col] svarer direkte til radene og setene i salen. En annen god
// løsning er én boolean-array med lengde 12, der sete (row, col) ligger på
// indeks row * 4 + col. En feil i den utregningen setter en X på feil rad
// uten noen feilmelding.
public class Main {
    public static void main(String[] args) {
        boolean[][] sold = new boolean[3][4];
        sold[0][1] = true;
        sold[1][0] = true;
        sold[2][3] = true;

        for (int row = 0; row < sold.length; row++) {
            String line = "";
            for (int col = 0; col < sold[row].length; col++) {
                if (sold[row][col]) {
                    line += "X";
                } else {
                    line += ".";
                }
            }
            System.out.println(line);
        }
    }
}
