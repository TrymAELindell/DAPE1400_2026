public class ReferenceExamples {
    public static void main(String[] args) {

        // Non-primitive data types can have several variables referring to
        // the same underlying data. This is a bit like having an alias:
        // both your gamer tag and your real name refer to the same person.
        Person person1 = new Person("Trym", 34); // create a Person object
        Person person1Alias = person1; // create an alias for the same object

        // Since both variables refer to the same underlying object,
        // changes made through one variable are visible through the other.
        System.out.println(person1); // Person has a toString() method, so it can be printed directly
        person1Alias.setName("Per"); // change the name through the alias

        // Print the object through both variables to see that
        // the name changed to Per in both cases.
        System.out.println(person1Alias);
        System.out.println(person1);

        // Primitive variables cannot alias each other, but arrays OF
        // primitive types can, because arrays are objects.
        int[] intArray = {4, 3, 1, 2, 5};
        int[] intArrayAlias = intArray; // create an alias for intArray

        // Change two different elements of the underlying array through the two aliases
        intArray[0] = 10;
        intArrayAlias[1] = 100;

        // Print the array through both aliases to see that both changes are visible in both
        System.out.println("Array verdier printet ut via intArray");
        for (int i : intArray) {
            System.out.println(i);
        }

        System.out.println("Array verdier printet ut via intArrayAlias");
        for (int i : intArrayAlias) {
            System.out.println(i);
        }
    }
}
