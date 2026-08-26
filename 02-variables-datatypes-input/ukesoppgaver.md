# Ukesoppgaver — modul 02: variabler, datatyper og brukerinput

Ukesoppgavene har fire deler, og hver del trener sin egen ferdighet: å skrive
koden, å lese kode andre har skrevet, å velge selv hvordan en oppgave skal
løses, og å gå fra en problembeskrivelse til et ferdig program. Slik er det
hver uke i dette emnet.

Du trenger bare det du har lært til og med denne uka.

Det er flere oppgaver her enn de fleste rekker på én uke. Det er meningen:
oppgavene du ikke rekker nå, kan du komme tilbake til som repetisjon senere i
semesteret.

Ukas kodeeksempler ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/02-variables-datatypes-input/repetisjon-kode>.
Se på dem hvis du står fast — spesielt `BreadCalculatorWithInput`, som viser
hele mønsteret for å lese inn tall fra brukeren.

Fasit til oppgavene ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/02-variables-datatypes-input/ukesoppgaver-fasit>.
Prøv selv først — bruk fasiten til å sjekke løsningen din etterpå.

## Del 1 — Skriv koden

### Oppgave 1

Lag et program som leser inn en persons fornavn og etternavn hver for seg
(altså i to forskjellige dialogbokser), konkatenerer dem, og viser det
fullstendige navnet som del av en passende tekst i en meldingsboks. Bruk
passende ledetekster ved innlesingen, slik at brukeren forstår hva som skal
skrives inn.

For inndata `Ole` og `Olsen` skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Det fullstendige navnet ditt er Ole Olsen
```

</details>

### Oppgave 2

Utvid oppgave 1 med å lese inn alderen. Meldingsboksen skal nå vise én
setning med både det fullstendige navnet og alderen i år.

For inndata `Ole`, `Olsen` og 21:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Alderen til Ole Olsen er 21 år.
```

</details>

### Oppgave 3

Utvid oppgave 2 med adresse, postnummer og poststed. Les inn opplysningene i
hver sin dialogboks og vis alt sammen som sammenhengende tekst: hvor
personen bor, med postnummer og poststed, og hvor gammel personen er.

For inndata `Ole`, `Olsen`, 21, `Osloveien 23`, `0470` og `Oslo`:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Ole Olsen bor i Osloveien 23 som har postnummer 0470 i Oslo. Alderen til Ole er 21 år.
```

</details>

### Oppgave 4

Endre oppgave 3 slik at meldingsboksen viser én opplysning per linje, med en
ledetekst foran hver: `Navn:`, `Adresse:`, `Postnummer:`, `Poststed:` og
`Alder:`, i den rekkefølgen. Alderen skal ha `år` bak tallet.

For de samme inndataene:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Navn: Ole Olsen
Adresse: Osloveien 23
Postnummer: 0470
Poststed: Oslo
Alder: 21 år
```

</details>

Tips: bruk `\n` for å få linjeskift inne i en streng.

### Oppgave 5

Endre oppgave 4 slik at utskriften ikke kommer i en meldingsboks, men i
`System.out`. Linjene og ledetekstene skal være de samme som i oppgave 4.

For de samme inndataene:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Navn: Ole Olsen
Adresse: Osloveien 23
Postnummer: 0470
Poststed: Oslo
Alder: 21 år
```

</details>

### Oppgave 6

Programmene dine begynner med `import javax.swing.JOptionPane;`, og da må du
skrive `JOptionPane.` foran hvert metodekall. Lag to nye versjoner av
programmet fra oppgave 1:

- **versjon B**, som begynner med `import static javax.swing.JOptionPane.*;`
- **versjon C**, som begynner med disse to linjene:

      import static javax.swing.JOptionPane.showInputDialog;
      import static javax.swing.JOptionPane.showMessageDialog;

I begge de nye versjonene skal du skrive `showInputDialog(...)` og
`showMessageDialog(...)` uten `JOptionPane.` foran. Skriv en `//`-kommentar
over hver `import`-linje som sier hva den henter inn.

