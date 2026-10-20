// Reference solution for exercise 31.
//
// Koden fra oppgaven, gjort kjørbar. Uten krøllparenteser hører bare den
// første setningen til if-setningen, og den andre kjører alltid, uansett hva
// innrykket ser ut til å si.
public class Main {
    public static void main(String[] args) {
        int temperature = 12;
        if (temperature > 15)
            System.out.println("Det er varmt ute");
            System.out.println("Ta med solbriller");
        System.out.println("Ha en fin dag");
    }
}
