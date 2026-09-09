# Forberedelse – Collections-frameworket

I modul 07 lærte du å samle mange verdier i én variabel med arrays. Denne
uken skal vi bruke dem til noe hverdagslig — en handleliste — og møte
veggen. Se på dette programmet:

```java
String[] shoppingList = new String[10];
shoppingList[1] = "Gummihansker";
shoppingList[2] = "Sylteagurk";
shoppingList[3] = "Duct tape";
// ... og så videre, helt til:
shoppingList[10] = "Vekkerklokke";   // krasj!
```

Programmet kompilerer fint, men krasjer:
`ArrayIndexOutOfBoundsException`. Feilen kjenner du fra modul 07 —
indeksene går fra 0 til 9, og både den ubrukte plassen på indeks 0 og
krasjet på indeks 10 følger av det.

Feilen er lett å rette, men den avslører noe dypere: da vi skrev
`new String[10]`, måtte vi bestemme størrelsen — *før* vi visste hvor mye
vi skulle handle. En handleliste har ingen naturlig størrelse. Det kommer
en vare til; en vare strykes. Arrayen kan ingen av delene: den har samme
lengde hele livet, og det blir vår jobb å holde styr på hvilke plasser som
er i bruk. Det samme gjelder passasjerlister, stemmer i et valg, meldinger
i en chat — listene i virkelige programmer vokser og krymper.

Forelesningen introduserer **Collections-frameworket** (norsk:
*rammeverk*) og begrepet **datastruktur**. Du blir best kjent med klassen
**`ArrayList`** og
metodene dens, og med **`HashMap`**, som lagrer **key–verdi-par** (norsk
for *key*: *nøkkel*). På veien møter du **wrapper-klassene** (norsk:
*innpakningsklasser*) `Integer` og `Double`, og **autoboxing** — og til
slutt klassen **`Collections`**, som gjør for lister omtrent det `Arrays`
fra modul 07 gjør for arrays.

Ta med deg spørsmålet inn i forelesningen:

**Hvordan lagrer du en liste som vokser og krymper mens programmet kjører —
når en array må få størrelsen sin i det øyeblikket den lages?**
