public class Main {
    public static void main(String[] args) {
        // Et scope er den delen av koden der en variabel finnes.
        // En variabel finnes bare inne i blokka { } der den er deklarert.
        Person trym = new Person(34, "Januar");

        // incrementAge deklarerer variabelen ageIncrement inne i sitt eget scope.
        // Derfor finnes ageIncrement ikke her i main.
        trym.incrementAge();

        // ageIncrement += 1;          // KOMPILERINGSFEIL: cannot find symbol

        // En frittstående blokk lager også et scope, uten en metode, loop eller if-setning rundt.
        int numberInMainScope = 3;

        {
            int numberInInnerScope = 3;
            numberInInnerScope += 4;    // OK — vi er inne i blokka
        }

        numberInMainScope += 3;         // OK — deklarert i dette scopet
        // numberInInnerScope += 2;     // KOMPILERINGSFEIL: cannot find symbol
    }
}
