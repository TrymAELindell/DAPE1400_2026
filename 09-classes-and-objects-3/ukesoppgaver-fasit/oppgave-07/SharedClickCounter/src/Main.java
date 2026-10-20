// Reference solution for exercise 7: two variables that refer to one counter.
public class Main {
    public static void main(String[] args) {
        ClickCounter frontDoorCounter = new ClickCounter();
        ClickCounter alias = frontDoorCounter;

        alias.click();
        alias.click();
        frontDoorCounter.click();

        // Begge linjene skriver ut 3. Assignment-setningen kopierte referansen,
        // så alle tre klikkene havnet i det samme objektet.
        System.out.println("frontDoorCounter: " + frontDoorCounter.getClicks());
        System.out.println("alias: " + alias.getClicks());
    }
}
