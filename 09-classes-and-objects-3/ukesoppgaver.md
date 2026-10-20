# Ukesoppgaver — modul 09: klasser og objekter 3

Du trenger bare det du har lært til og med denne uka. Som vanlig er det
flere oppgaver her enn én ukes arbeid — resten er repetisjon.

Ukas kodeeksempler ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/09-classes-and-objects-3/repetisjon-kode>.
Se på dem hvis du står fast — kjør `ReferenceExamples` med debuggeren, så
ser du referansene.

Fasit til oppgavene ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/09-classes-and-objects-3/ukesoppgaver-fasit>.
Prøv selv først — bruk fasiten til å sjekke løsningen din etterpå.

## Del 1 — Skriv koden

### Oppgave 1

Lag klassen `CoffeeMachine` med:

- et field `brand` av typen `String`
- konstruktøren `CoffeeMachine(String brand)`
- metoden `brew()`, som returnerer teksten `En kopp filterkaffe fra `
  etterfulgt av merket
- en overloadet variant `brew(String coffeeType)`, som returnerer
  `En kopp ` + kaffetypen + ` fra ` + merket

Lag så klassen `Main` med en `main`-metode. Den skal opprette en maskin med
merket `Java Beans`, kalle `brew()` og `brew("cappuccino")` og skrive ut
det de returnerer, ett resultat per linje.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
En kopp filterkaffe fra Java Beans
En kopp cappuccino fra Java Beans
```

</details>

### Oppgave 2

Utvid `CoffeeMachine` fra oppgave 1 med to varianter til av `brew`:

- `brew(int cups)` returnerer antall kopper + ` kopper filterkaffe fra ` +
  merket
- `brew(String coffeeType, int cups)` returnerer antall kopper + ` kopper `
  + kaffetypen + ` fra ` + merket

La `main` kalle alle fire variantene på maskinen `Java Beans`, i denne
rekkefølgen: `brew()`, `brew("cappuccino")`, `brew(3)` og
`brew("cappuccino", 2)`. Skriv ut det de returnerer, ett resultat per
linje.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
En kopp filterkaffe fra Java Beans
En kopp cappuccino fra Java Beans
3 kopper filterkaffe fra Java Beans
2 kopper cappuccino fra Java Beans
```

</details>

> Fire metoder med samme navn går fint, så lenge parameterlistene er
> forskjellige: i antall parametre, i datatypene eller i rekkefølgen.

### Oppgave 3

Legg denne metoden til i `CoffeeMachine` fra oppgave 2:

```java
public void brew() {
    System.out.println("En kopp filterkaffe fra " + brand);
}
```

Den skriver ut teksten i stedet for å returnere den, men gjør ellers det
samme som `brew()` fra oppgave 1. Kompilerer klassen nå? Bestem deg for et
svar før du kjører programmet. Fjern metoden igjen etterpå.

<details markdown="1">
<summary>Fasit</summary>

Nei. Kompilatoren stopper med en melding som denne:

```text
error: method brew() is already defined in class CoffeeMachine
```

Signaturen til en metode er navnet og parameterlisten. Returtypen er ikke
med. `void brew()` og `String brew()` heter begge `brew` og har tom
parameterliste, så de har samme signatur. Tenk på kallet `machine.brew()`:
det ser helt likt ut for begge variantene, og Java har ingen måte å vite
hvilken du mener.

</details>

### Oppgave 4

Skriv denne linjen i `main`, med `CoffeeMachine` fra oppgave 2:

```java
CoffeeMachine officeMachine = new CoffeeMachine();
```

I modul 04 virket `new Klassenavn()` på klasser som ikke hadde noen
konstruktør. Kompilerer linjen her? Bestem deg for et svar før du kjører
programmet.

<details markdown="1">
<summary>Fasit</summary>

Nei. Kompilatoren stopper med en melding som denne:

```text
error: constructor CoffeeMachine in class CoffeeMachine cannot be applied to given types;
  required: String
  found:    no arguments
```

Har en klasse *ingen* konstruktør, gir Java den automatisk en tom
konstruktør uten parametre. Men `CoffeeMachine` har konstruktøren
`CoffeeMachine(String brand)`, og da lager ikke Java den tomme lenger. Den
eneste måten å opprette en `CoffeeMachine` på er derfor med et merke.

</details>

### Oppgave 5

Utvid `CoffeeMachine` fra oppgave 2 med en konstruktør *uten* parametre.
Den skal lese inn merket fra brukeren med
`JOptionPane.showInputDialog("Hvilket merke er kaffemaskinen?")`.

La `main` opprette en maskin med `new CoffeeMachine()`, kalle `brew()` på
den og skrive ut resultatet.

Prøv programmet med inndata `Moccamaster`.

<details markdown="1">
<summary>Forventet utskrift</summary>

For inndata `Moccamaster`:

```text
En kopp filterkaffe fra Moccamaster
```

</details>

### Oppgave 6

Lag klassen `Pizza` med fields `name` (`String`) og `diameter` (`int`, i
centimeter), og to konstruktører:

- `Pizza(String name, int diameter)`
- `Pizza(String name)`, som gir pizzaen diameter 30 — restaurantens
  vanlige størrelse

Gi klassen metoden `getDescription()`, som returnerer navnet, et komma,
diameteren og ` cm`, for eksempel `Margherita, 40 cm`.

