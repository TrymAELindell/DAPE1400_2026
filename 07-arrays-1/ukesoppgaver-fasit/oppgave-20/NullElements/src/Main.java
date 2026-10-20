// Reference solution for exercise 20.
//
// En array av objekter starter med null-referanser, så den andre linjen
// krasjer med vilje.
public class Main {
    public static void main(String[] args) {
        String[] names = new String[3];

        System.out.println(names[0]);
        System.out.println(names[0].toUpperCase());
    }
}
