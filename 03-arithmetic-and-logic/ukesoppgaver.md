# Ukesoppgaver — modul 03: aritmetikk, casting og logiske uttrykk

Du trenger bare det du har lært til og med denne uka. Som vanlig er det
flere oppgaver her enn én ukes arbeid — resten er repetisjon.

Ukas kodeeksempler ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/03-arithmetic-and-logic/repetisjon-kode>.
Se på dem hvis du står fast — spesielt `BreadCalculatorWithLeftovers`, som
viser heltallsdivisjon, modulus og casting i ett og samme program.

Fasit til oppgavene ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/03-arithmetic-and-logic/ukesoppgaver-fasit>.
Prøv selv først — bruk fasiten til å sjekke løsningen din etterpå.

## Del 1 — Skriv koden

### Oppgave 1

Lag et program som oppretter en variabel `int count = 0`. Skriv så ut
partallene mellom 0 og 10 ved å øke variabelen med 2 mellom hver utskrift,
slik at utskriften blir:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
2
4
6
8
```

</details>

Det blir noen like kodelinjer etter hverandre — det er meningen; i modul 06
lærer vi en bedre måte å gjenta kode på.

### Oppgave 2

Lag et program som regner ut arealet av et rektangel. Programmet skal lese
inn lengden og bredden på rektangelet, regne ut arealet og vise svaret på
følgende måte:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Et rektangel med bredde 20.0 cm og lengde 40.0 cm har et areal på 800.0 cm^2
```

</details>

Tips: husk fra modul 02 at alt brukeren skriver inn med `showInputDialog`,
kommer til programmet som en streng. Skal du regne med verdien, må den
konverteres med `Integer.parseInt` eller `Double.parseDouble`.

### Oppgave 3

Lag et program som regner ut omkretsen til en sirkel. Les først inn radiusen.
Regn så ut omkretsen (2 · 3.14 · radius) og vis svaret på følgende måte:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.
```

</details>

Tips: bruk
`String circumferenceWithTwoDecimals = String.format("%.2f", circumference);`
for å få to desimaler i utskriften.

### Oppgave 4

Lag et program som regner om fra fahrenheit til celsius. Les inn verdien for
fahrenheit og regn ut tilsvarende celsius med formelen C = (F − 32) / 1.8.
Vis så resultatet i celsius. For inndata 50 skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
50.0 grader fahrenheit er 10.0 grader celsius
```

</details>

### Oppgave 5

Lag et program som leser inn et beløp i amerikanske dollar (USD) og regner om
og viser tilsvarende beløp i norske kroner. Finn dagens valutakurs på nettet.
Dersom kursen er 10.5 kroner per dollar, skal inndata 100 gi utskriften:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
100.0 USD er 1050.0 norske kroner
```

</details>

### Oppgave 6

Lag et program som regner ut hva én brusflaske koster. Les inn totalprisen
for en kasse brus som et desimaltall, og antall flasker i kassen som et
heltall. For inndata 240.0 og 6 skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
En flaske koster 40.0 kr
```

</details>

### Oppgave 7

Lag et program som leser inn navn og alder i hver sin dialogboks. Programmet
skal så skrive en liten historie basert på det som ble lest inn, for eksempel:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Per Olsen er i dag 32 år. Han er født i 1994. I 2061 er han 67 år og da vil han være pensjonist.
```

</details>

(Årstallene i eksemplet er regnet ut fra året 2026 — programmet ditt skal
regne dem ut fra alderen.)

### Oppgave 8

Lag et program uten innlesing som lagrer de tre heltallene 4, 5 og 9 i hver
sin variabel og skriver ut gjennomsnittet av dem. Selve utregningen skal stå
i **ett uttrykk** på én linje. Utskriften skal bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Gjennomsnittet er 6.0
```

</details>

Tips: uttrykket trenger både parenteser og et desimaltall for å gi riktig
svar. Prøv gjerne uten parenteser først, og se hva som skjer.

### Oppgave 9

