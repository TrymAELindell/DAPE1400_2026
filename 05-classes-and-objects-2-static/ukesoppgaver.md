# Ukesoppgaver — modul 05: klasser og objekter 2 og `static`

Du trenger bare det du har lært til og med denne uka. Som vanlig er det
flere oppgaver her enn én ukes arbeid — resten er repetisjon.

Ukas kodeeksempler ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/05-classes-and-objects-2-static/repetisjon-kode>.
Se på dem hvis du står fast — spesielt `TicketV4.java` og
`AirportTicketSystemV4.java`, som oppgave 23 bruker direkte.

Fasit til oppgavene ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/05-classes-and-objects-2-static/ukesoppgaver-fasit>.
Prøv selv først — bruk fasiten til å sjekke løsningen din etterpå.

## Del 1 — Skriv koden

### Oppgave 1

Lag en klasse `Person` med disse private fieldene:

- `firstName`
- `lastName`
- `address`
- `phoneNumber`

Klassen skal ha:

- en konstruktør som setter alle fire fieldene når klassen instansieres
- getter- og setter-metoder for alle fieldene
- en metode `showPersonInfo` som viser alle opplysningene i en meldingsboks
  med `JOptionPane.showMessageDialog`, én opplysning per linje, med en
  ledetekst foran verdien

Skriv så koden i `main` som trengs for å lese inn opplysningene med
`JOptionPane.showInputDialog`, opprette et `Person`-objekt og kalle metoden
som viser dem.

Tips: bruk `\n` for å få linjeskift inne i en streng.

For inndataene `Solveig`, `Aune`, `Kirkeveien 4` og `22334455` skal
meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Fornavn: Solveig
Etternavn: Aune
Adresse: Kirkeveien 4
Telefonnr: 22334455
```

</details>

### Oppgave 2

Lag en klasse `FuelPurchase` som representerer et kjøp av drivstoff.
Klassen skal ha fem private fields:

- stedet bensinstasjonen ligger (en streng)
- type drivstoff (en streng)
- antall liter fylt (et desimaltall)
- prisen per liter (et desimaltall)
- tidspunktet det ble fylt (en streng)

Klassen skal ha en konstruktør som initialiserer alle fieldene, og getter-
og setter-metoder for dem. Lag så en metode `calculateTotalPrice`. Den skal
ikke ha noen parametre, men returnere totalprisen som et desimaltall —
antall liter multiplisert med prisen per liter.

Skriv kode i `main` som oppretter et kjøp på 42,3 liter diesel til 21,49 kr
literen i Oslo, og skriver ut stedet, drivstofftypen og totalprisen med to
desimaler. Prisen med to desimaler får du slik:

    String formattedPrice = String.format("%.2f", totalPrice);

Om du får komma eller punktum som desimaltegn, avhenger av
språkinnstillingene på maskinen din — begge deler er riktig her.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Kjøp hos stasjonen i Oslo
Drivstoff: Diesel
Totalpris: 909,03 kr
```

</details>

### Oppgave 3

Lag en klasse `Clock` med tre private heltalls-fields: `hours`, `minutes`
og `seconds`.

Klassen skal ha en konstruktør som initialiserer alle fieldene, og getter-
og setter-metoder. Setter-metodene skal sjekke at verdiene er gyldige:
timer skal være 0–23, minutter og sekunder 0–59. Er verdien ugyldig, skal
fieldet ikke endres, og det skal skrives ut hvilken verdi som ble avvist.

Lag så en metode `showTime` som viser tiden som tre tall med et kolon
mellom seg: timer, minutter og sekunder, hvert tall skrevet slik det er.
(Sekundet 5 skrives altså `5`, ikke `05`.)

Test i `main`: opprett klokka 14, 32 og 5, sett timen til 15, prøv så å
sette timen til 25, minuttet til −1 og sekundet til 60, og vis tiden igjen.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
14 : 32 : 5
15 : 32 : 5
Ugyldig timetall: 25
Ugyldig minuttall: -1
Ugyldig sekundtall: 60
15 : 32 : 5
```

</details>

### Oppgave 4

Nedenfor ser du en skisse av klassen `Account`. Din oppgave er å erstatte
kommentarene med Java-kode.

```java
// nødvendig(e) import-setning(er)

public class Account
{
    // Fields for kontoinnehaverens navn, kontonummer og saldo.

    // Konstruktør som skal gi startverdier til ALLE fieldene.

    /* Kontoutskrift-metode, som viser kontoinnehaverens navn,
       kontonummer og saldo i et dialogvindu. */

    /* Metode som setter inn et beløp på kontoen.
       Beløpets størrelse skal tas imot via en parameter til metoden.
       Metoden skal returnere en tekst som inneholder informasjon om
       den nye saldoen. */

    /* Metode som tar ut et beløp fra kontoen, under forutsetning av
       at det er dekning for beløpet.
       Uttaksbeløpets størrelse skal tas imot via en parameter til metoden.
       Hvis det er dekning på kontoen, skal metoden returnere en tekst
       med informasjon om den nye saldoen. Hvis det ikke er dekning,
       skal den returnerte teksten inneholde informasjon om det. */

} // end of class Account
```

Nedenfor ser du en skisse av hovedprogrammet du skal bruke til å teste
klassen `Account`. Også her skal du erstatte kommentarene med Java-kode.

```java
// nødvendig(e) import-setning(er)

