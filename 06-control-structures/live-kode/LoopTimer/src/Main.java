public class Main {
    public static void main(String[] args) {
        double startTime = System.nanoTime();

        int loopIterations = 1_000_0000;

        for (int i = loopIterations; i >= 0; i--) {
            loopIterations--;
        }

        double endTime = System.nanoTime();

        System.out.println("Loopen tok: " + ((endTime - startTime)/1_000_000_000) + " sekunder" );
    }
}
