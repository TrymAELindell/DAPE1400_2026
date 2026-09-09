# Ukesoppgaver — modul 06: kontrollstrukturer

Du trenger bare det du har lært til og med denne uka. Som vanlig er det
flere oppgaver her enn én ukes arbeid — resten er repetisjon.

Ukas kodeeksempler ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/06-control-structures/repetisjon-kode>.
Se på dem hvis du står fast — oppgave 41 bruker `DoubleLoop.java` direkte.

Fasit til oppgavene ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/06-control-structures/ukesoppgaver-fasit>.
Prøv selv først — bruk fasiten til å sjekke løsningen din etterpå.

## Del 1 — Skriv koden

### Oppgave 1

Les inn en alder (heltall) med en inputboks. Dersom alderen er fra og med
18 til og med 20 år, skal en meldingsboks vise «Du er myndig, men kan ikke
kjøpe alkohol med mer enn 22 % på polet». Ellers skal den vise «Du er enten
umyndig, eller så kan du kjøpe hva du vil på polet». Du trenger altså en
betingelse som tester om alderen ligger i intervallet 18–20.

For alderen 19 skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du er myndig, men kan ikke kjøpe alkohol med mer enn 22 % på polet
```

</details>

### Oppgave 2

Les inn en alder (heltall). Avhengig av alderen skal programmet vise én av
tekstene i en meldingsboks:

- «Du kan ta førerkort for bil, da du er gammel nok»
- «Du er for ung til å ta førerkort for bil»

Gjør dette **uten** `else` — bruk to frittstående `if`-setninger.

For alderen 17 skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du er for ung til å ta førerkort for bil
```

</details>

### Oppgave 3

Løs oppgave 2 på nytt med én `if`-setning og en `else`-grein. Utskriften
skal være nøyaktig den samme. Kapitlet forklarer hvorfor `if`–`else` sier
tydeligere at dette er ett valg med to utfall.

For alderen 17 skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du er for ung til å ta førerkort for bil
```

</details>

### Oppgave 4

Førerkort krever at man er 18 år, og fra og med fylte 70 år kreves i
tillegg regelmessig legeattest. Definer en variabel for denne øvre grensen
(70). Utvid programmet fra oppgave 3 til å vise riktig melding av disse
tre:

- «Du er for ung til å ta førerkort for bil»
- «Du kan ta førerkort for bil, og du trenger ikke legeattest»
- «Du er absolutt gammel nok til å kjøre bil, men må ha legeattest»

For alderen 73 skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du er absolutt gammel nok til å kjøre bil, men må ha legeattest
```

</details>

### Oppgave 5

Lag et program som leser inn et månedsnavn og viser i en meldingsboks
hvilken årstid måneden hører til:

- vinter: desember, januar, februar
- vår: mars, april, mai
- sommer: juni, juli, august
- høst: september, oktober, november

Løs oppgaven med `if`/`else if`. Programmet skal tåle at brukeren skriver
månedsnavnet med stor forbokstav, og det skal si fra dersom teksten ikke er
et månedsnavn.

Tips: metoden `toLowerCase` returnerer en ny streng der alle bokstavene er
små — kall den på strengen du har lest inn.

For inndataen `Mars` skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
mars er en vårmåned
```

</details>

### Oppgave 6

Løs oppgave 5 på nytt med `switch`. Månedene som deler årstid, kan dele
`case`. Utskriften skal være nøyaktig den samme som i oppgave 5 — sammenlikn
de to løsningene etterpå og se hvor gjentakelsen ble av.

For inndataen `Mars` skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
mars er en vårmåned
```

</details>

### Oppgave 7

Lag et program som leser inn et månedsnavn og skriver månedens nummer til
terminalen på formen «‹månedsnavnet› er måned nummer ‹nummeret›». Bruk en
`switch` som *returnerer* nummeret, slik ukedagseksempelet i kapitlet
returnerer ukedagsnummeret, og la en `default`-grein returnere 0 for tekst
som ikke er et månedsnavn: da skal programmet i stedet skrive
«‹teksten› er ikke et månedsnavn».

<details markdown="1">
<summary>Forventet utskrift</summary>

For inndataen `april`:

```text
april er måned nummer 4
```

For inndataen `påskemåned`:

```text
påskemåned er ikke et månedsnavn
```

</details>

### Oppgave 8

