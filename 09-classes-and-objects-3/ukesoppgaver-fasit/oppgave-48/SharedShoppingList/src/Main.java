import java.util.ArrayList;

// Reference solution for exercise 48 (Del 3): one shopping list filled by two people.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();

        ItemReader.addItems("Mor", shoppingList);
        ItemReader.addItems("Sønn", shoppingList);

        for (String item : shoppingList) {
            System.out.println(item);
        }
    }
}
