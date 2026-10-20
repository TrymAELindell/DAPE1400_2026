// Reference solution for exercise 42.
//
// Denne løsningen lagrer køen i en array. En for-loop stopper med break
// ved Jonas, så position holder hvor mange som står foran ham. En annen god
// løsning er en while-loop med betingelsen «ikke Jonas ennå». Der ligger
// tellingen på to steder, og begge stedene må endres sammen.
public class Main {
    public static void main(String[] args) {
        String[] queue = {"Piotr", "Amina", "Jonas", "Sara"};

        int position = 0;
        for (int i = 0; i < queue.length; i++) {
            if (queue[i].equals("Jonas")) {
                position = i;
                break;
            }
        }

        System.out.println(position + " personer står foran Jonas");
    }
}