I `main`: opprett en Margherita på 40 cm og en Pepperoni i vanlig
størrelse, og skriv ut beskrivelsen av begge, én per linje.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Margherita, 40 cm
Pepperoni, 30 cm
```

</details>

### Oppgave 7

Lag klassen `ClickCounter`, en teller som kan telle for eksempel hvor mange
som går gjennom en dør:

- et field `clicks` av typen `int`
- metoden `click()`, som øker telleren med 1
- metoden `getClicks()`, som returnerer tellerverdien

Ikke skriv noen konstruktør i denne klassen. Skriv så denne `main`-metoden:

```java
public static void main(String[] args) {
    ClickCounter frontDoorCounter = new ClickCounter();
    ClickCounter alias = frontDoorCounter;

    alias.click();
    alias.click();
    frontDoorCounter.click();

    System.out.println("frontDoorCounter: " + frontDoorCounter.getClicks());
    System.out.println("alias: " + alias.getClicks());
}
```

Hva skriver de to siste linjene ut? Bestem deg for et svar før du kjører
programmet.

Kjør det så i debuggeren: sett et breakpoint på den første
`alias.click()`-linjen, start med Debug-knappen (billen), og se på de to
variablene i Debug-vinduet. Hva forteller `ClickCounter@`-tallet deg?

<details markdown="1">
<summary>Fasit</summary>

```text
frontDoorCounter: 3
alias: 3
```

`ClickCounter alias = frontDoorCounter;` kopierer referansen, ikke
objektet. De to variablene refererer altså til *ett* objekt, og alle tre
klikkene havner i det. I debuggeren viser begge variablene samme
`ClickCounter@`-tall: det er samme referanse.

`clicks` starter på 0 selv om ingen konstruktør gir den en verdi. Et field
får automatisk en default-verdi, og for `int` er den 0.

</details>

### Oppgave 8

Lag klassen `BankAccount` med et field `balance` (`int`) og metodene
`deposit(int amount)`, `withdraw(int amount)` og `getBalance()`. Ikke
skriv noen konstruktør: kontoen starter på 0 kr.

Maria åpner en konto, og ektefellen hennes skal bruke *samme* konto. I
`main`:

- Opprett kontoen med `BankAccount mariaAccount = new BankAccount();`.
- Lag variabelen `sharedAccount`, som skal referere til det samme
  objektet — ikke til en ny konto.
- Sett inn 500 kr via `mariaAccount`, og ta ut 200 kr via `sharedAccount`.
- Skriv ut saldoen gjennom begge variablene, med ledetekstene
  `Maria ser:` og `Felles ser:` og `kr` bak beløpet.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Maria ser: 300 kr
Felles ser: 300 kr
```

</details>

### Oppgave 9

Gi `ClickCounter` fra oppgave 7 metoden `reset()`, som setter telleren
tilbake til 0.

Lag så klassen `CounterUtils` med to `static` metoder. Ingen av dem
returnerer noe:

- `resetCounter(ClickCounter counter)` kaller `reset()` på telleren den
  får inn.
- `tryToReset(int number)` setter parameteren til 0 og skriver den ut med
  ledeteksten `Inne i metoden:`.

Skriv en `main` som gjør dette, i denne rekkefølgen:

1. Oppretter `int localNumber = 42;`, kaller
   `CounterUtils.tryToReset(localNumber)` og skriver ut `localNumber`
   etterpå, med ledeteksten `Etter tryToReset:`.
2. Oppretter en `ClickCounter`, klikker den tre ganger, kaller
   `CounterUtils.resetCounter` på den og skriver ut tellerverdien
   etterpå, med ledeteksten `Etter resetCounter:`.

Hva tror du de tre linjene blir? Bestem deg for et svar før du kjører
programmet.

<details markdown="1">
<summary>Fasit</summary>

```text
Inne i metoden: 0
Etter tryToReset: 42
Etter resetCounter: 0
```

En parameter er en lokal variabel i metoden, og den får en kopi av
argumentets verdi. For `int` er verdien selve tallet. `tryToReset`
endrer derfor bare sin egen kopi, og `localNumber` i `main` er fortsatt 42.

For `ClickCounter` er verdien en referanse. `counter` i `resetCounter`
refererer derfor til *samme* objekt som variabelen i `main`, og `reset()`
nullstiller det objektet. Metoden trenger ikke returnere noe: den har
jobbet på det delte objektet hele tiden.

</details>

### Oppgave 10

Bruk `BankAccount` fra oppgave 8. Lag klassen `Bank` med en `static`
metode `transfer(BankAccount from, BankAccount to, int amount)`. Den skal
ta ut beløpet fra kontoen `from` og sette det inn på kontoen `to`, og den
skal ikke returnere noe.

Gi `Bank` også en overloadet variant `transfer(BankAccount from, BankAccount to)`
uten beløp. Den skal overføre *hele* saldoen på `from` og returnere
beløpet den overførte, som en `int`.

I `main`:

1. Opprett en sparekonto med 1000 kr og en brukskonto med 100 kr (sett
   inn beløpene med `deposit`).
2. Overfør 300 kr fra sparekontoen til brukskontoen, og skriv ut saldoen
   på begge, med ledetekstene `Sparekonto:` og `Brukskonto:` og `kr` bak
   beløpet.
3. Overfør så hele brukskontoen tilbake til sparekontoen med varianten
   uten beløp. Skriv ut beløpet den returnerte, med ledeteksten
   `Overført:` og `kr` bak, og så saldoen på begge kontoene igjen.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Sparekonto: 700 kr
Brukskonto: 400 kr
Overført: 400 kr
Sparekonto: 1100 kr
Brukskonto: 0 kr
```

</details>

### Oppgave 11

Lag klassen `Car` med et field `registrationNumber` (`String`), en
konstruktør som tar registreringsnummeret, og en getter for det.

Lag så klassen `ParkingSpot`, en parkeringsplass som enten er ledig eller
har én bil parkert:

- et field `number` (`int`), og en konstruktør `ParkingSpot(int number)`
- et field `car` av typen `Car`, som konstruktøren *ikke* gir noen verdi —
  plassen starter ledig
- metoden `park(Car car)`, som parkerer bilen på plassen
- metoden `leave()`, som setter `car` tilbake til `null`
- metoden `getStatus()`, som returnerer `Plass 3: ledig` når ingen bil
  står der, og `Plass 3: EL12345` når bilen `EL12345` står der (med
  plassens eget nummer)

I `main`: opprett plass nummer 3 og skriv ut statusen. Parker bilen
`EL12345`, skriv ut statusen, la bilen kjøre, og skriv ut statusen igjen.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Plass 3: ledig
Plass 3: EL12345
Plass 3: ledig
```

