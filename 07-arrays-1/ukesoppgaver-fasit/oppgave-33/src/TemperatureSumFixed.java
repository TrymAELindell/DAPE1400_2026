// Reference solution for exercise 33: the fixed version. The bug was i <= length, which
// tries the index temperatures[4]; the fix is < instead of <=.
public class TemperatureSumFixed {
    public static void main(String[] args) {
        int[] temperatures = {5, 9, 12, 7};
        int sum = 0;

        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }

        System.out.println("Summen er " + sum);
    }
}
