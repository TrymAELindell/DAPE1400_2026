# Ukesoppgaver — modul 10: inheritance og composition

Du trenger bare det du har lært til og med denne uka. Som vanlig er det
flere oppgaver her enn én ukes arbeid — resten er repetisjon.

Ukas kodeeksempler ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/10-inheritance-and-composition/repetisjon-kode>.
Se på dem hvis du står fast — de fem prosjektene `CargoHoldV0`,
`CargoHoldV1Inheritance`, `CargoHoldV2Composition`, `CargoHoldV3Composition`
og `CargoHoldV4Aggregation` viser inheritance, composition og aggregation
steg for steg.

Fasit til oppgavene ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/10-inheritance-and-composition/ukesoppgaver-fasit>.
Prøv selv først — bruk fasiten til å sjekke løsningen din etterpå.

## Del 1 — Skriv koden

### Oppgave 1

Klassen `Date` er nesten ferdig — bare `toString` mangler. Fullfør den:

```java
public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private static String getMonthName(int month) {
        String[] names = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober",
                "november", "desember" };
        if (month > 0 && month < 13) {
            return names[month - 1];
        } else {
            return "ukjent måned";
        }
    }

    public String toString() {
        // lag denne: returner datoen som f.eks. "1 mars 2015",
        // med månedsnavnet fra getMonthName
    }
}
```

Lag så klassen `Main` med en `main`-metode som skriver ut datoene 1. mars
2015 og 17. mai 2021, én per linje:

```java
System.out.println(new Date(1, 3, 2015));
System.out.println(new Date(17, 5, 2021));
```

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
1 mars 2015
17 mai 2021
```

</details>

> Husk fra modul 09: har klassen en `toString`, kan du skrive ut objektet
> direkte med `System.out.println`. Ta vare på klassen — du får bruk for
> datoer igjen senere på arket.

### Oppgave 2

Kafeen Kork & Krumkake fører personallister. Klassen `Employee` er gitt:

```java
public class Employee {
    private String name;
    private int hourlyWage;

    public Employee(String name, int hourlyWage) {
        this.name = name;
        this.hourlyWage = hourlyWage;
    }

    public String toString() {
        return name + " (timelønn " + hourlyWage + " kr)";
    }
}
```

- Lag klassen `Barista` som subklasse av `Employee` med `extends`. Den
  skal ikke ha noen egne fields eller metoder — alt arves.
- Konstruktøren skal ta imot navn og timelønn og sende dem videre til
  superklassens konstruktør med `super(...)`.
- Lag klassen `Main` med en `main` som oppretter baristaen Mons med
  timelønn 195 kr og skriver den ut:

```java
Barista barista = new Barista("Mons", 195);
System.out.println(barista);
```

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Mons (timelønn 195 kr)
```

</details>

> Kallet på `super(...)` må være første setning i subklassens konstruktør.
> Og legg merke til at `Barista` ikke har noen `toString` — linjen som
> skrives ut, kommer fra den arvede.

### Oppgave 3

Nå har `Employee` fått en getter for navnet:

```java
public String getName() {
    return name;
}
```

Legg den inn i `Employee` fra oppgave 2. Gi så `Barista` en egen metode,
`serve(String drink)`, som skriver ut navnet på baristaen, ordene
`serverer en` og drikken. I `main` skal du skrive ut baristaen Mons som i
oppgave 2 og så kalle `barista.serve("cortado")`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Mons (timelønn 195 kr)
Mons serverer en cortado
```

</details>

> `name` er `private` i `Employee`, så `Barista` kan ikke bruke fieldet
> direkte, selv om det er arvet. Bruk den arvede `getName()` i stedet.

### Oppgave 4

Lag klassen `ShiftLeader`, også en subklasse av `Employee` fra oppgave 2:

- En skiftleder har i tillegg et eget field: `bonus` — et kronetillegg per
  vakt.
- Konstruktøren tar imot navn, timelønn og bonus, og sender de to første
  videre med `super(...)`.
- `ShiftLeader` skal ha sin egen `toString` som gjenbruker superklassens
  med `super.toString()` og legger til bonusen bakerst, på formen
  `, bonus 150 kr per vakt`.

La `main` opprette skiftlederen Ida og skrive henne ut:

```java
ShiftLeader leader = new ShiftLeader("Ida", 210, 150);
System.out.println(leader);
```

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Ida (timelønn 210 kr), bonus 150 kr per vakt
```

</details>

### Oppgave 5

Bruk `Employee`, `Barista` og `ShiftLeader` fra oppgave 2 og 4. I `main`:

- Opprett en array med superklassetypen — `Employee[]` — med plass til
  10, og legg inn baristaen Mons og skiftlederen Ida.
- Skriv ut alle ansatte med én loop, én per linje. Arrayen er større enn
  antallet ansatte, og de tomme plassene er `null` (modul 07) — sjekk
  `!= null` før du skriver ut.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Mons (timelønn 195 kr)
Ida (timelønn 210 kr), bonus 150 kr per vakt
```

</details>

> Sjekk at skiftlederen får med bonusen sin og baristaen ikke, selv om
> loopen behandler begge som `Employee` — det er polymorfismen som velger
> riktig `toString` for hvert objekt.

### Oppgave 6

Kafeen vil vite hva en vakt koster. Ta med deg `Employee` med `getName`
fra oppgave 3, og `Barista` og `ShiftLeader` fra oppgave 2 og 4.

- Gi `Employee` metoden `calculateShiftPay(int hours)`, som returnerer
  antall timer ganget med timelønnen.
- Skiftlederen får bonusen i tillegg for hver vakt. Overskriv
  `calculateShiftPay` i `ShiftLeader`: kall superklassens versjon med
  `super.calculateShiftPay(hours)` og legg til bonusen.
- I `main`: legg Mons og Ida i en `ArrayList<Employee>`. Gå gjennom lista
  med én loop og skriv ut navnet og lønnen for en vakt på 6 timer, på
  formen `Mons: 1170 kr`. Skriv til slutt summen på en egen linje med
  ledeteksten `Til sammen:`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Mons: 1170 kr
Ida: 1410 kr
Til sammen: 2580 kr
```

