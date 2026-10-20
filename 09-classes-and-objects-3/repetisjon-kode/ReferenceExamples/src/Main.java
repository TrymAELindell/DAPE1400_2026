public class Main {
    public static void main(String[] args) {
        // Primitive datatyper og referansetyper oppfører seg forskjellig når du tilordner en
        // variabel til en ny variabel. Kjør programmet med debuggeren, så ser du forskjellen.

        int age = 34;

        int ageAlias = age; // ageAlias får en kopi av verdien i age

        age += 1; // hva skjer med ageAlias nå?

        // age er nå 35, men ageAlias er fortsatt 34. De to variablene har hver sin verdi.

        // Oppfører en referansetype seg på samme måte? Vi prøver det samme med et Person-objekt.
        Person trym = new Person(34, "Januar");

        Person weds = trym;

        // Se i debuggeren hva som skjer med age-fieldet til trym når vi endrer weds.
        weds.incrementAge();

        // Alderen er endret både via trym og via weds, for begge refererer til samme objekt.
        // Debuggeren viser samme referanse ved begge variablene, for eksempel Person@343.

        // En parameter av en referansetype får en kopi av referansen, ikke en kopi av objektet.
        // Derfor endrer agePerson objektet til trym uten å returnere noe.
        Time.agePerson(trym);
    }
}