public class Bank
{
    public static void main(String[] args)
    {
        /* Opprett et Account-objekt som ved opprettelsen får
           navn, kontonummer og saldo. */

        /* Test ut ALLE metodene du har laget i Account-klassen på
           objektet. Skriv resultatene av metodene ut på System.out.
           Bruk dialogvinduer til både innlesing og utskrift av
           kontoinformasjon. */

    }
} // end of class Bank
```

Merk: her må det opprettes to `.java`-filer — `Bank.java` og `Account.java`.

For Natalia Kovalenko med kontonummer 1234.56.78901 og 1000 kr i saldo, et
innskudd på 500, et uttak på 200 og et uttak på 1 000 000, skal utskriften
i terminalen bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Satt inn 500.0 kr. Ny saldo: 1500.0 kr
Tatt ut 200.0 kr. Ny saldo: 1300.0 kr
Ikke dekning for uttak på 1000000.0 kr. Saldo: 1300.0 kr
```

</details>

### Oppgave 5

Det skal lages en klasse `Wind`. Klassen skal, ut fra en oppgitt
vindhastighet i km/t, kunne svare på om det er vindstille (mindre enn
2 km/t) og om det er orkan (mer enn 120 km/t).

Videre skal klassen kunne regne ut hvor mye vindhastigheten tilsvarer på
Beaufort-skalaen (1–12). Formelen er:

    beaufort = ((vindhastighet i km/t) / 3.01)^0.6666 + 0.5

`^` betyr «opphøyd i». Utregningen gjør du med `Math.pow`, slik:

    double result = Math.pow(base, exponent);

Svaret skal returneres som et heltall.

Til slutt skal klassen kunne regne om vindhastigheten til knop i en egen
metode. Én knop er 1,852 km/t.

Slik skal klassen se ut:

```java
public class Wind {
    private double windSpeed;

    // her skal det inn en konstruktør som setter vindhastigheten

    public double getWindSpeed() {
        // sett inn kode her
    }

    public boolean isHurricane() {
        // sett inn kode her
    }

    public boolean isCalm() {
        // sett inn kode her
    }

    public double getKnots() {
        // sett inn kode her
    }

    public int getBeaufort() {
        // sett inn kode her
    }
}
```

Test i `main` med vindhastighetene 15 km/t og 130 km/t. For hver av dem skal
programmet skrive ut de samme fem linjene — vindhastighet, om det er
vindstille, om det er orkan, knop og beaufort — med en blank linje mellom de
to vindhastighetene.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Vindhastighet: 15.0 km/t
Vindstille: false
Orkan: false
Knop: 8.099352051835853
Beaufort: 3

Vindhastighet: 130.0 km/t
Vindstille: false
Orkan: true
Knop: 70.19438444924405
Beaufort: 12
```

</details>

### Oppgave 6

I modul 04 ga du hver bok sitt eget field for butikknavnet. Da bar hver bok
sin egen kopi av navnet, og skulle butikken skifte navn, måtte hver eneste
bok endres.

Lag klassen `Book` med to private fields, `title` og `author`, og en
konstruktør som tar imot begge. Gi klassen i tillegg et **statisk** field
`storeName` med startverdien `"Bokkjelleren"`, og lag:

- en metode `printBookInfo` som skriver ut tittel, forfatter og butikknavn,
  én per linje
- en statisk getter `getStoreName` og en statisk setter `setStoreName`

Skriv kode i `main` som først skriver ut butikknavnet **før du oppretter
noen bøker i det hele tatt**, så oppretter «Sofies verden» av Jostein
Gaarder og «Sult» av Knut Hamsun og skriver ut begge, så endrer
butikknavnet til `"Bokhjørnet"` med setteren, og til slutt skriver ut begge
bøkene på nytt.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Bokhandel: Bokkjelleren
Tittel: Sofies verden
Forfatter: Jostein Gaarder
Selges hos: Bokkjelleren
Tittel: Sult
Forfatter: Knut Hamsun
Selges hos: Bokkjelleren
Tittel: Sofies verden
Forfatter: Jostein Gaarder
Selges hos: Bokhjørnet
Tittel: Sult
Forfatter: Knut Hamsun
Selges hos: Bokhjørnet
```

</details>

### Oppgave 7

Utvid `Book` fra oppgave 6 så hver bok får sitt eget boknummer:

1. Legg til et statisk field som teller hvor mange `Book`-objekter som er
   opprettet.
2. Gi hver bok et field `bookNumber`, som settes i konstruktøren ut fra
   telleren — første bok får nummer 1, neste nummer 2, og så videre.
3. Lag getteren `getBookNumber` og den statiske getteren
   `getBooksRegistered`.

Telleren økes med én i konstruktøren. Skriv den linja nøyaktig slik, uten
`this.` foran:

    booksRegistered++;

Opprett tre bøker i `main` — «Sofies verden», «Sult» og «Kristin
Lavransdatter» av Sigrid Undset — og skriv ut boknumrene og totalen.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Boknummer: 1
Boknummer: 2
Boknummer: 3
Registrerte bøker: 3
```

</details>

### Oppgave 8

Gjør det samme med `Person` fra oppgave 1:

1. Legg til et statisk field som teller hvor mange `Person`-objekter som er
   opprettet.
2. Gi hver person et field `personNumber`, som settes i konstruktøren ut fra
   telleren.
3. Lag en statisk getter som returnerer hvor mange personer som er
   opprettet.

Opprett tre personer i `main` — Solveig Aune, Piotr Nowak og Amina Farah —
og skriv ut personnumrene deres og totalen.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Solveig har personnummer 1
Piotr har personnummer 2
Amina har personnummer 3
Registrerte personer: 3
```

