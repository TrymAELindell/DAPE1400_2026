public class Main {
    public static void main(String[] args) {
        // En loop inne i en annen loop: for hver runde i den ytre loopen
        // kjører den indre loopen seg helt ferdig.
        for (int row = 0; row < 5; row++) {
            System.out.print("\nRow nr: " + row);
            for (int column = 0; column < 3; column++) {
                System.out.print(" column: " + column);
            }
        }
    }
}
