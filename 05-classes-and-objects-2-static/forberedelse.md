# Forberedelse – Klasser og objekter 2 — `static`

I modul 04 bygde vi `Ticket`-klassen for billettsystemet på Gardermoen:
private fields, konstruktør, metoder, settere og gettere. Denne uken vil
Gardermoen ha noe nytt: hver billett skal ha sitt eget billettnummer. Den
første billetten som skrives ut, skal ha nummer 1, den neste nummer 2, og
slik fortsetter det.

Halvparten er lett. En billett som skal huske nummeret sitt, trenger et
field:

```java
public class Ticket {
    private int ticketNr;
    // ... fieldene og metodene fra modul 04
}
```

Men hvem skal *sette* nummeret? Verdien avhenger av hvor mange billetter som
er laget fra før — og det vet ikke det nye objektet. Et field bor inne i ett
objekt: `ticket2` kan ikke se inn i `ticket1`. Telleren må bo et sted alle
billettene deler, men alt vi kan lage nå, bor i ett bestemt objekt.

Vi kunne latt `main` holde telleren og sende den inn som parameter til
konstruktøren. Men da er vi tilbake i feilen som åpnet modul 04: kunnskap
som hører hjemme hos billettene, ligger løst i `main`.

Forelesningen handler om nøkkelordet `static`, som løser dette — og et
problem til: klasser det aldri gir mening å lage objekter av. Du møter
**statiske fields**, **statiske metoder** og regelen som avgjør om en metode
bør være statisk eller ikke, og **konstanter** med nøkkelordet **`final`**.
Du får lage dine egne **pakker** og hente klasser fra dem med **`import`**
og **`import static`** — og tilgangsnivået **package-private**, den tomme
raden i modul 04s tabell, gir endelig mening. Underveis avsløres det at
`JOptionPane.showInputDialog`, `Integer.MAX_VALUE` og til og med `main` har
brukt denne ukens konsept helt siden modul 01.

Ta med deg spørsmålet inn i forelesningen:

**Hvor skal billett-telleren bo, når hvert field bor inne i ett objekt?**
