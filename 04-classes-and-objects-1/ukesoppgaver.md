# Ukesoppgaver — modul 04: klasser og objekter 1

Du trenger bare det du har lært til og med denne uka. Som vanlig er det
flere oppgaver her enn én ukes arbeid — resten er repetisjon.

Ukas kodeeksempler ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/04-classes-and-objects-1/repetisjon-kode>.
Se på dem hvis du står fast — spesielt `TicketV2.java`, som oppgave 14–17
bygger videre på.

Fasit til oppgavene ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/04-classes-and-objects-1/ukesoppgaver-fasit>.
Prøv selv først — bruk fasiten til å sjekke løsningen din etterpå.

## Del 1 — Skriv koden

### Oppgave 1

Lag klassen `Song` med to fields: `title` og `artist`, begge strenger.
Klassen skal ikke ha noen konstruktør eller metoder ennå.

Lag så klassen `Main` med en `main`-metode som instansierer ett
`Song`-objekt, gir begge fieldene verdier direkte med punktum, og skriver
dem ut med `System.out.println` — én linje per field, med en ledetekst
foran verdien. For sangen «Nordnorsk vise» av Halvdan Sivertsen skal
utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Tittel: Nordnorsk vise
Artist: Halvdan Sivertsen
```

</details>

I forelesningen så du hvorfor det å sette fields direkte er en dårlig
løsning i lengden — de neste oppgavene tetter hullet.

### Oppgave 2

Lag en klasse `Book` med disse fieldene:

- `title`
- `price`
- `author`
- `isbn`

Velg selv fornuftige datatyper. Tenk over hvilken datatype som passer for
prisen, og hvilken som passer for et ISBN-nummer.

Klassen skal ha:

- en konstruktør som tar imot alle fire verdiene
- en metode `printBookInfo` som skriver ut en overskrift og deretter hvert
  field på sin egen linje, med en ledetekst foran verdien

Skriv så koden i `main` (i en egen klasse `Main`) som trengs for å
opprette et `Book`-objekt og kalle `printBookInfo` på det. For boka «Sofies
verden» av Jostein Gaarder, som koster 249 kroner og har ISBN
82-03-26000-6, skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Bok
Tittel: Sofies verden
Forfatter: Jostein Gaarder
Pris: 249.0 kr
ISBN: 82-03-26000-6
```

</details>

> Et ISBN-nummer kan begynne med 0 og kan inneholde bindestrek. Hva sier det
> deg om hvilken datatype du bør bruke?

### Oppgave 3

Utvid `main` fra oppgave 2 slik at programmet oppretter **tre**
`Book`-objekter med hver sine verdier og kaller `printBookInfo` på alle
tre. Bruk disse bøkene:

- «Sofies verden», Jostein Gaarder, 249 kr, ISBN 82-03-26000-6
- «Java for begynnere», Kari Nordmann, 549 kr, ISBN 978-82-450-1234-5
- «Sult», Knut Hamsun, 129 kr, ISBN 0-14-044926-9

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Bok
Tittel: Sofies verden
Forfatter: Jostein Gaarder
Pris: 249.0 kr
ISBN: 82-03-26000-6

Bok
Tittel: Java for begynnere
Forfatter: Kari Nordmann
Pris: 549.0 kr
ISBN: 978-82-450-1234-5

Bok
Tittel: Sult
Forfatter: Knut Hamsun
Pris: 129.0 kr
ISBN: 0-14-044926-9
```

</details>

Legg merke til hvor lite som skulle til — og sammenlign med hvordan dette
hadde sett ut med tolv løse variabler.

### Oppgave 4

Alle bøkene selges i samme bokhandel, Bokkjelleren. Utvid `Book` med et
field `storeName` som får verdien `"Bokkjelleren"` **med én gang det
deklareres** — uten at konstruktøren endres. Utvid så `printBookInfo` med
en siste linje som bruker fieldet, slik at hver bok i oppgave 3 skrives ut
med én linje til:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Bok
Tittel: Sofies verden
Forfatter: Jostein Gaarder
Pris: 249.0 kr
ISBN: 82-03-26000-6
Selges hos: Bokkjelleren

Bok
Tittel: Java for begynnere
Forfatter: Kari Nordmann
Pris: 549.0 kr
ISBN: 978-82-450-1234-5
Selges hos: Bokkjelleren

Bok
Tittel: Sult
Forfatter: Knut Hamsun
Pris: 129.0 kr
ISBN: 0-14-044926-9
Selges hos: Bokkjelleren
```