</details>

> Et field av en klassetype som ikke har fått noen verdi, har
> default-verdien `null`. Du sjekker det med `car == null`.

### Oppgave 12

Bruk `Car` fra oppgave 11. Skriv dette i `main`:

```java
Car myCar = null;
System.out.println(myCar.getRegistrationNumber());
```

Hva tror du skjer? Bestem deg for et svar før du kjører programmet.

Rett så opp programmet: legg inn en sjekk, slik at det skriver ut
`Ingen bil` når `myCar` ikke refererer til noen bil, og
registreringsnummeret ellers.

<details markdown="1">
<summary>Fasit</summary>

Programmet krasjer med en melding som denne:

```text
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Car.getRegistrationNumber()" because "myCar" is null
```

`myCar` inneholder `null`, altså ingen referanse. Programmet prøver å
følge referansen til et objekt for å kalle metoden, men det finnes ikke
noe objekt å følge den til.

Med sjekken skriver programmet ut:

```text
Ingen bil
```

</details>

### Oppgave 13

Bruk `BankAccount` fra oppgave 8.

- Opprett en `ArrayList<BankAccount>` med navnet `accounts`, og legg inn
  tre nye kontoer.
- Hent kontoen på indeks 1 ut i en egen variabel:
  `BankAccount account = accounts.get(1);`
- Sett inn 250 kr via `account`.
- Skriv så ut saldoen til alle kontoene i lista med en `for`-loop, én
  linje per konto, på formen `Konto 0: 0 kr`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Konto 0: 0 kr
Konto 1: 250 kr
Konto 2: 0 kr
```

</details>

> `get` gir deg referansen til objektet i lista — ikke en kopi av
> objektet.

### Oppgave 14

Lag klassen `ArrayUtils` med en `static` metode `doubleAll(int[] numbers)`.
Den skal doble hvert element i arrayen, og den skal *ikke* returnere noe.

Lag også en overloadet variant `doubleAll(int number)`, som *returnerer*
tallet doblet. De to variantene har altså forskjellig returtype.

I `main`: definer arrayen `int[] prices = {50, 120, 35};`, kall
`ArrayUtils.doubleAll(prices)`, og skriv ut elementene i `prices` etterpå,
ett per linje. Skriv til slutt ut det `ArrayUtils.doubleAll(21)` returnerer.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
100
240
70
42
```

</details>

> En array er en referansetype. Hva får `numbers` en kopi av?

### Oppgave 15

Lag klassen `Book` med fields `title` (`String`), `author` (`String`) og
`numberOfPages` (`int`), og en konstruktør som tar alle tre.

Opprett en bok i `main` og skriv ut selve objektet:

```java
Book book = new Book("Sofies verden", "Jostein Gaarder", 512);
System.out.println(book);
```

Kjør programmet. Utskriften blir `Book@` fulgt av et tall — samme notasjon
som debuggeren viste i oppgave 7.

Definer så metoden `toString` i `Book`. Den skal returnere tittelen i
anførselstegn (« »), `av`, forfatteren, og i parentes sidetallet fulgt av
ordet `sider`. Legg også
til en utskrift som konkatenerer objektet med en streng,
`"Ukas bok: " + book`, og kjør igjen.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
«Sofies verden» av Jostein Gaarder (512 sider)
Ukas bok: «Sofies verden» av Jostein Gaarder (512 sider)
```

</details>

> `toString` kalles automatisk begge steder — du skal ikke skrive
> `book.toString()` noen av stedene.

### Oppgave 16

Gi `Pizza` fra oppgave 6 metoden `toString`. Den skal returnere `Pizza`,
navnet og diameteren i parentes, for eksempel `Pizza Margherita (40 cm)`.

I `main`: opprett de samme to pizzaene som i oppgave 6. Skriv ut begge
objektene direkte med `System.out.println`, og skriv til slutt ut
`"Dagens pizza: "` konkatenert med pepperonipizzaen.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Pizza Margherita (40 cm)
Pizza Pepperoni (30 cm)
Dagens pizza: Pizza Pepperoni (30 cm)
```

</details>

### Oppgave 17

Bygg videre på `Car` og `ParkingSpot` fra oppgave 11.

- Gi `Car` en `toString` som returnerer registreringsnummeret.
- Bytt ut `getStatus()` i `ParkingSpot` med en `toString` som returnerer
  den samme teksten. Når en bil står på plassen, skal `toString` i
  `ParkingSpot` konkatenere med selve `car`-objektet, ikke med
  `car.getRegistrationNumber()`.

Kjør `main` fra oppgave 11 igjen, men skriv ut `ParkingSpot`-objektet
direkte i stedet for å kalle `getStatus()`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Plass 3: ledig
Plass 3: EL12345
Plass 3: ledig
```

</details>

### Oppgave 18

Programmet under kompilerer ikke. Alle feilene handler om scope.

```java
public class Main {
    public static void main(String[] args) {
        for (int number = 1; number <= 5; number++) {
            int sum = 0;
            sum += number;
        }
        System.out.println("Summen er: " + sum);
        System.out.println("Siste tall var: " + number);

        {
            int bonus = 10;
        }
        System.out.println("Summen med bonus er: " + (sum + bonus));
    }
}
```

Rett opp programmet, slik at det kompilerer og skriver ut summen av
tallene 1 til 5 og summen med bonus. Linjen med `Siste tall var` skal du
bare fjerne.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen er: 15
Summen med bonus er: 25
```

