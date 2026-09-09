# Forberedelse – Klasser og objekter 1

Til nå har du brukt datatyper som andre har laget: `int`, `double`,
`String`. Denne uken har Gardermoen gitt oss et oppdrag: et program som
lagrer informasjonen som hører til en flybillett — navn, personnummer,
destinasjon — og skriver den ut. Tre billetter til å begynne med.

Med det du kan fra før, blir det variabler:

```java
String person1Name = "Trym Lindell";
String person1PersonNr = "24019189763";
String person1Destination = "Japan";

String person2Name = "Kristian Nymoen";
// ... og fem variabler til, for billett 2 og 3
```

Det virker. Men kjenn på det: tre billetter ble ni variabler. Ti billetter
blir tretti. Og ingenting i koden sier at `person2PersonNr` hører sammen
med `person2Name` — det vet bare du. Bytter du om to av dem, kompilerer alt
fint og feilen seiler rett gjennom. Utskriftskoden må skrives på nytt for
hver billett. Java vet hva en `double` er og hva en `String` er — men det
programmet vårt handler om, *billetter*, aner språket ingenting om.

Forelesningen introduserer kjernen i objektorientert programmering: du skal
få lage dine egne datatyper. Du møter **klasser** og **objekter**, og å
**instansiere** objekter med `new`. Du møter **fields** (norsk: *felt*) —
og forskjellen på dem og **lokale variabler** — samt **konstruktører**,
**metoder** med **parametere** og **returtyper**, og ordet **referanse**,
som modul 09 skal si mye mer om. Til slutt kommer prinsippet som
skiller god objektorientering fra kaos: **encapsulation** (norsk:
*innkapsling*), med tilgangsnivåene `public` og `private` og metodeparet
**settere** og **gettere**.

Ta med deg spørsmålet inn i forelesningen:

**Hvordan forteller du Java hva en billett *er* — slik at navn,
personnummer og destinasjon henger sammen som én ting, og koden som gjelder
billetter har ett sted å bo?**