</details>

### Oppgave 5

Konstruktøren i `Book` krever fire verdier. Hva skjer om du gir den noe
annet? To eksperimenter i `main`:

1. Prøv å opprette en bok med bare tre av de fire verdiene:
   `new Book("Sofies verden", 249.0, "Jostein Gaarder")`. Gjett hva som
   skjer før du prøver.
2. Rett opp igjen, og bytt så om tittelen og forfatteren i kallet, slik at
   `"Jostein Gaarder"` står først. Gjett hva som skjer nå — både når du
   kompilerer og når du kjører — før du prøver.

Åpne fasiten først når du har sett begge resultatene selv.

<details markdown="1">
<summary>Fasit</summary>

1. Programmet kompilerer ikke. Kompilatoren teller verdiene i kallet og
   sammenligner med parameterlista — mangler det én, nekter den å
   kompilere. Feilen stoppes altså før programmet i det hele tatt kan
   kjøres.
2. Programmet kompilerer og kjører som om alt er i orden — tittelen og
   forfatteren er begge strenger, så typene stemmer. Men utskriften viser
   verdiene på feil plass: konstruktøren kobler verdier til parametre etter
   **rekkefølgen**, ikke etter hva de betyr. Det er derfor IntelliJ tegner
   parameternavnene (`title:`, `author:`) foran verdiene i kallet — de
   hintene er der for at du skal se akkurat denne feilen.

</details>

### Oppgave 6

Utvid programmet fra oppgave 2 slik at verdiene leses inn fra brukeren i
stedet for å stå fast i koden:

- Les inn hver verdi med `JOptionPane.showInputDialog`.
- Lag en metode `getBookInfo` i `Book` som **returnerer** all
  informasjonen som én streng, og vis den i en meldingsboks med
  `JOptionPane.showMessageDialog`.

Husk at `showInputDialog` alltid gir deg en streng. Skal verdien være et
tall, må du konvertere den med `Integer.parseInt` eller
`Double.parseDouble`. Tips: bruk `\n` for å få linjeskift inne i en streng.

For inndataene `Sofies verden`, `249`, `Jostein Gaarder` og `82-03-26000-6`
skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Tittel: Sofies verden
Forfatter: Jostein Gaarder
Pris: 249.0 kr
ISBN: 82-03-26000-6
```

</details>

### Oppgave 7

Lag en klasse `Person` med disse fieldene:

- `name`
- `address`
- `phoneNumber`
- `birthYear`

Klassen skal ha en konstruktør som tar imot alle fire verdiene.

Lag så to metoder:

1. `calculateAge` — tar **ingen** parametre og regner ut alderen ut fra
   `birthYear`. Metoden skal **returnere** alderen.
2. `printPersonInfo` — tar imot alderen som parameter og skriver ut alle
   opplysningene om personen som én setning: navn, adresse, telefonnummer
   og alder.

Opprett minst to `Person`-objekter i `main` for å teste at det virker. For
Per Hansen (Osloveien 82, 22124512, født 2005) og Agnieszka Kowalska
(Storgata 1, 99887766, født 1998) skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.
Agnieszka Kowalska med adresse Storgata 1 med telefonnummer 99887766 er 28 år.
```

</details>

> `calculateAge` trenger å vite hvilket år det er nå. Den kan ikke spørre
> brukeren, siden den ikke har noen parametre. Legg inn et eget field for
> året og gi det verdien med én gang du deklarerer det.

### Oppgave 8

Utvid oppgave 7 slik at opplysningene leses inn med `showInputDialog`. Lag
en metode `getPersonInfo` som **returnerer** opplysningene som én streng
med fire linjer — navn, adresse, telefonnummer og alder, hver med
ledetekst — og vis den i en meldingsboks.

