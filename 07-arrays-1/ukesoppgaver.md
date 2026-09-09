# Ukesoppgaver — modul 07: arrays 1

Du trenger bare det du har lært til og med denne uka. Som vanlig er det
flere oppgaver her enn én ukes arbeid — resten er repetisjon.

Ukas kodeeksempler ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/07-arrays-1/repetisjon-kode>.
Se på dem hvis du står fast.

Fasit til oppgavene ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/07-arrays-1/ukesoppgaver-fasit>.
Prøv selv først — bruk fasiten til å sjekke løsningen din etterpå.

## Del 1 — Skriv koden

### Oppgave 1

Definer en heltallsarray med verdiene 1, 2, 3, 4, 5, 6, 7, 8, 9 ved å
liste opp verdiene i krøllparenteser. Skriv ut det tredje og det sjette
elementet til terminalen, hvert på sin linje, på formen
«Tredje element: ‹verdien›».

> Husk at indekseringen starter på 0 — det tredje elementet har ikke
> indeks 3.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Tredje element: 3
Sjette element: 6
```

</details>

### Oppgave 2

En parkeringsplass har 16 plasser, og hver plass er enten opptatt eller
ledig. Definer først en heltallsvariabel med verdien 16, og bruk den som
lengde når du oppretter en boolsk array med `new`. Skriv ut hvor mange
plasser parkeringsplassen har — hent antallet fra arrayen med `.length`,
ikke fra variabelen.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Parkeringsplassen har 16 plasser
```

</details>

### Oppgave 3

Opprett en heltallsarray med `new int[4]`, og skriv ut alle de fire
elementene, hvert på sin linje — *uten* å legge inn noen verdier først.
Hva tror du skrives ut? Bestem deg for et svar før du kjører programmet.

<details markdown="1">
<summary>Fasit</summary>

```text
0
0
0
0
```

Programmet krasjer ikke, og det skrives ikke ut noe tilfeldig: alle
elementene får automatisk en default-verdi når arrayen opprettes. For
`int` er den 0, for `double` 0.0 og for `boolean` `false`.

</details>

### Oppgave 4

Bruk arrayen fra oppgave 1. Bytt ut det andre elementet med verdien 20,
og det siste elementet med verdien 90. Det siste elementet skal du nå
uten å skrive indeksen som et fast tall — bruk lengden til arrayen.
Skriv ut de to elementene etter endringen, hvert på sin linje, på
formen «Andre element: ‹verdien›».

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Andre element: 20
Siste element: 90
```

</details>

### Oppgave 5

Definer en heltallsarray med verdiene 10, 20, 30, og prøv å skrive ut
elementet med indeks 3. Hva tror du skjer? Bestem deg for et svar før du
kjører programmet.

<details markdown="1">
<summary>Fasit</summary>

```text
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
```

Programmet krasjer. Arrayen har tre elementer, men indeksene går fra 0
til 2 — indeks 3 finnes ikke. Feilmeldingen sier både hvilken indeks du
prøvde (`Index 3`) og hvor lang arrayen er (`length 3`). Dette er en av
de vanligste feilene i array-kode: siste gyldige indeks er alltid
`length - 1`.

</details>

### Oppgave 6

Bruk arrayen fra oppgave 1 (uten endringene fra oppgave 4). Skriv ut
alle elementene, hvert på sin linje, med en for-loop som bruker
`.length` i betingelsen.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
1
2
3
4
5
6
7
8
9
```

</details>

### Oppgave 7

Bruk arrayen fra oppgave 1. Summer alle tallene med en for-loop og skriv
ut summen, og regn så ut gjennomsnittet og skriv ut det. Utskriften er
to linjer, på formen «Summen er ‹summen›» og «Gjennomsnittet er
‹gjennomsnittet›» — gjennomsnittet skal skrives ut med desimaler.