</details>

### Oppgave 7

Kafeen har tatt inn en lærling. En lærling får 40 kr mindre i timen enn
timelønnen sin. Fortsett med klassene fra oppgave 6:

- Gi `Employee` getteren `getHourlyWage()`, som returnerer timelønnen.
- Lag klassen `Apprentice` som subklasse av `Employee`. Overskriv
  `calculateShiftPay` slik at lærlingen får `getHourlyWage() - 40` kroner
  per time.
- Legg lærlingen Siri, med timelønn 180 kr, inn bakerst i lista fra
  oppgave 6, og kjør programmet igjen.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Mons: 1170 kr
Ida: 1410 kr
Siri: 840 kr
Til sammen: 3420 kr
```

</details>

> `hourlyWage` er `private` i `Employee`, så `Apprentice` kan ikke lese
> fieldet selv. Den arvede getteren gir tilgang til verdien, mens
> fieldet fortsatt er `private`.

### Oppgave 8

Bare skiftlederen setter opp vaktlista. Bruk `Employee`, `Barista` og
`ShiftLeader` fra oppgave 6.

- Gi `ShiftLeader` metoden `planShift()`, som skriver ut navnet og
  `setter opp vaktlista`.
- I `main`: legg Mons og Ida i en `ArrayList<Employee>`. Skriv ut hver
  ansatt i en loop. Når den ansatte er en skiftleder, skal loopen i
  tillegg kalle `planShift()`. Sjekk med `instanceof`, og cast til
  `ShiftLeader` før du kaller metoden.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Mons (timelønn 195 kr)
Ida (timelønn 210 kr), bonus 150 kr per vakt
Ida setter opp vaktlista
```

</details>

### Oppgave 9

Bruk klassene fra oppgave 8, og skriv disse linjene i `main`:

```java
Employee employee = new Barista("Mons", 195);
ShiftLeader leader = (ShiftLeader) employee;
System.out.println(leader);
```

Kompilerer programmet? Og hva skjer når du kjører det? Bestem deg for et
svar før du kjører. Rett deretter programmet med en `instanceof`-sjekk:
er den ansatte en skiftleder, skrives skiftlederen ut som før. Ellers
skal programmet skrive ut navnet og `er ikke skiftleder`.

<details markdown="1">
<summary>Fasit</summary>

Programmet kompilerer, men krasjer når det kjører:

```text
Exception in thread "main" java.lang.ClassCastException: class Barista cannot be cast to class ShiftLeader (Barista and ShiftLeader are in unnamed module of loader 'app')
```

Kompilatoren ser bare at `employee` har typen `Employee`, og en
`Employee` *kan* være en `ShiftLeader`. Derfor godtar den casten. Men
objektet er en `Barista`, og det oppdager Java først når programmet
kjører. Med `instanceof`-sjekken skriver det rettede programmet ut:

```text
Mons er ikke skiftleder
```

</details>

### Oppgave 10

Sykkelutleien Trå til leier ut sykler per dag. Klassen `Bicycle` er gitt:

```java
public class Bicycle {
    private String brand;
    private int basePrice;

    public Bicycle(String brand, int basePrice) {
        this.brand = brand;
        this.basePrice = basePrice;
    }

    public int computeDayPrice() {
        return basePrice;
    }

    public String toString() {
        return brand + ": " + computeDayPrice() + " kr per dag";
    }
}
```

- Lag klassen `ElectricBike` som subklasse av `Bicycle`, med et eget field
  `rangeKm` — hvor mange kilometer batteriet holder.
- Konstruktøren tar imot merke, grunnpris og rekkevidde.
- `ElectricBike` skal ha sin egen `toString` som gjenbruker superklassens
  og legger til rekkevidden bakerst, på formen `, rekkevidde 80 km`.
- I `main`: skriv ut en vanlig sykkel, DBS med grunnpris 200 kr, og en
  elsykkel, Merida med grunnpris 300 kr og rekkevidde 80 km.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
DBS: 200 kr per dag
Merida: 300 kr per dag, rekkevidde 80 km
```

</details>

### Oppgave 11

En subklasse kan selv ha subklasser. Fortsett med klassene fra
oppgave 10:

- Lag klassen `CargoBike` som subklasse av `ElectricBike` — en
  lastesykkel er en elsykkel som også kan ta last. Den har et eget field
  `maxLoadKg`.
- Konstruktøren tar imot merke, grunnpris, rekkevidde og maks last, og
  sender de tre første videre med `super(...)`.
- `CargoBike` sin `toString` gjenbruker `ElectricBike` sin og legger til
  `, last opptil 100 kg` bakerst.
- I `main`: legg de to syklene fra oppgave 10 og lastesykkelen Butchers,
  med grunnpris 350 kr, rekkevidde 60 km og maks last 100 kg, i en
  `ArrayList<Bicycle>`. Skriv ut alle tre med én loop.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
DBS: 200 kr per dag
Merida: 300 kr per dag, rekkevidde 80 km
Butchers: 350 kr per dag, rekkevidde 60 km, last opptil 100 kg
```

