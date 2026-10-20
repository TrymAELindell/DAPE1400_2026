import java.util.ArrayList;

// Reference solution for exercise 18 (Del 2).
//
// Den rettede versjonen av koden med bugen. remove(2) med et
// int-argument fjerner etter indeks, så verdien må finnes med indexOf
// først.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);

        int index = numbers.indexOf(2);
        numbers.remove(index);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
