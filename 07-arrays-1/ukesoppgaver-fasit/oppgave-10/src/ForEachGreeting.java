// Reference solution for exercise 10.
public class ForEachGreeting {
    public static void main(String[] args) {
        String[] names = {"Ingrid", "Piotr", "Amina", "Jonas"};

        for (String name : names) {
            System.out.println("Hei, " + name + "!");
        }
    }
}
