// Reference solution for exercise 44 (Del 3).
public class Main {
    public static void main(String[] args) {
        // To overloadede konstruktører passer her. De fleste kontoene starter på
        // 0 kr, og da trenger den som oppretter kontoen, bare å oppgi navnet.
        // Én konstruktør som alltid tar et beløp, ville også virket. Men da må
        // hver konto uten innskudd få 0 skrevet inn for hånd.
        // Én konstruktør med bare navnet og en metode for innskudd etterpå ville
        // også virket, men da tar Omars konto to steg der ett holder.
        Account lise = new Account("Lise");
        Account omar = new Account("Omar", 1500);
        Account nora = new Account("Nora");

        System.out.println(lise);
        System.out.println(omar);
        System.out.println(nora);
    }
}