Lag et program som leser inn navnet på en ukedag og skriver til terminalen
om dagen er en hverdag eller en helgedag, på formen
«‹dagen› er en helgedag». Bruk en `switch` som returnerer teksten `hverdag`
eller `helgedag`, og la dagene som hører sammen dele `case`. Tekst som ikke
er en ukedag, skal gi utskriften «‹teksten› er ikke en ukedag».

<details markdown="1">
<summary>Forventet utskrift</summary>

For inndataen `lørdag`:

```text
lørdag er en helgedag
```

For inndataen `tirsdag`:

```text
tirsdag er en hverdag
```

For inndataen `fjortisdag`:

```text
fjortisdag er ikke en ukedag
```

</details>

### Oppgave 9

Lag en minikalkulator: les inn to desimaltall og deretter en
regneoperasjon (`+`, `-`, `*` eller `/`). Bruk en `switch` på
regneoperasjonen der hver `case` *utfører* utskriften — her skal ingenting
returneres. Svaret skrives til terminalen som et helt regnestykke, på
formen `2.0 + 3.0 = 5.0`. En ukjent regneoperasjon skal gi utskriften
«Ukjent regneoperasjon: ‹tegnet›».

For inndataene 12, 4 og `/`:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
12.0 / 4.0 = 3.0
```

</details>

### Oppgave 10

Lag en `for`-loop som skriver ut tallene fra og med 0 til og med 9 i
terminalen, på hver sin linje.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
0
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

### Oppgave 11

Lag en `for`-loop som summerer tallene fra og med 0 til og med 9, og skriv
ut summen med en ledetekst som sier hva som er summert.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen av tallene fra 0 til 9 er 45
```

</details>

### Oppgave 12

Lag en `for`-loop som skriver ut partallene fra og med 0 til og med 18 på
én linje, med mellomrom mellom tallene.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
0 2 4 6 8 10 12 14 16 18 
```

</details>

### Oppgave 13

Lag en `for`-loop som summerer partallene fra og med 0 til og med 98, og
skriv ut summen og gjennomsnittet av dem, hver på sin linje med en
ledetekst foran.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen av partallene fra 0 til 98 er 2450
Gjennomsnittet er 49.0
```

</details>

### Oppgave 14

Som oppgave 10, men med en `while`-loop: skriv ut tallene fra og med 0 til
og med 9, på hver sin linje.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
0
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

### Oppgave 15

Som oppgave 11, men med en `while`-loop: summer tallene fra og med 0 til
og med 9 og skriv ut summen.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen av tallene fra 0 til 9 er 45
```

</details>

### Oppgave 16

Som oppgave 12, men med en `while`-loop: skriv ut partallene fra og med 0
til og med 18, med mellomrom mellom tallene.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
0 2 4 6 8 10 12 14 16 18 
```

</details>

### Oppgave 17

Som oppgave 13, men med en `while`-loop: summer partallene fra og med 0
til og med 98, og skriv ut summen og gjennomsnittet av dem.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen av partallene fra 0 til 98 er 2450
Gjennomsnittet er 49.0
```

</details>

### Oppgave 18

European Space Agency (ESA) har bedt oss lage et nedtellingsprogram til
neste rakettoppskytning. Kravene:

- Programmet skal ta brukerinput: `countdownFrom`.
- Programmet skal telle ned fra `countdownFrom` til 0.
- Når programmet når null, skal det skrives ut «Launch!».

Lag programmet med en `while`-loop. Nedtellingen skrives til terminalen.

For inndataen 3:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
3
2
1
Launch!
```

</details>

### Oppgave 19

Løs oppgave 18 på nytt med en `for`-loop. Utskriften skal være nøyaktig den
samme. Her er antall runder kjent i det loopen starter — kapitlets
tommelfingerregel sier hvilken loop som viser det tydeligst.

For inndataen 3:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
3
2
1
Launch!
```

</details>

### Oppgave 20

Lag en `for`-loop som skriver ut en potenstabell i terminalen: en
overskriftslinje med kolonnenavnene N, N^2, N^3 og N^4, og deretter én
linje per tall fra 1 til og med 10 med tallet og de tre potensene. Regn ut
potensene med ganging (`i * i`, `i * i * i`, ...), og bruk `\t` for
tabulator mellom kolonnene.

(Den innebygde metoden `Math.pow(base, exponent)` fra modul 05 kunne også
regnet ut potensene, men den returnerer en `double`, så tallene ville fått
desimaler — her holder vi oss til ganging.)

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
N	N^2	N^3	N^4
1	1	1	1
2	4	8	16
3	9	27	81
4	16	64	256
5	25	125	625
6	36	216	1296
7	49	343	2401
8	64	512	4096
9	81	729	6561
10	100	1000	10000
```