</details>

### Oppgave 12

Nå skal prisene bli riktige. En elsykkel koster grunnprisen pluss 150 kr
i batteritillegg. En lastesykkel koster det samme som en elsykkel, pluss
100 kr. Fortsett med klassene fra oppgave 11:

- `basePrice` er `private` i `Bicycle`. Gi `Bicycle` getteren
  `getBasePrice()`, slik at subklassene kan lese grunnprisen.
- Overskriv `computeDayPrice` i `ElectricBike`, og bruk den arvede
  `getBasePrice()`.
- Overskriv `computeDayPrice` i `CargoBike`. Den skal bygge på
  elsykkelens pris med `super.computeDayPrice()`.
- Kjør `main` fra oppgave 11 igjen, uten å endre den.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
DBS: 200 kr per dag
Merida: 450 kr per dag, rekkevidde 80 km
Butchers: 600 kr per dag, rekkevidde 60 km, last opptil 100 kg
```

</details>

> `toString` står i `Bicycle` og kaller `computeDayPrice()`. Likevel får
> hver sykkel sin egen pris: også dette kallet er polymorft, så versjonen
> til objektets egen klasse kjører.

### Oppgave 13

Kafeen registrerer også stamkundene sine. Klassen `Address` er gitt:

```java
public class Address {
    private String street;
    private String postalCode;
    private String city;

    public Address(String street, String postalCode, String city) {
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String toString() {
        return street + ", " + postalCode + " " + city;
    }
}
```

- Lag klassen `Customer` med to fields: navnet (en streng) og adressen —
  et `Address`-objekt.
- Konstruktøren skal ta imot navn, gate, postnummer og poststed, og selv
  opprette `Address`-objektet — slik `Baggage` oppretter sine
  `Dimensions` i kapitlet.
- `Customer` skal ha en `toString` som viser navn og adresse på én linje,
  med komma mellom de to. La adressedelen komme fra `Address` sin egen
  `toString`.
- Ikke lag noen getter som returnerer `Address`-objektet — del-objektet
  skal være innkapslet i kompositt-objektet.

Prøv med:

```java
Customer customer = new Customer("Nora Vik", "Storgata 12", "2815", "Gjøvik");
System.out.println(customer);
```

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Nora Vik, Storgata 12, 2815 Gjøvik
```

</details>

### Oppgave 14

En mobiltelefon har et batteri. Klassen `Battery` er gitt:

```java
public class Battery {
    private int level;

    public Battery() {
        this.level = 100;
    }

    public int getLevel() {
        return level;
    }

    public void drain(int percent) {
        level = level - percent;
        if (level < 0) {
            level = 0;
        }
    }
}
```

- Lag klassen `Phone` med to fields: modellnavnet og et
  `Battery`-objekt. Konstruktøren tar imot modellnavnet og oppretter
  batteriet selv.
- Metoden `call(int minutes)` bruker 2 prosent av batteriet per minutt.
  Den skal be batteriet om å tappes, med `drain`.
- Metoden `getBatteryLevel()` returnerer batterinivået ved å spørre
  batteriet.
- `toString` viser modellnavnet og batterinivået, på formen
  `Fairphone 5 (batteri 100 %)`.
- `Phone` skal ikke ha noen getter som returnerer `Battery`-objektet.
- I `main`: skriv ut telefonen Fairphone 5, ring i 10 minutter, skriv
  den ut igjen, ring i 45 minutter og skriv den ut en siste gang.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Fairphone 5 (batteri 100 %)
Fairphone 5 (batteri 80 %)
Fairphone 5 (batteri 0 %)
```

</details>

### Oppgave 15

En vannkoker har en vanntank, og den tar maks 1.7 liter. Klassen
`WaterTank` er gitt:

```java
public class WaterTank {
    private double liters;

    public WaterTank() {
        this.liters = 0;
    }

    public double getLiters() {
        return liters;
    }

