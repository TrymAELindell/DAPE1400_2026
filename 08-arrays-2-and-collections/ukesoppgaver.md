# Ukesoppgaver — modul 08: arrays 2 og collections

Du trenger bare det du har lært til og med denne uka. Som vanlig er det
flere oppgaver her enn én ukes arbeid — resten er repetisjon.

Ukas kodeeksempler ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/08-arrays-2-and-collections/repetisjon-kode>.
Se på dem hvis du står fast — `PassengerList` viser `ArrayList`-metodene i
praksis.

Fasit til oppgavene ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/08-arrays-2-and-collections/ukesoppgaver-fasit>.
Prøv selv først — bruk fasiten til å sjekke løsningen din etterpå.

## Del 1 — Skriv koden

### Oppgave 1

Definer en `ArrayList` med heltallene 1, 2, 3, 4, 5, 6, 7, 8, 9.

Skriv ut det tredje og det sjette elementet med `System.out`, ett per
linje og med en ledetekst foran tallet: `Tredje element:` og
`Sjette element:`.

Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Tredje element: 3
Sjette element: 6
```

</details>

> Husk wrapper-klassen: en liste av heltall er en `ArrayList<Integer>`,
> ikke `ArrayList<int>`. Og indekseringen starter fortsatt på 0.

### Oppgave 2

Bruk lista fra oppgave 1.

- Legg til tallene 10 og 11 i lista.
- Fjern så elementene med *verdiene* 2 og 3 fra lista.
- Skriv til slutt ut hele lista med en for-loop, ett element per linje.
  Bruk `size()` for å finne lengden på lista.

Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
1
4
5
6
7
8
9
10
11
```

</details>

> Pass på: `remove(2)` fjerner elementet på *indeks* 2, ikke verdien 2.
> Bruk `indexOf` til å finne indeksen til verdien først, og fjern med
> `remove(index)` etterpå.

### Oppgave 3

Et fly skal boarde. Definer en `ArrayList<String>` og legg inn navnene
`"Andrea Arntsen"`, `"Ellen Gleditsch"` og `"Gudrun Wolan"` med `add`, i
den rekkefølgen.

- `"Grete Kittelsen"` har sniket i køen: sett henne inn på indeks 1 med
  `add(indeks, element)`.
- `"Andrea Arntsen"` viste seg å være feilstavet — det skulle stått
  `"Andrea Aulie"`. Bytt ut elementet på indeks 0 med `set`.
- Skriv ut lista med en for-each-loop, ett navn per linje.

Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Andrea Aulie
Grete Kittelsen
Ellen Gleditsch
Gudrun Wolan
```

</details>

> `add(indeks, element)` dytter resten av lista bakover; `set(indeks,
> element)` bytter ut elementet som står der. Følg med på hvilken av delene
> hver av de to oppgavelinjene ber om.

### Oppgave 4

Utvid oppgave 3.

- `"Ellen Gleditsch"` har kansellert: fjern henne med `remove(element)` —
  varianten som tar navnet, ikke indeksen.
- Skriv ut om hun fortsatt står på lista, med `contains`:
  `Ellen Gleditsch på lista: false`.
- Førstemann i køen har boardet: fjern elementet på indeks 0 med
  `remove(indeks)`.
- `"Nora Berg"` kommer løpende i siste liten: sett henne inn på indeks 1
  med `add(indeks, element)`.
- `"Grete Kittelsen"` har giftet seg og heter nå `"Grete Berg"`: bytt ut
  elementet hennes med `set`.
- Skriv ut lista med for-each-loopen igjen.
- Flyet har boardet: tøm hele lista med `clear`, og skriv ut
  `Antall som venter:` fulgt av `size()`.

Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Ellen Gleditsch på lista: false
Grete Berg
Nora Berg
Gudrun Wolan
Antall som venter: 0
```

</details>

### Oppgave 5

Gjenbruk boardinglista fra oppgave 3 (de fire navnene før noen ble
fjernet). Les inn et navn fra brukeren med `JOptionPane.showInputDialog`.

