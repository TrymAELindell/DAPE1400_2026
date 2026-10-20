# Forberedelse – Klasser og objekter 3

Modul 04 og 05 bygde klassene våre; siden har vi lært kontrollstrukturer,
arrays og collections. Denne uken vender vi tilbake til klassene og
objektene — for det har samlet seg opp noen mysterier. Her er det største.

Klassen `Person` har et field for alder og en metode `incrementAge()` som
øker den med én. Så kjører vi dette:

```java
Person trym = new Person("Trym", 34);
Person weds = trym;

weds.incrementAge();

System.out.println(trym.getAge());
```

Utskriften er `35`.

Les det en gang til. Vi kalte `incrementAge` på `weds` — men det var `trym`
som ble ett år eldre. Gjør du det samme med to `int`-variabler, skjer det
ikke: `int b = a;` gir to tall som lever hver sine liv. Objektvariabler
oppfører seg altså annerledes enn primitive — og helt siden modul 04 har
det ligget et løfte om at ordet *referanse* en dag skulle forklares
ordentlig. Den dagen er nå.

Forelesningen stiller tre spørsmål. Hva skjer når flere metoder har samme
navn? — du møter **overloading** (norsk: *overlasting*) og **signaturen**
til en metode. Hva inneholder egentlig en objektvariabel? — du møter
**referanser** og **referansetyper**, den tomme referansen **`null`**, hva
som faktisk skjer når objekter sendes som parametere, og metoden
**`toString`**. Og hvorfor kan ikke variabler brukes utenfor metoden de ble
deklarert i? — du møter **scope** (norsk: *rekkevidde*) og **lokale
variabler**. Ta gjerne med debuggeren fra IntelliJ; dette er uken hvor den
lar deg *se* svaret.

Ta med deg spørsmålet inn i forelesningen:

**Hva er det egentlig som ligger lagret i variabelen `trym` — og hvorfor
gjør svaret at `trym` og `weds` eldes i takt?**