Les inn verdier for antall pizzaer, antall personer og antall slices per
pizza. Regn så ut hvor mange pizza-slices hver person får dersom man deler
likt, og hvor mange slices som blir til overs. Bruk heltallsdivisjon og
modulusoperatoren. Vis resultatet på følgende form:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Dersom man er 4 personer og har 3 pizzaer med 6 slices hver, får hver person 4 slices og 2 blir til overs.
```

</details>

### Oppgave 10

Les inn et tall mellom 0 og 1000 og skriv ut summen av sifrene i tallet
(tverrsummen). For eksempel skal inndata 751 gi utdata:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
7 + 5 + 1 = 13
```

</details>

Tips: `751 % 10` gir 1, og `751 / 10` gir 75.

### Oppgave 11

Lag et program uten innlesing som deler 1 på 49 og ganger svaret med 49 igjen.
Skriv ut både resultatet av divisjonen og resultatet av multiplikasjonen.

```java
double number1 = 1;
double number2 = 49;
double quotient = number1 / number2;
double product = quotient * number2;
```

Gjett hva den siste linjen skriver ut før du kjører programmet — matematisk
skal jo 1 delt på 49, ganget med 49, bli 1 igjen. Kjør det så, og åpne
fasiten først når du har sett utskriften selv.

<details markdown="1">
<summary>Fasit</summary>

```text
0.02040816326530612
0.9999999999999999
```

En `double` har plass til et endelig antall sifre, og 1/49 er ikke et av
tallene den kan lagre nøyaktig. Den bittelille feilen i divisjonen
overlever multiplikasjonen, og da blir svaret 0.9999999999999999 i stedet
for 1.0. Programmet ditt er ikke ødelagt — det er slik desimaltall virker på
en datamaskin.

</details>

### Oppgave 12

Lag et program uten innlesing som lagrer det store tallet
9 000 000 000 000 000 i en `double`, og som skriver ut hva tallet blir når du
legger til 0.6, og hva det blir når du legger til 0.4:

```java
double bigNumber = 9000000000000000.0;
```

Gjett hva de to utskriftene blir før du kjører programmet. Kjør det så, og
åpne fasiten først når du har sett utskriften selv.

<details markdown="1">
<summary>Fasit</summary>

```text
9.000000000000001E15
9.0E15
```

Jo større tallet er, jo færre sifre er det plass til etter desimalpunktumet.
Her er det ikke plass til desimaler i det hele tatt: 0.6 rundes opp til en
hel 1, mens 0.4 forsvinner helt. Sammenlign de to linjene — den ene har fått
et siffer mer enn den andre.

</details>

### Oppgave 13

Lag et program uten innlesing som viser widening i praksis. Programmet skal
ha disse fire variablene, og skrive ut alle fire verdiene på hver sin linje:

```java
int integerNumber = 15;
long longNumber = integerNumber;
float floatNumber = 3.5F;
double doubleNumber = floatNumber;
```

Utskriften blir:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
15
15
3.5
3.5
```

</details>

Skriv en `//`-kommentar over hver av de to linjene der verdien bytter
datatype, som sier hvilken vei castingen går.

### Oppgave 14

Widening er trygt for verdiområdet, men ikke alltid for presisjonen. Lag et
program uten innlesing som skriver ut den største verdien en `long` kan ha,
og så den samme verdien lagt i en `float`:

```java
long bigInteger = Long.MAX_VALUE;
float bigIntegerAsFloat = bigInteger;
```

Gjett om de to utskriftene blir like før du kjører programmet. Kjør det så,
og åpne fasiten først når du har sett utskriften selv.

<details markdown="1">
<summary>Fasit</summary>

```text
9223372036854775807
9.223372E18
```

En `float` kan representere større tall enn en `long`, men ikke alle
heltallene underveis. Verdien får plass, men de nederste sifrene er borte.
Det er derfor rekkefølgen `long → float` teller som widening selv om en
`long` har flere bits enn en `float`.

</details>

### Oppgave 15

Utvid oppgave 14 med enda et tall: en `long` med verdien 12345678910, som
også skal legges i en `float` og skrives ut sammen med originalen.