</details>

### Oppgave 21

Lag et program som skriver ut den lille gangetabellen i terminalen med
nested `for`-looper: fem rader, der rad nummer `r` viser tallene `r * 1`
til `r * 5`, med `\t` mellom tallene.

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
1	2	3	4	5
2	4	6	8	10
3	6	9	12	15
4	8	12	16	20
5	10	15	20	25
```

</details>

### Oppgave 22

Lag et program som viser en rettvinklet trekant av stjerner i en
meldingsboks. Programmet leser inn hvor mange stjerner grunnlinja skal ha,
og bygger trekanten med nested looper: linje nummer `i` skal ha `i`
stjerner. Bygg teksten i en streng med `+=`, og vis den til slutt.

For inndataen 3 skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
*
**
***
```

</details>

### Oppgave 23

Lag en `do-while`-loop som skriver «Hei!» i terminalen og deretter spør
brukeren «En gang til? (j/n)» i en inputboks. Loopen skal fortsette så
lenge svaret er `j`. Legg merke til at «Hei!» alltid skrives minst én gang
— betingelsen sjekkes først *etter* runden.

For svarene `j`, `j`, `n`:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Hei!
Hei!
Hei!
```

</details>

### Oppgave 24

Lag et program som leser inn et timetall med en `do-while`-loop, og spør på
nytt til tallet er gyldig — fra og med 0 til og med 23. Hver gang tallet er
ugyldig, skal en meldingsboks vise «Ugyldig timetall: ‹tallet›. Prøv
igjen.» Når tallet er gyldig, skal en meldingsboks vise «Registrert time:
‹tallet›».

For inndataene 25, -3 og 14 skal meldingsboksene vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Ugyldig timetall: 25. Prøv igjen.
Ugyldig timetall: -3. Prøv igjen.
Registrert time: 14
```

</details>

### Oppgave 25

Utvid nedtellingsprogrammet fra oppgave 19 slik at brukeren blir bedt om
ny brukerinput dersom den forrige ikke var gyldig — altså ikke et positivt
heltall. Bruk en `do-while`-loop til innlesingen, med `try`–`catch` rundt
`Integer.parseInt` fra modul 02: da fanger du også svar som ikke er tall i
det hele tatt. Ugyldig brukerinput skal gi en meldingsboks med beskjed om hva som
var galt, før programmet spør på nytt.

For inndataene `tre`, -1 og 3 skal terminalen til slutt vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
3
2
1
Launch!
```

</details>

### Oppgave 26

Utvid oppgave 25 slik at brukeren kan skyte opp så mange raketter hen vil:
før hver oppskytning spør programmet «Fortsett oppskytning? (j/n)» i en
inputboks, og hver gang svaret er `j`, gjennomføres en ny nedtelling. Ved
et annet svar skal det skrives ut hvor mange raketter som er skutt opp —
også når svaret er nei før den aller første.

For to oppskytninger — den første fra 3, den andre fra 2 — skal terminalen
vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
3
2
1
Launch!
2
1
Launch!
2 raketter har blitt skutt opp
```

</details>

### Oppgave 27

Et palindrom er en sekvens av tegn som er lik seg selv baklengs, for
eksempel 12321. Skriv et program som leser inn et femsifret heltall og
viser i en meldingsboks om det er et palindrom. Dersom tallet ikke har fem
siffer, skal programmet lese inn et nytt tall — bruk en `do-while`-loop.

Tips: bruk heltallsdivisjon og modulus fra modul 03 til å plukke ut de
enkelte sifrene i tallet.

For inndataen 12321 skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
12321 er et palindrom
```

</details>

### Oppgave 28

Pi kan beregnes med denne uendelige rekka:

    pi = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...

Bruk en `for`-loop til å beregne pi med rekka. Les inn hvor mange ledd av
rekka som skal brukes (antall runder i loopen), slik at det går an å
eksperimentere med hvor mange ledd som trengs for en presisjon på 10
desimaler. Programmet skriver resultatet til terminalen sammen med
fasitverdien, slik at de er lette å sammenlikne.

Tips: det trengs *svært* mange ledd — bruk `long` i stedet for `int` for
tellevariabelen, så loopen kan gå mer enn ca. 2,1 milliarder runder.

For inndataen 1000:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Pi beregnet med 1000 ledd: 3.140592653839794
Pi med 12 desimaler:       3.141592653589
```

