// Reference solution for exercise 37.
//
// Koden fra oppgaven, gjort kjørbar. Utskriften skjer før doblingen, så 800
// blir regnet ut, men aldri skrevet ut.
public class Main {
    public static void main(String[] args) {
        int amount = 100;
        do {
            System.out.println(amount);
            amount *= 2;
        } while (amount <= 400);
    }
}