```java
long distanceInMeters = 12345678910L;
```

Utskriften blir:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
12345678910
1.2345679E10
```

</details>

### Oppgave 16

Lag et program uten innlesing som viser narrowing i praksis. Programmet skal
lagre 3.9 i en `double`, caste verdien til `int`, og
skrive ut **tre** linjer: `double`-variabelen, `int`-variabelen, og
resultatet av `(int) -3.9`.

```java
double decimalNumber = 3.9;
int wholeNumber = (int) decimalNumber;
```

Gjett de tre linjene før du kjører programmet — særlig om 3.9 blir 3 eller 4.
Kjør det så, og åpne fasiten først når du har sett utskriften selv.

<details markdown="1">
<summary>Fasit</summary>

```text
3.9
3
-3
```

Narrowing **kutter** desimalene, den runder ikke av: 3.9 blir 3, og −3.9
blir −3. Legg også merke til at `decimalNumber` fortsatt er 3.9 på den
første linjen. En cast endrer aldri variabelen det castes fra — det er den
returnerte verdien som har den nye typen.

</details>

### Oppgave 17

Utvid oppgave 16 med en `long` som er for stor til å få plass i en `int`.
Programmet skal skrive ut `long`-variabelen først, og så den samme verdien
castet til `int`:

```java
long tooBig = 3000000000L;
int shrunk = (int) tooBig;
```

Gjett hva den andre linjen blir før du kjører programmet. Husk hva som
skjedde i modul 02 da du la 1 til den største `int`-verdien. Åpne fasiten
først når du har sett utskriften selv.

<details markdown="1">
<summary>Fasit</summary>

```text
3000000000
-1294967296
```

3 milliarder får ikke plass i en `int`, som stopper på 2147483647. Verdien
går rundt, akkurat som i modul 02, og resultatet er et negativt tall som
ikke har noe med originalen å gjøre. Programmet krasjer ikke, og det er
nettopp derfor Java krever at du skriver casten selv: du tar ansvaret for at
verdien får plass.

</details>

### Oppgave 18

To heltall skal deles, og svaret skal ha desimaler. Lag et program uten
innlesing med `int distance = 7;` og `int hours = 2;` som skriver ut to
linjer: først divisjonen uten casting, så divisjonen der telleren castes til
`double` først.

Utskriften blir:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
3.0
3.5
```

</details>

Skriv en `//`-kommentar ved den første linjen om hvorfor desimalene er borte
selv om variabelen utskriften kommer fra, er en `double`.

### Oppgave 19

Nå kan brødkalkulatoren fra forberedelsen endelig svare ordentlig. Lag et
program som leser inn hvor mange desiliter deig brukeren har. Hvert brød tar
2.5 dl. Programmet skal vise antall **hele** brød og hvor mye deig som blir
til overs. For inndata 11 skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du kan bake 4 brød, og 1.0 dl deig blir til overs.
```

</details>

Tips: begge tallene i utregningen er desimaltall, så her må du både caste og
bruke modulusoperatoren.

### Oppgave 20

Lag et program uten innlesing med `int number1 = 7;` og `int number2 = 7;`.
Programmet skal sammenligne de to variablene med alle de seks
sammenligningsoperatorene, lagre hvert svar i sin egen `boolean`-variabel, og
skrive ut alle seks på hver sin linje med en ledetekst foran. Utskriften blir:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
number1 == number2 : true
number1 != number2 : false
number1 <= number2 : true
number1 >= number2 : true
number1 <  number2 : false
number1 >  number2 : false
```

</details>

### Oppgave 21

Utvid oppgave 20 slik at de to tallene leses inn fra brukeren i hver sin
dialogboks. De seks utskriftslinjene skal se helt like ut. For inndata 3 og 8
blir utskriften:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
number1 == number2 : false
number1 != number2 : true
number1 <= number2 : true
number1 >= number2 : false
number1 <  number2 : true
number1 >  number2 : false
```

</details>

### Oppgave 22

Lag et program som leser inn to navn i hver sin dialogboks og viser om de er
like. Husk at strenger ikke sammenlignes med `==`, men med `equals`. For
inndata `Per` og `Per` skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Er navnene like? true
```