Alle tre versjonene skal vise samme meldingsboks som oppgave 1:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Det fullstendige navnet ditt er Ole Olsen
```

</details>

### Oppgave 7

Lag et program uten innlesing som lagrer initialene dine i to
`char`-variabler og viser dem i en meldingsboks som del av en kort tekst,
med punktum etter hver initial. Husk at `char`-verdier skrives med enkle
anførselstegn (`'T'`), ikke doble.

Programmet trenger ingen dialogboks for innlesing, så det holder med én
import: `import static javax.swing.JOptionPane.showMessageDialog;`

For initialene O og O skal meldingsboksen vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Initialene mine er O.O.
```

</details>

### Oppgave 8

Lag et program uten innlesing som lagrer opplysninger om deg selv i variabler
med hver sin datatype:

- alder i år, som `int`
- høyde i meter, som `float` — husk `f` bakerst i verdien: `1.75f`
- vekt i kilo, som `double`
- forbokstaven i fornavnet ditt, som `char`
- om du har førerkort, som `boolean`

Vis alt i én meldingsboks, med hver opplysning på sin egen linje og en
ledetekst foran hver: `Alder:`, `Høyde:`, `Vekt:`, `Forbokstav:` og
`Førerkort:`, i den rekkefølgen.

For verdiene 21, 1.75, 68.5, `O` og `true` blir meldingsboksen:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Alder: 21
Høyde: 1.75
Vekt: 68.5
Forbokstav: O
Førerkort: true
```

</details>

### Oppgave 9

Lag et program uten innlesing som gjør dette, i denne rekkefølgen:

1. deklarerer `boolean member;` uten å gi den noen verdi
2. gir den verdien `false` i en egen setning
3. skriver ut `Medlem: false` i `System.out`
4. gir den verdien `true`
5. skriver ut `Medlem: true` i `System.out`

Begge utskriftene skal bruke den samme variabelen. Utskriften blir:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Medlem: false
Medlem: true
```

</details>

### Oppgave 10

Lag et program som leser inn alderen din som et heltall. Vis den så i en
meldingsboks sammen med en tekst. For inndata 19:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Min alder er 19 år.
```

</details>

Husk at `showInputDialog` alltid gir deg en streng — skal verdien være et
heltall, må du konvertere den med `Integer.parseInt`.

### Oppgave 11

Lag et program som leser inn to heltall i hver sin dialogboks og viser både
summen og produktet av dem i en meldingsboks, på hver sin linje. Hver linje
skal vise hele regnestykket: begge tallene, operatoren mellom dem og svaret.
Bruk `import static javax.swing.JOptionPane.*;` slik at du slipper å skrive
`JOptionPane.` foran metodekallene.

For inndata 12 og 30:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
12 + 30 = 42
12 * 30 = 360
```

</details>

### Oppgave 12

Lag et program som leser inn tre desimaltall. Programmet skal summere de tre
tallene og vise summen i `System.out` som del av en setning. For inndata
1.5, 2.5 og 3.0:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen av de tre tallene er 7.0
```

</details>

### Oppgave 13

Utvid programmet i oppgave 12 til også å beregne gjennomsnittet av tallene
som er lest inn. Vis resultatet både i en meldingsboks og i `System.out`, med
én linje for hver verdi. For de samme inndataene:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen av de tre tallene er 7.0
Gjennomsnittet er 2.3333333333333335
```

</details>

### Oppgave 14

Endre programmet i oppgave 13 slik at det tåler at brukeren skriver inn noe
som ikke er tall. Bruk `try` og `catch`. Dersom noe av det som skrives inn
ikke er tall, skal alle tre verdiene settes til 0, og brukeren skal få en
melding om hva som gikk galt. For inndata 1.5, `to` og 3.0:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen av de tre tallene er 0.0
Gjennomsnittet er 0.0
```

</details>

### Oppgave 15

Gjør det samme med programmet i oppgave 10: skriver brukeren noe som ikke er
et heltall, skal alderen settes til 0, og brukeren skal få en melding om hva
som gikk galt. For inndata `nitten`:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Min alder er 0 år.
```