> Tenk over datatypen til gjennomsnittet. Blir svaret riktig hvis både
> summen og antallet er `int`?

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen er 45
Gjennomsnittet er 5.0
```

</details>

### Oppgave 8

Utvid oppgave 7: Summer bare de tallene som er større enn 5, og skriv ut
summen og gjennomsnittet av disse tallene, hver på sin linje. Også her
skal gjennomsnittet ha desimaler — og denne gangen er det ikke et helt
tall, så feil datatype gir faktisk feil svar.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen av tallene større enn 5 er 30
Gjennomsnittet av dem er 7.5
```

</details>

### Oppgave 9

Summer tallene i arrayen fra oppgave 1 en gang til, nå med en
for-each-loop, og skriv ut summen på samme form som i oppgave 7.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen er 45
```

</details>

### Oppgave 10

Definer en `String`-array med navnene Ingrid, Piotr, Amina og Jonas.
Skriv ut en hilsen til hvert navn med en for-each-loop, én per linje, på
formen «Hei, ‹navnet›!».

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Hei, Ingrid!
Hei, Piotr!
Hei, Amina!
Hei, Jonas!
```

</details>

### Oppgave 11

Skriv inn programmet under nøyaktig som det står. Hva tror du skrives
ut? Bestem deg for et svar før du kjører programmet.

```java
int[] numbers = {1, 2, 3};

for (int number : numbers) {
    number = number * 2;
}

for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

<details markdown="1">
<summary>Fasit</summary>

```text
1
2
3
```

Ingen av elementene ble doblet. Variabelen `number` er en *kopi* av
tur-elementet — å gi den en ny verdi endrer ikke arrayen. Skal du endre
elementene, må du bruke en vanlig for-loop og skrive til
`numbers[i]`.

</details>

### Oppgave 12

Gitt følgende `String`-array:

```java
String[] names = {"Piotr", "Kowalski", "Ingrid", "Dahl", "Amina", "Ali", "Jonas", "Berg"};
```

Arrayen inneholder annethvert fornavn og etternavn. Skriv ut navnene som
hele navn, ett per linje, med én loop.

> Hvor mye må telleren øke for hver runde i loopen?

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Piotr Kowalski
Ingrid Dahl
Amina Ali
Jonas Berg
```

</details>

### Oppgave 13

Definer en heltallsarray med verdiene 45, 34, 5, 8, 10, 2, 13, 25.
Skriv ut tallene baklengs, hvert på sin linje, med en for-loop.

> Tips: Start telleren på `array.length - 1` og la loopen fortsette så
> lenge telleren er større enn eller lik 0. Reduser telleren med 1 for
> hver runde.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
25
13
2
10
8
5
34
45
```

</details>

### Oppgave 14

Bruk arrayen fra oppgave 13. Finn det største og det minste tallet i
arrayen med en loop, og skriv ut begge tallene, hvert på sin linje, på
formen «Største tall: ‹tallet›».

> Tips: Sett både største og minste til det *første* elementet i arrayen
> før loopen starter, og sammenlign deg gjennom resten.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Største tall: 45
Minste tall: 2
```

</details>

### Oppgave 15

Skriv en metode `copyArray` som tar imot en heltallsarray og returnerer
en *ny* array med samme innhold, kopiert element for element med en
loop. Test metoden: Kopier arrayen 1, 2, 3, sett det første elementet i
kopien til 100, og skriv ut det første elementet i originalen og i
kopien, hvert på sin linje.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Første element i originalen: 1
Første element i kopien: 100
```

</details>

### Oppgave 16

Skriv inn programmet under nøyaktig som det står. Hva tror du skrives
ut? Bestem deg for et svar før du kjører programmet.

```java
int[] x = {1, 2, 3};
int[] y = x;

y[0] = 100;

System.out.println(x[0]);
```

<details markdown="1">
<summary>Fasit</summary>

```text
100
```

`y = x` kopierer ikke innholdet — den kopierer *referansen*, så `x` og
`y` refererer til det samme array-objektet. Endringen gjennom `y` er
derfor synlig gjennom `x`. Sammenlign med oppgave 15, der kopien var en
egen array og originalen fikk være i fred.

</details>

### Oppgave 17

Skriv en metode `doubleAll` som tar imot en heltallsarray og dobler
hvert element — metoden skal ikke returnere noe. Kall metoden med
arrayen 1, 2, 3, og skriv deretter ut elementene med en for-each-loop,
hvert på sin linje. Legg merke til at endringene metoden gjorde, er
synlige etterpå — metoden og `main` arbeider med samme array.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
2
4
6
```

