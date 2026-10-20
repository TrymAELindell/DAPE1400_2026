# Kodeeksempler – Inheritance og composition

Dette er eksempelkoden til kapitlet «Repetisjon – Inheritance og
composition» på Canvas. Kapitlet forklarer begrepene, og her finner du
koden.

Hver mappe er et eget prosjekt. `.java`-filene ligger i `src/`, og klassen
med `main`-metoden heter `Main`. Vil du kjøre et eksempel, lager du et nytt
prosjekt i IntelliJ og kopierer inn filene fra `src/`.

De fem prosjektene er fem versjoner av samme program: et dyrelasterom på et
fly. Hver versjon finnes fordi den forrige har et problem, så les dem i
denne rekkefølgen:

1. **`CargoHoldV0`** – én klasse for hver dyretype, med den samme koden i
   alle tre, og én liste for hver dyretype. Se avsnittet «Problemet: tre
   klasser, samme kode» i kapitlet.
2. **`CargoHoldV1Inheritance`** – koden som dyrene deler, ligger i
   superklassen `Animal`, og alle dyrene ligger i én liste. Prosjektet
   viser også overriding, casting og `instanceof`. Se avsnittet
   «Inheritance» i kapitlet.
3. **`CargoHoldV2Composition`** – `Animal` og den nye klassen `Baggage` har
   begge et `Dimensions`-field. Versjonen har en referanselekkasje:
   getteren `getDimensions` gir ut del-objektet. Se avsnittene
   «Composition» og «Referanselekkasjen» i kapitlet.
4. **`CargoHoldV3Composition`** – getteren `getDimensions` er fjernet, og
   lekkasjen er tettet. Se avsnittet «Referanselekkasjen» i kapitlet.
5. **`CargoHoldV4Aggregation`** – en `Passenger` har kjæledyret sitt som et
   field, og det samme dyret ligger også i lasterommet. Se avsnittet
   «Aggregation» i kapitlet.

Klasser som flere versjoner bruker, for eksempel `Cat` og `Dimensions`,
ligger i hvert prosjekt som bruker dem, slik at hvert prosjekt kan kjøres
for seg.