</details>

### Oppgave 9

Skriv et program som skriver ut disse fire verdiene, hver med en ledetekst
foran:

    Integer.MAX_VALUE
    Integer.MIN_VALUE
    Double.MAX_VALUE
    Double.MIN_VALUE

Legg så til en femte linje som skriver ut `Integer.MAX_VALUE + 1`.

**Gjett hva den siste linja skriver ut før du kjører programmet.** Åpne
fasiten først når du har sett resultatet selv.

<details markdown="1">
<summary>Fasit</summary>

```text
Største int: 2147483647
Minste int: -2147483648
Største double: 1.7976931348623157E308
Minste positive double: 4.9E-324
Største int pluss 1: -2147483648
```

Den siste linja gir det *minste* tallet en `int` kan lagre. En `int` har en
fast mengde plass, og når den største verdien økes med 1, er det ikke plass
til svaret — tellingen begynner forfra på den andre enden. Java sier ikke
fra: programmet kjører videre med et tall som er langt fra det du ba om.

Legg merke til hvordan de fire verdiene hentes: klassenavn, punktum,
fieldnavn — `Integer.MAX_VALUE`. Ikke noe `new Integer()` noe sted. Det er
statiske fields, akkurat som telleren i oppgave 7 og 8, og de er merket
`final`, som er dagens neste oppgave.

`Double.MIN_VALUE` overrasker kanskje også: den er ikke det minste tallet en
`double` kan lagre, men det minste *positive*.

</details>

### Oppgave 10

Posten har tre priser: småbrev opp til 20 gram koster 24 kr, storbrev opp
til 350 gram koster 39 kr, og alt over det sendes som pakke til 89 kr.

Lag en klasse `Postage` med et privat field `weightInGrams`, en konstruktør
som setter det, og en metode `getPrice` som returnerer prisen for vekta.

Alle de fem tallene i avsnittet over — tre priser og to vektgrenser — skal
være konstanter: `static final`, med navn i store bokstaver og `_` mellom
ordene.

Lag i tillegg en statisk metode `getHeaviestAllowedWeight` som returnerer
`Double.MAX_VALUE`.

Test i `main` med 18, 120 og 900 gram, og skriv til slutt ut den tyngste
tillatte vekta.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
18 gram koster: 24.0 kr
120 gram koster: 39.0 kr
900 gram koster: 89.0 kr
Tyngste tillatte vekt: 1.7976931348623157E308
```

</details>

### Oppgave 11

Lag en klasse med konstanten

    private static final double VAT_RATE = 0.25;

og en `main` som regner ut og skriver ut momsen på 100 kroner.

Legg så inn denne linja i `main`:

    VAT_RATE = 0.30;

**Gjett hva som skjer når du kompilerer, før du prøver.** Åpne fasiten når
du har sett resultatet selv, og fjern linja etterpå.

<details markdown="1">
<summary>Fasit</summary>

Programmet kompilerer ikke. Kompilatoren melder `cannot assign a value to
final variable VAT_RATE`.

Uten `final` hadde linja kompilert helt fint, og momssatsen ville vært
endret midt i programmet uten at noen la merke til det. `final` er et løfte
til kompilatoren om at verdien er satt én gang for alle — og kompilatoren
holder alle andre til det løftet. Sammenlign med oppgave 9: også der ble en
feil fanget før programmet fikk kjøre.

Selve utregningen skriver ut:

```text
Moms: 25.0 kr
```

</details>

### Oppgave 12

Lag en klasse `Calculator` med fire statiske metoder som tar inn to
desimaltall hver. De fire metodene skal henholdsvis addere, subtrahere,
multiplisere og dividere tallene, og returnere svaret.

Skriv kode i `main` som kaller alle fire med tallene 2,5 og 4,0. Legg merke
til at du ikke trenger å instansiere noe `Calculator`-objekt.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
2.5 + 4.0 = 6.5
2.5 - 4.0 = -1.5
2.5 * 4.0 = 10.0
2.5 / 4.0 = 0.625
```

</details>

### Oppgave 13

Legg inn et vanlig (ikke-statisk) field i `Calculator` fra oppgave 12:

    private double lastResult;

og prøv å lagre svaret i det inne i `add`, slik:

    this.lastResult = a + b;

**Gjett hva kompilatoren sier, før du prøver.** Åpne fasiten når du har sett
resultatet selv, og fjern fieldet etterpå.

<details markdown="1">
<summary>Fasit</summary>

Programmet kompilerer ikke: `non-static variable lastResult cannot be
referenced from a static context`.

`add` er statisk. Den tilhører klassen og kjøres uten at det finnes noe
objekt — derfor finnes det heller ikke noe `this` inne i den. `lastResult`
bor i objekter, og metoden har ingen å hente det fra. Det er ikke en
vilkårlig regel: hvilket objekts `lastResult` skulle den ha skrevet til, når
det ikke er opprettet noen?

En statisk metode kan bruke parametrene sine og statiske fields — ikke
vanlige fields.

</details>

### Oppgave 14

Lag klassen `Tax` med to konstanter: momssatsen på 25 prosent og
passasjeravgiften på 60 kroner.

Klassen skal ha to statiske metoder:

- `computeVAT`, som tar imot en pris uten moms og returnerer momsen
- `getPassengerFee`, som returnerer passasjeravgiften