For inndataene `Per Hansen`, `Osloveien 82`, `22124512` og `2005` skal
meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Navn: Per Hansen
Adresse: Osloveien 82
Telefonnr: 22124512
Alder: 21 år
```

</details>

### Oppgave 9

Ta utgangspunkt i `Person` fra oppgave 7 og lukk klassen: gjør alle
fieldene `private`.

Legg så inn en linje i `main` som prøver å sette et field direkte:
`person1.name = "Noen andre";`. Gjett hva som skjer når du kompilerer, før
du prøver. Åpne fasiten når du har sett resultatet selv, og kommenter ut
linja etterpå.

<details markdown="1">
<summary>Fasit</summary>

Programmet kompilerer ikke. Kompilatoren melder at `name` har `private`
tilgang i `Person` — fieldet kan bare nås fra kode som står inne i klassen
selv. Sammenlign med oppgave 5: også her er en feil flyttet fra kjøretid
til kompileringstid. Før var «noen setter ett field utenfra» noe som stille
kunne gi gale data; nå er det umulig å få kompilert.

</details>

### Oppgave 10

Folk flytter utenlands — et semester på utveksling, en jobb i et annet
land. Da endres adressen, og med lokalt SIM-kort gjerne telefonnummeret
også. Oppdateres bare det ene, sitter registeret igjen med en blanding av
gammelt og nytt. Lag en setter-metode `setContactInfo` som tar imot begge
to og endrer begge.

Forklar med én setning i en kommentar over metoden hvorfor den tar imot
begge verdiene i stedet for å være to metoder.

Test i `main`: skriv ut en person, flytt personen med `setContactInfo`, og
skriv ut på nytt. For Per Hansen som drar på utveksling til København, med
ny adresse Studiestræde 12 og nytt dansk nummer +4540404040, skal
utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.
Per Hansen med adresse Studiestræde 12 med telefonnummer +4540404040 er 21 år.
```

</details>

### Oppgave 11

Klassen skal fortsatt kunne dele ut enkeltopplysninger:

1. Lag getter-metoden `getName`.
2. `birthYear` skal kunne **leses**, men aldri **endres** etter at objektet
   er opprettet. Lag det som trengs — og tenk over hva du må la være å
   lage.

Bruk de to getterne i `main` til å skrive ut én linje med navnet og
fødselsåret:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Per Hansen er født i 2005.
```

</details>

### Oppgave 12

Ingen kan være født i framtida. Legg inn en sjekk i konstruktøren til
`Person`: er fødselsåret større enn året vi er i (du har fieldet for det
fra oppgave 7), skal det skrives ut en advarsel i stedet for at verdiene
lagres.

Test i `main` ved å opprette en person med fødselsår 2030. Utskriften skal
bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Advarsel: fødselsåret kan ikke være i framtida. Personen ble ikke opprettet.
```

</details>

### Oppgave 13

Gjør det samme med `Book` som du gjorde med `Person` — lukk klassen og gi
den reglene sine:

1. Gjør alle fieldene `private`.
2. En bok må ha en tittel. Legg inn en sjekk i konstruktøren: er tittelen
   tom, skal det skrives ut en advarsel i stedet for at verdiene lagres.
3. Prisen kan endres — bokhandelen har salg — men aldri til et negativt
   tall. Lag en setter `setPrice` med den sjekken, og en getter `getPrice`.
4. ISBN-nummeret skal kunne leses, men aldri endres. Hvilken metode lager
   du — og hvilken lar du være å lage?

Tips: `length()`-metoden gir deg antall tegn i en streng, og en tom streng
har lengden 0:

    String title = "";
    int titleLength = title.length();

Test i `main`: opprett en bok med tom tittel, opprett så «Sult» fra
oppgave 3, prøv å sette prisen til −50, sett den til 99 kroner, og skriv
ut prisen med getteren. Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Advarsel: tittelen kan ikke være tom. Boka ble ikke opprettet.
Advarsel: prisen kan ikke være negativ. Prisen ble ikke endret.
Pris: 99.0 kr
```

</details>

### Oppgave 14

Resten av oppgavene i denne delen bygger på billettsystemet fra
forelesningen. Kopier `TicketV2.java` og `AirportTicketSystemV2.java` fra
ukas kodeeksempler som utgangspunkt.

`TicketV2` sjekker at personnummeret har elleve siffer **to** steder — i
konstruktøren og i `setPassengerInfo`. Den samme sjekken står altså to
ganger, og retter noen den ene uten den andre, har klassen to meninger om
hva et gyldig personnummer er.

Flytt sjekken inn i én egen metode `hasValidPersonNr`, som tar imot
personnummeret som parameter og returnerer svaret, og bruk den begge
stedene.

Programmet skal oppføre seg akkurat som før: kjør `AirportTicketSystemV2`
og sjekk at utskriften er uendret.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Billett
Navn: Trym
PersonNr: 24019189765
Destinasjon: Svalbard

Billett
Navn: Kristian
PersonNr: 01107012345
Destinasjon: Svalbard

Billetten går til: Svalbard
```