</details>

> En variabel som skal være tilgjengelig etter en loop eller en blokk, må
> deklareres i scopet *utenfor*, altså før loopen eller blokka. Tenk også
> på hva som skjer med `sum` i hver runde av loopen: deklarasjonen *må*
> flyttes, ikke bare gjøres synlig.

### Oppgave 19

Programmet under kompilerer ikke:

```java
public class PriceCalculator {
    public static void calculateTotal(int price, int quantity) {
        int total = price * quantity;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        PriceCalculator.calculateTotal(49, 3);
        System.out.println("Totalt: " + total + " kr");
    }
}
```

Rett det opp: metoden skal returnere summen, og `main` skal ta vare på
den i en egen variabel og skrive den ut.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Totalt: 147 kr
```

</details>

> `total` finnes bare inne i `calculateTotal`, og bare mens metoden
> kjører.

### Oppgave 20

Definer denne arrayen i `main`:

```java
String[] words = {"sol", "regnbue", "sky", "torden", "tåke"};
```

Skriv en `for`-loop som finner det lengste ordet og indeksen det står på.
*Etter* loopen skal programmet skrive ut ordet og indeksen, med
ledetekstene `Lengste ord:` og `Indeks:`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Lengste ord: regnbue
Indeks: 1
```

</details>

> Telleren i `for`-linjen finnes ikke etter loopen. Det du skal skrive ut
> etterpå, må ligge i variabler som er deklarert *før* loopen.

### Oppgave 21

Lag klassen `Thermostat` med et field `temperature` (`int`), en
konstruktør `Thermostat(int temperature)`, en setter
`setTemperature(int temperature)` og en getter. Parameterne skal hete
nøyaktig det samme som fieldet.

I `main`: opprett en termostat på 20 grader og skriv ut temperaturen. Sett
den så til 23 grader og skriv ut temperaturen igjen. Bruk ledeteksten
`Temperatur:`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Temperatur: 20
Temperatur: 23
```

</details>

> Inne i konstruktøren og setteren treffer navnet `temperature` den
> nærmeste deklarasjonen, som er parameteren. Fieldet når du med
> `this.temperature`.

### Oppgave 22

Skriv inn programmet under nøyaktig som det står:

```java
public class Main {
    public static void main(String[] args) {
        int[] steps = {4200, 6100, 3900};
        int total;
        for (int step : steps) {
            total += step;
        }
        System.out.println("Skritt totalt: " + total);
    }
}
```

`clicks` i `ClickCounter` fra oppgave 7 startet på 0 uten at noen ga den
en verdi. Gjør `total` det samme? Bestem deg for et svar før du kjører
programmet. Rett så opp programmet, slik at det skriver ut summen.

<details markdown="1">
<summary>Fasit</summary>

Nei. Kompilatoren stopper med en melding som denne:

```text
error: variable total might not have been initialized
```

`clicks` er et field, og fields får en default-verdi. `total` er en lokal
variabel, og lokale variabler får ingen default-verdi. Rettelsen er å gi
den en startverdi: `int total = 0;`. Da skriver programmet ut:

```text
Skritt totalt: 14200
```

</details>

### Oppgave 23

Klassen under skal ta vare på navnet til en student:

```java
public class Student {
    private String name;

    public void setName(String name) {
        name = name;
    }

    public String getName() {
        return name;
    }
}
```

Men dette programmet skriver ut `null`:

```java
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sofie");
        System.out.println(student.getName());
    }
}
```

Rett opp setteren, slik at programmet skriver ut navnet.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Sofie
```

</details>

> Hvilken `name` treffer navnet på hver side av `=`?

### Oppgave 24

Programmet under kompilerer ikke:

```java
public class Main {
    public static void main(String[] args) {
        double total;
        {
            double discount = 0.25;
        }
        double[] prices = {120.0, 80.0, 200.0};
        for (double price : prices) {
            total += price;
        }
        System.out.println("Sum: " + total);
        System.out.println("Med rabatt: " + total * (1 - discount));
    }
}
```

Rett det opp, slik at det kompilerer og skriver ut summen av prisene, og
summen med 25 prosent rabatt. Ingen av utregningene skal fjernes.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Sum: 400.0
Med rabatt: 300.0
```

</details>

### Oppgave 25

Denne oppgaven kombinerer ukas temaer. Lag klassen `Playlist` med:

- fields `name` (`String`) og `songs` (`ArrayList<String>`)
- konstruktøren `Playlist(String name)`, som starter med en tom liste
- en overloadet konstruktør `Playlist(String name, ArrayList<String> songs)`,
  som bruker lista den får inn
- metoden `addSong(String song)`, som legger sangen til på slutten
- en overloadet variant `addSong(int index, String song)`, som setter
  sangen inn på plassen `index`
- metodene `getSong(int index)` og `getNumberOfSongs()`
- `toString`, som returnerer `Spilleliste: «navnet», antall sanger: N`

Skriv en `main` som oppretter en spilleliste med navnet `Mine favoritter`.
Den skal lese inn sanger fra brukeren med `JOptionPane.showInputDialog`
helt til brukeren skriver `ferdig`, og legge hver sang i spillelista.
Etter loopen skal den sette inn sangen `Intro` først i lista med
`addSong(0, "Intro")`. Til slutt skal den skrive ut spillelista, og så
første sang med ledeteksten `Første sang:`.

Prøv programmet med inndataene `Nordnorsk julesalme`, `Tir n'a Noir` og
`ferdig`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Spilleliste: «Mine favoritter», antall sanger: 3
Første sang: Intro
```

</details>

> Sjekk også om brukeren trykket Cancel: da returnerer
> `showInputDialog` `null`, og loopen bør stoppe. Betingelsen
> `song != null && !song.equals("ferdig")` dekker begge deler.
> `addSong(int index, String song)` gjør det samme som `add(index, element)`
> i `ArrayList` — kjenner du igjen paret?

### Oppgave 26

Bruk `Playlist` fra oppgave 25. Skriv en ny `main`:

```java
ArrayList<String> sharedSongs = new ArrayList<String>();
Playlist roadTrip = new Playlist("Roadtrip", sharedSongs);
Playlist beachParty = new Playlist("Strandfest", sharedSongs);

