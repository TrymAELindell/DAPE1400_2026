// Reference solution for exercise 10.
public class PostageMain {
    public static void main(String[] args) {
        Postage letter = new Postage(18);
        Postage largeLetter = new Postage(120);
        Postage parcel = new Postage(900);

        System.out.println("18 gram koster: " + letter.getPrice() + " kr");
        System.out.println("120 gram koster: " + largeLetter.getPrice() + " kr");
        System.out.println("900 gram koster: " + parcel.getPrice() + " kr");
        System.out.println("Tyngste tillatte vekt: " + Postage.getHeaviestAllowedWeight());
    }
}
