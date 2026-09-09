// Reference solution for exercise 35: the snippet from the handout, runnable. Legacy switch
// syntax with no break anywhere: after the match on "medium", execution
// falls through every branch below it, default included.
public class CoffeeSizesLegacy {
    public static void main(String[] args) {
        String size = "medium";
        switch (size) {
            case "liten":
                System.out.println("2 dl kaffe");
            case "medium":
                System.out.println("3 dl kaffe");
            case "stor":
                System.out.println("5 dl kaffe");
            default:
                System.out.println("Ukjent størrelse");
        }
    }
}