Skriv så en `main` som regner ut totalprisen for en billett som koster 100
kroner før moms og avgift, og skriver ut totalprisen, billettprisen, momsen
og avgiften.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Pris: 185.0
Billett: 100.0
Moms: 25.0
Passasjeravgift: 60.0
```

</details>

### Oppgave 15

Lag en klasse med en `main`-metode, og gi klassen dette fieldet:

    private int counter = 0;

Prøv så å øke telleren rett fra `main`, med linja `counter++;`.

**Gjett hva kompilatoren sier, før du prøver.** Åpne fasiten når du har sett
resultatet selv.

<details markdown="1">
<summary>Fasit</summary>

Samme feilmelding som i oppgave 13: `non-static variable counter cannot be
referenced from a static context`.

Dette er grunnen. `main` er selv statisk — du har skrevet
`public static void main` i hvert eneste program siden modul 01. Den kjøres
uten at noen har opprettet et objekt av klassen den står i. Et vanlig field
bor i objekter, og `main` har ingen.

Det er to veier videre, og begge er riktige avhengig av hva du vil:

1. Gjør fieldet statisk — da bor det på klassen, som `main` selv.
2. La fieldet være vanlig, og opprett et objekt i `main` å nå det gjennom.

Har du sett `non-static variable ... static context` før uten å forstå den,
vet du nå hva den mente.

</details>

### Oppgave 16

Nå skal `Tax` fra oppgave 14 flyttes inn i sin egen pakke.

1. Lag pakka `pricing` i prosjektet (i IntelliJ: *New → Package*).
2. Flytt `Tax` inn i den, og sett `package pricing;` som første linje i
   fila. Fila skal ligge i mappa `pricing`.
3. Lag en ny klasse `PricingMain` **utenfor** pakka, som importerer `Tax`
   med `import pricing.Tax;` og regner ut den samme prisen som i oppgave 14.

Fjern importen et øyeblikk og se hva kompilatoren sier — sett den så
tilbake.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Pris: 185.0
Moms: 25.0
Passasjeravgift: 60.0
```

</details>

### Oppgave 17

Lag en kopi av `PricingMain` fra oppgave 16 som heter
`PricingStaticImportMain`, og bytt ut importen med en statisk import:

    import static pricing.Tax.computeVAT;
    import static pricing.Tax.getPassengerFee;

Fjern så `Tax.` foran de to metodekallene. Utskriften skal være nøyaktig den
samme som i oppgave 16 — det er bare måten navnene nås på som er endret.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Pris: 185.0
Moms: 25.0
Passasjeravgift: 60.0
```

</details>

### Oppgave 18

Lag to klasser til inne i pakka `pricing`:

- `FeeTable`, med en statisk metode `getHandlingFee` som returnerer 15
  kroner. Metoden skal ikke ha noe tilgangsnivå foran seg i det hele tatt —
  verken `public` eller `private`.
- `FeeReport`, med en `public static` metode `describeFees` som returnerer
  en tekst med både passasjeravgiften fra `Tax` og gebyret fra `FeeTable`.

Lag så `FeeMain` **utenfor** pakka, som skriver ut resultatet av
`FeeReport.describeFees()`.

Prøv til slutt å kalle `FeeTable.getHandlingFee()` direkte fra `FeeMain`.
**Gjett hva som skjer, før du prøver.**

<details markdown="1">
<summary>Fasit</summary>

`FeeMain` skriver ut:

```text
Passasjeravgift: 60.0 kr
Gebyr: 15.0 kr
```

Kallet på `FeeTable.getHandlingFee()` fra `FeeMain` kompilerer ikke:
`getHandlingFee() is not public in pricing.FeeTable; cannot be accessed from
outside package`.

Metoden uten tilgangsnivå er package-private. `FeeReport` ligger i samme
pakke og når den uten videre; `FeeMain` ligger utenfor og ser den ikke i det
hele tatt. Det er slik en pakke kan ha hjelpeklasser som resten av
programmet ikke skal bry seg med — og det er den tomme raden i oversikten
over tilgangsnivåer fra modul 04.

</details>

### Oppgave 19

Vi bygger videre på Gardermoens billettsystem. Det skal nå være mulig å lage
en kvittering til billettene, med kjøpsinformasjon:

- kontonummer
- pris
- billettnummer

Prisen skal inkludere moms på 25 prosent og en passasjeravgift på 60 kroner.

Ta utgangspunkt i `TicketV4.java` fra ukas kodeeksempler — billettklassen med
telleren — og bygg systemet med to pakker:

- `ticketing`, med `Ticket` (navn, personnummer, destinasjon, billettnummer
  fra telleren) og `Receipt` (kontonummer, pris, moms, avgift, totalpris)
- `pricing`, med `Tax`-klassen din fra oppgave 16

`Receipt` skal hente moms og avgift fra `Tax` med statisk import. Les inn
opplysningene med `JOptionPane.showInputDialog`, og skriv billett og
kvittering til terminalen.

For en billett til 100 kroner med kontonummer 1234.56.78901 skal
kvitteringen bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Kvittering for billett nummer: 1
Betalingskonto: 1234.56.78901
Total pris: 185.0
Herav
Billett: 100.0
Moms: 25.0
Passasjeravgift: 60.0
```

</details>

## Del 2 — Les koden

### Oppgave 20

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
public class TicketCounter {
    private static int ticketsIssued = 0;
    private int ticketNr;

    public TicketCounter() {
        ticketsIssued++;
        this.ticketNr = ticketsIssued;
    }

    public int getTicketNr() {
        return this.ticketNr;
    }

