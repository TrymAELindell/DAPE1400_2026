// Reference solution for exercise 16.
//
// y = x kopierer referansen, så begge variablene holder en referanse til
// det samme array-objektet.
public class Main {
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int[] y = x;

        y[0] = 100;

        System.out.println(x[0]);
    }
}
