// Reference solution for exercise 37 (Del 3): the weight rule that shelves and vans share.
public class LoadLimit {
    // Composition passer her. Både Shelf og Van har en LoadLimit som del-objekt,
    // så regelen om maksvekt står på ett sted.
    // En felles superklasse for hylle og varebil ville også virket. Men en klasse kan
    // bare ha én superklasse, så Van kan senere ikke bli en subklasse av en Vehicle-klasse.
    // Å skrive sjekken i både Shelf og Van ville også virket. Men da må en endring i
    // regelen gjøres to steder.
    private int maxKg;
    private int currentKg;

    public LoadLimit(int maxKg) {
        this.maxKg = maxKg;
        this.currentKg = 0;
    }

    public boolean add(int kg) {
        if (currentKg + kg <= maxKg) {
            currentKg += kg;
            return true;
        }
        return false;
    }

    public int getCurrentKg() {
        return currentKg;
    }

    public int getMaxKg() {
        return maxKg;
    }
}
