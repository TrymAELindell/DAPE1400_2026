// Reference solution for exercise 33.
//
// Den rettede versjonen. Bugen var i <= temperatures.length, som prøver
// indeks 4. Rettingen er < i stedet for <=.
public class Main {
    public static void main(String[] args) {
        int[] temperatures = {5, 9, 12, 7};
        int sum = 0;

        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }

        System.out.println("Summen er " + sum);
    }
}