- Sjekk med `contains` om navnet står på lista.
- Står navnet der, skal programmet vise en meldingsboks med plassen i
  køen: `indexOf` gir indeksen, og køplassen er indeksen pluss 1. Fjern så
  navnet fra lista med `remove(element)`, og vis en melding til:
  `N passasjerer igjen på lista`, der `N` er `size()`.
- Står navnet ikke der, skal meldingen si det.

Prøv programmet med inndataene `Ellen Gleditsch` og `Omar Aden`, med
lista fra oppgave 3. Meldingene skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

For inndata `Ellen Gleditsch`:

```text
Ellen Gleditsch er nummer 3 i køen
3 passasjerer igjen på lista
```

og for inndata `Omar Aden`:

```text
Omar Aden står ikke på lista
```

</details>

### Oppgave 6

Definer en heltallsarray med verdiene 1, 2, 3, 4, 5, 6, 7, 8, 9.

Skriv kode som konverterer den til en `ArrayList`, og skriv så ut
`ArrayList`-en, ett element per linje:

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

Definer en `ArrayList` med heltallene 1, 2, 3, 4, 5, 6, 7, 8, 9.

Skriv kode som konverterer den til en vanlig heltallsarray, og skriv så ut
den nye arrayen, ett element per linje:

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

> Hvor lang skal arrayen være? Spør lista — `size()`.

### Oppgave 8

Definer en `ArrayList<String>` med disse navnene, i usortert rekkefølge:

```java
"Gudrun Wolan", "Ellen Gleditsch", "Andrea Arntsen", "Grete Kittelsen"
```

- Skriv ut lista med en for-each-loop.
- Sorter lista med `Collections.sort`, og skriv den ut igjen.
- Snu til slutt rekkefølgen med `Collections.reverse`, og skriv den ut en
  siste gang.

Skriv ett navn per linje, og sett en overskriftslinje foran hver av de tre
utskriftene: `Usortert:`, `Sortert:` og `Baklengs:`.

Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Usortert:
Gudrun Wolan
Ellen Gleditsch
Andrea Arntsen
Grete Kittelsen
Sortert:
Andrea Arntsen
Ellen Gleditsch
Grete Kittelsen
Gudrun Wolan
Baklengs:
Gudrun Wolan
Grete Kittelsen
Ellen Gleditsch
Andrea Arntsen
```

</details>

> Husk `import java.util.Collections;` i tillegg til
> `import java.util.ArrayList;`.

### Oppgave 9

Definer en `ArrayList` med heltallene 42, 7, 19, 3 og 25.

- Sorter lista med `Collections.sort`, og skriv den ut på én linje med
  overskriften `Stigende:` foran — bruk en for-each-loop og skriv
  mellomrom mellom tallene.
- Snu rekkefølgen med `Collections.reverse`, og skriv den ut på samme
  måte med overskriften `Synkende:`.
- Skriv til slutt ut største og minste tall med `Collections.max` og
  `Collections.min`, med ledetekstene `Størst:` og `Minst:`.

Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Stigende: 3 7 19 25 42
Synkende: 42 25 19 7 3
Størst: 42
Minst: 3
```

</details>

### Oppgave 10

En kaffebar har disse prisene på menyen. Definer en `ArrayList<Double>`
med verdiene:

```java
39.0, 45.0, 52.0, 34.0, 61.0
```

