// Reference solution for exercise 39.
//
// Den rettede versjonen. Koden i oppgaven har et semikolon rett etter
// while-betingelsen, og det semikolonet blir hele loopen. Resultatet er en
// evig loop, og rettingen fjerner semikolonet.
public class Main {
    public static void main(String[] args) {
        int secondsLeft = 3;
        while (secondsLeft > 0) {
            System.out.println(secondsLeft);
            secondsLeft--;
        }
        System.out.println("Tid!");
    }
}