</details>

## Del 2 — Les koden

### Oppgave 29

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
int i = 6;
while (i > 0) {
    System.out.println(i);
    i -= 2;
}
System.out.println("Ferdig!");
```

<details markdown="1">
<summary>Fasit</summary>

```text
6
4
2
Ferdig!
```

Loopen teller ned med 2 om gangen. Når `i` har blitt 0, er betingelsen
`i > 0` usann, så 0 skrives aldri ut — programmet fortsetter med første
setning etter loopen.

</details>

### Oppgave 30

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
int sum = 0;
for (int i = 1; i < 5; i++) {
    sum += i;
}
System.out.println("Summen er " + sum);
```

<details markdown="1">
<summary>Fasit</summary>

```text
Summen er 10
```

Betingelsen er `i < 5`, ikke `i <= 5` — loopen går for `i` lik 1, 2, 3 og
4, og 5 er *ikke* med i summen: 1 + 2 + 3 + 4 = 10. Grensebetingelsen er
alltid verdt et ekstra blikk.

</details>

### Oppgave 31

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
int temperature = 12;
if (temperature > 15)
    System.out.println("Det er varmt ute");
    System.out.println("Ta med solbriller");
System.out.println("Ha en fin dag");
```

<details markdown="1">
<summary>Fasit</summary>

```text
Ta med solbriller
Ha en fin dag
```

Uten `{ }` hører bare den *første* setningen til `if`-en. Innrykket får
solbrille-linja til å se ut som en del av valget, men for Java er den en
vanlig setning som alltid utføres. Dette er fella kapitlet advarer mot:
bruk alltid `{ }`, også når blokka bare har én setning.

</details>

### Oppgave 32

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
int participants = 0;
int totalScore = 480;
if (participants > 0 && totalScore / participants > 50) {
    System.out.println("Høyt snitt");
} else {
    System.out.println("Ingen deltakere ennå");
}
```

<details markdown="1">
<summary>Fasit</summary>

```text
Ingen deltakere ennå
```

Og viktigere: programmet krasjer *ikke*, enda `totalScore / participants`
er en divisjon med null. `&&` evalueres med short-circuit: når
`participants > 0` er usann, er svaret avgjort, og høyresiden regnes aldri
ut. Venstresiden fungerer som vaktledd — snus rekkefølgen på de to leddene,
krasjer programmet.

</details>

### Oppgave 33

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
String day = "lørdag";
int openingHour = switch (day) {
    case "søndag" -> 12;
    case "lørdag" -> 10;
    default -> 8;
};
System.out.println("Butikken åpner klokka " + openingHour);
```

<details markdown="1">
<summary>Fasit</summary>

```text
Butikken åpner klokka 10
```

`switch`-uttrykket sammenlikner `day` med hver `case` og returnerer verdien
til den som treffer — her 10. `default`-greina (8) brukes bare når ingen
`case` treffer, og «søndag» står før «lørdag» uten at det betyr noe:
rekkefølgen avgjør ikke, treffet gjør.

</details>

### Oppgave 34

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
String ticketType = "student";
switch (ticketType) {
    case "barn", "student" -> System.out.println("Billetten koster 44 kr");
    case "voksen" -> System.out.println("Billetten koster 81 kr");
    default -> System.out.println("Ukjent billettype");
}
```

<details markdown="1">
<summary>Fasit</summary>

```text
Billetten koster 44 kr
```

`"student"` treffer den første `case`-en, som dekker to verdier — `"barn"`
og `"student"` deler grein, atskilt med komma. Denne `switch`-en returnerer
ingenting; hver grein *utfører* bare en setning.

</details>

### Oppgave 35

