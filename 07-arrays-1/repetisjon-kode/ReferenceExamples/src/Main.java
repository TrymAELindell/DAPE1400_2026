public class Main {
    public static void main(String[] args) {

        // To variabler av en ikke-primitiv type kan referere til det samme
        // objektet.
        Person person1 = new Person("Trym", 34); // lager et Person-objekt
        Person person1Alias = person1; // person1Alias refererer til det samme objektet

        // Begge variablene refererer til det samme objektet. En endring gjennom
        // den ene variabelen ser du derfor også gjennom den andre.
        System.out.println(person1); // Person har en toString-metode, så vi kan skrive ut objektet direkte
        person1Alias.setName("Per"); // endrer navnet gjennom person1Alias

        // Vi skriver ut objektet gjennom begge variablene. Navnet er blitt Per
        // i begge.
        System.out.println(person1Alias);
        System.out.println(person1);

        // En array er et objekt. Derfor kan to variabler referere til den samme
        // arrayen, også når elementene er av en primitiv type.
        int[] intArray = {4, 3, 1, 2, 5};
        int[] intArrayAlias = intArray; // intArrayAlias refererer til den samme arrayen

        // Vi endrer to forskjellige elementer, ett gjennom hver variabel
        intArray[0] = 10;
        intArrayAlias[1] = 100;

        // Vi skriver ut arrayen gjennom begge variablene. Begge endringene
        // synes i begge.
        System.out.println("Array verdier printet ut via intArray");
        for (int i : intArray) {
            System.out.println(i);
        }

        System.out.println("Array verdier printet ut via intArrayAlias");
        for (int i : intArrayAlias) {
            System.out.println(i);
        }
    }
}
