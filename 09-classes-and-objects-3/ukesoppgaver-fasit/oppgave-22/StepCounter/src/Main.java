// Reference solution for exercise 22: a local variable needs a start value.
public class Main {
    public static void main(String[] args) {
        int[] steps = {4200, 6100, 3900};
        // En lokal variabel får ingen default-verdi. Uten startverdien 0 stopper
        // kompilatoren med "might not have been initialized".
        int total = 0;
        for (int step : steps) {
            total += step;
        }
        System.out.println("Skritt totalt: " + total);
    }
}
