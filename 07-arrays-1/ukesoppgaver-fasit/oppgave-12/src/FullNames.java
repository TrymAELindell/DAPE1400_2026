// Reference solution for exercise 12. The counter moves two steps per round:
// index i is a first name, index i + 1 the matching last name.
public class FullNames {
    public static void main(String[] args) {
        String[] names = {"Piotr", "Kowalski", "Ingrid", "Dahl", "Amina", "Ali", "Jonas", "Berg"};

        for (int i = 0; i < names.length; i += 2) {
            System.out.println(names[i] + " " + names[i + 1]);
        }
    }
}
