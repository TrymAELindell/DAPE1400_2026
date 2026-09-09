import java.util.Arrays;

// Reference solution for exercise 22. Arrays.copyOf makes a real copy, so the
// sort touches the copy and leaves the original alone.
public class ArraysToolbox {
    public static void main(String[] args) {
        int[] list1 = {2, 5, 1, 8, 2};
        int[] list2 = {2, 5, 1, 8, 2};

        System.out.println("Arrayene er like: " + Arrays.equals(list1, list2));

        int[] sortedCopy = Arrays.copyOf(list1, list1.length);
        Arrays.sort(sortedCopy);

        System.out.print("Sortert kopi: ");
        for (int number : sortedCopy) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.print("Originalen: ");
        for (int number : list1) {
            System.out.print(number + " ");
        }
        System.out.println();

        int index = Arrays.binarySearch(sortedCopy, 5);
        System.out.println("Indeksen til 5 i den sorterte kopien: " + index);
    }
}
