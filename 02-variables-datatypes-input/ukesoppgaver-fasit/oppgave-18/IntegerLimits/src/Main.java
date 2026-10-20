// Reference solution for exercise 18.
public class Main {
    public static void main(String[] args) {
        int largest = Integer.MAX_VALUE;
        System.out.println(largest);

        // The same variable gets a new value - and the value wraps around to
        // the smallest int instead of growing.
        largest = largest + 1;
        System.out.println(largest);

        int smallest = Integer.MIN_VALUE;
        System.out.println(smallest);

        smallest = smallest - 1;   // wraps around to the largest int
        System.out.println(smallest);

        byte largestByte = 127;
        System.out.println(largestByte);

        short largestShort = 32767;
        System.out.println(largestShort);

        byte hundred = 100;
        byte twentySeven = 27;
        System.out.println(hundred + twentySeven);
    }
}