Koden under bruker den gamle `switch`-syntaksen fra kapitlet. Hva skriver
programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
String size = "medium";
switch (size) {
    case "liten":
        System.out.println("2 dl kaffe");
    case "medium":
        System.out.println("3 dl kaffe");
    case "stor":
        System.out.println("5 dl kaffe");
    default:
        System.out.println("Ukjent størrelse");
}
```

<details markdown="1">
<summary>Fasit</summary>

```text
3 dl kaffe
5 dl kaffe
Ukjent størrelse
```

Ingen av greinene har `break`, så etter treffet på `"medium"` *fortsetter*
utførelsen rett inn i de neste greinene — fall-through. Alt fra treffet og
ned utføres, `default` inkludert. Det er nettopp denne fella den moderne
pilsyntaksen fjerner; den gamle formen skal du likevel kunne lese, for du
kommer til å møte den.

</details>

### Oppgave 36

Hva skriver hvert av de to programmene ut? Bestem deg for et svar på begge
før du åpner fasiten.

```java
int number = 12;
while (number < 10) {
    System.out.println("A: " + number);
    number++;
}
```

```java
int number = 12;
do {
    System.out.println("B: " + number);
    number++;
} while (number < 10);
```

<details markdown="1">
<summary>Fasit</summary>

Det første programmet skriver ingenting. Det andre skriver:

```text
B: 12
```

`while` sjekker betingelsen *før* hver runde: `12 < 10` er usann allerede
første gang, så blokka kjøres aldri. `do-while` sjekker betingelsen *etter*
runden, så blokka rekker alltid nøyaktig én runde før loopen gir seg.

</details>

### Oppgave 37

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
int amount = 100;
do {
    System.out.println(amount);
    amount *= 2;
} while (amount <= 400);
```

<details markdown="1">
<summary>Fasit</summary>

```text
100
200
400
```

`amount` dobles hver runde: 100 skrives og blir 200; 200 skrives og blir
400; 400 skrives og blir 800 — og `800 <= 400` er usann, så loopen
stopper. Legg merke til at 800 aldri skrives: utskriften skjer *før*
doblingen i hver runde.

</details>

### Oppgave 38

Programmet skal skrive ut alle radnumrene i salen, fra 1 til og med 8 —
men én rad mangler i utskriften. Hva er feilen, og hva er rettelsen?
Bestem deg for et svar før du åpner fasiten.

```java
for (int row = 1; row < 8; row++) {
    System.out.println("Rad " + row);
}
```

<details markdown="1">
<summary>Fasit</summary>

Rad 8 mangler. Betingelsen `row < 8` stopper loopen når `row` blir 8, så
den siste raden skrives aldri — en av-med-én-feil. Rettelsen er
`row <= 8`. Sjekk alltid endepunktene: hvilken verdi har tellevariabelen i
første runde, og i siste?

</details>

### Oppgave 39

Programmet skal telle ned fra 3 i terminalen og så skrive «Tid!» — men det
henger og skriver aldri noe. Hva er feilen, og hva er rettelsen? Bestem deg
for et svar før du åpner fasiten.

```java
int secondsLeft = 3;
while (secondsLeft > 0);
{
    System.out.println(secondsLeft);
    secondsLeft--;
}
System.out.println("Tid!");
```

<details markdown="1">
<summary>Fasit</summary>

Semikolonet rett etter `while (secondsLeft > 0)` er en *tom setning* — og
den tomme setningen er hele kroppen til loopen. Blokka under er ikke en del
av loopen i det hele tatt. Siden kroppen (ingenting) aldri endrer
`secondsLeft`, er betingelsen sann for alltid: en evig loop, uten én eneste
syntaksfeil. Rettelsen er å fjerne semikolonet, så blokka blir loopens
kropp. Regelen gjelder alle kontrollstrukturene: aldri semikolon rett etter
betingelsen.

</details>

### Oppgave 40

Se på loopen under. Hva gjør den? Beskriv det med én setning. Forklar også
hvorfor det er riktig at blokka alltid kjøres minst én gang. Bestem deg for
et svar før du åpner fasiten.

```java
double weight;
do {
    String input = showInputDialog("Skriv inn vekta i kg (0,1–20):");
    weight = Double.parseDouble(input);
} while (weight < 0.1 || weight > 20);
```

<details markdown="1">
<summary>Fasit</summary>

Loopen leser inn en vekt og spør på nytt helt til svaret er gyldig — fra og
med 0,1 til og med 20 kg.

Blokka *må* kjøres minst én gang, for før den første innlesingen finnes det
ingen vekt å teste. Det er typetilfellet for `do-while`: spør minst én
gang, og spør igjen så lenge svaret er ugyldig. Betingelsen leses som «så
lenge vekta er *ugyldig*» — under minstegrensa *eller* over maksgrensa.

</details>

### Oppgave 41

Åpne `DoubleLoop.java` fra ukas kodeeksempler og kjør programmet med
**debuggeren**:

