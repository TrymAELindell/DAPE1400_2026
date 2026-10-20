# SeatBooking – én oppgave per klasse

Dette prosjektet er flyet fra modul 07 bygd om. Programmet gjør det samme
som `PlaneV2`: det finner ledige seter i et fly og setter dem til opptatt.
Det nye er hvordan arbeidet er delt mellom klassene.

## Hvorfor to klasser?

I modul 07 hadde `Plane` to oppgaver. Klassen holdt på setene, og den fant
og tok et ledig sete (`setFreeSeatToTaken`). Her er de to oppgavene delt
mellom to klasser:

- **`Plane`** holder bare på setene. Den kan fortelle hvor mange seter den
  har (`getNrOfSeats`), og den kan sette ett bestemt sete til opptatt
  (`setSeatToTaken`).
- **`SeatBooker`** finner et ledig sete. Metoden `bookSeatInPlane` tar et
  `Plane`-objekt som parameter, går gjennom setene og tar det første ledige.

Et viktig prinsipp i objektorientert programmering er at hver klasse skal
ha én tydelig oppgave. Når en klasse bare gjør én ting, er det lettere å
bruke den på nytt i et annet program. Det blir også lettere å endre koden: en endring i
måten vi finner ledige seter på, gjør vi i `SeatBooker`, og `Plane` trenger
vi ikke røre.

## Hvorfor er `bookSeatInPlane` statisk?

Metoden bruker bare parameteren `plane`. Den trenger ingen fields i et
`SeatBooker`-objekt, så den kan være statisk. Derfor lager `Main` aldri et
`SeatBooker`-objekt, men kaller metoden rett på klassenavnet:
`SeatBooker.bookSeatInPlane(plane)`. Regelen for når en metode bør være
statisk, står i kapitlet til modul 05, avsnittet «Når bør en metode være
statisk?».

## Hvorfor returnerer metodene en `boolean`?

`setSeatToTaken` returnerer `true` hvis setet var ledig og nå er tatt, og
`false` hvis det var opptatt fra før. `bookSeatInPlane` returnerer på samme
måte `true` hvis den fikk tatt et sete, og `false` hvis flyet er fullt.

Denne returverdien bruker `Main` direkte i betingelsen til en `while`-loop:

```java
while (SeatBooker.bookSeatInPlane(plane)) {}
```

Loopen kaller metoden igjen og igjen. Når flyet er fullt, returnerer
metoden `false`, og loopen stopper. Blokka til loopen er tom, fordi alt
arbeidet skjer i kallet i betingelsen.

Du kommer ofte til å se metoder som returnerer en `boolean` som forteller
om metoden fikk gjort jobben sin. Da kan koden som kaller metoden, bestemme
hva som skal skje videre.

## Filene

Les dem i denne rekkefølgen:

1. `src/Plane.java` – setene.
2. `src/SeatBooker.java` – letingen etter et ledig sete.
3. `src/Main.java` – programmet som tar alle setene.
