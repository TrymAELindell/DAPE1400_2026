# DAPE1400 (H2026) – kodeeksempler og oppgaver

Dette repoet er kursets kodebibliotek: eksempelkoden fra forelesningene,
ukesoppgavene med startkode og fasit, og startkoden til de obligatoriske
oppgavene. Alt ligger her fra semesterstart.

## Slik bruker du repoet

Repoet er **for å lese og kopiere fra**. Det er ikke et prosjekt du skal
kjøre, og mappestrukturen her er **ikke** en mal for hvordan du skal
organisere dine egne prosjekter. Unntakene er prosjektmappene: hvert
eksempel i `repetisjon-kode/` og hver oppgavemappe i
`ukesoppgaver-fasit/` viser med vilje riktig prosjektstruktur — se
README-en i mappen. (Uke 02–05 har ennå eksemplene sine liggende rett i
`repetisjon-kode/`; de får samme form etter semesteret.)

- **Les** koden direkte her på GitHub.
- **Vil du kjøre eller endre koden?** Lag et nytt prosjekt i IntelliJ og
  kopier inn filene du trenger. Du trenger ikke klone repoet eller bruke
  git – kopier filene direkte.

## Dine egne prosjekter

- Lag **ett IntelliJ-prosjekt per eksempelsett som hører sammen**, og ett
  per oppgave som står for seg selv.
- Kode som ikke hører sammen, skal **aldri** ligge i samme prosjekt.
- Du kommer til å lage mange små prosjekter i løpet av semesteret. Det er
  meningen: å sette opp et nytt prosjekt er noe du skal bli trygg på.

## Hva ligger hvor

Hver undervisningsuke har en mappe (`01-…`, `02-…`, …) med:

- `forberedelse.md` – kort lesestoff **før** forelesningen
- `repetisjon-kode/` – eksempelkoden forelesningen og lesestoffet bruker,
  med én prosjektmappe per eksempel. README-en øverst gir en oversikt, og
  et eksempel som trenger mer forklaring, har sin egen README.
- `live-kode/` – koden slik den faktisk ble skrevet i forelesningen
  (legges ut etter hver forelesning)
- `ukesoppgaver.md` – ukens oppgaver
- `startkode/` – utgangspunkt for ukesoppgavene
- `ukesoppgaver-fasit/` – fasit til ukesoppgavene, med én mappe per
  oppgave: `oppgave-NN/` inneholder prosjektmappen, som har samme form som
  ditt eget IntelliJ-prosjekt – `.java`-filene ligger i `src/`, slik de også
  skal gjøre hos deg, og klassen med `main`-metoden heter `Main`. Prøv selv
  først – du lærer lite av å lese fasiten før du har forsøkt.

`obligs/` har teksten og startkoden til de obligatoriske oppgavene.

## Kommentarer på norsk og engelsk

Kommentarene i koden her er skrevet på to språk, med vilje:

- **Engelske kommentarer** er vanlige kodekommentarer – den typen du også
  skal skrive i din egen kode.
- **Norske kommentarer** er forklaringer fra oss til deg. De hører til
  undervisningen, og slike kommentarer skriver du ikke i et vanlig program.

(Uke 02–05 har ennå mest engelske kommentarer; de får samme form etter
semesteret.)

## Hvorfor finnes koden i flere versjoner?

Noen eksempler ligger i flere nummererte versjoner side om side, for
eksempel prosjektmappene `PlaneV0/` … `PlaneV4/`. Det er gjort med vilje, slik at
du kan sammenligne versjonene og se hva som endres fra steg til steg.

Merk: i virkelige prosjekter lager man **ikke** slike kopier av filer.
Der brukes versjonskontroll (for eksempel git) til å ta vare på
historikken i én og samme fil. Kopiene her er et undervisningsgrep, ikke
et mønster å ta etter.