    public void setLiters(double liters) {
        this.liters = liters;
    }
}
```

`WaterTank` har ingen grense selv — det er vannkokerens jobb.

- Lag klassen `Kettle` med en `WaterTank` som field. Konstruktøren
  oppretter tanken.
- Metoden `fill(double liters)` legger vannet til i tanken hvis det blir
  1.7 liter eller mindre til sammen. Ellers skal den skrive ut
  `Avvist: vannkokeren tar maks 1.7 liter.` og la tanken være som den er.
- Metoden `getWaterLevel()` returnerer hvor mye vann tanken har.
- Ikke lag noen getter som returnerer `WaterTank`-objektet. Da kunne
  hvem som helst fylle tanken forbi grensen.
- I `main`: fyll 0.5 liter, så 1.0 liter og så 0.5 liter. Skriv ut
  vannmengden etter hver fylling, på formen `Vann: 0.5 liter`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Vann: 0.5 liter
Vann: 1.5 liter
Avvist: vannkokeren tar maks 1.7 liter.
Vann: 1.5 liter
```

</details>

### Oppgave 16

Biblioteket har en katalog over bøkene sine, og medlemmene låner bøker
fra den. Klassen `Book` er gitt:

```java
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return title;
    }
}
```

- Lag klassen `Member` med to fields: navnet og en `Book`. Konstruktøren
  tar bare imot navnet — et nytt medlem har ikke lånt noe ennå, så
  `book` er `null`.
- Metoden `borrow(Book book)` tar imot en bok som finnes fra før, og
  lagrer referansen i fieldet.
- Metoden `getBook()` returnerer boka.
- `toString` viser for eksempel `Emma har lånt Sofies verden`. Har
  medlemmet ingen bok, viser den `Emma har ingen bok`.
- I `main`: opprett boka «Sofies verden» og legg den i en
  `ArrayList<Book>` som heter `catalogue`. Opprett medlemmet Emma, og la
  henne låne boka. Skriv ut Emma. Skriv så ut
  `Samme bok i katalogen og hos Emma: ` fulgt av resultatet av
  `catalogue.get(0) == member.getBook()`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Emma har lånt Sofies verden
Samme bok i katalogen og hos Emma: true
```

</details>

> `==` på to referanser er `true` bare når de refererer til *det samme*
> objektet (modul 09). Boka finnes én gang, og både katalogen og Emma
> har en referanse til den.

### Oppgave 17

Utvid `Member` fra oppgave 16 med metoden `returnBook()`, som setter
`book` tilbake til `null`. I `main`: la Emma låne «Sofies verden» og
skriv henne ut. La henne levere boka tilbake, og skriv henne ut igjen.
Skriv til slutt ut den første boka i katalogen, med ledeteksten
`Katalogen har fortsatt:`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Emma har lånt Sofies verden
Emma har ingen bok
Katalogen har fortsatt: Sofies verden
```

</details>

### Oppgave 18

Idrettslaget har to fotballag, G12 og G14, med samme trener. Klassen
`Coach` er gitt:

```java
public class Coach {
    private String name;
    private String phone;

    public Coach(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return name + " (tlf " + phone + ")";
    }
}
```

- Lag klassen `Team` med to fields: lagets navn og en `Coach`.
  Konstruktøren tar imot navnet og et `Coach`-objekt som finnes fra før.
- Metoden `getCoach()` returnerer treneren.
- `toString` viser lagets navn og treneren, på formen
  `G12, trener Kari (tlf 41234567)`.
- I `main`: opprett treneren Kari med telefonnummer 41234567, og la både
  G12 og G14 få det samme `Coach`-objektet. Skriv ut begge lagene. Endre
  så telefonnummeret til 99887766 gjennom `getCoach()` på G12, og skriv ut
  begge lagene igjen.
- G14 får ny trener neste sesong. Gi `Team` metoden `removeCoach()`, som
  setter `coach` til `null`. Når laget ikke har noen trener, skal
  `toString` vise for eksempel `G14, ingen trener`. Fjern treneren fra
  G14, og skriv ut begge lagene en siste gang.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
G12, trener Kari (tlf 41234567)
G14, trener Kari (tlf 41234567)
G12, trener Kari (tlf 99887766)
G14, trener Kari (tlf 99887766)
G12, trener Kari (tlf 99887766)
G14, ingen trener
```

</details>

### Oppgave 19

To `Date`-objekter fra oppgave 1 med samme dag, måned og år er to
forskjellige objekter, så `==` gir `false`. Den arvede `equals` fra
`Object` gjør det samme. Overskriv `equals` i `Date`, slik at to datoer
er like når dag, måned og år er like:

```java
public boolean equals(Object other) {
    // sett inn kode her
}
```

Parameteren har typen `Object`, fordi det er slik `equals` er deklarert i
`Object` — og overriding krever samme signatur. Sjekk derfor først med
`instanceof` at `other` er en `Date`, og cast den. Er den ikke en `Date`,
skal metoden returnere `false`.

I `main`: opprett to datoer for 17. mai 2021 og én for 1. mars 2015.
Skriv ut, én per linje: om de to første er `==`, om de to første er
`equals`, og om den første er `equals` med 1. mars 2015.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
false
true
false
```

</details>

> Inne i `Date` kan du lese fieldene til et annet `Date`-objekt direkte,
> for eksempel `date.day`. `private` betyr «bare synlig i klassen der det
> er deklarert», og koden står i den samme klassen.

### Oppgave 20

Konserthuset selger seter med rad og setenummer. Lag klassen `Seat` med
fields for rad og setenummer, og:

- en `toString` på formen `Rad 5, sete 12`
- en `equals` som overskriver den arvede, slik at to seter er like når
  både rad og setenummer er like — på samme måte som i oppgave 19

I `main`: legg de solgte setene rad 5 sete 11, rad 5 sete 12 og rad 6
sete 3 i en `ArrayList<Seat>`. En kunde vil ha rad 5 sete 12 eller rad 5
sete 13. Sjekk hvert av de to ønskede setene mot lista med `equals` i en
loop. Skriv ut setet fulgt av `er allerede solgt` eller `er ledig`, på
formen `Rad 5, sete 13 er ledig`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Rad 5, sete 12 er allerede solgt
Rad 5, sete 13 er ledig
```

</details>

## Del 2 — Les koden

### Oppgave 21

Hva skriver programmet ut — og i hvilken rekkefølge? Bestem deg for et
svar før du åpner fasiten.

```java
public class Instrument {
    public Instrument() {
        System.out.println("Instrument klart");
    }
}

public class Guitar extends Instrument {
    public Guitar() {
        System.out.println("Gitar stemt");
    }
}

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
Instrument klart
Gitar stemt
```

`Guitar` sin konstruktør kaller ikke `super()` selv — da gjør Java det
automatisk, som aller første setning. Superklassens del av objektet
initialiseres alltid før subklassens, så `Instrument` sin konstruktør
kjører først.

</details>

### Oppgave 22

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
public class Player {
    public void describeRole() {
        System.out.println("Spiller på laget");
    }
}

public class Goalkeeper extends Player {
    public void describeRole() {
        System.out.println("Står i mål");
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Goalkeeper();

        player1.describeRole();
        player2.describeRole();
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
Spiller på laget
Står i mål
```

Begge variablene har typen `Player`, men `player2` refererer til et
`Goalkeeper`-objekt. `Goalkeeper` overskriver `describeRole`, og det er
polymorfismen fra kapitlet som gjør at objektets egen versjon kjører —
ikke versjonen til variabelens type.

</details>

### Oppgave 23

Hva skriver programmet ut? Og hvilke av `greet`-metodene er overloading,
og hvilken er overriding? Bestem deg for et svar før du åpner fasiten.

```java
public class Greeter {
    public void greet() {
        System.out.println("Hei!");
    }

    public void greet(String name) {
        System.out.println("Hei, " + name + "!");
    }
}

public class PoliteGreeter extends Greeter {
    public void greet() {
        System.out.println("God dag!");
    }
}

public class Main {
    public static void main(String[] args) {
        Greeter greeter = new PoliteGreeter();
        greeter.greet();
        greeter.greet("Ola");
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
God dag!
Hei, Ola!
```

De to `greet`-metodene i `Greeter` er overloading: samme navn, forskjellig
parameterliste, i samme klasse. `greet()` i `PoliteGreeter` er overriding:
den har samme signatur som `greet()` i `Greeter` og erstatter den. Det
første kallet kjører derfor `PoliteGreeter` sin versjon. `PoliteGreeter`
overskriver ikke `greet(String)`, så det andre kallet kjører den arvede
versjonen fra `Greeter`.

</details>

### Oppgave 24

Hva skriver linje A, B og C ut? Bestem deg for et svar før du åpner
fasiten.

```java
public class Locker {
    private int row;
    private int number;

    public Locker(int row, int number) {
        this.row = row;
        this.number = number;
    }
}

public class Ticket {
    private String code;

    public Ticket(String code) {
        this.code = code;
    }

    public boolean equals(Object other) {
        if (other instanceof Ticket) {
            Ticket ticket = (Ticket) other;
            return code.equals(ticket.code);
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Locker locker1 = new Locker(3, 7);
        Locker locker2 = new Locker(3, 7);
        Ticket ticket1 = new Ticket("A17");
        Ticket ticket2 = new Ticket("A17");

        System.out.println(locker1.equals(locker2)); // linje A
        System.out.println(ticket1 == ticket2);      // linje B
        System.out.println(ticket1.equals(ticket2)); // linje C
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
false
false
true
```

Linje A: `Locker` har ingen egen `equals`, så den arvede fra `Object`
kjører. Den sammenligner referansene, og `locker1` og `locker2` refererer
til to forskjellige objekter. Linje B: `==` sammenligner også
referansene, uansett hva klassen har av metoder. Linje C: `Ticket`
overskriver `equals` og sammenligner koden, og begge billettene har koden
`A17`.

</details>

### Oppgave 25

Programmet under kompilerer ikke. Hva er feilen, og hvordan retter du
den? Bestem deg for et svar før du åpner fasiten.

```java
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }
}

public class Ebook extends Book {
    private double fileSizeMb;

    public Ebook(String title, double fileSizeMb) {
        this.fileSizeMb = fileSizeMb;
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

`Ebook` sin konstruktør kaller ikke `super(...)`. Da prøver Java
automatisk å kalle superklassens konstruktør *uten* parametre. Men den
finnes ikke. Fra modul 09 vet vi at den automatiske tomme konstruktøren
forsvinner når klassen definerer en konstruktør selv. `Book` har bare
konstruktøren som tar en tittel. Rettelsen er å kalle superklassens
konstruktør som første setning. Da får tittelen samtidig verdien sin:

```java
public Ebook(String title, double fileSizeMb) {
    super(title);
    this.fileSizeMb = fileSizeMb;
}
```

</details>

### Oppgave 26

Programmet under kompilerer ikke. Hva er feilen, og hvordan retter du
den slik at kaktusen fortsatt sier «Au!»? Bestem deg for et svar før du
åpner fasiten.

```java
import java.util.ArrayList;

public class Plant {
    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public void water() {
        System.out.println(name + " får vann");
    }
}

public class Cactus extends Plant {
    public Cactus(String name) {
        super(name);
    }

