# Forberedelse – Aritmetikk, casting og logiske uttrykk

I modul 02 fikk brødkalkulatoren variabler og brukerinput, og programmet
regnet endelig ut antall brød selv. Men se nøye på svaret det gir. Det går
2,5 dl deig per brød, og brukeren skriver inn hvor mye deig hun har:

```java
String input = JOptionPane.showInputDialog("Hvor mange dl deig har du?");
double doughDl = Double.parseDouble(input);
double breadCount = doughDl / 2.5;
System.out.println("Du kan bake " + breadCount + " brød.");
```

Med 11 dl deig svarer programmet: «Du kan bake 4.4 brød.»

Ingen baker 0,4 brød. Det riktige svaret er «4 brød, og 1 dl deig til
overs» — men programmet vårt kan ikke si det. Antall hele brød er et
heltall, og verdien vår er en `double`; fra modul 02 vet du at Java er
statisk typet og ikke lar oss blande i vei. Og resten på 1 dl? Den regner
ikke programmet ut i det hele tatt. Verre: har brukeren bare 2 dl deig,
svarer programmet i fullt alvor «Du kan bake 0.8 brød.» — det burde heller
sagt fra at deigen ikke rekker. Men programmet vårt kan bare si én ting,
uansett hva som er sant når det kjører.

Forelesningen gir programmene to nye evner: å regne ordentlig, og å ta
avgjørelser. Du møter de **aritmetiske operatorene** og **operandene**
deres — blant dem nykommeren **modulus** — sammen med **heltallsdivisjon**,
**regnerekkefølge** og **avrundingsfeil**, grunnen til at datamaskinen kan
bomme på 0,1 + 0,2. Du lærer **casting** mellom talltyper, med de to
variantene **widening** (norsk: *utvidende*) og **narrowing**
(*innsnevrende*). Så kommer avgjørelsene: **sammenligningsoperatorer**,
**logiske uttrykk** og de **logiske operatorene** — og til slutt din første
**kontrollstruktur**: **`if`-setningen**, med følgesvennene **`else`** og
**`else if`**, som lar programmet svare forskjellig for forskjellige
brukere.

Ta med deg spørsmålet inn i forelesningen:

**Hvordan får du kalkulatoren til å svare «4 brød, og 1 dl deig til overs» —
og til å si fra når deigen ikke rekker til et eneste brød?**
