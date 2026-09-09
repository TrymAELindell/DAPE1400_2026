public class ArrayExamples {
    public static void main(String[] args) {

        // Arrays can be made of any data type or class by writing [] after the type name.
        // The single values in an array are called elements.
        // Each element has a position in the array, given as an integer: the index.
        // Indexing starts at 0, so the fourth element of an array has index 3,
        // the first has index 0, and so on.

        int[] arrInt = new int[4]; // the 4 sets the size of the array: 4 elements
        arrInt[0] = 2; // set the value of an element by putting its index in [] after the array name
        System.out.println(arrInt[0]); // the element at index 0 is now 2
        System.out.println(arrInt[1]); // primitive types get default values (0 for int),
                                       // so the element at index 1 is 0

        double[] arrDouble = new double[4];
        arrDouble[0] = 2.0;
        System.out.println(arrDouble[0]);
        System.out.println(arrDouble[1]);

        boolean[] arrBool = new boolean[4];
        arrBool[2] = true;
        System.out.println(arrBool[0]);
        System.out.println(arrBool[2]);

        // Arrays can also be created with chosen values by placing them inside { }
        int[] arrIntPreDefined = {1, 2, 3, 4, 2, 3};

        // Arrays have access to their own length through the length field
        int arrayLength = arrIntPreDefined.length;
        System.out.println("Arrayen har lengde: " + arrayLength);

        // As mentioned, arrays can be made of any type. Here: arrays of String.
        String[] arrString = new String[4];
        arrString[0] = "hei";
        System.out.println(arrString[0]);
        System.out.println(arrString[1]); // arrays of non-primitive types start out as null,
                                          // which you see when printing an element
                                          // that has not been initialized

        // Here we create an array of our own class Person
        Person[] arrPerson = new Person[3];
        arrPerson[0] = new Person("Omar", 34);
        System.out.println(arrPerson[0]);
        System.out.println(arrPerson[1]);

        arrPerson[0].setName("Hasan"); // we can use the methods of elements in an array
        arrPerson[2].setName("Heidi"); // but calling a method on an element that has not
                                       // been initialized throws a NullPointerException
    }
}
