public class Main {
    public static void main(String[] args) {

        // En array lagrer flere verdier av samme datatype, og hver verdi er et
        // element. Indeksen er posisjonen til et element, og den starter på 0.

        int[] arrInt = new int[4]; // 4 gir arrayen fire elementer
        arrInt[0] = 2; // indeksen i [ ] velger hvilket element som får verdien
        System.out.println(arrInt[0]); // elementet på indeks 0 er nå 2
        // Primitive typer får en default-verdi (0 for int), så elementet på
        // indeks 1 er 0.
        System.out.println(arrInt[1]);

        double[] arrDouble = new double[4];
        arrDouble[0] = 2.0;
        System.out.println(arrDouble[0]);
        System.out.println(arrDouble[1]);

        boolean[] arrBool = new boolean[4];
        arrBool[2] = true;
        System.out.println(arrBool[0]);
        System.out.println(arrBool[2]);

        // En array kan også opprettes med ferdige verdier inne i { }
        int[] arrIntPreDefined = {1, 2, 3, 4, 2, 3};

        // length gir antall elementer i arrayen
        int arrayLength = arrIntPreDefined.length;
        System.out.println("Arrayen har lengde: " + arrayLength);

        // Elementene kan ha en hvilken som helst type. Her er det String.
        String[] arrString = new String[4];
        arrString[0] = "hei";
        System.out.println(arrString[0]);
        // I en array av en ikke-primitiv type starter hvert element som null.
        // Det ser du når du skriver ut et element som ikke er initialisert.
        System.out.println(arrString[1]);

        // Her lager vi en array av vår egen klasse Person
        Person[] arrPerson = new Person[3];
        arrPerson[0] = new Person("Omar", 34);
        System.out.println(arrPerson[0]);
        System.out.println(arrPerson[1]);

        arrPerson[0].setName("Hasan"); // vi kan kalle metodene til et element
        // Men et metodekall på et element som er null, gir en NullPointerException.
        arrPerson[2].setName("Heidi");
    }
}