</details>

### Oppgave 18

Skriv en metode `sumOf` som tar imot en heltallsarray og returnerer
summen av elementene. Kall metoden med to forskjellige arrayer — 1 til
9 fra oppgave 1, og 40, 25, 20, 15 — og skriv ut begge summene, hver på
sin linje, på formen «Summen av den første arrayen er ‹summen›».

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen av den første arrayen er 45
Summen av den andre arrayen er 100
```

</details>

### Oppgave 19

Skriv en metode `makeNumberedArray` som tar imot en lengde, oppretter
en ny heltallsarray med den lengden, fyller den med tallene fra 1 og
oppover med en loop, og returnerer den. Kall metoden med lengden 5, og
skriv ut elementene i arrayen du får tilbake med en for-each-loop,
hvert på sin linje.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
1
2
3
4
5
```

</details>

### Oppgave 20

Skriv inn programmet under nøyaktig som det står. Hva tror du skrives
ut? Bestem deg for et svar før du kjører programmet.

```java
String[] names = new String[3];

System.out.println(names[0]);
System.out.println(names[0].toUpperCase());
```

<details markdown="1">
<summary>Fasit</summary>

```text
null
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "names[0]" is null
```

Den første linja skriver ut `null`: en array av objekter starter ikke
med ferdige objekter, men med tomme referanser — default-verdien for
objekter er `null`. Den andre linja krasjer med en
`NullPointerException`, for `names[0]` refererer ikke til noen streng
det går an å kalle `toUpperCase` på. Objektene må du opprette selv,
plass for plass.

</details>

### Oppgave 21

Et lite pensjonat har fire rom. Lag en klasse `Guest` med et field for
navn, en konstruktør som setter navnet, og en getter. Opprett i `main`
en `Guest`-array med plass til fire gjester, og legg inn en gjest med
navnet Halyna på plass 0 og en gjest med navnet Kari på plass 2. Gå så
gjennom arrayen med en loop: for hver plass skal programmet skrive ut
«Rom ‹indeksen›: ‹navnet›» hvis rommet har en gjest, og «Rom
‹indeksen›: ledig» hvis plassen fortsatt er `null`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Rom 0: Halyna
Rom 1: ledig
Rom 2: Kari
Rom 3: ledig
```

</details>

### Oppgave 22

Definer to heltallsarrayer som begge inneholder 2, 5, 1, 8, 2. Klassen
`Arrays` (i pakken `java.util` — husk import) har ferdige metoder for
vanlige array-operasjoner. Bruk dem:

1. Sjekk med `Arrays.equals` om de to arrayene har likt innhold, og
   skriv ut resultatet.
2. Lag en ekte kopi av den første arrayen med `Arrays.copyOf`, og
   sorter kopien med `Arrays.sort`.
3. Skriv ut den sorterte kopien og originalen, hver på sin linje med
   ledetekst, med mellomrom mellom tallene — originalen skal være
   uendret.
4. Finn indeksen til verdien 5 i den sorterte kopien med
   `Arrays.binarySearch`, og skriv den ut.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Arrayene er like: true
Sortert kopi: 1 2 2 5 8 
Originalen: 2 5 1 8 2 
Indeksen til 5 i den sorterte kopien: 3
```

</details>

### Oppgave 23

Lottotrekningen ga tallene 34, 7, 21, 2, 19, 28, 11, og kupongen til
naboen har tallene 2, 7, 11, 19, 21, 28, 34. Definer begge som
heltallsarrayer, og:

1. Lag en sortert kopi av trekningen med `Arrays.copyOf` og
   `Arrays.sort`.
2. Sjekk med `Arrays.binarySearch` om tallet 19 og tallet 20 ble
   trukket ut — husk at metoden krever en sortert array, og at den
   returnerer et negativt tall når verdien ikke finnes. Skriv ut én
   linje per tall.
