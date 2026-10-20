// Reference solution for exercise 21 — the main program. A room without a guest
// still holds the default value null, and that is what the loop tests.
public class Main {
    public static void main(String[] args) {
        Guest[] rooms = new Guest[4];
        rooms[0] = new Guest("Halyna");
        rooms[2] = new Guest("Kari");

        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                System.out.println("Rom " + i + ": ledig");
            } else {
                System.out.println("Rom " + i + ": " + rooms[i].getName());
            }
        }
    }
}