</details>

### Oppgave 16

I oppgave 14 settes alle tre verdiene til 0 selv om bare én av dem var feil.
Lag en ny versjon der hver innlesing har sin egen `try` og `catch`, slik at
de verdiene brukeren faktisk skrev riktig, blir beholdt.

Da må programmet si tydelig fra. Gjennomsnittet regnes fortsatt over tre
tall, og ett av dem er en 0 brukeren aldri skrev — svaret ser riktig ut uten
å være det. Meldingen skal derfor si hvilken verdi som ikke var et tall, og
at den er regnet som 0.

For inndata 1.5, `to` og 3.0:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Det andre tallet var ikke et tall og er regnet som 0.
Summen av de tre tallene er 4.5
Gjennomsnittet er 1.5
```

</details>

### Oppgave 17

Gå tilbake til programmet fra oppgave 13 og kommenter det:

- skriv en `/* */`-kommentar øverst i filen som forklarer hva programmet gjør
- skriv en `//`-kommentar på linjen der du konverterer fra streng til tall,
  som forklarer hvorfor konverteringen trengs

Skriv kommentarene på engelsk — det er slik vi skriver kommentarer i dette
emnet. Kjør programmet etterpå: utskriften skal være den samme som i oppgave
13, for kompilatoren hopper over kommentarene.

For inndata 1.5, 2.5 og 3.0:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Summen av de tre tallene er 7.0
Gjennomsnittet er 2.3333333333333335
```

</details>

### Oppgave 18

Lag et program som skriver ut sju linjer i `System.out`. De fire første skal
bruke bare to `int`-variabler, `largest` og `smallest`, som får nye verdier
underveis:

1. `largest` settes til `Integer.MAX_VALUE`, og skrives ut
2. `largest` settes til seg selv pluss 1, og skrives ut på nytt
3. `smallest` settes til `Integer.MIN_VALUE`, og skrives ut
4. `smallest` settes til seg selv minus 1, og skrives ut på nytt

De tre siste linjene bruker de andre heltallstypene:

5. den største verdien en `byte` kan ha (127), lagret i en `byte`-variabel
6. den største verdien en `short` kan ha (32767), lagret i en `short`-variabel
7. summen av to `byte`-variabler med verdiene 100 og 27

Gjett hva linje 2 og linje 4 kommer til å skrive ut før du kjører
programmet, og skriv en `//`-kommentar bak hver av dem med hva du tror
skjedde. Kjør så programmet — og åpne fasiten først når du har sett
utskriften selv.

<details markdown="1">
<summary>Fasit</summary>

```text
2147483647
-2147483648
-2147483648
2147483647
127
32767
127
```

Legger du 1 til den største `int`-verdien, får du ikke et større tall — du
havner på den minste. Verdien går rundt, og det samme skjer motsatt vei.
Programmet krasjer ikke, og det er nettopp det som gjør dette til en farlig
type feil.

</details>

### Oppgave 19

Lag et program som lagrer tallet 1.123456789123456789 i både en
`float`-variabel og en `double`-variabel, og som skriver begge ut i
`System.out`.

Tips: husk `f` bakerst i verdien til `float`-variabelen, slik kapitlet og
forelesningen viser — `1.123456789123456789f`.

Gjett hvor mange sifre hver av de to typene klarer å holde på, før du kjører
programmet. Kjør det så, og åpne fasiten først når du har sett utskriften
selv.

<details markdown="1">
<summary>Fasit</summary>

```text
float:  1.1234568
double: 1.1234567891234568
```

En `float` bruker 32 bits og holder på rundt 8 sifre; en `double` bruker 64
og holder på rundt 17. Resten er borte for godt — de er ikke avrundet i
utskriften, de finnes ikke i variabelen.

</details>

