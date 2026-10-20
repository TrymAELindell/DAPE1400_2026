// Reference solution for exercise 12: check for null before calling a method.
public class Main {
    public static void main(String[] args) {
        Car myCar = null;

        // Uten sjekken krasjer programmet med NullPointerException. Det finnes
        // ikke noe objekt å kalle getRegistrationNumber() på.
        if (myCar == null) {
            System.out.println("Ingen bil");
        } else {
            System.out.println(myCar.getRegistrationNumber());
        }
    }
}
