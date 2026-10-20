// Reference solution for exercise 38.
//
// Den rettede versjonen. Koden i oppgaven har row < 8, en av-med-én-feil
// som mister den siste raden. Rettingen er <=.
public class Main {
    public static void main(String[] args) {
        for (int row = 1; row <= 8; row++) {
            System.out.println("Rad " + row);
        }
    }
}