roadTrip.addSong("Sommerfuggel i vinterland");

System.out.println(roadTrip);
System.out.println(beachParty);
```

Sangen ble bare lagt til i `roadTrip`. Hvor mange sanger har `beachParty`?
Bestem deg for et svar før du kjører programmet.

<details markdown="1">
<summary>Fasit</summary>

```text
Spilleliste: «Roadtrip», antall sanger: 1
Spilleliste: «Strandfest», antall sanger: 1
```

`sharedSongs` inneholder en referanse til én `ArrayList`. Begge
konstruktørkallene får en kopi av den referansen, og begge lagrer den i
fieldet `songs`. De to spillelistene refererer derfor til *samme*
listeobjekt. Når `roadTrip` legger til en sang, legger den den til i den
lista som `beachParty` også bruker.

</details>

## Del 2 — Les koden

### Oppgave 27

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
public class Robot {
    private String name;

    public Robot(String name) {
        this.name = name;
    }

    public void dance() {
        System.out.println(name + " danser fritt");
    }

    public void dance(String choreography) {
        System.out.println(name + " danser " + choreography);
    }

    public void dance(int rounds) {
        System.out.println(name + " danser " + rounds + " runder");
    }

    public void dance(String choreography, int rounds) {
        System.out.println(name + " danser " + choreography + " " + rounds + " ganger");
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Robot rusty = new Robot("Rusty");
        rusty.dance(3);
        rusty.dance("tango");
        rusty.dance();
        rusty.dance("vals", 2);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
Rusty danser 3 runder
Rusty danser tango
Rusty danser fritt
Rusty danser vals 2 ganger
```

Java velger variant ut fra argumentene i kallet. `dance(3)` har ett
`int`-argument og treffer `dance(int rounds)`. `dance("tango")` har én
`String` og treffer `dance(String choreography)`. Rekkefølgen metodene står
i klassen, spiller ingen rolle.

</details>

### Oppgave 28

Klassen `Robot` har allerede metoden `dance()` øverst. Se på linjene A–D,
hver for seg: hvilke av dem kan legges til i klassen uten
kompileringsfeil? Bestem deg for et svar før du åpner fasiten.

```java
public class Robot {
    private String name;

    public void dance() {
        System.out.println(name + " danser fritt");
    }

    public String dance() { return name + " danser fritt"; }            // linje A
    public void dance(String choreography) { System.out.println(name); } // linje B
    public void dance(int rounds) { System.out.println(rounds); }         // linje C
    private void dance() { System.out.println(name); }                   // linje D
}
```

<details markdown="1">
<summary>Fasit</summary>

Linje B og linje C kompilerer. Linje A og linje D gir kompileringsfeil.

Signaturen er navnet og parameterlisten, og den må være unik i klassen.
Linje B og C har samme navn som `dance()`, men andre parameterlister:
en `String` og en `int`. Linje A skiller seg bare på returtypen, og linje D
bare på `private`. Ingen av delene er med i signaturen, så begge har samme
signatur som `dance()`.

</details>

### Oppgave 29

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void incrementAge() {
        age += 1;
    }

    public int getAge() {
        return age;
    }
}
```

```java
public class Party {
    public static void celebrate(int age) {
        age += 1;
    }