1. Sett et breakpoint på `System.out.print`-linja i den *indre* loopen.
2. Start programmet med Debug-knappen i stedet for Run-knappen.
3. Programmet stopper på breakpointet. Les av `row` og `column` i
   debugger-vinduet, og bruk *Resume* til å hoppe til neste stopp.

Hvor mange ganger stopper programmet på breakpointet totalt, og hvilke
verdier har `row` og `column` ved det sjuende stoppet? Bestem deg for et
svar før du åpner fasiten — og sjekk det så med debuggeren.

<details markdown="1">
<summary>Fasit</summary>

Programmet stopper 15 ganger: den ytre loopen går 5 runder, og for hver av
dem kjører den indre loopen seg helt ferdig med sine 3 runder — 5 · 3 = 15.

Ved det sjuende stoppet er `row` 2 og `column` 0. De seks første stoppene
er rundene (0,0), (0,1), (0,2), (1,0), (1,1) og (1,2); stopp nummer sju er
starten på den tredje runden av den ytre loopen.

</details>

## Del 3 — Velg selv

### Oppgave 42

Karakterskalaen på universitetet går fra A til F: A betyr «fremragende», B
«meget god», C «god», D «nokså god», E «tilstrekkelig» og F «ikke bestått».
Programmet skal lese inn en bokstavkarakter og vise en meldingsboks på
formen «Karakteren ‹bokstaven› betyr: ‹beskrivelsen›». En ukjent bokstav
skal gi «Ukjent karakter: ‹bokstaven›». Skriv én setning i en kommentar om hvorfor du valgte å løse
oppgaven slik.

For inndataen `C` skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Karakteren C betyr: god
```

</details>

### Oppgave 43

Programmet skal lese inn et månedsnavn og vise i en meldingsboks hvor
mange dager måneden har i år: januar, mars, mai, juli, august, oktober og
desember har 31, april, juni, september og november har 30, og februar har
28. Et ukjent månedsnavn skal gi «‹teksten› er ikke et månedsnavn». Skriv
én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

For inndataen `april` skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
april har 30 dager
```

</details>

### Oppgave 44

Fakultetet til et tall n er produktet av alle heltallene fra n og ned til
1, og skrives n!. For eksempel er 5! = 5 · 4 · 3 · 2 · 1 = 120. Skriv et
program som leser inn et tall og viser fakultetet til tallet i en
meldingsboks. Skriv én setning i en kommentar om hvorfor du valgte å løse
oppgaven slik.

For inndataen 6 skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
6! er 720
```

</details>

### Oppgave 45

Lag et program som beregner skatten til tre personer. Skatten er 30 % av
inntekt opp til 500 000 kr, og 50 % av det som overstiger 500 000 kr. Les
inn navn og inntekt for de tre personene, og vis navn, inntekt og forventet
skatt for hver av dem i en meldingsboks. Skriv én setning i en kommentar om
hvorfor du valgte å løse oppgaven slik.

For Marek med inntekt 400 000 kr, Ingrid med 650 000 kr og Yusuf med
250 000 kr skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Marek: inntekt 400000.0 kr gir skatt på 120000.0 kr
Ingrid: inntekt 650000.0 kr gir skatt på 225000.0 kr
Yusuf: inntekt 250000.0 kr gir skatt på 75000.0 kr
```

</details>

### Oppgave 46

Lag et program som regner ut hvor mye bensin en bil bruker. Programmet
skal lese inn to og to verdier: lengden på en tur i km, og hvor mange liter
bensin turen brukte. Når det leses inn en lengde som er 0 eller negativ,
avsluttes innlesingen, og programmet viser bilens gjennomsnittlige forbruk
i liter per mil over alle turene i en meldingsboks. Skriv én setning i en
kommentar om hvorfor du valgte å løse oppgaven slik.

For turene 250 km på 18 liter og 150 km på 12 liter skal meldingsboksen
vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Gjennomsnittlig forbruk per mil er 0.75 liter
```

</details>

### Oppgave 47

En selger får 9 % kommisjon av salget sitt i tillegg til vanlig månedslønn.
Skriv et program som leser inn prisen på varene selgeren har solgt, én og
én, og regner ut hvor stort tillegg selgeren skal ha. Avslutt innlesingen
når prisen som leses inn er 0, og vis tillegget i en meldingsboks. Skriv én
setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

For prisene 1200 kr og 850 kr skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Kommisjonen for et salg på totalt 2050.0 kr blir 184.5 kr
```