Skriv en `//`-kommentar ved hver utskrift om hvor mange sifre som overlevde,
og en `/* */`-kommentar øverst i filen om hvilken av de to typene du vil
bruke som standard, og hvorfor. Kapitlet forklarer under «Datatyper gir
kontroll over minnebruk» hvorfor forskjellen er verdt å ta på alvor.

## Del 2 — Les koden

### Oppgave 20

Hva skriver programmet ut? Bestem deg for et svar på alle tre linjene før du
åpner fasiten.

```java
int number1 = 23;
int number2 = 5;
System.out.println(number1 + number2);

String text1 = "23";
String text2 = "5";
System.out.println(text1 + text2);
System.out.println(text1 + number2);
```

<details markdown="1">
<summary>Fasit</summary>

```text
28
235
235
```

Den første linjen legger sammen to tall, så `+` betyr addisjon. De to neste
har en streng på venstre side, og da betyr `+` konkatenering: tegnene settes
bare etter hverandre. På siste linje blir `number2` gjort om til tekst før
den konkateneres, fordi den står sammen med en streng.

</details>

### Oppgave 21

Hva skriver programmet ut? Bestem deg for et svar før du åpner fasiten.

```java
int a = 5;
int b = 3;
a = b;
b = 10;
System.out.println(a + " " + b);
```

<details markdown="1">
<summary>Fasit</summary>

```text
3 10
```

`=` er ikke et likhetstegn — det betyr «settes til», og høyre side utføres
først. `a = b` legger *verdien* 3 inn i `a`. Etterpå er de to variablene
uavhengige av hverandre, så `b = 10` endrer bare `b`.

</details>

### Oppgave 22

Programmet under kompilerer ikke. Hva er feilen, og hvordan retter du den?
Bestem deg for et svar før du åpner fasiten.

```java
public class Greeting {
    public static void main(String[] args) {
        String firstName = "Ole";
        String lastname = "Olsen";
        System.out.println("Hei " + firstName + " " + lastName);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Variabelen heter `lastname`, men den brukes som `lastName` med stor `N`.
Java skiller mellom store og små bokstaver, så det er to forskjellige navn —
og `lastName` er aldri deklarert. Rettelsen er å skrive navnet likt begge
steder; `lastName` er det som følger camelCase-regelen:

```java
String lastName = "Olsen";
System.out.println("Hei " + firstName + " " + lastName);
```

Legg merke til at feilen dukker opp allerede når du kompilerer, ikke først
når programmet kjører. Det er statisk typing som gjør det.

</details>

### Oppgave 23

Hva skriver programmet ut? Bestem deg for et svar på alle tre linjene før du
åpner fasiten.

```java
char first = 'O';
char last = 'O';
boolean ofAge = true;
System.out.println(first + last);
System.out.println("" + first + last);
System.out.println("Myndig: " + ofAge);
```

<details markdown="1">
<summary>Fasit</summary>

```text
158
OO
Myndig: true
```

En `char` lagres som et tall — tegnkoden. `'O'` har koden 79, så `first +
last` legger sammen to tall og gir 158. På den neste linjen står det en tom
streng først, og da er hele uttrykket tekst: `+` konkatenerer, og resultatet
blir `OO`. En `boolean` skrives ut som `true` eller `false`.

</details>

### Oppgave 24

Brukeren skriver `20` i dialogboksen. Hva skriver programmet ut? Bestem deg
for et svar før du åpner fasiten.

```java
String ageInput = JOptionPane.showInputDialog("Hvor gammel er du?");
System.out.println("Om ett år er du " + ageInput + 1 + " år");
```

<details markdown="1">
<summary>Fasit</summary>

```text
Om ett år er du 201 år
```

`showInputDialog` gir alltid en streng tilbake, også når brukeren bare
skriver sifre. `ageInput` er derfor `"20"`, ikke tallet 20, og `+ 1`
konkatenerer tegnet `1` i stedet for å legge til én. Skal programmet regne, må
strengen først konverteres:

```java
int age = Integer.parseInt(ageInput);
System.out.println("Om ett år er du " + (age + 1) + " år");
```

</details>

### Oppgave 25

Hva gjør programmet under? Beskriv det med én setning. Og hvorfor står
metodekallet på høyre side av `=` på den første linjen inne i `main`?
Bestem deg for et svar før du åpner fasiten.

```java
import javax.swing.JOptionPane;