    public static void celebrate(Person person) {
        person.incrementAge();
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        int age = 20;
        Person sofie = new Person(20);

        Party.celebrate(age);
        Party.celebrate(sofie);

        System.out.println("age: " + age);
        System.out.println("sofie: " + sofie.getAge());
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
age: 20
sofie: 21
```

`celebrate` er overloadet, og Java velger variant ut fra argumentet:
`Party.celebrate(age)` treffer `int`-varianten, og
`Party.celebrate(sofie)` treffer `Person`-varianten.

`int`-varianten får en kopi av tallet 20 og øker bare kopien. `age` i
`main` er fortsatt 20. `Person`-varianten får en kopi av referansen, og
den refererer til samme objekt som `sofie`. Derfor blir sofie-objektet 21.

</details>

### Oppgave 30

Hva skriver programmet ut? Bruk `Person` fra oppgave 29. Bestem deg for et
svar før du åpner fasiten.

```java
public class Main {
    public static void main(String[] args) {
        int year = 2025;
        int yearAlias = year;
        year += 1;

        Person trym = new Person(34);
        Person weds = trym;
        weds.incrementAge();

        String name = "Rusty";
        String nameAlias = name;
        name += " Jr.";

        System.out.println(yearAlias);
        System.out.println(trym.getAge());
        System.out.println(nameAlias);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
2025
35
Rusty
```

`int yearAlias = year;` kopierer verdien, så `yearAlias` er fortsatt 2025.
`Person weds = trym;` kopierer referansen, så `trym` og `weds` refererer
til ett objekt. Når alderen økes via `weds`, blir `trym` også 35.

`String` er også en referansetype, men en streng kan ikke endres etter at
den er laget. `name += " Jr."` lager en *ny* streng og legger referansen
til den i `name`. `nameAlias` refererer fortsatt til den gamle strengen
`Rusty`.

</details>

### Oppgave 31

Programmet under skal skrive ut tittelen på alle bøkene i hylla. Det
skriver ut to titler, og så krasjer det. Hva er feilen, og hvordan retter
du den? Bestem deg for et svar før du åpner fasiten.

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
```

```java
public class Main {
    public static void main(String[] args) {
        Book[] shelf = new Book[3];
        shelf[0] = new Book("Sofies verden");
        shelf[1] = new Book("Doppler");

        for (int i = 0; i < shelf.length; i++) {
            System.out.println(shelf[i].getTitle());
        }
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Hylla har plass til tre bøker, men bare to er satt inn. `shelf[2]` har
default-verdien `null`. Når loopen kommer til indeks 2, kaller den
`getTitle()` gjennom en `null`-referanse, og programmet krasjer med
`NullPointerException`.

Rettelsen er å sjekke referansen før metodekallet:

```java
if (shelf[i] != null) {
    System.out.println(shelf[i].getTitle());
}
```

</details>

### Oppgave 32

Et idrettslag deler spillerne inn i to lag. Begge lagene skal starte med
de samme to spillerne, men etterpå skal de være to separate lag.

```java
import java.util.ArrayList;

public class Team {
    private String name;
    private ArrayList<String> players;

    public Team(String name, ArrayList<String> players) {
        this.name = name;
        this.players = players;
    }

    public void addPlayer(String player) {
        players.add(player);
    }

    public int getNumberOfPlayers() {
        return players.size();
    }
}
```

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> startingPlayers = new ArrayList<>();
        startingPlayers.add("Ola");
        startingPlayers.add("Kari");

        Team red = new Team("Rødt lag", startingPlayers);
        Team blue = new Team("Blått lag", startingPlayers);

        red.addPlayer("Amir");

        System.out.println("Rødt lag: " + red.getNumberOfPlayers());
        System.out.println("Blått lag: " + blue.getNumberOfPlayers());
    }
}
```

Programmet skriver ut 3 for begge lagene. Hva er feilen, og hvordan
retter du den? Bestem deg for et svar før du åpner fasiten.

<details markdown="1">
<summary>Fasit</summary>

Konstruktøren lagrer referansen den får inn. Den lager ingen ny liste. Begge
lagene refererer derfor til *samme* `ArrayList`, og når Amir legges til
rødt lag, havner han i den eneste lista som finnes.

Rettelsen er å gi hvert lag sin egen liste. Konstruktøren kan lage en ny
liste og kopiere spillerne inn i den:

```java
this.players = new ArrayList<>();
for (String player : players) {
    this.players.add(player);
}
```

Da skriver programmet ut `Rødt lag: 3` og `Blått lag: 2`.

</details>

### Oppgave 33

Hva gjør metoden `toString` i klassen under? Beskriv det med én setning.
Hva skriver så `main` ut? Bestem deg for et svar før du åpner fasiten.

```java
public class Flight {
    private String flightNumber;
    private String destination;
    private int delayMinutes;

    public Flight(String flightNumber, String destination, int delayMinutes) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.delayMinutes = delayMinutes;
    }

    public String toString() {
        if (delayMinutes == 0) {
            return flightNumber + " til " + destination + ": i rute";
        }
        return flightNumber + " til " + destination + ": " + delayMinutes + " min forsinket";
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Flight bergenFlight = new Flight("DY604", "Bergen", 25);
        Flight tromsoFlight = new Flight("SK4412", "Tromsø", 0);

        System.out.println(bergenFlight);
        System.out.println("Neste avgang: " + tromsoFlight);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Metoden lager en tekst om flyet med flynummer og reisemål, og sier om
flyet er i rute eller hvor mange minutter det er forsinket.

Programmet skriver ut:

```text
DY604 til Bergen: 25 min forsinket
Neste avgang: SK4412 til Tromsø: i rute
```

`System.out.println(bergenFlight)` og konkateneringen
`"Neste avgang: " + tromsoFlight` kaller begge `toString` automatisk.

</details>

### Oppgave 34

Programmet under skal skrive ut `«Doppler» av Erlend Loe`, men det skriver
ut `Book@` fulgt av et tall. Hva er feilen, og hvordan retter du den?
Bestem deg for et svar før du åpner fasiten.

```java
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String tostring() {
        return "«" + title + "» av " + author;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Doppler", "Erlend Loe");
        System.out.println(book);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Metoden heter `tostring` med liten s. Java skiller mellom store og små
bokstaver, så dette er en helt annen metode enn `toString`. Når
`System.out.println` trenger en tekst, leter Java etter `toString`, finner
ikke klassens egen, og bruker den innebygde varianten som gir `Book@` og
et tall.

Rettelsen er å kalle metoden `toString`, med stor S.

</details>

### Oppgave 35

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
public class Pizza {
    private String name;
    private int diameter;

    public Pizza(String name, int diameter) {
        this.name = name;
        this.diameter = diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String toString() {
        return "Pizza " + name + " (" + diameter + " cm)";
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Pizza lunch = new Pizza("Margherita", 30);
        Pizza dinner = lunch;
        dinner.setDiameter(40);

        System.out.println(lunch);
        System.out.println("Middag: " + dinner);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
Pizza Margherita (40 cm)
Middag: Pizza Margherita (40 cm)
```

`Pizza dinner = lunch;` lager ingen ny pizza. Den kopierer referansen, så
`lunch` og `dinner` refererer til samme objekt. Når diameteren endres via `dinner`,
ser `lunch` endringen også. Begge utskriftene kaller `toString` på det ene
objektet.

</details>

### Oppgave 36

Hvilke av linjene A–E kompilerer? Se på hver linje for seg. Bestem deg for
et svar før du åpner fasiten.

```java
public class Main {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            int doubled = i * 2;
            total += doubled;
            System.out.println(total);    // linje A
        }
        System.out.println(doubled);      // linje B
        System.out.println(i);            // linje C
        {
            int bonus = 5;
            total += bonus;               // linje D
        }
        System.out.println(bonus);        // linje E
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Linje A og linje D kompilerer. Linje B, C og E gir kompileringsfeil.

- Linje A: `total` er deklarert i `main` før loopen, og loopen ligger inni
  det scopet.
- Linje B: `doubled` er deklarert i loopkroppen og finnes bare i én
  iterasjon om gangen. Etter loopen finnes den ikke.
- Linje C: telleren `i` tilhører loopens scope, selv om den står i
  `for`-linjen. Etter loopen finnes den ikke.
- Linje D: blokka ligger inni scopet der `total` ble deklarert. Kode inne
  i blokka kan bruke variabler fra scopet utenfor, men ikke omvendt.
- Linje E: `bonus` er deklarert inne i blokka og forsvinner ved den
  lukkende krøllparentesen.

</details>

### Oppgave 37

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
public class Player {
    private int score;

    public Player(int score) {
        this.score = score;
    }

    public void addBonus() {
        int score = 5;
        score += 1;
        System.out.println(score);
        System.out.println(this.score);
    }

    public int getScore() {
        return score;
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        Player player = new Player(10);
        player.addBonus();
        System.out.println(player.getScore());
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
6
10
10
```

Inne i `addBonus` er det deklarert en lokal variabel som heter `score`,
akkurat som fieldet. Navnet `score` treffer den nærmeste deklarasjonen,
altså den lokale variabelen. Den starter på 5 og blir 6. Fieldet er
aldri endret, og det når du bare med `this.score`. Derfor gir både
`this.score` og `getScore()` 10.

</details>

### Oppgave 38

Programmet under skal skrive ut hvor mange ja-svar det har sett så langt,
én linje etter hvert svar. Hva skriver det ut, og hva er feilen? Bestem
deg for et svar før du åpner fasiten.

```java
public class Main {
    public static void main(String[] args) {
        String[] answers = {"ja", "nei", "ja", "ja"};

        for (String answer : answers) {
            int yesCount = 0;
            if (answer.equals("ja")) {
                yesCount++;
            }
            System.out.println("Ja-svar så langt: " + yesCount);
        }
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
Ja-svar så langt: 1
Ja-svar så langt: 0
Ja-svar så langt: 1
Ja-svar så langt: 1
```

`yesCount` er deklarert inne i loopkroppen. En variabel der lever bare én
iterasjon, så den starter på 0 igjen i hver runde. Rettelsen er å flytte
`int yesCount = 0;` til linjen før loopen. Da skriver programmet ut 1, 1,
2 og 3.

</details>

### Oppgave 39

Programmet under skal fjerne alle tall som er mindre enn 5 fra lista. Men
tallet 1 blir igjen. Hvorfor, og hvordan retter du det? Bestem deg for et
svar før du åpner fasiten.

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(3);
        scores.add(8);
        scores.add(2);
        scores.add(1);
        scores.add(9);

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) < 5) {
                scores.remove(i);
            }
        }

        for (int score : scores) {
            System.out.println(score);
        }
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
8
1
9
```

Programmet fjerner elementer fra lista mens det itererer over den.
`remove` rykker alle senere elementer én indeks fram. Ved `i = 1` fjernes
`2`, og `1` rykker fram til indeks 1. Men loopen går videre til `i = 2`,
så `1` blir aldri sjekket.

En rettelse er å trekke 1 fra `i` hver gang et element fjernes, slik at
samme indeks sjekkes en gang til:

```java
if (scores.get(i) < 5) {
    scores.remove(i);
    i--;
}
```

En annen rettelse er å la loopen gå baklengs, fra siste indeks til 0. Da
rykker bare elementer som allerede er sjekket.

</details>

## Del 3 — Velg selv

### Oppgave 40

En værstasjon har målt temperaturen klokka 12 hver dag i én uke: 4, 7, 5,
9, 11, 8 og 6 grader. Lag et program som skriver ut gjennomsnittet for uka,
og hvor mange dager det var varmere enn gjennomsnittet. Bruk ledetekstene
`Gjennomsnitt:` og `Dager over gjennomsnittet:`. Skriv én setning i en
kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Gjennomsnitt: 7.142857142857143
Dager over gjennomsnittet: 3
```

</details>

### Oppgave 41

En kinobillett koster 130 kr. Kjøper du fire billetter eller flere på én
gang, blir hver billett 20 kr billigere. Lag et program som skriver ut
prisen for 1, 3 og 5 billetter, én linje for hvert antall, på formen
`3 billetter: 390 kr` (og `1 billett` i entall). Skriv én setning i en
kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
1 billett: 130 kr
3 billetter: 390 kr
5 billetter: 550 kr
```

</details>

### Oppgave 42

Et malerfirma regner ut hvor mange kvadratmeter gulv som skal lakkeres.
Hvert rom er enten kvadratisk, og da oppgir firmaet bare én side, eller
rektangulært, og da oppgir de bredde og lengde. Denne uka har de fire rom:
et kvadratisk på 4 meter, et rektangulært på 3 ganger 5 meter, et
kvadratisk på 2.5 meter og et rektangulært på 4 ganger 6 meter.

Lag et program som skriver ut arealet av hvert rom, én linje per rom, og
til slutt det samlede arealet. Linjene skal ha formen
`Kvadratisk rom, 4.0 m: 16.0 kvm` og
`Rektangulært rom, 3.0 x 5.0 m: 15.0 kvm`, og den siste linjen formen
`Totalt: 61.25 kvm`. Skriv én setning i en kommentar om hvorfor du valgte
å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Kvadratisk rom, 4.0 m: 16.0 kvm
Rektangulært rom, 3.0 x 5.0 m: 15.0 kvm
Kvadratisk rom, 2.5 m: 6.25 kvm
Rektangulært rom, 4.0 x 6.0 m: 24.0 kvm
Totalt: 61.25 kvm
```

</details>

### Oppgave 43

En bokhandel har tre bøker på ukas liste:

| Tittel | Forfatter | Sider |
| --- | --- | --- |
| Sofies verden | Jostein Gaarder | 512 |
| Doppler | Erlend Loe | 170 |
| Naiv. Super. | Erlend Loe | 200 |

Lag et program som skriver ut lista, én linje per bok, på formen
`«Sofies verden» av Jostein Gaarder (512 sider)`. Til slutt skal det
skrive ut én linje som anbefaler den andre boka på lista, med samme
beskrivelse av boka etter ledeteksten `Ukas anbefaling:`. Skriv én setning
i en kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
«Sofies verden» av Jostein Gaarder (512 sider)
«Doppler» av Erlend Loe (170 sider)
«Naiv. Super.» av Erlend Loe (200 sider)
Ukas anbefaling: «Doppler» av Erlend Loe (170 sider)
```

</details>

### Oppgave 44

En bank oppretter kontoer for nye kunder. De fleste kundene starter med
0 kr, men noen setter inn penger i det de åpner kontoen. I dag har tre
kunder åpnet konto: Lise uten innskudd, Omar med 1500 kr og Nora uten
innskudd. Lag et program som oppretter de tre kontoene og så skriver ut
alle, én linje per konto, på formen `Omar: 1500 kr`. Skriv én setning i en
kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Lise: 0 kr
Omar: 1500 kr
Nora: 0 kr
```

</details>

### Oppgave 45

Et quizspill har tre spillere: Aisha med 40 poeng, Jonas med 25 og Mia med
55. Etter runden får alle spillerne 10 bonuspoeng. Lag et program som
skriver ut stillingen før og etter bonusen. Hver spiller får én linje på
formen `Aisha: 40 poeng`, og de to stillingene skilles av linjen
`Etter bonus:`. Skriv én setning i en kommentar om hvorfor du valgte å
løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Aisha: 40 poeng
Jonas: 25 poeng
Mia: 55 poeng
Etter bonus:
Aisha: 50 poeng
Jonas: 35 poeng
Mia: 65 poeng
```

</details>

### Oppgave 46

Lag et program som leser inn heltall fra brukeren, ett om gangen, helt
til brukeren skriver `0`. Til slutt skal programmet skrive ut hvor mange
av tallene som var positive, og summen av de positive tallene, med
ledetekstene `Positive tall:` og `Summen av dem:`. Skriv én setning i en
kommentar om hvorfor du valgte å løse oppgaven slik.

Prøv programmet med inndataene `5`, `-3`, `8` og `0`.

<details markdown="1">
<summary>Forventet utskrift</summary>

For inndataene `5`, `-3`, `8` og `0`:

```text
Positive tall: 2
Summen av dem: 13
```

</details>

### Oppgave 47

Et treningssenter har to innganger: hoveddøra og garderobedøra. Senteret
vil vite hvor mange som har gått inn gjennom hver av dørene, og hvor mange
som har kommet inn totalt. I dag har fem personer kommet inn, i denne
rekkefølgen: gjennom hoveddøra, garderobedøra, hoveddøra, hoveddøra og
garderobedøra. Lag et program som registrerer de fem personene én etter
én, og så skriver ut tellingene med ledetekstene `Hoveddøra:`,
`Garderobedøra:` og `Totalt:`. Skriv én setning i en kommentar om hvorfor
du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Hoveddøra: 3
Garderobedøra: 2
Totalt: 5
```

</details>

### Oppgave 48

Familien Berg deler én handleliste. Først skriver mor inn varene hun vil
ha, én om gangen, helt til hun skriver `ferdig`. Så gjør sønnen det samme.
Programmet skal spørre hver av dem med navnet deres i spørsmålet, for
eksempel `Mor: hvilken vare?`. Til slutt skal programmet skrive ut hele
handlelista, én vare per linje, i den rekkefølgen varene ble skrevet inn.
Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

Prøv programmet med inndataene `melk`, `brød` og `ferdig` for mor, og
`taco` og `ferdig` for sønnen.

<details markdown="1">
<summary>Forventet utskrift</summary>

For inndataene over:

```text
melk
brød
taco
```

</details>

## Del 4 — Fra problem til program

### Oppgave 49

Kari driver brettspillkafeen Terningkast. Hun beskriver det hun trenger
slik:

> «Vi har en hylle med brettspill som gjestene kan låne med seg til bordet
> sitt. Nå skriver jeg det opp på en lapp når et bord tar et spill, og
> stryker det når de leverer det tilbake — men lappen forsvinner alltid.
> Jeg vil ha noe der jeg kan legge inn spillene vi har, skrive opp hvilket
> bord som har tatt et spill, og stryke det igjen når spillet kommer
> tilbake. Og så vil jeg når som helst kunne se hele hylla: hvilke spill
> som er ledige, og hvilket bord som har de andre.»

Lag programmet Kari trenger. Der du må ta et valg beskrivelsen ikke svarer
på, skriv antakelsen din som en kommentar i koden.

Du kan åpne eksempelkjøringen under for å se én godkjent løsning.
Programmet ditt kan oppføre seg annerledes og likevel være riktig.

<details markdown="1">
<summary>Eksempelkjøring</summary>

Kari legger inn Catan, Ticket to Ride og Codenames. Bord 4 låner Ticket to
Ride, og bord 2 låner Codenames. Så leverer bord 2 Codenames tilbake, og
Kari ber om å se hylla. Meldingen programmet viser blir:

```text
Catan: ledig
Ticket to Ride: bord 4
Codenames: ledig
```

</details>
