// Reference solution for exercise 18: the scope puzzle, fixed.
public class Main {
    public static void main(String[] args) {
        // sum er flyttet ut av loopen. Inne i loopen startet den på 0 igjen i
        // hver runde, og den fantes ikke etter loopen.
        int sum = 0;
        for (int number = 1; number <= 5; number++) {
            sum += number;
        }
        System.out.println("Summen er: " + sum);

        // bonus er flyttet ut av blokka, slik at den finnes etter den.
        int bonus = 10;
        System.out.println("Summen med bonus er: " + (sum + bonus));
    }
}
