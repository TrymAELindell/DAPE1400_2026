// Reference solution for exercise 36 (Del 3): a wedding cake is a cake with extra tiers.
public class WeddingCake extends Cake {
    // Inheritance passer her. En bryllupskake er en kake, så WeddingCake arver
    // navnet og grunnprisen fra Cake og overskriver bare utregningen av prisen.
    // Composition, der en WeddingCake har et Cake-objekt som del-objekt, ville også
    // virket. Men da må WeddingCake sende både getName og getPrice videre selv.
    // Én Cake-klasse med et field for ekstra etasjer ville også virket. Men da får
    // hver vanlig kake et field den aldri bruker, og merkingen krever en if i toString.
    private int extraTiers;

    public WeddingCake(String name, int basePrice, int extraTiers) {
        super(name, basePrice);
        this.extraTiers = extraTiers;
    }

    public int getPrice() {
        return super.getPrice() + extraTiers * 500;
    }

    public String toString() {
        return getName() + " (bryllupskake): " + getPrice() + " kr";
    }
}
