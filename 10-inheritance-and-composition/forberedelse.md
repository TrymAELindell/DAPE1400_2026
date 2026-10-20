# Forberedelse – Inheritance og composition

Til nå har hver klasse du har skrevet, stått alene. Denne uken skal vi skrive
et program for dyrelasterommet på et fly: kjæledyrene som reiser med,
registreres med mål og vekt, og programmet skal regne ut total vekt og totalt
volum i lasterommet.

Med det du kan fra før, får hver dyretype sin egen klasse:

```java
public class Cat {
    private double length;
    private double height;
    private double width;
    private double weight;

    public Cat(double length, double height, double width, double weight) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    public double getVolume() {
        return length * height * width;
    }

    public void makeSound() {
        System.out.println("Mjau!");
    }
}
```

`Dog` og `Parrot` blir *nesten* identiske: samme fire fields, samme
konstruktør, samme `getVolume`. Bare `makeSound` skiller. Tre klasser deler
nesten all koden sin — men de *deler* den ikke: skal `getVolume` rettes, må
den rettes tre steder, og hver ny dyreart betyr en ny kopi av alt. Koden
klarer ikke å uttrykke det vi vet: at katter, hunder og papegøyer er samme
slags ting — dyr.

Forelesningen introduserer to måter klasser kan dele kode på. Den første er
**inheritance** (norsk: *arv*), og med den følger **superklasser**,
**subklasser** og **klassehierarkier**, å **overskrive** metoder
(**overriding**), **polymorfisme**, **casting** av objekter i et hierarki,
et nytt tilgangsnivå (`protected`) — og uttrykket **tett kobling**. Du møter
også `Object`-klassen, og du får endelig vite hvor `toString` fra modul 09
kommer fra. Den andre måten er **composition** (norsk: *komposisjon*), med
sine **kompositt-objekter** og **del-objekter**. I tillegg kommer
**aggregation** (norsk: *aggregering*) og det generelle begrepet
**association** — på norsk sier vi at en klasse er **assosiert** med en
annen.

Ta med deg spørsmålet inn i forelesningen:

**Hvor skal koden som `Cat`, `Dog` og `Parrot` deler, egentlig bo — og hva
koster hvert av de mulige svarene?**