</details>

Hvilket tilgangsnivå bør `hasValidPersonNr` ha? Bestem deg for et svar og
en begrunnelse før du åpner fasiten.

<details markdown="1">
<summary>Fasit</summary>

`private`. Sjekken er klassens indre anliggende — den finnes for at
konstruktøren og setteren skal være enige, ikke for at koden utenfor skal
kalle den. Gjør du den `public`, lover du omverdenen at metoden finnes og
alltid vil finnes, uten å få noe igjen for løftet.

</details>

### Oppgave 15

De fem siste sifrene i et personnummer er mer følsomme enn de første, og
bør ikke vises hvor som helst.

Lag en metode i `TicketV2` som gir tilbake en maskert versjon av
personnummeret — de seks første sifrene etterfulgt av `xxxxx` — og endre
`printTicketInfo` slik at den bruker den. Kjør `AirportTicketSystemV2`
igjen: `PersonNr`-linjene skal nå vise den maskerte versjonen.

Tips: `myString.substring(startIndex, endIndex)` gir deg en del av en
streng. Det første tegnet har indeks 0, det andre 1, og så videre —
`endIndex` er det første tegnet som *ikke* blir med.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Billett
Navn: Trym
PersonNr: 240191xxxxx
Destinasjon: Svalbard

Billett
Navn: Kristian
PersonNr: 011070xxxxx
Destinasjon: Svalbard

Billetten går til: Svalbard
```

</details>

Bør maskeringsmetoden være `private` eller `public`? Bestem deg for et
svar og en begrunnelse før du åpner fasiten.

<details markdown="1">
<summary>Fasit</summary>

`private` — den brukes bare av `printTicketInfo`, inne i klassen. Gjør du
den `public`, har du bestemt at omverdenen skal kunne hente den maskerte
versjonen. Det kan være et rimelig valg i et større system, men det skal
være et *valg* — hver `public`-metode er en dør du lover å holde åpen.

</details>

### Oppgave 16

De seks første sifrene i personnummeret er fødselsdatoen: to siffer for
dag, to for måned, to for år.

Lag en metode `getBirthDate` i `TicketV2` som returnerer datoen med
punktum mellom delene, for eksempel `24.01.91`. Legg til en linje nederst
i `main` som viser fødselsdatoen til passasjeren som står på billetten.

Siden passasjeren nå er Kristian med personnummer 01107012345, skal linja
bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Passasjeren er født 01.10.70
```

</details>

### Oppgave 17

Med maskeringen fra oppgave 15 har vi laget et problem for oss selv: vi
kan ikke lenger sammenligne personnummeret på billetten med passet til
passasjeren, siden vi bare får se en maskert versjon.

Vi vil fortsatt kunne kontrollere at passasjeren som skal om bord, har
riktig personnummer — uten at det er mulig å hente ut et umaskert
personnummer fra klassen.

Lag en metode som tar imot personnummeret fra passet, gjør kontrollen
**inne i klassen**, og returnerer svaret. Bruk svaret i `main` til å ønske
passasjeren velkommen om bord hvis nummeret stemmer, eller tilkalle PST
hvis det ikke gjør det.

Husk fra modul 03: to strenger sammenlignes med `.equals()`, ikke med
`==`.

<details markdown="1">
<summary>Forventet utskrift</summary>

Hvis nummeret fra passet stemmer med billetten:

```text
Velkommen om bord!
```

og hvis det ikke stemmer:

```text
Tilkall PST!
```

</details>

## Del 2 — Les koden

### Oppgave 18

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
public class GiftCard {
    private String store = "Bokkjelleren";
    private int balance;

    public GiftCard(int balance) {
        this.balance = balance;
    }

    public void spend(int amount) {
        this.balance = this.balance - amount;
    }

