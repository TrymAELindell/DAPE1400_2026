// Reference solution for exercise 11.
//
// == mellom to Integer-objekter sammenlikner referanser, ikke innhold, så
// to separate objekter som begge holder 1000, gir false. Likt innhold i
// objekter av wrapper-klasser sjekkes med equals, akkurat som for String.
public class Main {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