3. Sjekk med `Arrays.equals` om kupongen er identisk med selve
   trekningen, og skriv ut resultatet. Tenk over svaret: de inneholder
   jo de samme tallene.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Tallet 19 ble trukket ut
Tallet 20 ble ikke trukket ut
Kupongen er identisk med trekningen: false
```

</details>

### Oppgave 24

Opprett en todimensjonal heltallsarray med 3 rader og 4 plasser per rad
med `new`. Sett verdien 7 på rad 1, plass 2. Skriv ut tre linjer:
antall rader, antall plasser på rad 0, og verdien på rad 1, plass 2 —
på formen i den forventede utskriften. Antallene skal hentes fra
arrayen med `.length`.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Antall rader: 3
Antall plasser på rad 0: 4
Verdien på rad 1, plass 2: 7
```

</details>

### Oppgave 25

Definer en todimensjonal heltallsarray med verdiene under, og skriv ut
alle elementene med nested looper — én rad per linje, med mellomrom
mellom tallene.

```java
int[][] table = {
    {2, 4, 6},
    {1, 3, 5},
    {8, 10, 12}
};
```

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
2 4 6 
1 3 5 
8 10 12 
```

</details>

### Oppgave 26

Tre grupper leverte poengsummer: gruppe 0 leverte 80 og 92, gruppe 1
leverte 75, og gruppe 2 leverte 88, 90 og 85. Definer en todimensjonal
heltallsarray der radene har *forskjellig* lengde, og skriv ut én linje
per gruppe med antall poengsummer og summen av dem, på formen i den
forventede utskriften.

> Husk at hver rad er sin egen array: `scores.length` er antall rader,
> mens `scores[1].length` er lengden på rad 1.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Gruppe 0: antall 2, sum 172
Gruppe 1: antall 1, sum 75
Gruppe 2: antall 3, sum 263
```

</details>

### Oppgave 27

I modul 06 skrev du ut den lille gangetabellen rett fra loopene. Nå
skal tallene innom en array først: Opprett en todimensjonal
heltallsarray med 4 rader og 4 plasser per rad med `new`, og fyll den
med nested looper slik at den inneholder gangetabellen fra 1 · 1 til
4 · 4. Skriv deretter ut arrayen med et nytt par nested looper — én rad
per linje, med mellomrom mellom tallene.

> Husk at indeksene starter på 0, men gangetabellen på 1.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
1 2 3 4 
2 4 6 8 
3 6 9 12 
4 8 12 16 
```

</details>

### Oppgave 28

Det skal lages et program som beregner gjennomsnittlig poengsum for et
antall elever. Poengene er mellom 0 og 100.

1. Les først inn hvor mange poengsummer som skal registreres, med en
   inputboks.
2. Opprett en heltallsarray med riktig lengde (fra brukerinputen).
3. Les inn poengsummene i en loop, og fyll arrayen underveis.
4. Beregn gjennomsnittet med en loop, og vis det i en meldingsboks på
   formen «Gjennomsnittet av ‹antallet› poengsummer er ‹gjennomsnittet›».

Bruk `try`/`catch` ved parsing av brukerinputen, og spør igjen dersom
det som ble skrevet inn ikke er et tall.

For inndataene 2, 80 og 85 skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Gjennomsnittet av 2 poengsummer er 82.5
```

</details>

## Del 2 — Les koden

### Oppgave 29

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
int[] numbers = {5, 3, 8};

for (int i = 0; i < numbers.length; i++) {
    System.out.println("Indeks " + i + ": " + numbers[i]);
}
```

<details markdown="1">
<summary>Fasit</summary>

```text
Indeks 0: 5
Indeks 1: 3
Indeks 2: 8
```

Telleren `i` brukes både som utskrift og som indeks: for hver runde
skrives indeksen og elementet på den indeksen. Loopen stopper når `i`
blir 3, for `3 < 3` er usann — siste gyldige indeks er `length - 1`.

</details>

### Oppgave 30

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
int[] values = {4, 8, 15, 16, 23, 42};

for (int i = 1; i < values.length; i += 2) {
    System.out.println(values[i]);
}
```