    public void printBalance() {
        System.out.println(this.store + ": " + this.balance + " kr igjen");
    }
}
```

```java
GiftCard card1 = new GiftCard(500);
GiftCard card2 = new GiftCard(500);
card1.spend(150);
card1.spend(100);
card2.spend(50);
card1.printBalance();
card2.printBalance();
```

<details markdown="1">
<summary>Fasit</summary>

```text
Bokkjelleren: 250 kr igjen
Bokkjelleren: 450 kr igjen
```

De to objektene har de samme fieldene, men hver sine **verdier** i dem:
`card1` har betalt 150 + 100 og står igjen med 250, mens `card2` bare har
betalt 50. At `spend` kalles på `card1`, rører aldri `card2`. Fieldet
`store` fikk verdien sin allerede ved deklarasjonen, så begge kortene
starter med `"Bokkjelleren"` uten at konstruktøren nevner det.

</details>

### Oppgave 19

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
public class Doorbell {
    public void ring() {
        System.out.println("Ding dong!");
    }

    public void announce() {
        System.out.println("Det er noen på døra.");
    }
}
```

```java
Doorbell doorbell = new Doorbell();
doorbell.ring();
doorbell.ring();
```

<details markdown="1">
<summary>Fasit</summary>

```text
Ding dong!
Ding dong!
```

En metodedefinisjon kjører ikke av seg selv — den kjører når metoden
**kalles**, og da hver gang. `ring` kalles to ganger og kjører to ganger.
`announce` er definert, men aldri kalt, så den linja skrives aldri ut.

</details>

### Oppgave 20

Programmet under skal skrive ut filmens tittel og regissør, men utskriften
viser navnene på feil plass. Hva er feilen, og hvordan retter du den?
Bestem deg for et svar før du åpner fasiten.

```java
public class Movie {
    private String title;
    private String director;

    public Movie(String title, String director) {
        this.title = director;
        this.director = title;
    }

    public void printMovieInfo() {
        System.out.println("Tittel: " + this.title);
        System.out.println("Regissør: " + this.director);
    }
}
```

```java
Movie movie = new Movie("Flåklypa Grand Prix", "Ivo Caprino");
movie.printMovieInfo();
```

<details markdown="1">
<summary>Fasit</summary>

Konstruktøren tilordner i kryss: `this.title = director;` legger
regissøren i tittel-fieldet, og omvendt. Kallet er riktig — det er inne i
konstruktøren byttet skjer. Rettelsen:

```java
this.title = title;
this.director = director;
```

Feilen kompilerer fint, for begge fieldene er strenger. Det er `this` som
holder orden: `this.title` er fieldet, `title` alene er parameteren — og
da må høyresiden faktisk være riktig parameter.

</details>

### Oppgave 21

Gitt klassen:

```java
public class Locker {
    private int code;
    public String owner;

    public Locker(int code, String owner) {
        this.code = code;
        this.owner = owner;
    }

    public int getCode() {
        return this.code;
    }

    private void resetCode() {
        this.code = 0;
    }
}
```

og disse fire linjene i `main`:

```java
Locker locker = new Locker(1234, "Ada");
System.out.println(locker.owner);        // linje A
System.out.println(locker.code);         // linje B
System.out.println(locker.getCode());    // linje C
locker.resetCode();                      // linje D
```

Hvilke av de fire linjene kompilerer? Bestem deg for et svar på alle fire
før du åpner fasiten.

<details markdown="1">
<summary>Fasit</summary>

Linje A og C kompilerer; linje B og D gjør det ikke.

- **A**: `owner` er `public`, så den kan leses fra hvor som helst.
- **B**: `code` er `private` — kompilatoren nekter, akkurat som i oppgave 9.
- **C**: `getCode` er `public`, og det er nettopp den døra klassen har
  åpnet for å lese koden.
- **D**: tilgangsnivåer gjelder metoder også. `resetCode` er `private` og
  kan bare kalles fra kode inne i `Locker`.

I dette kurset ville `owner` også vært `private` — regelen er at fields er
`private`. Her er den `public` nettopp for at du skal se forskjellen.

</details>

### Oppgave 22

Gitt klassen:

```java
public class KeyCard {
    private String pin;

    public KeyCard(String pin) {
        this.pin = pin;
    }

    public void setPin(String oldPin, String newPin) {
        if (this.pin.equals(oldPin)) {
            this.pin = newPin;
        } else {
            System.out.println("Feil pin. Koden ble ikke endret.");
        }
    }

    public boolean checkPin(String attempt) {
        return this.pin.equals(attempt);
    }
}
```

Hva gjør `setPin`, og hva gjør `checkPin`? Beskriv hver av dem med én
setning. Forklar også hvorfor ingen kode utenfor klassen kan få *lest*
pin-koden. Bestem deg for et svar før du åpner fasiten.

<details markdown="1">
<summary>Fasit</summary>