og for inndata `Per` og `Kari`:

```text
Er navnene like? false
```

</details>

### Oppgave 23

Lag et program som leser inn temperaturen ute som et desimaltall.
Programmet skal **alltid** skrive ut temperaturen, og i tillegg en advarsel
dersom det er minusgrader. Bruk en `if`-setning uten `else`. For inndata
−4.0 skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Det er -4.0 grader ute.
Pass på: det er minusgrader, så det kan være glatt.
```

og for inndata 5.0 blir det bare én linje:

```text
Det er 5.0 grader ute.
```

</details>

### Oppgave 24

Lag et program som leser inn hvor mange poeng en student fikk på eksamen.
Grensen for bestått er 40 poeng. Bruk `if` og `else`. For inndata 55 skal
utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du fikk 55 poeng. Bestått!
```

og for inndata 32:

```text
Du fikk 32 poeng. Ikke bestått.
```

</details>

### Oppgave 25

Et firma låner ut firmabilen til ansatte som er over 25 år **og** har
førerkort. Lag et program som leser inn alderen og om den ansatte har
førerkort (`ja` eller `nei`). Lagre svaret på om hen får låne bilen i en
`boolean`-variabel ved hjelp av `&&`, og bruk så `if` og `else` til å vise
resultatet. For inndata 30 og `ja` skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du får låne firmabilen.
```

og for inndata 30 og `nei`:

```text
Du får ikke låne firmabilen.
```

</details>

### Oppgave 26

Kinoen gir rabatt til studenter **eller** til alle over 67 år. Lag et program
som leser inn alderen og om personen er student (`ja` eller `nei`).
Programmet skal alltid skrive ut hva billetten koster (150 kr), og i tillegg
en linje om rabatt dersom minst én av betingelsene er oppfylt. Bruk `||` og
en `if`-setning uten `else`. For inndata 70 og `nei` skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Billetten koster 150 kr.
Du har rett på rabatt.
```

og for inndata 40 og `nei` blir det bare én linje:

```text
Billetten koster 150 kr.
```

</details>

### Oppgave 27

Et treningssenter tar 200 kr for en time i salen, og ikke-medlemmer betaler
50 kr i tillegg. Lag et program som leser inn om personen er medlem (`ja`
eller `nei`), lagrer svaret i en `boolean`-variabel, og legger til tillegget
i en `if`-setning som bruker `!`. Til slutt skal programmet skrive ut prisen.
For inndata `nei` skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du skal betale 250.0 kr.
```

og for inndata `ja`:

```text
Du skal betale 200.0 kr.
```

</details>

### Oppgave 28

Lag et program som leser inn to ja/nei-svar fra brukeren og lagrer dem i hver
sin `boolean`-variabel: «Liker du kaffe?» og «Liker du te?». Programmet skal
så skrive ut fire linjer med resultatet av `!`, `&&` og `||`, slik at
brukeren ser hele sannhetstabellen for sine egne svar. For inndata `ja` og
`nei` blir utskriften:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Liker kaffe: true
Liker ikke kaffe: false
Liker både kaffe og te: false
Liker kaffe eller te: true
```

</details>

### Oppgave 29

Lag et program som leser inn alderen til en kinogjest og viser hva billetten
koster: gjester under 12 år betaler 80 kr, gjester fra 12 til og med 17 år
betaler 120 kr, og alle andre betaler 150 kr. Bruk `if`, `else if` og
`else`. For inndata 15 skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
En kinobillett koster 120 kr for deg.
```

</details>

### Oppgave 30

Lag et program som leser inn antall poeng på en prøve (0–100) og viser
karakteren. Skalaen er: 89 poeng og over gir A, fra 77 gir B, fra 65 gir C,
fra 53 gir D, fra 41 gir E, og under 41 gir F. Bruk `if`, `else if` og
`else`. For inndata 70 skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
70 poeng gir karakteren C.
```

</details>

