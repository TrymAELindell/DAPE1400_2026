// Reference solution for exercise 39 (Del 3): two groups share one meeting room.
public class Main {
    public static void main(String[] args) {
        Room room = new Room("Møterom 1");
        Group north = new Group("Gruppe Nord", room);
        Group south = new Group("Gruppe Sør", room);
        System.out.println(north);
        System.out.println(south);

        north.bookRoom();
        south.bookRoom();
        System.out.println(north);
        System.out.println(south);
    }
}