`setPin` endrer pin-koden, men bare hvis den som spør kan bevise at hen
kjenner den gamle. `checkPin` svarer på om et forsøk er riktig, uten å
avsløre hva koden er.

Pin-koden kan ikke leses utenfra fordi fieldet er `private` **og** ingen
metode returnerer det: `checkPin` gir bare `true` eller `false` tilbake.
Klassen har dermed en regel som hele programmet må følge — pin-koden
slipper aldri ut — og regelen står i koden, ikke i hodet til den som
skrev den.

</details>

### Oppgave 23

Konstruktøren i klassen under skal garantere at pin-koden alltid har fire
siffer. Likevel har kortet pin-koden `12` etter at de to linjene i `main`
har kjørt. Hva er feilen, og hvordan retter du den? Bestem deg for et svar
før du åpner fasiten.

```java
public class SimCard {
    private String pin;

    public SimCard(String pin) {
        if (pin.length() == 4) {
            this.pin = pin;
        } else {
            System.out.println("Advarsel: pin-koden må ha fire siffer.");
        }
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
```

```java
SimCard card = new SimCard("1234");
card.setPin("12");
```

<details markdown="1">
<summary>Fasit</summary>

`setPin` har ingen sjekk. Konstruktøren vokter inngangen når objektet
opprettes, men setteren er en åpen bakdør — den tar imot hva som helst og
legger det rett i fieldet. En regel om dataene må håndheves på **alle**
veiene inn, ellers er den ingen regel.

Rettelsen er å legge den samme sjekken i `setPin` — eller enda bedre:
flytte sjekken til én privat metode som både konstruktøren og setteren
bruker, slik du gjorde i oppgave 14.

</details>

### Oppgave 24

Gitt klassen:

```java
public class TravelCard {
    private String cardNumber;
    private int balance;

    public TravelCard(String cardNumber, int balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public void addMoney(int amount) {
        this.balance = this.balance + amount;
    }
}
```

Begge fieldene kan leses utenfra, men bare `balance` kan endres. Hvorfor
har ikke `cardNumber` noen metode som endrer det? Hva ville en
`setCardNumber` ha gjort mulig? Bestem deg for et svar før du åpner
fasiten.

<details markdown="1">
<summary>Fasit</summary>

Kortnummeret er identiteten til kortet — det skal aldri endres etter at
kortet er laget. Klassen får det til uten en eneste sjekk: den bare **lar
være** å lage en setter. En getter uten setter gjør fieldet
skrivebeskyttet utenfra.

En `setCardNumber` ville gjort det mulig å «flytte» saldoen til et annet
kortnummer — og dermed gjort kortnummeret like upålitelig som `name` var i
billettsystemet før fieldene ble `private`. Det du ikke lager, kan ingen
misbruke.

</details>

### Oppgave 25

Programmet under skal legge penger i sparegrisen, men saldoen står stille
på 100 kr uansett hvor mye som settes inn. Hva er feilen, og hvordan
retter du den? Bestem deg for et svar før du åpner fasiten.

```java
public class PiggyBank {
    private int balance;

    public PiggyBank(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        int newBalance = this.balance + amount;
    }

    public void printBalance() {
        System.out.println("Saldo: " + this.balance + " kr");
    }
}
```

```java
PiggyBank bank = new PiggyBank(100);
bank.deposit(50);
bank.printBalance();
```

<details markdown="1">
<summary>Fasit</summary>

`deposit` regner ut riktig sum, men legger den i `newBalance` — en **lokal
variabel** som bare finnes inne i metoden og forsvinner i det metoden er
ferdig. Fieldet `balance` blir aldri oppdatert. Rettelsen er å tilordne
til fieldet:

```java
this.balance = this.balance + amount;
```

Et field lever like lenge som objektet; en lokal variabel lever bare til
metoden er ferdig. Skal noe huskes mellom metodekall, må det inn i et
field.

</details>

### Oppgave 26

Hva skriver programmet ut? Bestem deg for et svar på begge linjene før du
åpner fasiten.

```java
public class Subscription {
    private String name;
    private double monthlyPrice;

    public Subscription(String name, double monthlyPrice) {
        this.name = name;
        this.monthlyPrice = monthlyPrice;
    }

    public double getYearlyPrice() {
        return this.monthlyPrice * 12;
    }
}
```

