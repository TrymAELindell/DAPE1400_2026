// Reference solution for exercise 14.
//
// Med while blir tellevariabelen deklarert før loopen og oppdatert til slutt
// i loopens blokk.
public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 9) {
            System.out.println(i);
            i++;
        }
    }
}
