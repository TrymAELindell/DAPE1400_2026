# Forberedelse – Variabler, datatyper og brukerinput

I første forelesning så vi at et program er som en oppskrift: en liste med
instruksjoner som utføres i rekkefølge, ovenfra og ned. Men en oppskrift er
ikke bare instruksjoner:

> Du trenger:
>
> - 2 dl mel
> - 1 dl melk
>
> Bland melet og melken til en deig. Del deigen i biter på 2,5 dl. Hver bit
> blir ett brød.

Oppskriften har også *ingredienser*, og instruksjonene bruker navnene deres.
«Bland ___ og ___ til en deig» går ikke — instruksjoner trenger noe å jobbe
med.

Programmene vi har skrevet så langt, har bare instruksjoner. Prøver vi å lage
en brødkalkulator med det vi kan nå, blir det slik:

```java
public class BreadCalculator {
    public static void main(String[] args) {
        System.out.println("Du har 10 dl mel og 5 dl melk.");
        System.out.println("Da kan du bake 5 brød.");
    }
}
```

Programmet *ser ut* som det regner, men det gjør ikke det. Det var du som
regnet ut «5 brød» — programmet gjentar bare svaret ditt. Har du 12 dl mel i
morgen, må du regne på nytt og skrive om koden. Og programmet kan ikke spørre
deg om noe: alt det «vet», står fast i koden før det kjører.

Forelesningen handler om det som mangler. Du møter **variabler** — det som
skal spille rollen som ingrediensene — og **datatyper**, blant dem Javas
**primitive datatyper** og **strenger** (tekst); du får også høre hvorfor
Java kalles *statisk typet*. Du lærer å gi en variabel verdi —
**assignment** (norsk: *tilordning*) — og å **konkatenere** strenger. Du
møter **brukerinput** og **konvertering** fra tekst til tall, du ser ditt
første **exception** (norsk: *unntak*) — og du får vite hvordan ferdigskrevet
Java-kode hentes inn i programmet ditt fra **pakker**.

Ta med deg spørsmålet inn i forelesningen:

**Hvordan får du programmet til å regne ut antall brød selv — for en
melmengde du ikke kjenner når du skriver koden?**
