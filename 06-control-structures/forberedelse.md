# Forberedelse – Kontrollstrukturer

Programmene dine kan nå ta avgjørelser: `if` og `else` fra modul 03 lar dem
svare forskjellig på forskjellige situasjoner. Men de kan fortsatt ikke
*gjenta* noe. Denne uken merkes det, for ESA har bestilt et
nedtellingsprogram: brukeren oppgir et tall, programmet teller ned til null
og skriver «Launch!».

Med det du kan fra før, blir det slik:

```java
String input = JOptionPane.showInputDialog("Start nedtelling fra:");
int countdownFrom = Integer.parseInt(input);

if (countdownFrom >= 3) {
    System.out.println(3);
}
if (countdownFrom >= 2) {
    System.out.println(2);
}
if (countdownFrom >= 1) {
    System.out.println(1);
}
System.out.println("Launch!");
```

Dette virker — så lenge brukeren starter på 3 eller lavere. Vil ESA telle
ned fra 100, trenger vi hundre `if`-setninger. Og ESA sa aldri hvor de vil
starte: programmet skal takle *et hvilket som helst tall*, og da finnes det
ikke nok `if`-er i verden. Se på koden en gang til: de tre blokkene gjør
nesten nøyaktig det samme. Det er selve *gjentakelsen* vi mangler et språk
for.

Forelesningen fullfører familien av **kontrollstrukturer**. Først skjerpes
valgene fra modul 03: du møter **short-circuit**-oppførselen til `&&` og
`||`, og **`switch`** for valg mellom mange alternativer — med fellen
**fall-through** i switchens gamle form. Så det store: **loopen** (norsk:
*løkke*), i de tre variantene **`while`**, **`for`** og **`do-while`** — og
med den begreper som **iterasjon**, **tellevariabel** og den fryktede
**evige loopen**. Du møter **kortformene** `++`, `--` og `+=`, og
**nested** (norsk: *nøstede*) **looper** — looper inne i looper. Du får
også et formelt navn på noe du har skrevet siden modul 02: **blokken**. Og
du får teknikker for feilsøking når loopen bommer med én.

Ta med deg spørsmålet inn i forelesningen:

**Hvordan teller du ned fra et tall du ikke kjenner når du skriver koden —
uten én `if` per verdi?**