```java
Subscription music = new Subscription("Musikk", 129.0);
Subscription training = new Subscription("Trening", 399.0);
double total = music.getYearlyPrice() + training.getYearlyPrice();
System.out.println("Til sammen per år: " + total + " kr");
System.out.println(music.getYearlyPrice() > training.getYearlyPrice());
```

<details markdown="1">
<summary>Fasit</summary>

```text
Til sammen per år: 6336.0 kr
false
```

`getYearlyPrice` returnerer en verdi, og da kan kallet brukes som et
uttrykk: legges sammen (129 · 12 + 399 · 12 = 1548 + 4788 = 6336) eller
sammenlignes (1548 er ikke større enn 4788, altså `false`). En metode som
hadde *skrevet ut* årsprisen i stedet for å returnere den, kunne ikke
brukes slik — det er hele forskjellen på `void` og en returtype.

</details>

## Del 3 — Velg selv

### Oppgave 27

Konferansen JavaDagen skal ha et velkomstskilt for én gjest. Skiltet viser
konferansenavnet, gjestens navn, firma og rolle. Verdiene står fast i
koden — programmet lages for denne ene gjesten og kjøres én gang.
Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
JavaDagen
Ada Lovelace
Analytical Engines AS
Foredragsholder
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 28

Kiosken på studenthuset har tre faste varer: kaffe (25 kr, 40 på lager),
bolle (30 kr, 12 på lager) og twist (45 kr, 8 på lager). Programmet skal
vise navn, pris og lagerbeholdning for hver vare, i nøyaktig samme oppsett
for alle tre. Ingen innlesing. Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Vare: Kaffe
Pris: 25 kr
På lager: 40

Vare: Bolle
Pris: 30 kr
På lager: 12

Vare: Twist
Pris: 45 kr
På lager: 8
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 29

Kinoen gir honnørrabatt: gjester som er 67 år eller eldre, betaler 120 kr;
alle andre betaler 150 kr. Programmet kjenner navnet og fødselsåret til to
gjester — Randi Berg, født 1955, og Amir Said, født 1991 — som faste
verdier i koden. For hver gjest skal programmet vise navnet, alderen i år
(regnet fra 2026) og billettprisen. Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Randi Berg er 71 år og betaler 120 kr.
Amir Said er 35 år og betaler 150 kr.
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 30

Turnforeningen registrerer nye medlemmer. Et medlemsnummer skal alltid ha
seks siffer, og uansett hvor i programmet et medlem blir til, skal et
ugyldig nummer gi en advarsel og ikke bli lagret. Programmet leser inn navn
og medlemsnummer for to nye medlemmer, ett medlem om gangen, og skriver ut
én linje per medlem etter hver registrering.

For inndataene `Dawit` med nummer `123456` og `Ola` med nummer `12345` skal
utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Registrert: Dawit (123456)
Advarsel: medlemsnummeret må ha seks siffer. Ola ble ikke registrert.
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

## Del 4 — Fra problem til program

### Oppgave 31

Ingrid driver hundepensjonatet Voff & Vel. Hun beskriver det hun trenger
slik:

> «Når en hund sjekkes inn hos meg, noterer jeg tre ting: hva hunden
> heter, hvem som eier den, og telefonnummeret jeg skal ringe hvis noe
> skjer. I dag står det på lapper, og lapper blir borte. Det jeg trenger,
> er å legge inn disse tre tingene når hunden kommer, og få dem pent opp
> igjen når jeg trenger dem. Og én ting til: folk bytter nummer, eller så
> er det plutselig svigermoren som skal kontaktes i ferien. Da må jeg
> kunne oppdatere hvem jeg ringer — men da vil jeg ha inn både nytt navn
> og nytt nummer samtidig, ellers ender jeg med å ringe riktig person på
> feil nummer. Navnet på hunden, derimot — det skal ingen kunne tukle med
> etter innsjekk. Det står på buret.»

Lag programmet Ingrid trenger. Der du må ta et valg beskrivelsen ikke
svarer på, skriv antakelsen din som en kommentar i koden.

Du kan åpne eksempelkjøringen under for å se én godkjent løsning.
Programmet ditt kan oppføre seg annerledes og likevel være riktig.

<details markdown="1">
<summary>Eksempelkjøring</summary>

```text
Innsjekk registrert:
Hund: Bella
Eier: Amina Yusuf
Telefon: 40404040

Kontakt oppdatert:
Hund: Bella
Eier: Hassan Yusuf
Telefon: 91919191
```

</details>
