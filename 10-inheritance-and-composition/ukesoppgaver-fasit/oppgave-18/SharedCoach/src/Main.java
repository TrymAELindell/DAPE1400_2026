// Reference solution for exercise 18: two teams share one coach.
public class Main {
    public static void main(String[] args) {
        Coach coach = new Coach("Kari", "41234567");
        Team younger = new Team("G12", coach);
        Team older = new Team("G14", coach);
        System.out.println(younger);
        System.out.println(older);

        younger.getCoach().setPhone("99887766");
        System.out.println(younger);
        System.out.println(older);

        older.removeCoach();
        System.out.println(younger);
        System.out.println(older);
    }
}