Prøv etterpå å bytte om på to av grenene i koden, og se hva som går galt.

## Del 2 — Les koden

### Oppgave 31

Gitt variablene:

```java
int number1 = 5;
int number2 = 4;
```

Hva blir de logiske uttrykkene under — `true` eller `false`? Bestem deg for
et svar på alle seks før du åpner fasiten.

    number1 == number2 : ?
    number1 != number2 : ?
    number1 <= number2 : ?
    number1 >= number2 : ?
    number1 <  number2 : ?
    number1 >  number2 : ?

<details markdown="1">
<summary>Fasit</summary>

```text
number1 == number2 : false
number1 != number2 : true
number1 <= number2 : false
number1 >= number2 : true
number1 <  number2 : false
number1 >  number2 : true
```

5 er ikke lik 4, så `==` gir `false` og `!=` gir `true`. 5 er større enn 4,
så begge uttrykkene med `>` gir `true` og begge med `<` gir `false`.

</details>

### Oppgave 32

Hva skriver programmet under ut? Bestem deg for et svar på alle fem linjene
før du åpner fasiten.

```java
int a = 9;
int b = 4;
System.out.println(a / b);
System.out.println(a % b);
System.out.println(-a % b);
System.out.println((double) a / b);
System.out.println((double) (a / b));
```

<details markdown="1">
<summary>Fasit</summary>

```text
2
1
-1
2.25
2.0
```

De to første er heltallsdivisjon og resten: 4 går opp i 9 to hele ganger,
med 1 til overs. På den tredje linjen er telleren negativ, og da blir resten
negativ også — `%` gir resten fortegnet til tallet som deles. På den fjerde
linjen castes `a` til `double` **før** divisjonen, så divisjonen blir en
desimaltallsdivisjon og desimalene beholdes. På den femte står casten utenfor
parentesen: da regnes heltallsdivisjonen først, og 2 castes til 2.0 etterpå —
for sent.

</details>

### Oppgave 33

Gitt koden under:

```java
public class Arithmetic {
    public static void main(String[] args) {
        double number1 = 1;
        double number2 = 2;
        double result;
        result = number1 * 4 + (number2 * 2 + number1) / (number2 - number1 * 3);
        System.out.println(result);
    }
}
```

Hva blir skrevet ut? Bruk reglene for regnerekkefølge til å finne svaret, og
bestem deg før du åpner fasiten.

<details markdown="1">
<summary>Fasit</summary>

Programmet skriver ut `-1.0`. Parentesene regnes først:
`(number2 * 2 + number1)` er `5.0`, og `(number2 - number1 * 3)` er `-1.0`
(multiplikasjonen inni går før subtraksjonen). Så kommer multiplikasjon og
divisjon fra venstre: `number1 * 4` er `4.0`, og `5.0 / -1.0` er `-5.0`.
Til slutt addisjonen: `4.0 + -5.0` er `-1.0`.

</details>

### Oppgave 34

Hva skriver programmet under ut? Bestem deg for et svar på alle fire linjene
før du åpner fasiten.

```java
System.out.println((int) 3.9);
System.out.println((int) -3.9);

double half = 5 / 2;
System.out.println(half);

double half2 = 5 / 2.0;
System.out.println(half2);
```

<details markdown="1">
<summary>Fasit</summary>

```text
3
-3
2.0
2.5
```

Casting til `int` kutter desimalene i stedet for å runde av, begge veier.
På den tredje linjen er begge tallene heltall, så `5 / 2` er en
heltallsdivisjon som gir 2 — at `half` er en `double`, hjelper ikke, for
desimalene var allerede borte. På den siste linjen er `2.0` et desimaltall,
og da blir hele divisjonen en desimaltallsdivisjon.

</details>

### Oppgave 35

Programmet under skal regne ut hvor mange poeng et lag har fått i snitt per
runde: 22 poeng på 4 runder skal gi 5.5 poeng per runde. Men programmet
skriver ut «Snittet er 5.0 poeng per runde». Hva er feilen, og hvordan
retter du den? Bestem deg for et svar før du åpner fasiten.