    public static int getTicketsIssued() {
        return ticketsIssued;
    }
}
```

```java
TicketCounter first = new TicketCounter();
TicketCounter second = new TicketCounter();
TicketCounter third = new TicketCounter();

System.out.println(first.getTicketNr());
System.out.println(second.getTicketNr());
System.out.println(third.getTicketNr());
System.out.println(TicketCounter.getTicketsIssued());
```

<details markdown="1">
<summary>Fasit</summary>

```text
1
2
3
3
```

Konstruktøren kjøres én gang per objekt. `ticketsIssued` er felles for
klassen, så den teller videre for hvert `new`: 1, 2, 3. `ticketNr` er ett
per objekt, og hver billett beholder tallet telleren hadde akkurat da den
ble opprettet — derfor står de tre billettene igjen med 1, 2 og 3, mens
telleren står på 3.

Legg merke til den siste linja: telleren hentes på **klassen**, ikke på noe
objekt. Den hadde svart 0 selv om ingen billetter var opprettet.

</details>

### Oppgave 21

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
public class CinemaHall {
    private static double ticketPrice = 150.0;
    private String hallName;

    public CinemaHall(String hallName) {
        this.hallName = hallName;
    }

    public void printPrice() {
        System.out.println(this.hallName + ": " + ticketPrice + " kr");
    }

    public static void setTicketPrice(double newPrice) {
        ticketPrice = newPrice;
    }
}
```

```java
CinemaHall bigHall = new CinemaHall("Sal 1");
CinemaHall smallHall = new CinemaHall("Sal 2");

bigHall.printPrice();
smallHall.printPrice();

CinemaHall.setTicketPrice(120.0);

bigHall.printPrice();
smallHall.printPrice();
```

<details markdown="1">
<summary>Fasit</summary>

```text
Sal 1: 150.0 kr
Sal 2: 150.0 kr
Sal 1: 120.0 kr
Sal 2: 120.0 kr
```

Ett kall endret prisen i begge salene. `ticketPrice` finnes bare i ett
eksemplar, på klassen, og begge objektene leser den samme verdien.
`hallName` er derimot ett per objekt, og de to salene beholder hvert sitt
navn.

Sammenlign med modul 04: der ville en prisendring måttet gjøres på hvert
objekt for seg, og salen som ble glemt, hadde blitt stående med gammel
pris.

</details>

### Oppgave 22

Klubben gir hvert nytt medlem et løpende medlemsnummer — første medlem får
nummer 1, neste nummer 2. Men alle tre medlemmene får nummer 1. Hva er
feilen, og hvordan retter du den? Bestem deg for et svar før du åpner
fasiten.

```java
public class MemberCard {
    private int membersRegistered = 0;
    private String name;
    private int memberNr;

    public MemberCard(String name) {
        this.name = name;
        this.membersRegistered++;
        this.memberNr = this.membersRegistered;
    }

    public String getName() {
        return this.name;
    }

    public int getMemberNr() {
        return this.memberNr;
    }
}
```

```java
MemberCard first = new MemberCard("Natalia Kovalenko");
MemberCard second = new MemberCard("Lars Moen");
MemberCard third = new MemberCard("Amina Farah");
```

<details markdown="1">
<summary>Fasit</summary>

`membersRegistered` er et vanlig field. Da får **hvert objekt sin egen
teller**, og hver av dem starter på 0 og økes til 1 i sin egen konstruktør.
Ingen av dem vet noe om de andre — nøyaktig problemet `static` finnes for å
løse.

Rettelsen er ett nøkkelord:

```java
private static int membersRegistered = 0;
```

Da må `this.` også fjernes foran telleren begge steder — den bor ikke i
objektet lenger. `memberNr` skal derimot fortsatt være et vanlig field: det
er personlig for hvert medlem. Rettet skriver programmet ut medlemsnummer
1, 2 og 3.

</details>

### Oppgave 23

Programmet `AirportTicketSystemV4` fra ukas kodeeksempler skriver ingenting
ut. Kjør det med **debuggeren** i stedet:

1. Sett et breakpoint på den første linja i konstruktøren til `TicketV4`.
2. Start programmet med Debug-knappen i stedet for Run-knappen.
3. Programmet stopper på breakpointet. Bruk *Step Over* til å gå én linje om
   gangen, og les av `nrOfTicketsPrinted` og `this.ticketNr` i
   debugger-vinduet.
4. Fortsett til programmet er ferdig.

Hvilke verdier har de to fieldene rett etter hver av de tre `new`-linjene?
Bestem deg for et svar før du åpner fasiten.

<details markdown="1">
<summary>Fasit</summary>

| Etter | `nrOfTicketsPrinted` | `ticket1.ticketNr` | `ticket2.ticketNr` | `ticket3.ticketNr` |
| --- | --- | --- | --- | --- |
| første `new` | 1 | 1 | — | — |
| andre `new` | 2 | 1 | 2 | — |
| tredje `new` | 3 | 1 | 2 | 3 |

Det er verdt å se på i debuggeren nettopp fordi programmet ikke skriver noe
ut: telleren stiger for hver `new`, mens hvert billettobjekt beholder tallet
den fikk. Debuggeren viser deg det statiske fieldet ett sted og de tre
`ticketNr`-verdiene hver for seg — samme bilde som lysbildene i
forelesningen tegnet.

</details>

### Oppgave 24

Hva gjør denne klassen? Beskriv den med én setning. Forklar også hvorfor
begge metodene er statiske. Bestem deg for et svar før du åpner fasiten.