public class Greeting {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Hva heter du?");
        String output = "Hei på deg " + name;
        JOptionPane.showMessageDialog(null, output);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Programmet spør brukeren om navnet og viser en hilsen med navnet i en
meldingsboks.

Metodekallet står på høyre side fordi høyre side utføres først: først vises
dialogboksen og brukeren skriver, og *deretter* legges det brukeren skrev inn
i variabelen `name`. Sto kallet alene på en linje, ville svaret blitt kastet
bort med én gang.

`import`-linjen øverst henter klassen `JOptionPane` inn i programmet fra
pakken `javax.swing`.

</details>

### Oppgave 26

Linjen under kompilerer ikke. Hva mangler? Bestem deg for et svar før du
åpner fasiten.

```java
JOptionPane.showMessageDialog("Klar!");
```

<details markdown="1">
<summary>Fasit</summary>

`showMessageDialog` skal ha et ekstra første parameter, som vi setter til
`null`. Meldingen er det *andre* parameteret:

```java
JOptionPane.showMessageDialog(null, "Klar!");
```

`showInputDialog` er ikke laget på samme måte — der er ledeteksten det eneste
parameteret.

</details>

### Oppgave 27

Programmet under kompilerer ikke. Hva er feilen, og hva er de to måtene å
rette den på? Bestem deg for et svar før du åpner fasiten.

```java
import javax.swing.JOptionPane;

public class Ask {
    public static void main(String[] args) {
        String answer = showInputDialog("Hva heter du?");
        System.out.println(answer);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

`import javax.swing.JOptionPane;` henter inn *klassen*, og da må klassenavnet
stå foran metodekallet. Programmet skriver `showInputDialog(...)` uten
klassenavn, og da finner Java ingen metode med det navnet.

De to rettelsene:

```java
String answer = JOptionPane.showInputDialog("Hva heter du?");
```

eller bytt importen til en statisk import, som henter selve metoden:

```java
import static javax.swing.JOptionPane.showInputDialog;
```

</details>

### Oppgave 28

Programmet under kompilerer ikke. Hvilken linje er det som ikke går, og
hvorfor? Bestem deg for et svar før du åpner fasiten.

```java
import static javax.swing.JOptionPane.showInputDialog;

public class Ask {
    public static void main(String[] args) {
        String answer = showInputDialog("Hva heter du?");
        showMessageDialog(null, "Hei " + answer);
    }
}
```

<details markdown="1">
<summary>Fasit</summary>

Linjen med `showMessageDialog`. Importen henter bare *én* metode —
`showInputDialog` — så `showMessageDialog` er fortsatt ukjent for programmet.

Enten importerer du den også:

```java
import static javax.swing.JOptionPane.showMessageDialog;
```

eller du bytter til `import static javax.swing.JOptionPane.*;`, som henter
alle metodene i klassen på én gang.

</details>

### Oppgave 29

De to versjonene under gjør nesten det samme, og `input` er `"to"` i begge.
Hva skjer i hver av dem? Bestem deg for et svar før du åpner fasiten.

Versjon A:

```java
String input = "to";
double number = Double.parseDouble(input);
System.out.println("Tallet er " + number);
```

Versjon B:

```java
String input = "to";
double number;
try {
    number = Double.parseDouble(input);
} catch (Exception e) {
    number = 0;
}
System.out.println("Tallet er " + number);
```

<details markdown="1">
<summary>Fasit</summary>

Versjon A skriver ikke ut noe i det hele tatt. `Double.parseDouble` klarer
ikke å tolke `"to"` som et tall, så den kaster en exception
(`NumberFormatException`), og programmet stopper på den linjen — utskriften
under blir aldri utført.

Versjon B skriver ut:

```text
Tallet er 0.0
```

Her hopper programmet rett til `catch`-blokken når exceptionen kastes.
`number` settes til 0, og programmet fortsetter som normalt.

</details>

### Oppgave 30

Programmet under krasjer ikke lenger, men det har likevel et problem. Hva er
problemet, og hvordan retter du det? Bestem deg for et svar før du åpner
fasiten.

```java
String flourInput = JOptionPane.showInputDialog("Hvor mye mel har du (dl)?");

double flourDl;
try {
    flourDl = Double.parseDouble(flourInput);
} catch (Exception e) {
    flourDl = 0;
}

double numberOfLoaves = flourDl / 2.5;
JOptionPane.showMessageDialog(null, "Du kan lage " + numberOfLoaves + " brød!");
```

<details markdown="1">
<summary>Fasit</summary>

Skriver brukeren `2 dl`, får hen beskjed om at hen kan lage 0.0 brød — uten
å få vite hvorfor. Programmet feiler stille, og brukeren tror svaret er
riktig.

`catch`-blokken bør si fra om hva som gikk galt:

```java
} catch (Exception e) {
    flourDl = 0;
    JOptionPane.showMessageDialog(null, "Du skrev ikke inn et tall");
}
```

Hvilken verdi backup-koden skal sette, er en vurdering du må gjøre selv, og
det finnes sjelden ett riktig svar — her kunne 0 like gjerne vært noe annet.
Det ene som er lett å slå fast, er at det er feil å ikke si fra i det hele
tatt.

Å gjette på brukerens vegne er uansett en nødløsning. Det programmet egentlig
burde gjort, er å spørre på nytt til brukeren skriver noe gyldig — men det
krever en loop, og looper kommer i modul 06.

</details>

### Oppgave 31

Hva gjør programmet under hvis brukeren trykker OK uten å skrive noe? Og
hvilken verdi ville du selv satt i `catch`-blokken? Her finnes det flere
forsvarlige svar — bestem deg for ett, og finn en begrunnelse, før du åpner
fasiten.

```java
String input = JOptionPane.showInputDialog("Hvor mange billetter vil du ha?");
int tickets;
try {
    tickets = Integer.parseInt(input);
} catch (Exception e) {
    tickets = 1;
    JOptionPane.showMessageDialog(null, "Vi tolker det som én billett.");
}
JOptionPane.showMessageDialog(null, "Du har bestilt " + tickets + " billett(er).");
```

<details markdown="1">
<summary>Fasit</summary>

Trykker brukeren OK uten å skrive noe, får `input` verdien `""` — en tom
streng. `Integer.parseInt("")` klarer ikke å lage et tall av den og kaster en
exception, så `catch`-blokken kjører: brukeren får meldingen «Vi tolker det
som én billett», og programmet fortsetter med `tickets` lik 1.

Om 1 er den *riktige* verdien, finnes det ikke noe fasitsvar på. To
forsvarlige valg:

- **1** — den som åpner en billettbestilling, vil nesten sikkert ha minst én
  billett. Til gjengjeld bestiller programmet noe brukeren aldri ba om.
- **0** — programmet bestiller ingenting brukeren ikke har bedt om, men da
  er hele bestillingen verdiløs, og meldingen må si tydelig fra at ingenting
  ble bestilt og at brukeren må kjøre programmet på nytt.

Poenget er ikke hvilken du velger, men at du velger bevisst og sier fra til
brukeren hva programmet faktisk gjorde. Begge svarene er nødløsninger: det
programmet egentlig burde gjort, er å spørre på nytt til brukeren skriver et
gyldig tall. Det krever en loop, og looper kommer i modul 06.

</details>

### Oppgave 32

Hva skriver programmet ut? De to første linjene kan du regne ut selv; den
tredje er en overraskelse — gjett, og se etterpå.

```java
int a = 7;
int b = 2;
System.out.println(a / b);