```java
public class AveragePoints {
    public static void main(String[] args) {
        int totalPoints = 22;
        int rounds = 4;
        double average = totalPoints / rounds;
        System.out.println("Snittet er " + average + " poeng per runde");
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Begge operandene i `totalPoints / rounds` er `int`, så divisjonen er en
heltallsdivisjon: `22 / 4` blir `5`, og desimalene kuttes bort *før*
verdien legges i `average`. At `average` er en `double`, hjelper ikke da —
skaden har allerede skjedd. Rettelsen er å caste én av operandene til
`double`, slik at divisjonen beholder desimalene:

```java
double average = (double) totalPoints / rounds;
```

</details>

### Oppgave 36

Programmet under skal regne ut hvor mange hele brød man får av 11 dl deig
når hvert brød tar 2.5 dl. Det kompilerer ikke. Hva er feilen, og hvordan
retter du den? Bestem deg for et svar før du åpner fasiten.

```java
public class BreadCount {
    public static void main(String[] args) {
        double doughDl = 11;
        double doughPerBread = 2.5;
        int breadCount = (int) doughDl / doughPerBread;
        System.out.println("Du kan bake " + breadCount + " brød");
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Casten gjelder bare verdien rett bak seg, altså `doughDl`. Java caster
derfor 11.0 til `int`, og deler så en `int` på en `double` — og en divisjon
med minst én `double` gir en `double`. Resultatet er 4.4, som ikke får
plass i en `int`, og kompilatoren stopper med «possible lossy conversion
from double to int».

Rettelsen er en parentes, slik at hele divisjonen regnes først og resultatet
castes etterpå:

```java
int breadCount = (int) (doughDl / doughPerBread);
```

</details>

### Oppgave 37

Hva skriver programmet under ut? Bestem deg for et svar på alle fire linjene
før du åpner fasiten.

```java
boolean a = 5 > 3;
boolean b = 2 > 4;
System.out.println(a && b);
System.out.println(a || b);
System.out.println(!a);
System.out.println(!a || b);
```

<details markdown="1">
<summary>Fasit</summary>

```text
false
true
false
false
```

`a` er `true` (5 er større enn 3) og `b` er `false` (2 er ikke større enn
4). `&&` krever at begge er sanne, så den blir `false`. `||` krever bare én,
så den blir `true`. `!a` snur `true` til `false`. På siste linje er både
`!a` og `b` `false`, og da har `||` ingen sann side å ta av.

</details>

### Oppgave 38

Programmet under kompilerer og kjører, men det skriver «Du svarte nei» selv
når brukeren skriver `ja`. Hva er feilen, og hvordan retter du den? Bestem
deg for et svar før du åpner fasiten.

```java
String answer = JOptionPane.showInputDialog("Vil du fortsette? (ja/nei)");

if (answer == "ja") {
    System.out.println("Du svarte ja");
} else {
    System.out.println("Du svarte nei");
}
```

<details markdown="1">
<summary>Fasit</summary>

`answer` er en streng, og strenger skal ikke sammenlignes med `==`. To
strenger med akkurat samme innhold kan likevel telle som «ikke like» med
`==`, og det er det som skjer her: sammenligningen blir `false` uansett hva
brukeren skriver, så `else`-blokken kjører hver gang.

Rettelsen er å bruke `equals`:

```java
if (answer.equals("ja")) {
```

Feilen er ekstra farlig fordi programmet verken krasjer eller gir en
kompileringsfeil — det svarer bare feil.

</details>

### Oppgave 39

Museet gir gratis inngang til studenter og til alle over 67 år. Programmet
under gir gratis inngang til nesten ingen. Hva er feilen, og hvordan retter
du den? Bestem deg for et svar før du åpner fasiten.

```java
boolean isStudent = studentInput.equals("ja");
boolean isSenior = age > 67;

if (isStudent && isSenior) {
    System.out.println("Du kommer inn gratis");
} else {
    System.out.println("Billetten koster 120 kr");
}
```

<details markdown="1">
<summary>Fasit</summary>

`&&` krever at **begge** er sanne, så bare en student over 67 kommer inn
gratis. Museet mente «minst én av delene», og det er `||`:

```java
if (isStudent || isSenior) {
```

Legg merke til at ordet «og» i en kravtekst ofte betyr `||` i koden: «gratis
for studenter og for pensjonister» er to grupper, ikke to krav til samme
person.

</details>

### Oppgave 40

Porto for en pakke er 90 kr under 1 kg, 150 kr under 5 kg, og 250 kr for alt
tyngre. Programmet under gir 150 kr for en pakke på 0.5 kg. Hva er feilen, og
hvordan retter du den? Bestem deg for et svar før du åpner fasiten.

```java
if (weightKg < 5) {
    System.out.println("Porto: 150 kr");
} else if (weightKg < 1) {
    System.out.println("Porto: 90 kr");
} else {
    System.out.println("Porto: 250 kr");
}
```

<details markdown="1">
<summary>Fasit</summary>

Java sjekker grenene ovenfra og ned og kjører den *første* som er `true`.
0.5 er mindre enn 5, så programmet stopper allerede i den første grenen, og
`weightKg < 1` blir aldri sjekket for noen pakke i det hele tatt.

Rettelsen er å sjekke den strengeste grensen først:

```java
if (weightKg < 1) {
    System.out.println("Porto: 90 kr");
} else if (weightKg < 5) {
    System.out.println("Porto: 150 kr");
} else {
    System.out.println("Porto: 250 kr");
}
```

</details>

### Oppgave 41

Hva gjør programmet under? Beskriv det med én setning. Forklar også hvorfor
den siste betingelsen trenger både `&&`, `!` og `||`. Bestem deg for et svar
før du åpner fasiten.

```java
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String yearInput = JOptionPane.showInputDialog("Skriv inn et årstall");
        int year = Integer.parseInt(yearInput);

        boolean divisibleBy4 = year % 4 == 0;
        boolean divisibleBy100 = year % 100 == 0;
        boolean divisibleBy400 = year % 400 == 0;

        if ((divisibleBy4 && !divisibleBy100) || divisibleBy400) {
            System.out.println(year + " har 366 dager");
        } else {
            System.out.println(year + " har 365 dager");
        }
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet sjekker om årstallet brukeren skriver inn er et skuddår, og
skriver ut hvor mange dager året har.

Regelen har et forbehold inni et forbehold: et år er skuddår hvis det er delelig
på 4, *men ikke* hvis det er delelig på 100 — med mindre det også er delelig
på 400. `&&` binder de to første kravene sammen, `!` snur unntaket for 100,
og `||` slipper 400-årene inn igjen. År 2000 var skuddår, mens 1900 ikke
var det.

De tre `boolean`-variablene er ikke nødvendige — betingelsen kunne stått med
`%` direkte — men de gir hver del av regelen et navn, og det er lettere å
lese.

</details>

### Oppgave 42

Hva skriver programmet under ut? Bestem deg for et svar på begge linjene før
du åpner fasiten.

```java
double sum = 0.1 + 0.2;
System.out.println(sum);
System.out.println(sum == 0.3);
```

<details markdown="1">
<summary>Fasit</summary>

```text
0.30000000000000004
false
```

Den første linjen så du allerede i modul 02. Den andre er den som betyr noe
her: `==` krever at de to verdiene er *nøyaktig* like, og summen ligger et
knapt hår over 0.3. To utregninger som matematisk gir samme svar, kan altså
være ulike i koden. Det er derfor du skal være varsom med å sammenligne
desimaltall med `==` — sammenligner du heltall, er det ingen slik fare.

</details>

## Del 3 — Velg selv

### Oppgave 43

Lag et program som leser inn alderen til brukeren. Aldersgrensen for
førerkort klasse B er 18 år. For inndata 21 skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du er gammel nok til å ta førerkort for bil
```

og for inndata 16:

```text
Du er for ung til å ta førerkort for bil
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 44

Lag et program som leser inn et heltall og viser om tallet er et partall.
For inndata 14 skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
14 er partall: true
```

og for inndata 7:

```text
7 er partall: false
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 45

Lag et program som leser inn ett siffer (0–9) og viser sifferet gjentatt tre
ganger. For inndata 7 skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du skrev 7. Tre ganger på rad blir det 777.
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 46

Et beløp skal deles likt mellom flere personer, og det som ikke går opp,
blir liggende i kassen. Lag et program som leser inn beløpet i hele kroner og
antall personer, og viser hvor mye hver person får og hvor mye som blir
liggende igjen. For inndata 1000 og 3 skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Hver person får 333 kr, og 1 kr blir liggende igjen.
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 47

Lag et program som leser inn hvor mange av 12 innleveringer en student har
levert, og viser hvor mange prosent det er. For inndata 9 skal utskriften
bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du har levert 75.0 % av innleveringene.
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 48

Lag et program som leser inn to heltall og viser gjennomsnittet av dem med
desimaler. For inndata 7 og 8 skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Gjennomsnittet av 7 og 8 er 7.5
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 49

Konserten har 18-årsgrense, men de som er yngre slipper inn hvis de har med
en voksen. Lag et program som leser inn alderen og om personen har med en
voksen, og viser om hen slipper inn. For inndata 16 og `ja` skal utskriften
bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du slipper inn.
```

og for inndata 16 og `nei`:

```text
Du slipper ikke inn.
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 50

Lag et program som leser inn brukernavn og passord, og viser om
innloggingen er godkjent. Riktig brukernavn er `kari`, og riktig passord er
`sopp123`. For inndata `kari` og `sopp123` skal utskriften bli:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Innlogging godkjent.
```

og for alt annet:

```text
Feil brukernavn eller passord.
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

## Del 4 — Fra problem til program

### Oppgave 51

Kari driver kafeen Kaffekroken. Hun beskriver det hun trenger slik:

> «Når jeg stenger om kvelden, ser jeg på kassa hvor mye jeg har solgt for i
> løpet av dagen, og jeg teller hvor mange kunder jeg har hatt. Det jeg
> egentlig lurer på, er hva en vanlig kunde legger igjen hos meg — og om det
> er nok. Regnskapsføreren min sier at en kunde må legge igjen minst 85
> kroner i snitt for at kafeen skal gå rundt.»

Lag programmet Kari trenger. Der du må ta et valg beskrivelsen ikke svarer
på, skriv antakelsen din som en kommentar i koden.

Du kan åpne eksempelkjøringen under for å se én godkjent løsning.
Programmet ditt kan oppføre seg annerledes og likevel være riktig.

<details markdown="1">
<summary>Eksempelkjøring</summary>

```text
Du solgte for 4500.0 kr fordelt på 52 kunder. En vanlig kunde la igjen 86.54 kr. Det er nok til at kafeen går rundt.
```

</details>

### Oppgave 52

Jonas kjører fjordferja mellom to tettsteder. Han beskriver det han trenger
slik:

> «Ferja mi tar 40 passasjerer om gangen. Om sommeren kommer det ofte en hel
> busslast på kaia samtidig, og da står jeg der og teller på fingrene: hvor
> mange turer må jeg kjøre, og blir den siste turen halvtom? Jeg vil helst
> vite om det er noen få igjen til slutt, for da venter jeg heller på neste
> buss. Og så skal jeg jo ta betalt — 85 kroner for voksne, halv pris for
> barn — men jeg vet aldri på forhånd hvor mange barn det er i gjengen.»

Lag programmet Jonas trenger. Der du må ta et valg beskrivelsen ikke svarer
på, skriv antakelsen din som en kommentar i koden.

Du kan åpne eksempelkjøringen under for å se én godkjent løsning.
Programmet ditt kan oppføre seg annerledes og likevel være riktig.

<details markdown="1">
<summary>Eksempelkjøring</summary>

```text
Gruppa på 92 personer, hvorav 10 barn, trenger 3 turer.
Siste tur har bare 12 passasjerer — vurder å vente på neste buss.
Til sammen skal gruppa betale 7395.0 kr.
```

</details>
