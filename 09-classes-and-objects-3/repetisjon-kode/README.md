# Kodeeksempler – Klasser og objekter 3

Dette er eksempelkoden til kapitlet «Repetisjon – Klasser og objekter 3 —
overloading, referanser og scope» på Canvas. Kapitlet forklarer begrepene,
og her finner du koden.

Hver mappe er et eget prosjekt. `.java`-filene ligger i `src/`, og klassen
med `main`-metoden heter `Main`. Vil du kjøre et eksempel, lager du et nytt
prosjekt i IntelliJ og kopierer inn filene fra `src/`.

Les prosjektene i denne rekkefølgen:

1. **`OverloadingExamples`** – `Person` har to konstruktører og to
   varianter av metoden `incrementAge`, og `Main` bruker alle fire. Se
   avsnittet «Overloading» i kapitlet.
2. **`ReferenceExamples`** – to variabler som refererer til samme objekt,
   og et objekt som blir sendt som argument til metoden `Time.agePerson`.
   Kjør programmet med debuggeren, så ser du referansene. Se avsnittet
   «Referanser» i kapitlet.
3. **`ScopeExamples`** – hvor en variabel finnes, og hvor den ikke finnes.
   To linjer er kommentert ut fordi de gir kompileringsfeil. Fjern `//`
   foran en av dem, så ser du feilen. Se avsnittet «Scope» i kapitlet.

Klassen `Person` ligger i alle tre prosjektene, slik at hvert prosjekt kan
kjøres for seg.
