# Ukesoppgaver — modul 02: variabler, datatyper og brukerinput

Oppgavene følger samme vei som forelesningen: først variabler og strenger, så
innlesing av tall, og til slutt `try` og `catch`. Du trenger bare det du har
lært til og med denne uka.

Ukas kodeeksempler ligger på
<https://github.com/TrymAELindell/DAPE1400_2026/tree/main/02-variables-datatypes-input/repetisjon-kode>.
Se på dem hvis du står fast — spesielt `BreadCalculatorWithInput`, som viser
hele mønsteret for å lese inn tall fra brukeren.

## Del 1 — variabler og strenger

### Oppgave 1

Lag et program som leser inn en persons fornavn og etternavn hver for seg
(altså i to forskjellige dialogbokser), konkatenerer dem, og viser det
fullstendige navnet som del av en passende tekst i en meldingsboks. Bruk
passende ledetekster ved innlesingen, slik at brukeren forstår hva som skal
skrives inn.

### Oppgave 2

Utvid oppgave 1 med å lese inn alderen. Programmet skal så vise følgende i
meldingsboksen (eksempel på inndata):

> Alderen til Ole Olsen er 21 år.

### Oppgave 3

Utvid oppgave 2 med adresse, postnummer og poststed. Les inn opplysningene i
hver sin dialogboks og vis dem som en sammenhengende setning, for eksempel:

> Ole Olsen bor i Osloveien 23 som har postnummer 0470 i Oslo. Oles alder er
> 21 år.

### Oppgave 4

Endre oppgave 3 slik at meldingsboksen viser dette formatet:

    Navn: Ole Olsen
    Adresse: Osloveien 23
    Postnummer: 0470
    Poststed: Oslo
    Alder: 21 år

Tips: bruk `\n` for å få linjeskift inne i en streng.

### Oppgave 5

Endre oppgave 4 slik at utskriften ikke kommer i en meldingsboks, men i
`System.out`.

## Del 2 — innlesing av tall

### Oppgave 6

Lag et program som leser inn alderen din som et heltall. Vis den så i en
meldingsboks sammen med en tekst, for eksempel:

> Min alder er 19 år.

Husk at `showInputDialog` alltid gir deg en streng — skal verdien være et
heltall, må du konvertere den med `Integer.parseInt`.

### Oppgave 7

Lag et program som leser inn tre desimaltall. Programmet skal summere de tre
tallene og vise summen i `System.out`.

### Oppgave 8

Utvid programmet i oppgave 7 til også å beregne gjennomsnittet av tallene som
er lest inn. Vis resultatet både i en meldingsboks og i `System.out`.

### Oppgave 9 (litt vanskeligere)

Endre programmet i oppgave 8 slik at det tåler at brukeren skriver inn noe
som ikke er tall. Bruk `try` og `catch`. Dersom det som skrives inn ikke er
tall, skal verdiene settes til 0.

---

# Ekstraoppgaver

Ekstraoppgavene er litt vanskeligere enn de andre ukesoppgavene. Her får dere
trene mer på problemløsing og programdesign innenfor rammene av det dere har
lært så langt. Oppgavetekstene ligner på det dere kan møte i arbeidslivet,
hvor dere skal lage programmer for klienter som ikke nødvendigvis er
datakyndige — dere må selv oversette problemstillingen til et program.

### Ekstraoppgave 1

Blant ukas kodeeksempler finner du programmene `BreadCalculator` og
`BreadCalculatorWithInput`, som beregner hvor mange brød man kan lage basert
på hvor mye mel og melk man har. Dette er et litt dårlig program, fordi
brukeren selv må kunne forholdet mellom ingrediensene for at utregningen skal
bli riktig.

Lag en ny versjon av `BreadCalculatorWithInput` som bare tar mengde mel som
input, og som forteller brukeren hvor mye melk de trenger og hvor mange brød
de kan lage.

### Ekstraoppgave 2

En av kinoene i Oslo vil ha et nytt kassesystem som regner ut hvor mye en
kunde må betale, basert på hvor mange voksenbilletter og hvor mange
barnebilletter de ønsker å kjøpe.

Lag et program som spør om antall billetter av hver type og skriver ut
totalsummen i kroner. Anta at en voksenbillett koster 150 kr, og at en
barnebillett har 10 % rabatt i forhold til voksenbilletten.

### Ekstraoppgave 3

Lag et program som regner ut hvor mange dager du har levd, basert på hvor
gammel du er (i år).

Vurder hvilken datatype som gir mest mening å bruke her.

### Ekstraoppgave 4

Utforsk hvordan de forskjellige datatypene oppfører seg:

- Hva skjer hvis du deler to `int`-variabler på hverandre?
    - Hva skjer om telleren er størst?
    - Hva skjer om nevneren er størst?
    - Hva skjer om svaret egentlig skulle vært et desimaltall?
- Hva skjer når en `int` går *over* sin største mulige verdi? Og *under* den
  minste?
    - Tips: den største verdien kan skrives ut med
      `System.out.println(Integer.MAX_VALUE);` og den minste med
      `System.out.println(Integer.MIN_VALUE);`
- Oppfører de andre heltallstypene (`byte`, `short`, `long`) seg som `int`?
    - Hva skjer om man legger sammen to `byte`-variabler?
    - Her må det fort googles for å skjønne hva som skjer (best å gjøre det
      på engelsk).
- Hva slags tall kan man representere med en `float` i forhold til en
  `double`?
    - Hvor mange sifre etter punktum kan man ha i en `float`?
    - Hvor mange sifre etter punktum kan man ha i en `double`?
- Hva skjer om du prøver å konkatenere to `char`-variabler?

Tips: les feilmeldingene og hintene IntelliJ gir deg for å forstå hvorfor noe
ikke fungerer.

Merk: vær ekstra oppmerksom på tilfeller hvor programmet ditt ikke oppfører
seg som forventet, men likevel ikke krasjer. Slike tilfeller kan fort føre
til merkelige bugs som er vanskelige å spore opp. Det er spesielt viktig i
matematisk modellering, hvor numerisk presisjon betyr mye — at værsystemer er
kaotiske, altså vanskelige å forutsi, ble oppdaget på grunn av nettopp en
slik bug, forårsaket av hvordan desimaltall oppfører seg på datamaskiner.
