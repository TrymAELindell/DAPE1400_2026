// Reference solution for exercise 24. table.length counts the rows;
// table[0].length is the length of row 0.
public class Main {
    public static void main(String[] args) {
        int[][] table = new int[3][4];

        table[1][2] = 7;

        System.out.println("Antall rader: " + table.length);
        System.out.println("Antall plasser på rad 0: " + table[0].length);
        System.out.println("Verdien på rad 1, plass 2: " + table[1][2]);
    }
}
