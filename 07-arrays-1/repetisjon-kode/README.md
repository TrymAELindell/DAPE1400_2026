# Kodeeksempler – modul 07: arrays 1

Hvert eksempel er et eget prosjekt. Koden ligger i `src/`, og klassen med
`main`-metoden heter `Main`. Vil du kjøre et eksempel, lager du et nytt
prosjekt i IntelliJ og kopierer inn filene fra `src/`.

## Flyet i fem versjoner

`PlaneV0` til og med `PlaneV4` er fem versjoner av det samme programmet:
en klasse `Plane` som holder styr på hvilke seter i et fly som er opptatt.
Hver versjon løser et problem som den forrige ikke klarte. Les dem i
rekkefølge:

1. **`PlaneV0`** – én boolsk variabel per sete. Det virker for tre seter,
   men ikke for 150.
2. **`PlaneV1`** – setene ligger i en boolsk array, og antall seter
   velges når flyet opprettes.
3. **`PlaneV2`** – `setFreeSeatToTaken` finner et ledig sete selv med en
   loop.
4. **`PlaneV3`** – setene ligger i en todimensjonal array, med rad og
   setenummer. Metoden leter med nested looper.
5. **`PlaneV4`** – setene er `Seat`-objekter med navnet på passasjeren.
   Et element som er `null`, er et ledig sete.

I hver versjon oppretter `Main` et fly og tar noen seter.

## Arrays og referanser

6. **`ArrayExamples`** – en gjennomgang av arrays: opprette, lese og endre
   elementer, default-verdier, `length` og en array av objekter. Programmet
   stopper med vilje med en `NullPointerException` på siste linje. Kjør det
   og les feilmeldingen.
7. **`ReferenceExamples`** – to variabler som refererer til det samme
   objektet, og to variabler som refererer til den samme arrayen.

`Person` ligger i begge prosjektene, slik at hvert prosjekt virker alene.

## Kapitlet

Kapitlet *Repetisjon – Arrays 1* på Canvas forklarer begrepene. Hver
versjon av flyet har sitt eget avsnitt der, fra «Problemet: ett fly, 150
variabler» til «Live-koding: `PlaneV4`». `ReferenceExamples` hører til
avsnittet «Arrayvariabler er referanser».