double c = 7;
double d = 2;
System.out.println(c / d);

System.out.println(0.1 + 0.2);
```

<details markdown="1">
<summary>Fasit</summary>

```text
3
3.5
0.30000000000000004
```

Når begge tallene i en divisjon er heltall, blir svaret også et heltall, og
desimalene kuttes bort: `7 / 2` gir 3, ikke 3.5. Er tallene `double`,
beholdes desimalene.

Den siste linjen viser at `double` er presis, men ikke *helt* presis: 0.1 og
0.2 kan ikke lagres helt nøyaktig med et endelig antall bits, og de bittesmå
avrundingsfeilene blir synlige når vi legger dem sammen. Vi kommer tilbake
til regning med tall i modul 03.

</details>

## Del 3 — Velg selv

### Oppgave 33

En baker har en fast oppskrift: 2 dl mel til 1 dl melk, og hver bit deig på
2,5 dl blir ett brød. Bakeren vet aldri hvor mye melk hen skal bruke, og vil
bare oppgi hvor mye mel hen har.

Lag et program som spør om melmengden og forteller bakeren hvor mye melk hen
trenger og hvor mange brød hen kan lage. For inndata 10 skal programmet vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du trenger 5.0 dl melk og kan lage 6.0 brød!
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 34

En av kinoene i Oslo vil ha et nytt kassesystem. Det skal spørre om hvor
mange voksenbilletter og hvor mange barnebilletter kunden kjøper, og vise hva
kunden skal betale til sammen. En voksenbillett koster 150 kr, og en
barnebillett har 10 % rabatt i forhold til voksenbilletten.

For inndata 2 og 3 skal programmet vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Totalsummen er 705.0 kr
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 35

Lag et program som spør brukeren hvor gammel hen er i år, og som viser
omtrent hvor mange dager hen har levd. Regn 365 dager i året.

For inndata 21 skal programmet vise:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Du har levd i omtrent 7665 dager!
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

### Oppgave 36

Kafeen Kaffekroken vil ha menyen sin skrevet ut hver gang programmet kjøres.
Menyen er den samme hver dag, og ingen skal skrive inn noe mens programmet
kjører.

Menyen er kafeens navn øverst og så fem varer med pris: kaffe 35 kr, te 30
kr, vaffel 45 kr, bolle 40 kr og kakao 45 kr. Hver vare skal stå på sin egen
linje, og prisene skal stå under hverandre i en egen kolonne.

Utskriften skal se slik ut:

<details markdown="1">
<summary>Forventet utskrift</summary>

```text
Kaffekroken
Kaffe   35 kr
Te      30 kr
Vaffel  45 kr
Bolle   40 kr
Kakao   45 kr
```

</details>

Skriv én setning i en kommentar om hvorfor du valgte å løse oppgaven slik.

## Del 4 — Fra problem til program

Her får du en beskrivelse fra en «kunde» — en som trenger et program, men som
ikke kan programmere og ikke tenker i tekniske steg. Beskrivelsen er upresis
med vilje — ekte oppdrag er sånn. Jobben din er å oversette den til et
program, og å bestemme selv det beskrivelsen ikke sier noe om. Slik ser den
siste delen ut hver uke resten av semesteret.

### Oppgave 37

Sara har akkurat begynt som frilanser og beskriver behovet sitt slik:

> «Jeg skal sende min første faktura, og jeg tør ikke regne det ut på egen
> hånd. Jeg tar 750 kroner i timen, og så skal det legges på moms — 25
> prosent, tror jeg det er. Det jeg trenger, er noe som sier meg hva jeg skal
> skrive på fakturaen når jeg har jobbet et visst antall timer. Jeg jobber
> sjelden hele timer, altså.»

Der du må ta et valg beskrivelsen ikke svarer på, skriv antakelsen din som en
kommentar i koden.

Du kan åpne eksempelkjøringen under for å se én godkjent løsning.
Programmet ditt kan oppføre seg annerledes og likevel være riktig.

<details markdown="1">
<summary>Eksempelkjøring</summary>

```text
10.5 timer à 750.0 kr blir 7875.0 kr. Med 25 % moms skal du fakturere 9843.75 kr.
```

</details>
