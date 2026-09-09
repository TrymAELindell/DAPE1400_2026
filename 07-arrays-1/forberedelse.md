# Forberedelse – Arrays 1

Du kan nå lage klasser med fields, konstruktører og metoder, og du kan bruke
looper til å gjenta kode. Denne uken kolliderer de to ferdighetene med et
tall: 150.

Vi skal lage en klasse `Plane` som holder styr på hvilke seter i et fly som
er opptatt. Ett sete er enkelt: én boolsk variabel. Men flyet har 150 seter —
og med det du kan fra før, må hvert sete være sitt eget field:

```java
public class Plane {
    public boolean seat0Taken;
    public boolean seat1Taken;
    public boolean seat2Taken;
    // ... og slik fortsetter det, helt til seat149Taken
}
```

Dette kompilerer, men kjenn på hva som skjer videre. Vil du sjekke om flyet
har et ledig sete, må du skrive én sjekk per sete. Loopen du lærte i modul 06
hjelper deg ikke: 150 variabler med 150 forskjellige navn er 150 helt
uavhengige variabler, og en loop kan ikke gå «gjennom» dem. Og tallet 150 er
spikret i koden — et fly med 20 seter må bli en helt annen klasse.

Det forelesningen introduserer, heter **array** (norsk: *tabell*). Rundt den
møter du **elementer** og **indekser**, en ny loop-variant —
**for-each-loopen** — og **flerdimensjonale arrays**, som nested looper fra
modul 06 viser seg å passe perfekt til. Du får se hvilke **default-verdier**
(norsk: *standardverdier*) elementer starter med, hva som skjer når arrays
sendes inn i metoder, og du møter **null-referansen** — kilden til et av de
vanligste krasjene i Java. Til slutt hilser du på hjelpeklassen `Arrays`, som
kommer ferdigskrevet med Java.

Ta med deg spørsmålet inn i forelesningen:

**Hvordan kan de 150 setene bli noe en loop kan gå gjennom — slik at koden
er den samme enten flyet har 15, 150 eller 400 seter?**