</details>

### Oppgave 48

Kaféen har tre varer: espresso til 35 kr, cappuccino til 49 kr og te til
29 kr. Programmet skal ta imot bestillinger fra den som står i kassa: les
inn varenavn, ett og ett, til det skrives `ferdig`. Da skal en meldingsboks
vise hvor mange bestillinger som er tatt imot og hva de koster til sammen,
i én melding. Et ukjent varenavn skal gi en meldingsboks med «Ukjent
vare: ‹navnet›», uten at bestillingen telles. Skriv én setning i en
kommentar om hvorfor du valgte å løse oppgaven slik.

For bestillingene espresso, te, cappuccino og espresso skal meldingsboksen
til slutt vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
4 bestillinger, til sammen 148 kr
```

</details>

### Oppgave 49

Et program skal finne det største av 10 heltall. Tallene leses inn med
inputbokser, og resultatet vises i en meldingsboks. Programmet skal ikke
trenge å huske mer enn tre tall om gangen — det skal altså klare seg uten å
ta vare på alle de ti tallene. Skriv én setning i en kommentar om hvorfor
du valgte å løse oppgaven slik.

For inndataene 12, -4, 55, 7, 87, 3, 41, 60, 19 og 8 skal meldingsboksen
vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Det største tallet er 87
```

</details>

### Oppgave 50

Som forrige oppgave, men programmet skal finne de *to* største tallene. I
tillegg til de tre tallene fra oppgave 49 trenger du bare å huske ett til.
Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

For de samme inndataene som i oppgave 49 skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Det største tallet er 87
Det nest største tallet er 60
```

</details>

### Oppgave 51

Lag en primtallssjekk: programmet leser inn et tall og sjekker om tallet er
delelig med noen av tallene fra 2 og opp til tallet selv. Er det bare
delelig med 1 og seg selv, er det et primtall. Resultatet vises i en
meldingsboks. Skriv én setning i en kommentar om hvorfor du valgte å løse
oppgaven slik.

For inndataen 31 skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
31 er et primtall
```

</details>

### Oppgave 52

Lag en primtallsgenerator: programmet leser inn et tall og viser alle
primtall fra 2 og opp til tallet i en meldingsboks. Et primtall er et tall
som bare er delelig med 1 og seg selv. Skriv én setning i en kommentar om
hvorfor du valgte å løse oppgaven slik.

For inndataen 30 skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Primtall opp til 30:
2 3 5 7 11 13 17 19 23 29 
```

</details>

### Oppgave 53

ESA er fornøyd med nedtellingsprogrammet fra oppgave 26, men koden har
blitt lang og vanskelig å finne fram i. Rydd opp: del programmet opp slik
at innlesingen, nedtellingen og hovedprogrammet er tydelig atskilt, og slik
at hovedprogrammet blir kort og lett å lese. Programmet skal oppføre seg
nøyaktig som før. Skriv én setning i en kommentar om hvorfor du valgte å
løse oppgaven slik.

For de samme to oppskytningene som i oppgave 26 skal terminalen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
3
2
1
Launch!
2
1
Launch!
2 raketter har blitt skutt opp
```

</details>

## Del 4 — Fra problem til program

### Oppgave 54

Randi Bakken står i kiosken på Voldsløkka under hjemmekampene, og
forteller dette:

> «Jeg har stått i den kiosken i femten år, og jeg teller fortsatt opp for
> hånd på en lapp. Under kampen har jeg ikke tid til å notere — det er kø
> hele pausen. Jeg vil bare taste inn hvert salg mens kvelden går, og når
> jeg stenger vil jeg få vite hvor mye jeg har solgt for og hvor mange salg
> det ble. Og så krangler jeg alltid med Odd Arne om hvor stort det største
> enkeltsalget var, så det hadde vært stas å få svar på det også.»

Lag programmet Randi trenger. Der du må ta et valg beskrivelsen ikke svarer
på, skriv antakelsen din som en kommentar i koden.

Du kan åpne eksempelkjøringen under for å se én godkjent løsning.
Programmet ditt kan oppføre seg annerledes og likevel være riktig.

<details markdown="1">
<summary>Eksempelkjøring</summary>

Med salgene 25 kr, 60 kr, 15 kr og 30 kr viser meldingsboksen til slutt:

```text
Antall salg: 4
Samlet beløp: 130 kr
Største salg: 60 kr
```

</details>
