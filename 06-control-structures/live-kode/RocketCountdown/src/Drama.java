public class Drama {
    public static void pause(int forNSeconds){
        try {
            Thread.sleep(1000 * forNSeconds);
        } catch (InterruptedException ie) {
            System.out.println("Interrupted");
        }

    }
}