Skriv ut den dyreste og den billigste varen med `Collections.max` og
`Collections.min`, med ledetekstene `Dyrest:` og `Billigst:` og `kr`
etter tallet.

Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Dyrest: 61.0 kr
Billigst: 34.0 kr
```

</details>

> Wrapper-klassen for `double` heter `Double`.

### Oppgave 11

Skriv av programmet under. Hva tror du de to sammenlikningene skriver ut?
Bestem deg for et svar *før* du kjører programmet — og kjør det så.

```java
public class Main {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;

        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

```text
false
true
```

`Integer` er en klasse, så `a` og `b` er *objekter* — og `==` mellom to
objekter sammenlikner referanser, altså om det er *samme objekt*, ikke om
innholdet er likt. `a` og `b` er to forskjellige objekter som begge
inneholder 1000, så `==` gir `false`. Likhet mellom wrapper-objekter
sjekkes med `equals`, akkurat som for `String`.

</details>

### Oppgave 12

Definer en `ArrayList` med heltallene 4, 7, 4, 2, 4, 9, 7.

Skriv en for-each-loop som teller hvor mange elementer som er lik tallet
4. Bruk `equals` i sammenlikningen — oppgave 11 viste hvorfor. Skriv ut
antallet med ledeteksten `Antall 4-ere:`.

Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Antall 4-ere: 3
```

</details>

> Loopvariabelen må være `Integer`, ikke `int`, for at du skal kunne
> kalle `equals` på den.

### Oppgave 13

Lag et program som holder styr på hvilket land flyplasser ligger i.

- Opprett en `HashMap<String, String>` og legg inn minst disse parene med
  `put`: Gardermoen → Norway, Gatwick → United Kingdom, Schiphol →
  Netherlands.
- Les inn et flyplassnavn fra brukeren med `JOptionPane.showInputDialog`.
- Slå opp flyplassen med `get` og vis landet i en meldingsboks. Meldingen
  skal nevne både flyplassen og landet.
- Dersom flyplassen ikke finnes i HashMap-en, skal meldingen si at
  flyplassen ikke står i registeret, i stedet for å vise `null`.

Prøv programmet med inndataene `Gardermoen` og `Torp`. Meldingene skal
bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

For inndata `Gardermoen`:

```text
Gardermoen ligger i Norway
```

og for inndata `Torp`:

```text
Flyplassen Torp finnes ikke i registeret
```

</details>

> `get` returnerer `null` når keyen ikke finnes — eller sjekk med
> `containsKey` før du slår opp.

### Oppgave 14

Utvid registeret fra oppgave 13.

- Legg til to flyplasser til med `put`: Kastrup → Denmark og Arlanda →
  Sweden.
- Skriv ut om Torp er i registeret, med `containsKey`:
  `Torp i registeret: false`.
- Fjern Schiphol fra registeret med `remove(key)`.
- Skriv ut alle parene med en for-each-loop over `keySet()`, én linje per
  par på formen `Gardermoen ligger i Norway`.
- Skriv til slutt ut `Antall flyplasser:` fulgt av `size()`.

Med de fire gjenværende parene skal utskriften bli (rekkefølgen på
linjene kan variere — en `HashMap` har ingen rekkefølge):

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Torp i registeret: false
Gardermoen ligger i Norway
Kastrup ligger i Denmark
Arlanda ligger i Sweden
Gatwick ligger i United Kingdom
Antall flyplasser: 4
```

</details>

### Oppgave 15

Utvid oppgave 14. Gatwick skal ut av registeret — men bare hvis den
faktisk er der.

- Sjekk med `containsKey` om Gatwick finnes, og fjern den i så fall med
  `remove(key)`. Skriv ut `Gatwick fjernet`.
- Skriv ut flyplassene som er igjen, med en for-each-loop over
  `keySet()`, én per linje.
- Skriv ut `Antall flyplasser:` fulgt av `size()`.
- Legg ned hele registeret: tøm det med `clear`, og skriv ut
  `Antall flyplasser:` og `size()` en siste gang.

Med de tre gjenværende flyplassene skal utskriften bli (rekkefølgen på
flyplassene kan variere):

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Gatwick fjernet
Gardermoen
Kastrup
Arlanda
Antall flyplasser: 3
Antall flyplasser: 0
```

</details>

### Oppgave 16

Et lite flyselskap teller passasjerer. Definer denne todimensjonale
heltallsarrayen, der hver rad er én dag og de to kolonnene er dagens to
avganger:

```java
int[][] passengerCounts = {
    {24, 31},
    {28, 19},
    {35, 22}
};
```

Skriv ut arrayen rad for rad med nested looper — én dag per linje, med
mellomrom mellom tallene. Summer samtidig alle elementene, og skriv
totalen på en egen linje til slutt, med ledeteksten `Til sammen:` og ordet
`passasjerer` etter tallet.

Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
24 31
28 19
35 22
Til sammen: 159 passasjerer
```

</details>

> Antall rader er `passengerCounts.length`, og antall kolonner i rad `i`
> er `passengerCounts[i].length` — akkurat som i modul 07.

## Del 2 — Les koden

### Oppgave 17

Hva skriver programmet ut? Følg lista steg for steg, og bestem deg for et
svar før du åpner fasiten.

```java
import java.util.ArrayList;

public class NameList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Siri");
        names.add("Jonas");
        names.add(1, "Nora");
        names.set(0, "Emil");
        names.remove("Jonas");

        System.out.println(names.size());
        System.out.println(names.get(1));
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
2
Nora
```

Steg for steg: etter de to første `add`-kallene er lista `[Siri, Jonas]`.
`add(1, "Nora")` setter inn på indeks 1 og dytter resten bakover:
`[Siri, Nora, Jonas]`. `set(0, "Emil")` *erstatter* elementet på indeks 0:
`[Emil, Nora, Jonas]`. `remove("Jonas")` fjerner elementet med den
verdien: `[Emil, Nora]`. Da er `size()` 2, og elementet på indeks 1 er
`Nora`.

</details>

### Oppgave 18

Programmet under skal fjerne *verdien* 2 fra lista, men utskriften viser
at det ikke skjer. Hva er feilen, og hvordan retter du den? Bestem deg for
et svar før du åpner fasiten.

```java
import java.util.ArrayList;

public class RemoveNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);

        numbers.remove(2);

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
5
2
```

`remove(2)` med en `int` som argument fjerner elementet på *indeks* 2 —
her er det tallet 8 — ikke elementet med verdien 2. Rettelsen er å finne
indeksen til verdien først, og fjerne med den:

```java
int index = numbers.indexOf(2);
numbers.remove(index);
```

</details>

### Oppgave 19

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
import java.util.HashMap;

public class AirportMap {
    public static void main(String[] args) {
        HashMap<String, String> airportInCountryMap = new HashMap<>();
        airportInCountryMap.put("Gardermoen", "Norge");
        airportInCountryMap.put("Gatwick", "United Kingdom");
        airportInCountryMap.put("Gardermoen", "Norway");

        System.out.println(airportInCountryMap.size());
        System.out.println(airportInCountryMap.get("Gardermoen"));
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
2
Norway
```

Keyene i en `HashMap` er unike. Det andre `put`-kallet med keyen
`"Gardermoen"` legger ikke inn et nytt par — det *overskriver* verdien som
lå der fra før. HashMap-en ender derfor med to par, og oppslaget gir den
siste verdien, `Norway`.

</details>

### Oppgave 20

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
import java.util.HashMap;

public class CapitalMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalByCountry = new HashMap<>();
        capitalByCountry.put("Norway", "Oslo");
        capitalByCountry.put("Denmark", "Copenhagen");
        capitalByCountry.put("Sweden", "Stockholm");

        capitalByCountry.remove("Denmark");

        System.out.println(capitalByCountry.containsKey("Denmark"));
        System.out.println(capitalByCountry.get("Denmark"));
        System.out.println(capitalByCountry.size());
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut:

```text
false
null
2
```

`remove("Denmark")` fjerner hele paret, både key og verdi. Etterpå svarer
`containsKey` `false`, og `get` på en key som ikke finnes returnerer
`null` — programmet krasjer ikke, men verdien er ikke der. `size()`
teller par, og to par er igjen.

</details>

### Oppgave 21

Programmet under skal svare på hvilket land Gardermoen ligger i, men det
skriver ut `null`. Hva er feilen, og hvordan retter du den? Bestem deg
for et svar før du åpner fasiten.

```java
import java.util.HashMap;

public class CountryLookup {
    public static void main(String[] args) {
        HashMap<String, String> airportInCountryMap = new HashMap<>();
        airportInCountryMap.put("Gardermoen", "Norway");
        airportInCountryMap.put("Gatwick", "United Kingdom");

        String country = airportInCountryMap.get("gardermoen");
        System.out.println(country);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Oppslaget bruker keyen `"gardermoen"` med liten g, men paret ble lagt inn
med keyen `"Gardermoen"`. Keyer sammenliknes eksakt — `"gardermoen"` og
`"Gardermoen"` er to forskjellige strenger, så `get` finner ingenting og
returnerer `null`. Rettelsen er å slå opp med nøyaktig samme streng som
ble brukt i `put`:

```java
String country = airportInCountryMap.get("Gardermoen");
```

</details>

### Oppgave 22

Metoden under er hentet fra et program som håndterer en passasjerliste.
Hva gjør metoden? Beskriv det med én setning. Og hvorfor stopper loopen?
Bestem deg for et svar før du åpner fasiten.

```java
public static void removeCanceledPassenger(ArrayList<String> passengerList) {
    String name;
    do {
        name = JOptionPane.showInputDialog("Hvilken passasjer har kansellert?");
    } while (passengerList.remove(name) == false);
}
```

<details markdown="1">
<summary>Fasit</summary>

Metoden spør om navn helt til brukeren oppgir et navn som faktisk står i
lista, og fjerner det navnet.

Loopen stopper fordi `remove(element)` returnerer en `boolean`: `false`
når elementet ikke finnes i lista, `true` når det ble funnet og fjernet.
Så lenge brukeren skriver navn som ikke står i lista, gir `remove`
`false`, og do-while-loopen spør igjen. Første gang et navn finnes, blir
det fjernet, `remove` gir `true`, og loopen er ferdig.

</details>

## Del 3 — Velg selv

### Oppgave 23

Lag et program som viser de fem tallene 42, 7, 19, 3 og 25 i stigende
rekkefølge, ett tall per linje:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
3
7
19
25
42
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 24

Lag et program som leser inn heltall fra brukeren, ett om gangen, helt
til brukeren skriver `-1`. Når brukeren er ferdig, skal programmet skrive
ut det største og det minste av tallene som ble skrevet inn, med
ledetekstene `Størst:` og `Minst:`.

For inndataene `8`, `3`, `12`, `5` og `-1` skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Størst: 12
Minst: 3
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 25

Lag et program som leser inn navn fra brukeren, ett om gangen, helt til
brukeren skriver `ferdig`. Hvor mange navn som kommer, vet du ikke på
forhånd. Når brukeren er ferdig, skal programmet skrive ut alle navnene i
alfabetisk rekkefølge, ett per linje.

For inndataene `Vilde`, `Amir`, `Sofia` og `ferdig` skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Amir
Sofia
Vilde
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 26

Lag et program som svarer på hvor i landet et postnummer hører hjemme.
Programmet skal kjenne disse stedene:

| Postnummer | Sted |
| --- | --- |
| 0150 | Oslo |
| 5003 | Bergen |
| 7010 | Trondheim |
| 9008 | Tromsø |

Brukeren skriver inn et postnummer, og programmet svarer med en melding
som nevner både postnummeret og stedet. Kjenner ikke programmet
postnummeret, skal meldingen si ifra om det.

Prøv programmet med inndataene `5003` og `1234`. Meldingene skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

For inndata `5003`:

```text
5003 er i Bergen
```

og for inndata `1234`:

```text
Finner ikke postnummer 1234
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 27

En værstasjon har målt dagens temperatur i fire byer:

| By | Temperatur |
| --- | --- |
| Oslo | 4 |
| Bergen | 7 |
| Trondheim | 2 |
| Tromsø | -3 |

Lag et program som lar brukeren spørre om byer, én om gangen, helt til
brukeren skriver `ferdig`. For hver by svarer programmet med en melding
som nevner både byen og temperaturen. Kjenner ikke programmet byen, skal
meldingen si ifra om det.

For inndataene `Bergen`, `Kiruna` og `ferdig` skal meldingene bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
I Bergen er det 7 grader
Har ingen måling for Kiruna
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 28

Tre filmanmeldere har gitt score til de samme fire filmene:

| | Film 1 | Film 2 | Film 3 | Film 4 |
| --- | --- | --- | --- | --- |
| Anmelder 1 | 4 | 6 | 2 | 5 |
| Anmelder 2 | 7 | 9 | 4 | 8 |
| Anmelder 3 | 6 | 9 | 3 | 7 |

Lag et program som beregner gjennomsnittlig score for hver av de fire
filmene og skriver ut én linje per film, med filmens nummer og
gjennomsnittsscoren. Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Film 1 har gjennomsnittlig score 5.666666666666667
Film 2 har gjennomsnittlig score 8.0
Film 3 har gjennomsnittlig score 3.0
Film 4 har gjennomsnittlig score 6.666666666666667
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 29

Klassen skal velge tillitsvalgt. Lag et program som leser inn stemmer fra
brukeren, én om gangen: hver stemme er navnet på en kandidat, og brukeren
skriver `ferdig` når alle stemmene er talt opp. Hvem som stiller, og hvor
mange stemmer som kommer, vet du ikke på forhånd. Til slutt skriver
programmet ut hvor mange stemmer hver kandidat fikk, én linje per
kandidat, på formen `Kasra: 2`.

For inndataene `Kasra`, `Live`, `Kasra` og `ferdig` skal utskriften bli
(rekkefølgen på linjene kan variere):

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Kasra: 2
Live: 1
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

## Del 4 — Fra problem til program

### Oppgave 30

Amir driver frisørsalongen Saks & Kam. Han beskriver det han trenger slik:

> «Kundene som kommer inn, setter seg og venter på tur, og jeg roper opp
> nestemann når en stol blir ledig. I dag holder jeg styr på det med en
> papirlapp, og det går stadig i surr. Jeg vil ha noe der jeg kan skrive
> inn folk etter hvert som de kommer, se hvem som står for tur, ta ut
> nestemann når jeg er klar — og stryke en som går lei og drar. Og så vil
> jeg når som helst kunne se hvor mange som venter.»

Lag programmet Amir trenger. Der du må ta et valg beskrivelsen ikke svarer
på, skriv antakelsen din som en kommentar i koden.

Du kan åpne eksempelkjøringen under for å se én godkjent løsning.
Programmet ditt kan oppføre seg annerledes og likevel være riktig.

<details markdown="1">
<summary>Eksempelkjøring</summary>

Amir skriver inn Lin, Jonas og Sara etter hvert som de kommer, ber om
nestemann, stryker Jonas som drar, og spør til slutt hvor mange som
venter. Meldingene programmet viser blir:

```text
Neste kunde: Lin
Jonas er strøket fra lista
1 kunde venter
```

</details>

### Oppgave 31

Ingrid driver filmklubben på studenthuset. Hun beskriver det hun trenger
slik:

> «Vi viser et par–tre filmer hver klubbkveld, og etterpå gir alle som er
> igjen i salen poeng fra 0 til 9 for hver film. Hvor mange vi er, varierer
> fra gang til gang — alt fra fire til tjue stykker. Jeg vil at alle skal
> taste poengene sine på pc-en min etter tur, og så vil jeg se snittet for
> hver film og hvilken film som vant kvelden. Og folk tuller: forrige gang
> skrev noen ‹ni› med bokstaver. Programmet må ikke stoppe av sånt — bare
> spør igjen.»

Lag programmet Ingrid trenger. Der du må ta et valg beskrivelsen ikke
svarer på, skriv antakelsen din som en kommentar i koden.

Du kan åpne eksempelkjøringen under for å se én godkjent løsning.
Programmet ditt kan oppføre seg annerledes og likevel være riktig.

<details markdown="1">
<summary>Eksempelkjøring</summary>

Ingrid oppgir at de er 4 medlemmer og viste 2 filmer. Medlemmene taster
5, 7, 6 og 6 for den første filmen og 8, 9, 8 og 9 for den andre. En av
dem skriver «ni» med bokstaver og taster 9 i stedet etter beskjeden.
Meldingene programmet viser blir:

```text
Du må skrive inn et heltall
Film 1: 6.0 — Film 2: 8.5 — Kveldens vinner er film 2
```

</details>