    public void prick() {
        System.out.println("Au!");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Plant> plants = new ArrayList<>();
        plants.add(new Plant("Monstera"));
        plants.add(new Cactus("Kaktusen"));

        for (Plant plant : plants) {
            plant.water();
            plant.prick();
        }
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

`plant` har typen `Plant`, og `Plant` har ingen metode som heter `prick`.
Kompilatoren vet ikke mer om `plant` enn typen den er deklarert med, så
`plant.prick()` gir kompileringsfeil — selv om det ene objektet faktisk
er en `Cactus`. Rettelsen er å sjekke typen og caste før kallet:

```java
for (Plant plant : plants) {
    plant.water();
    if (plant instanceof Cactus) {
        Cactus cactus = (Cactus) plant;
        cactus.prick();
    }
}
```

Da skriver programmet ut:

```text
Monstera får vann
Kaktusen får vann
Au!
```

</details>

### Oppgave 27

`SavingsAccount` er en subklasse av `Account`. Hvilke av linjene A, B og C
kompilerer, og hvorfor? Bestem deg for et svar før du åpner fasiten.

```java
public class Account {
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    protected int getBalance() {
        return balance;
    }

    public void printBalance() {
        System.out.println("Saldo: " + balance + " kr");
    }
}

public class SavingsAccount extends Account {
    public SavingsAccount(int balance) {
        super(balance);
    }

    public void printReport() {
        System.out.println(balance);      // linje A
        System.out.println(getBalance()); // linje B
        printBalance();                   // linje C
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Linje B og C kompilerer, linje A gjør det ikke.

- Linje A: `balance` er `private` i `Account`. Fieldet er arvet, men
  `private` betyr «bare synlig i klassen der det er deklarert», så
  `SavingsAccount` kan ikke bruke det direkte.
- Linje B: `getBalance` er `protected`, og det gir subklassene tilgang.
  Men se tabellen i kapitlet: `protected` gir også tilgang til alle
  klasser i samme pakke. I et prosjekt der alle klassene ligger rett i
  `src`, er alle i samme pakke. Der stenger `protected` altså ingen ute.
- Linje C: `printBalance` er `public`, og det gir alle tilgang.

Rettelsen for linje A er å gjøre som linje B: bruk getteren.

</details>

### Oppgave 28

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
public class Engine {
    private int hours;

    public void run(int hours) {
        this.hours += hours;
    }

    public int getHours() {
        return hours;
    }
}

public class Boat {
    private String name;
    private Engine engine;

    public Boat(String name) {
        this.name = name;
        this.engine = new Engine();
    }

    public void takeTrip(int hours) {
        engine.run(hours);
    }

    public String toString() {
        return name + ": motoren har gått " + engine.getHours() + " timer";
    }
}

public class Main {
    public static void main(String[] args) {
        Boat seagull = new Boat("Måken");
        Boat tern = new Boat("Terna");
        seagull.takeTrip(3);
        seagull.takeTrip(2);
        tern.takeTrip(4);
        System.out.println(seagull);
        System.out.println(tern);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
Måken: motoren har gått 5 timer
Terna: motoren har gått 4 timer
```

Hver båt oppretter sitt eget `Engine`-objekt i konstruktøren. Det er
composition: motoren er et del-objekt som hører til én båt. Turene til
Måken teller derfor bare på Måkens motor, og Terna har sin egen.

</details>

### Oppgave 29

Hva skriver programmet ut? Sammenlign med oppgave 28 før du åpner
fasiten.

```java
public class Printer {
    private int pagesLeft;

    public Printer(int pagesLeft) {
        this.pagesLeft = pagesLeft;
    }

    public void print(int pages) {
        pagesLeft -= pages;
    }

    public int getPagesLeft() {
        return pagesLeft;
    }
}

public class Office {
    private String name;
    private Printer printer;

    public Office(String name, Printer printer) {
        this.name = name;
        this.printer = printer;
    }

    public void printReport(int pages) {
        printer.print(pages);
    }

    public String toString() {
        return name + ": " + printer.getPagesLeft() + " ark igjen";
    }
}

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(500);
        Office sales = new Office("Salg", printer);
        Office storage = new Office("Lager", printer);
        sales.printReport(120);
        storage.printReport(30);
        System.out.println(sales);
        System.out.println(storage);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
Salg: 350 ark igjen
Lager: 350 ark igjen
```

`Office` oppretter ikke skriveren selv — den får et `Printer`-objekt
utenfra gjennom konstruktøren. Begge kontorene får referansen til *det
samme* objektet, så begge utskriftene tar ark fra den samme skriveren:
500 − 120 − 30 = 350. Det er aggregation: skriveren lever uavhengig av
kontorene, og de deler den.

</details>

### Oppgave 30

Klassen `Classroom` har to fields av en annen klassetype. Hvilket av dem
er composition, og hvilket er aggregation? Pek på koden som avgjør det.
Bestem deg for et svar før du åpner fasiten.

```java
public class Classroom {
    private Whiteboard whiteboard;
    private Teacher teacher;

    public Classroom(Teacher teacher) {
        this.whiteboard = new Whiteboard();
        this.teacher = teacher;
    }

    public void writeOnBoard(String text) {
        whiteboard.write(text);
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

`whiteboard` er composition. Konstruktøren oppretter tavla selv, med
`new Whiteboard()`, og ingen metode gir ut referansen til den. Utenfra
kan man bare bruke tavla gjennom `writeOnBoard` — del-objektet er
innkapslet i kompositt-objektet.

`teacher` er aggregation. Læreren kommer utenfra, gjennom konstruktøren
og `setTeacher`, så objektet fantes før klasserommet. Og `getTeacher`
deler referansen videre. Læreren lever uavhengig av klasserommet og kan
godt undervise i flere klasserom.

</details>

### Oppgave 31

Klassen `Aquarium` skal holde vanntemperaturen mellom 22 og 26 grader,
og `setTemperature` avviser alt utenfor. Likevel klarer `main` å sette
temperaturen til 40 grader. Hvordan? Og hva må endres i `Aquarium` for å
tette hullet? Bestem deg for et svar før du åpner fasiten.

```java
public class Heater {
    private double temperature;

    public Heater(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

public class Aquarium {
    private Heater heater;

    public Aquarium() {
        this.heater = new Heater(24);
    }

    public void setTemperature(double temperature) {
        if (temperature >= 22 && temperature <= 26) {
            heater.setTemperature(temperature);
        } else {
            System.out.println("Avvist: " + temperature + " grader er utenfor 22-26.");
        }
    }

    public Heater getHeater() {
        return heater;
    }
}

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.setTemperature(40);
        aquarium.getHeater().setTemperature(40);
        System.out.println(aquarium.getHeater().getTemperature());
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
Avvist: 40.0 grader er utenfor 22-26.
40.0
```

Første forsøk går gjennom `Aquarium.setTemperature` og blir avvist. Men
`getHeater` returnerer *referansen til del-objektet* — og den som har
referansen, har objektet. `main` går rundt akvariet og snakker direkte
med varmeren, som ikke har noen egen temperatursjekk. Det er
referanselekkasjen fra kapitlet: del-objektet skal være innkapslet i
kompositt-objektet. Rettelsen er å fjerne `getHeater` — og heller la
`Aquarium` tilby en egen `getTemperature` som sender spørsmålet videre
til varmeren.

</details>

### Oppgave 32

Programmet under kompilerer, men krasjer når det kjører. Hva skriver det
ut før det krasjer, hva er feilen, og hvordan retter du den? Bestem deg
for et svar før du åpner fasiten.

```java
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class Member {
    private String name;
    private Book book;

    public Member(String name) {
        this.name = name;
    }

    public void borrow(Book book) {
        this.book = book;
    }

    public void returnBook() {
        this.book = null;
    }

    public void printLoan() {
        System.out.println(name + " har lånt " + book.getTitle());
    }
}

public class Main {
    public static void main(String[] args) {
        Member member = new Member("Jonas");
        member.borrow(new Book("Doppler"));
        member.printLoan();
        member.returnBook();
        member.printLoan();
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
Jonas har lånt Doppler
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Book.getTitle()" because "this.book" is null
```

I aggregation kan forholdet ta slutt: etter `returnBook` er `book` `null`.
Det andre kallet på `printLoan` prøver da å kalle `getTitle()` gjennom en
`null`-referanse. Rettelsen er å sjekke `book == null` først:

```java
public void printLoan() {
    if (book == null) {
        System.out.println(name + " har ingen bok");
    } else {
        System.out.println(name + " har lånt " + book.getTitle());
    }
}
```

Da blir den andre linjen `Jonas har ingen bok`.

</details>

## Del 3 — Velg selv

### Oppgave 33

Kafeen hadde seks kaffesalg i dag: 42, 55, 38, 55, 63 og 47 kroner. Lag
et program som viser det høyeste salget og gjennomsnittet på hver sin
linje, med ledetekstene `Høyeste salg:` og `Gjennomsnitt:` og `kr` etter
tallet.

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Høyeste salg: 63 kr
Gjennomsnitt: 50.0 kr
```

</details>

### Oppgave 34

Kinoen i byen selger to typer billetter: ordinær til 140 kr og honnør
til 70 kr. Lag et program som registrerer disse fem solgte billettene, i
denne rekkefølgen: ordinær, honnør, ordinær, ordinær, honnør — og så
skriver ut én kvitteringslinje per billett, på formen `Ordinær: 140 kr`, og
til slutt summen på en egen linje med ledeteksten `Til sammen:`.

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Ordinær: 140 kr
Honnør: 70 kr
Ordinær: 140 kr
Ordinær: 140 kr
Honnør: 70 kr
Til sammen: 560 kr
```

</details>

### Oppgave 35

Postkontoret på hjørnet sender brev og pakker. Et brev koster 25 kr,
uansett hvor mye det veier. En pakke koster 60 kr pluss 10 kr per kilo.
Lag et program som registrerer disse fire sendingene, i denne
rekkefølgen: et brev, en pakke på 3 kg, en pakke på 12 kg og et brev.
Programmet skal skrive ut én linje per sending med typen og prisen — for
pakkene også vekten i parentes — og til slutt summen på en egen linje med
ledeteksten `Til sammen:`.

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Brev: 25 kr
Pakke (3 kg): 90 kr
Pakke (12 kg): 180 kr
Brev: 25 kr
Til sammen: 320 kr
```

</details>

### Oppgave 36

Bakeriet Hvete & Heder selger vanlige kaker og bryllupskaker. Prisen på
en vanlig kake er fast. Prisen på en bryllupskake regnes ut fra en
grunnpris pluss 500 kr per ekstra etasje. Lag et program som
registrerer en vanlig kake — Sjokoladekake, 350 kr — og en bryllupskake
basert på Marsipankake med grunnpris 450 kr og 3 ekstra etasjer, og som
skriver ut én linje per kake på formen `Sjokoladekake: 350 kr`. For
bryllupskaken skal det stå `(bryllupskake)` etter navnet.

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Sjokoladekake: 350 kr
Marsipankake (bryllupskake): 1950 kr
```

</details>

### Oppgave 37

Firmaet Frakt & Fjell har hyller på lageret og varebiler på veien. Både
en hylle og en varebil har en maksvekt, og begge skal nekte å ta imot en last som gjør dem for
tunge. Lag et program der hylla «Hylle A», med maks 200 kg, får en last
på 120 kg og så en på 100 kg, og varebilen «Varebil 1», med maks
1000 kg, får en last på 800 kg og så en på 150 kg. For hver last skal
programmet skrive ut om lasten ble lagt inn, på formen
`Hylle A: 120 kg lagt inn, totalt 120 kg`, eller avvist, på formen
`Hylle A: 100 kg avvist, maks er 200 kg`.

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Hylle A: 120 kg lagt inn, totalt 120 kg
Hylle A: 100 kg avvist, maks er 200 kg
Varebil 1: 800 kg lagt inn, totalt 800 kg
Varebil 1: 150 kg lagt inn, totalt 950 kg
```

</details>

### Oppgave 38

Treningssenteret Puls & Pust gir hvert medlem et eget skap og en
personlig trener. Treneren Anders, med telefonnummer 90011223, har
medlemmene Lise, med skap 14, og Omar, med skap 27. Lag et program som
skriver ut en oversikt med én linje per medlem, på formen
`Lise: skap 14, trener Anders (tlf 90011223)`. Så får Anders nytt telefonnummer, 45566778,
og programmet skal skrive ut oversikten på nytt — nå med det nye
nummeret hos begge medlemmene.

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Lise: skap 14, trener Anders (tlf 90011223)
Omar: skap 27, trener Anders (tlf 90011223)
Lise: skap 14, trener Anders (tlf 45566778)
Omar: skap 27, trener Anders (tlf 45566778)
```

</details>

### Oppgave 39

To prosjektgrupper, «Gruppe Nord» og «Gruppe Sør», bruker det samme
møterommet, «Møterom 1». Lag et program som først viser hvilket rom hver
gruppe bruker, og om rommet er ledig, på formen
`Gruppe Nord bruker Møterom 1 (ledig)`. Så booker Gruppe Nord rommet, og
programmet skriver ut `Gruppe Nord booker Møterom 1`. Etterpå prøver
Gruppe Sør å booke det samme rommet. Rommet er opptatt, så bookingen går
ikke, og programmet skriver ut
`Gruppe Sør kan ikke booke Møterom 1, det er opptatt`. Til slutt skal
programmet vise de to gruppene på nytt — og begge skal nå se at rommet er
opptatt.

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Gruppe Nord bruker Møterom 1 (ledig)
Gruppe Sør bruker Møterom 1 (ledig)
Gruppe Nord booker Møterom 1
Gruppe Sør kan ikke booke Møterom 1, det er opptatt
Gruppe Nord bruker Møterom 1 (opptatt)
Gruppe Sør bruker Møterom 1 (opptatt)
```

</details>

### Oppgave 40

Padleklubben leier ut kajakker, og hver kajakk skal holde oversikt over
hvor mange ganger den er leid ut. En kajakk kan bare ha én leietaker om
gangen. Lag et program der Kari leier «Kajakk 3». Ola prøver å leie den
samme kajakken mens Kari har den, men får ikke lov. Så leverer Kari
kajakken tilbake, og Ola leier den. Programmet skal skrive ut en linje
for hvert forsøk, på formen `Kari leier Kajakk 3`,
`Ola kan ikke leie Kajakk 3, den er utleid` og `Kari leverer Kajakk 3`.
Til slutt skal det skrive ut hvor mange ganger kajakken er leid ut, på formen
`Kajakk 3 er leid ut 2 ganger`.

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Kari leier Kajakk 3
Ola kan ikke leie Kajakk 3, den er utleid
Kari leverer Kajakk 3
Ola leier Kajakk 3
Kajakk 3 er leid ut 2 ganger
```

</details>

## Del 4 — Fra problem til program

### Oppgave 41

Solveig driver hundepensjonatet Hale & Labb. Hun beskriver det hun
trenger slik:

> «Folk leverer hundene sine her når de skal på ferie. For hver hund
> noterer jeg navnet på hunden, navnet på eieren og hvor mange netter
> den skal bo. Små hunder koster 250 kr natta, store 400 kr. Når dagen
> er slutt, vil jeg se en oversikt over hundene som bor her, hva
> oppholdet til hver av dem koster, og hva jeg tjener til sammen.»

Lag programmet Solveig trenger. Der du må ta et valg beskrivelsen ikke
svarer på, skriv antakelsen din som en kommentar i koden.

Du kan åpne eksempelkjøringen under for å se én godkjent løsning.
Programmet ditt kan oppføre seg annerledes og likevel være riktig.

<details markdown="1">
<summary>Eksempelkjøring</summary>

Solveig registrerer Bella (liten, eier Kari, 3 netter) og Rex (stor, eier
Ove, 2 netter). Oversikten blir:

```text
Bella (eier Kari): 750 kr
Rex (eier Ove): 800 kr
Til sammen: 1550 kr
```

</details>

### Oppgave 42

Randi driver bruktforhandleren Gjøvik Bil og MC. Hun beskriver det hun
trenger slik:

> «Vi selger både biler og motorsykler, og i dag står alt i en gammel
> papirprotokoll. For hvert kjøretøy fører jeg opp typebetegnelsen —
> sånn som Audi A6 eller Yamaha MT-07 — datoen det ble
> førstegangsregistrert, og kjennetegnet, altså skiltnummeret. For
> bilene noterer jeg dessuten lastekapasiteten i kilo, for den spør
> kundene alltid om. Motorsykler har ingen lastekapasitet. Jeg vil kunne
> legge kjøretøyene inn i systemet og få skrevet ut hele registeret på
> én gang, med alle opplysningene om hvert kjøretøy — og datoene skal
> stå som lesbar tekst, sånn som ‹1 mars 2015›, ikke som 01.03.15.»

Lag programmet Randi trenger. Der du må ta et valg beskrivelsen ikke
svarer på, skriv antakelsen din som en kommentar i koden. Ta vare på
løsningen din — den skal videreutvikles i modul 11.

Du kan åpne eksempelkjøringen under for å se én godkjent løsning.
Programmet ditt kan oppføre seg annerledes og likevel være riktig.

<details markdown="1">
<summary>Eksempelkjøring</summary>

Randi legger inn en Volvo T5 (førstegangsregistrert 1 mars 2015,
kjennetegn DP23456, lastekapasitet 450 kg) og en Ducati Monster
(førstegangsregistrert 4 oktober 2016, kjennetegn DR4567). Utskriften
blir:

```text
Typebetegnelse : Volvo T5
Førstegangsregistrert : 1 mars 2015
Kjennetegn : DP23456
Lastekapasitet : 450 kg
-----
Typebetegnelse : Ducati Monster
Førstegangsregistrert : 4 oktober 2016
Kjennetegn : DR4567
-----
```

</details>
