// Reference solution for exercise 38 (Del 3): the overview before and after the new number.
public class Main {
    public static void main(String[] args) {
        Trainer anders = new Trainer("Anders", "90011223");
        Member lise = new Member("Lise", 14, anders);
        Member omar = new Member("Omar", 27, anders);
        System.out.println(lise);
        System.out.println(omar);

        anders.setPhone("45566778");
        System.out.println(lise);
        System.out.println(omar);
    }
}
