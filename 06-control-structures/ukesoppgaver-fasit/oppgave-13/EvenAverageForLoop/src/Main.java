// Reference solution for exercise 13.
//
// Castingen til double (modul 03) hindrer heltallsdivisjon når
// gjennomsnittet regnes ut.
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i <= 98; i += 2) {
            sum += i;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("Summen av partallene fra 0 til 98 er " + sum);
        System.out.println("Gjennomsnittet er " + average);
    }
}