```java
public class TemperatureConverter {
    private static final double FREEZING_POINT_IN_FAHRENHEIT = 32.0;
    private static final double FAHRENHEIT_PER_CELSIUS = 1.8;

    public static double toFahrenheit(double celsius) {
        return celsius * FAHRENHEIT_PER_CELSIUS + FREEZING_POINT_IN_FAHRENHEIT;
    }

    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - FREEZING_POINT_IN_FAHRENHEIT) / FAHRENHEIT_PER_CELSIUS;
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Klassen regner om temperaturer mellom celsius og fahrenheit, begge veier.

Metodene er statiske fordi de ikke trenger tilstanden til noe objekt: alt de
bruker, er parameteren de får inn og de to konstantene, som selv ligger på
klassen. Et `TemperatureConverter`-objekt ville ikke hatt noe å bære —
to slike objekter ville svart nøyaktig likt på alt.

Prøv gjerne kallene `TemperatureConverter.toFahrenheit(20.0)` og
`TemperatureConverter.toCelsius(212.0)`; de gir `68.0` og `100.0`.

</details>

### Oppgave 25

Klassen under kompilerer ikke. Hva er feilen, og hva er de to mulige
rettelsene? Bestem deg for et svar før du åpner fasiten.

```java
public class Shipping {
    private static final double PRICE_PER_KILO = 45.0;
    private int weightInGrams;