<details markdown="1">
<summary>Fasit</summary>

```text
8
16
42
```

Telleren starter på 1, ikke 0, og øker med 2 for hver runde — loopen
treffer altså indeksene 1, 3 og 5, og skriver ut elementene der. Verken
startverdien eller steget i en for-loop må være det vanlige `0` og
`++`.

</details>

### Oppgave 31

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
double[] prices = {49.9, 120.0, 15.5, 200.0};
int count = 0;

for (double price : prices) {
    if (price > 50) {
        count++;
    }
}

System.out.println(count + " varer koster mer enn 50 kr");
```

<details markdown="1">
<summary>Fasit</summary>

```text
2 varer koster mer enn 50 kr
```

For-each-loopen går gjennom alle prisene, og betingelsen slipper bare
gjennom 120.0 og 200.0 — to varer. Her trengs ingen indeks, bare
verdiene, og da er for-each-loopen den ryddigste skrivemåten.

</details>

### Oppgave 32

Hva gjør metoden `mystery`? Beskriv det med én setning. Bestem deg for
et svar før du åpner fasiten.

```java
public class MysteryMethod {
    public static int mystery(int[] numbers) {
        int result = numbers[0];
        for (int number : numbers) {
            if (number < result) {
                result = number;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] measurements = {12, 7, 19, 3, 8};
        System.out.println(mystery(measurements));
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Metoden finner og returnerer det minste tallet i arrayen. `result`
starter som det første elementet, og hver gang loopen møter et mindre
tall, tar det plassen. Programmet skriver derfor ut:

```text
3
```

</details>

### Oppgave 33

Programmet skal summere temperaturene og skrive ut summen — men det
krasjer. Hva er feilen, og hva er rettelsen? Bestem deg for et svar før
du åpner fasiten.

```java
int[] temperatures = {5, 9, 12, 7};
int sum = 0;

for (int i = 0; i <= temperatures.length; i++) {
    sum += temperatures[i];
}

System.out.println("Summen er " + sum);
```

<details markdown="1">
<summary>Fasit</summary>

Betingelsen `i <= temperatures.length` lar loopen kjøre en runde for
mye: arrayen har lengde 4, så siste gyldige indeks er 3, men loopen
prøver også `temperatures[4]` — og krasjer med en
`ArrayIndexOutOfBoundsException`. Rettelsen er `<` i stedet for `<=`.
Mot en array er `i < array.length` det riktige mønsteret.

</details>

### Oppgave 34

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
import java.util.Arrays;

public class EqualsVersusOperator {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println(a == b);
        System.out.println(Arrays.equals(a, b));
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

```text
false
true
```

`==` sammenligner *referansene*: `a` og `b` refererer til to
forskjellige array-objekter, så svaret er `false` — selv om innholdet
er likt. `Arrays.equals` sammenligner *innholdet*, element for element,
og det er nesten alltid den du vil ha.

</details>

### Oppgave 35

Programmet skal øke alle poengsummene med 5 og deretter skrive ut den
første — men utskriften blir feil. Hva er feilen, og hva er rettelsen?
Bestem deg for et svar før du åpner fasiten.

```java
int[] scores = {55, 70, 90};

for (int score : scores) {
    score = score + 5;
}

System.out.println(scores[0]);
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut `55` — ingen av elementene ble endret. Variabelen
`score` er en kopi av tur-elementet, så `score = score + 5` endrer bare
kopien. Rettelsen er en vanlig for-loop som skriver til elementet
gjennom indeksen: `scores[i] = scores[i] + 5;`. Gjennom for-each-loopen
kan du lese elementene, men ikke endre dem.

</details>

### Oppgave 36

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
int[][] groups = {
    {2, 4},
    {10},
    {1, 1, 1}
};

for (int row = 0; row < groups.length; row++) {
    System.out.println("Antall elementer på rad " + row + ": " + groups[row].length);
}
```

<details markdown="1">
<summary>Fasit</summary>

```text
Antall elementer på rad 0: 2
Antall elementer på rad 1: 1
Antall elementer på rad 2: 3
```

En todimensjonal array er en array av arrayer, og radene må ikke være
like lange. `groups.length` er antall rader (3), mens
`groups[row].length` er lengden på raden loopen står på.

</details>

### Oppgave 37

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
int[][] table = {
    {1, 2},
    {3, 4}
};

for (int row = 0; row < table.length; row++) {
    for (int col = 0; col < table[row].length; col++) {
        System.out.print(table[row][col] + " ");
    }
}
System.out.println();
```

<details markdown="1">
<summary>Fasit</summary>

```text
1 2 3 4 
```

Alt havner på én linje, for programmet bruker `print`, ikke `println` —
og rekkefølgen er hele rad 0 først, så hele rad 1. For hver runde i den
ytre loopen kjører den indre loopen seg helt ferdig.

</details>

### Oppgave 38

Programmet under leter i en sal der `true` betyr at setet er tatt. Hva
skriver programmet ut? Og hva gjør `break rowLoop;` som en vanlig
`break` ikke ville gjort? Bestem deg for svar på begge før du åpner
fasiten.

```java
boolean[][] seats = {
    {true, true},
    {true, false},
    {false, false}
};

String found = "ingen ledige plasser";

rowLoop:
for (int row = 0; row < seats.length; row++) {
    for (int col = 0; col < seats[row].length; col++) {
        if (!seats[row][col]) {
            found = "rad " + row + ", plass " + col;
            break rowLoop;
        }
    }
}

System.out.println(found);
```

<details markdown="1">
<summary>Fasit</summary>

```text
rad 1, plass 1
```

Programmet leter seg gjennom salen rad for rad og stopper på det første
ledige setet — det første elementet som er `false`. `rowLoop:` er en
merkelapp på den *ytre* loopen, og `break rowLoop;` bryter ut av den.
En vanlig `break` hadde bare brutt ut av den indre loopen, og letingen
ville fortsatt på neste rad — da kunne `found` blitt overskrevet av
neste ledige sete.

</details>

## Del 3 — Velg selv

### Oppgave 39

For tallene 45, 34, 5, 8, 10, 2, 13 og 25 skal programmet telle opp
hvor mange partall og hvor mange oddetall det er, og skrive ut begge
antallene, hvert på sin linje. Skriv én setning i en kommentar om
hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Antall partall: 4
Antall oddetall: 4
```

</details>

### Oppgave 40

To tallrekker skal sammenlignes: 2, 5, 1, 8, 2 og 2, 5, 1, 8, 2.
Programmet skal skrive ut «Rekkene er like» dersom de har samme antall
tall og de samme verdiene i samme rekkefølge, og ellers «Rekkene er
ikke like». Skriv én setning i en kommentar om hvorfor du valgte å løse
oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Rekkene er like
```

</details>

### Oppgave 41

Temperaturen ble målt klokka 06, klokka 12 og klokka 18: −3,0 grader,
4,5 grader og 1,5 grader. Programmet skal skrive ut gjennomsnittet av
de tre målingene og den høyeste av dem, hver på sin linje. Skriv én
setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Gjennomsnitt: 1.0
Høyest: 4.5
```

</details>

### Oppgave 42

Foran billettluka står Piotr, Amina, Jonas og Sara i kø, i den
rekkefølgen. Programmet skal finne ut hvor mange som står foran Jonas,
og skrive det ut på formen i den forventede utskriften. Skriv én
setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
2 personer står foran Jonas
```

</details>

### Oppgave 43

Fem terningkast leses inn, ett og ett, med inputbokser. Når alle fem er
lest inn, skal programmet skrive ut kastene til terminalen i motsatt
rekkefølge av den de kom i, hvert på sin linje. Skriv én setning i en
kommentar om hvorfor du valgte å løse oppgaven slik.

For inndataene 2, 5, 1, 6 og 4 skal terminalen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
4
6
1
5
2
```

</details>

### Oppgave 44

En terning ble kastet tolv ganger og ga: 3, 6, 3, 1, 5, 6, 6, 2, 4, 3,
1, 6. Programmet skal skrive ut hvor mange ganger hver av verdiene 1
til 6 forekom, én linje per verdi, på formen «‹verdien›: ‹antallet›».
Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven
slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
1: 2
2: 1
3: 3
4: 1
5: 1
6: 4
```

</details>

### Oppgave 45

Kinosalen i kjelleren på kulturhuset har 3 rader med 4 seter på hver
rad. Setene rad 0 plass 1, rad 1 plass 0 og rad 2 plass 3 er solgt.
Programmet skal skrive ut et kart over salen, én linje per rad, med `X`
for et solgt sete og `.` for et ledig. Skriv én setning i en kommentar
om hvorfor du valgte å løse oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
.X..
X...
...X
```

</details>

### Oppgave 46

Tre målestasjoner registrerte nedbør i millimeter hver av de sju dagene
i forrige uke:

- Blindern: 2,0 — 0,0 — 5,5 — 1,5 — 0,0 — 3,0 — 2,0
- Bergen: 8,0 — 12,5 — 6,0 — 9,5 — 15,0 — 7,0 — 12,0
- Tromsø: 1,0 — 3,5 — 0,0 — 2,5 — 4,0 — 0,0 — 3,0

Programmet skal skrive ut gjennomsnittsnedbøren for hver stasjon, én
linje per stasjon, på formen «‹stasjonen›: ‹gjennomsnittet› mm i
snitt». Skriv én setning i en kommentar om hvorfor du valgte å løse
oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Blindern: 2.0 mm i snitt
Bergen: 10.0 mm i snitt
Tromsø: 2.0 mm i snitt
```

</details>

### Oppgave 47

Tre studenter leverte fire innleveringer hver, med disse poengsummene:

- Sara: 8, 9, 7, 10
- Piotr: 6, 8, 9, 9
- Ingrid: 10, 10, 8, 8

Programmet skal først skrive ut totalsummen for hver student, én linje
per student, og deretter gjennomsnittet per innlevering på tvers av
studentene, én linje per innlevering — på formene i den forventede
utskriften. Skriv én setning i en kommentar om hvorfor du valgte å løse
oppgaven slik.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Sara: 34 poeng totalt
Piotr: 32 poeng totalt
Ingrid: 36 poeng totalt
Innlevering 1: 8.0 i snitt
Innlevering 2: 9.0 i snitt
Innlevering 3: 8.0 i snitt
Innlevering 4: 9.0 i snitt
```

</details>

## Del 4 — Fra problem til program

### Oppgave 48

Halyna Kovalenko driver bakeriet Solsikke på Torshov, og forteller
dette:

> «Hver kveld når vi stenger, noterer jeg på en lapp hvor mange
> kanelboller vi har solgt den dagen. På søndag sitter jeg der med to
> lapper — denne uka og forrige uke — og prøver å regne i hodet. Jeg
> vil heller taste inn tallene fra begge lappene og få vite hvor mange
> boller vi solgte totalt denne uka, og hvilken dag som var best. Og så
> vil jeg se dag for dag om vi solgte flere eller færre enn samme dag
> uka før — det er det Bohdan og jeg alltid krangler om. Det er sju
> tall på hver lapp, mandag til søndag.»

Lag programmet Halyna trenger. Der du må ta et valg beskrivelsen ikke
svarer på, skriv antakelsen din som en kommentar i koden.

Du kan åpne eksempelkjøringen under for å se én godkjent løsning.
Programmet ditt kan oppføre seg annerledes og likevel være riktig.

<details markdown="1">
<summary>Eksempelkjøring</summary>

Med tallene 12, 18, 25, 30, 41, 52, 38 for denne uka og 14, 16, 22,
33, 40, 45, 35 for forrige uke skriver programmet til slutt:

```text
Totalt denne uka: 216 boller
Beste dag: lørdag (52 boller)
mandag: 2 færre enn forrige uke
tirsdag: 2 flere enn forrige uke
onsdag: 3 flere enn forrige uke
torsdag: 3 færre enn forrige uke
fredag: 1 flere enn forrige uke
lørdag: 7 flere enn forrige uke
søndag: 3 flere enn forrige uke
```

</details>