    public Shipping(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public static double getShippingPrice() {
        return weightInGrams / 1000.0 * PRICE_PER_KILO;
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

`getShippingPrice` er statisk, men leser `weightInGrams`, som er et vanlig
field: `non-static variable weightInGrams cannot be referenced from a static
context`. Metoden kjøres uten noe objekt, så det finnes ingen vekt å lese.
Legg merke til at `PRICE_PER_KILO` går helt fint i den samme metoden — den
er statisk og ligger på klassen.

De to rettelsene:

1. **La vekta komme inn som parameter** og behold metoden statisk:
   `public static double getShippingPrice(int weightInGrams)`. Da kan den
   kalles uten objekt, som `Math.pow`.
2. **Fjern `static`** og la metoden være en vanlig metode som leser
   objektets eget field, slik `calculateTotalPrice` gjør i oppgave 2.

Hvilken som er riktig, avhenger av om klassen skal bære en vekt i det hele
tatt. Bærer den ingen andre data, er den første ryddigst.

</details>

### Oppgave 26

Gitt klassen:

```java
public class Locker {
    private static int lockersInUse = 0;
    private int lockerNr;

    public Locker(int lockerNr) {
        this.lockerNr = lockerNr;
        lockersInUse++;
    }

    public int getLockerNr() {
        return this.lockerNr;
    }

    public static int getLockersInUse() {
        return lockersInUse;
    }
}
```

og disse fire linjene i `main`:

```java
System.out.println(Locker.getLockersInUse());   // linje A
Locker locker = new Locker(12);
System.out.println(locker.getLockerNr());       // linje B
System.out.println(Locker.getLockerNr());       // linje C
System.out.println(locker.getLockersInUse());   // linje D
```

Hvilke av de fire linjene kompilerer? Bestem deg for et svar på alle fire før
du åpner fasiten.

<details markdown="1">
<summary>Fasit</summary>

Linje A, B og D kompilerer; linje C gjør det ikke.

- **A**: en statisk metode kalt på klassen, før noe objekt finnes. Det er
  hele poenget med statiske metoder. Skriver ut `0`.
- **B**: en vanlig metode kalt på et objekt. Skriver ut `12`.
- **C**: `getLockerNr` er en vanlig metode og trenger et objekt å hente
  `lockerNr` fra. Klassen har ingen — `non-static method getLockerNr()
  cannot be referenced from a static context`.
- **D**: dette kompilerer, men er misvisende. `getLockersInUse` er statisk,
  og svaret har ingenting med akkurat `locker` å gjøre. IntelliJ gir deg en
  advarsel og tilbyr å skrive om til `Locker.getLockersInUse()` — ta imot
  tilbudet, så viser koden hvor verdien faktisk bor.

Regelen bak alle fire: du kan alltid gå fra objekt til klasse, aldri
motsatt.

</details>

### Oppgave 27

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
public class Circle {
    private static final double DEFAULT_RADIUS = 2.0;

    private double radius;

    public Circle() {
        this.radius = DEFAULT_RADIUS;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
```

```java
Circle defaultCircle = new Circle();
Circle bigCircle = new Circle(10.0);

System.out.println(defaultCircle.getArea());
System.out.println(bigCircle.getArea());
```

<details markdown="1">
<summary>Fasit</summary>

```text
12.566370614359172
314.1592653589793
```

Den første sirkelen bruker konstruktøren uten parametre, som setter radien
til konstanten `DEFAULT_RADIUS`, altså 2: arealet blir π · 2² ≈ 12,57. Den
andre får radien 10: π · 10² ≈ 314,16.

`Math.PI` er verdt et blikk. Den er et statisk field på klassen `Math`,
akkurat som `Integer.MAX_VALUE` i oppgave 9 — og akkurat som
`DEFAULT_RADIUS` her. Java skriver sine egne konstanter på nøyaktig samme
måte som du nå skriver dine.

</details>

### Oppgave 28

Gitt klassen:

```java
public class LoginPolicy {
    private static final int MAX_ATTEMPTS = 3;

    public static boolean hasAttemptsLeft(int attemptsUsed) {
        return attemptsUsed < MAX_ATTEMPTS;
    }

    public static String getWarning(int attemptsUsed) {
        return "Du har brukt " + attemptsUsed + " av " + MAX_ATTEMPTS + " forsøk.";
    }
}
```

Forklar hva hvert av de tre ordene `private`, `static` og `final` gjør for
`MAX_ATTEMPTS`, og hva som ville gått galt hvis tallet 3 i stedet sto skrevet
rett inn i de to metodene. Bestem deg for et svar før du åpner fasiten.

<details markdown="1">
<summary>Fasit</summary>

- **`private`**: verdien kan bare nås fra kode inne i klassen selv. Regelen
  om hvor mange forsøk som er lov, er klassens eget anliggende.
- **`static`**: verdien ligger på klassen og finnes i ett eksemplar. Det
  må den, siden begge metodene er statiske og ikke har noe objekt å hente
  den fra.
- **`final`**: verdien kan ikke endres etter at den er satt. Prøver noen,
  nekter kompilatoren — som du så i oppgave 11.

Sto tallet 3 skrevet rett inn begge steder, ville det virket like godt i
dag. Faren kommer den dagen grensa skal endres til 5: den som retter, må
finne begge stedene, og retter hen bare det ene, sier programmet «du har
brukt 4 av 3 forsøk» — to regler som er uenige, uten at noe i koden røper
hvilken som gjelder. Navnet gjør i tillegg tallet lesbart: `MAX_ATTEMPTS`
sier hva 3 betyr, det gjør ikke `3`.

</details>

### Oppgave 29

Butikken skal legge 25 prosent moms på alt. Likevel er `getPriceWithVAT(200)`
og `200 + getVAT(200)` ikke det samme tallet. Hva er feilen, og hvordan
retter du den? Bestem deg for et svar før du åpner fasiten.

```java
public class PriceList {
    public static double getPriceWithVAT(double netPrice) {
        return netPrice + netPrice * 0.25;
    }

    public static double getVAT(double netPrice) {
        return netPrice * 0.20;
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Momssatsen står skrevet inn som et tall to steder, og de to tallene er ikke
like: `0.25` i den ene metoden, `0.20` i den andre. `getPriceWithVAT(200)`
gir 250, mens `200 + getVAT(200)` gir 240.

Rettelsen er ikke å endre `0.20` til `0.25`. Den ville virket i dag og latt
den samme feilen skje igjen ved neste satsendring. Rettelsen er å gi satsen
ett navn og ett sted:

```java
private static final double VAT_RATE = 0.25;
```

og bruke `VAT_RATE` i begge metodene. Da er det ikke lenger *mulig* for de
to å være uenige — og neste satsendring er én linje.

</details>

### Oppgave 30

Klassen `Tax` ligger i pakka `pricing`. Klassen under ligger utenfor pakka og
kompilerer ikke. Hva er feilen, og hva er de to måtene å rette den på? Bestem
deg for et svar før du åpner fasiten.

```java
public class TicketPriceMain {
    public static void main(String[] args) {
        double vat = Tax.computeVAT(100.0);
        System.out.println("Moms: " + vat);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Kompilatoren finner ikke `Tax`: `cannot find symbol — class Tax`. Klassen
finnes, men den bor i en annen pakke, og en klasse utenfor pakka kan ikke
bruke navnet uten videre.

De to rettelsene:

1. **Importer klassen** — `import pricing.Tax;` øverst i fila. Deretter
   virker `Tax.computeVAT(...)` som før.
2. **Skriv hele navnet på stedet** — `pricing.Tax.computeVAT(100.0)`, uten
   noen import. Det er samme mekanisme, bare uten forkortelsen.

Dette er nøyaktig det `import javax.swing.JOptionPane;` har gjort for deg
siden modul 02: `JOptionPane` bor i pakka `javax.swing`.

</details>

### Oppgave 31

Pakka `rates` inneholder disse to klassene:

```java
package rates;

public class RateTable {
    static double getHandlingFee() {
        return 15.0;
    }

    public static double getPassengerFee() {
        return 60.0;
    }
}
```

```java
package rates;

public class RateReport {
    public static double getTotalFees() {
        return RateTable.getHandlingFee() + RateTable.getPassengerFee();   // linje A
    }
}
```

og denne klassen ligger **utenfor** pakka:

```java
import rates.RateTable;

public class RateMain {
    public static void main(String[] args) {
        System.out.println(RateTable.getPassengerFee());   // linje B
        System.out.println(RateTable.getHandlingFee());    // linje C
    }
}
```

Hvilke av de tre linjene kompilerer? Bestem deg for et svar på alle tre før
du åpner fasiten.

<details markdown="1">
<summary>Fasit</summary>

Linje A og B kompilerer; linje C gjør det ikke.

- **A**: `RateReport` ligger i samme pakke som `RateTable`, og når begge
  metodene — også den uten tilgangsnivå.
- **B**: `getPassengerFee` er `public`, altså synlig for alle.
- **C**: `getHandlingFee` har ikke noe tilgangsnivå foran seg — den er
  package-private, synlig bare inne i `rates`. `RateMain` ligger utenfor
  og ser den ikke.

Merk at det ikke hjelper å importere `RateTable`: importen sier bare hvor
klassen bor, den gir ingen tilgang du ikke hadde.

</details>

### Oppgave 32

De to filene under gjør nøyaktig det samme. Hva er forskjellen på dem, og
hva er ulempen med den andre? Bestem deg for et svar før du åpner fasiten.

```java
import pricing.Tax;

public class PriceMainA {
    public static void main(String[] args) {
        System.out.println(Tax.computeVAT(100.0));
    }
}
```

```java
import static pricing.Tax.computeVAT;

public class PriceMainB {
    public static void main(String[] args) {
        System.out.println(computeVAT(100.0));
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Den første importerer **klassen** `Tax`, og metodekallet skrives med
klassenavnet foran. Den andre importerer den **statiske metoden** direkte,
og da kan den kalles uten klassenavn — som om den sto i fila selv.

Ulempen er lesbarhet. I `PriceMainB` ser `computeVAT(100.0)` ut som en
metode som er definert i klassen, og du må helt opp til importlinja for å se
hvor den kommer fra. Med én import går det fint; med fem statiske importer i
samme fil blir det fort umulig å se hvor et navn hører hjemme. Derfor: bruk
statisk import med måte.

</details>

## Del 3 — Velg selv

### Oppgave 33

Fagkvelden til Aune Regnskap trenger et velkomstskilt til kveldens vert.
Skiltet viser arrangementets navn, vertens navn, firma og rolle. Verdiene
står fast i koden — skiltet lages for denne ene kvelden og programmet kjøres
én gang.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Velkommen til Fagkvelden
Solveig Aune
Aune Regnskap AS
Kveldens vert
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 34

På returpunktet er panten 2 kroner for flasker på en halv liter og mindre,
og 3 kroner for de større. Programmet skal kunne svare på hva panten er for
én flaske av en gitt størrelse, og hva samlet pant blir for et gitt antall
små og store flasker.

Programmet skal vise panten for en flaske på 0,33 liter, panten for en
flaske på 1,5 liter, og samlet pant for 6 små og 4 store flasker.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Pant for en 0,33-liter: 2.0 kr
Pant for en 1,5-liter: 3.0 kr
Pant for 6 små og 4 store: 24.0 kr
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 35

I Norge er inntekt opp til 100 000 kr skattefri. Over dette betales en
grunnskatt på 22 prosent av den delen av inntekten som overstiger grensa.
Tjener du 150 000 kr i året, betaler du altså ingenting av de første
100 000, og 22 prosent av de resterende 50 000.

Lag et program som leser inn en årsinntekt og viser hvor mye grunnskatt som
skal betales.

Utvid det så i to trinn:

1. Vi betaler også trinnskatt, som avhenger av hvilke trinn inntekten faller
   innenfor. Satsene finner du på
   <https://www.skatteetaten.no/satser/trinnskatt/>. La programmet regne ut
   trinnskatten også.
2. La programmet vise den totale skatten, og hvor mye av totalen som kommer
   fra grunnskatt og hvor mye fra trinnskatt.

Tallene under er regnet ut med satsene som gjaldt i 2025. Bruker du nyere
satser fra Skatteetaten, blir trinnskatten en annen — grunnskatten er den
samme.

<details markdown="1">
<summary>Forventet utskrift</summary>

Første trinn, for en inntekt på 150 000 kr:

```text
Grunnskatt: 11000.0 kr
```

Andre trinn, for en inntekt på 650 000 kr:

```text
Trinnskatt: 15265.05 kr
```

Tredje trinn, for den samme inntekten på 650 000 kr:

```text
Total skatt: 136265.05 kr
Herav grunnskatt: 121000.0 kr
Herav trinnskatt: 15265.05 kr
```

En inntekt på 150 000 kr havner under det første trinnet, så trinnskatten
der er `0.0`.

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 36

Treningssenteret Puls har medlemmer som alle betaler den samme
månedsprisen, 449 kroner. Prisen justeres av og til for alle på én gang —
fra neste måned er den 499 kroner, og da skal den gjelde alle medlemmer,
også dem som meldte seg inn før justeringen.

Programmet skal skrive ut månedsregningen for Zahra Hassan og Jonas Vik,
gjennomføre prisjusteringen, og skrive ut regningen for begge på nytt.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Zahra Hassan betaler 449.0 kr denne måneden.
Jonas Vik betaler 449.0 kr denne måneden.
Zahra Hassan betaler 499.0 kr denne måneden.
Jonas Vik betaler 499.0 kr denne måneden.
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

## Del 4 — Fra problem til program

### Oppgave 37

Bilal Khan er på jakt etter leilighet, og forteller dette:

> «Jeg har sett på en leilighet på Finn til 51 kvadratmeter. På bildet av
> romplanen står målene på veggene i hvert rom, og jeg har regnet litt på
> baksiden av en konvolutt — jeg får det ikke helt til å stemme. Nå skal jeg
> se på flere leiligheter i helga, og jeg gidder ikke gjøre det for hånd hver
> gang. Jeg vil taste inn målene jeg leser av på romplanen, og få vite hvor
> stor leiligheten faktisk er, så jeg kan se det opp mot arealet de
> reklamerer med. Leilighetene jeg ser på har entré, bad, kjøkken, soverom og
> stue.»

Lag programmet Bilal trenger. Der du må ta et valg beskrivelsen ikke svarer
på, skriv antakelsen din som en kommentar i koden.

Du kan åpne eksempelkjøringen under for å se én godkjent løsning.
Programmet ditt kan oppføre seg annerledes og likevel være riktig.

<details markdown="1">
<summary>Eksempelkjøring</summary>

Med målene fra romplanen til leiligheten Bilal så på — entré 2,4 × 1,6,
bad 2,4 × 2,0, kjøkken 3,9 × 2,4, soverom 3,9 × 3,0 og stue 4,9 × 4,3:

```text
Leiligheten er på 50.77 kvadratmeter
```

</details>
