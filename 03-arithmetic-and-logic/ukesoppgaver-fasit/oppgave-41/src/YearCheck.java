import javax.swing.JOptionPane;

// Reference solution for exercise 41 - the program the exercise asks about.
// What it does: it tells the user whether the year they typed is a leap year,
// by printing the number of days in that year.
public class YearCheck {
    public static void main(String[] args) {
        String yearInput = JOptionPane.showInputDialog("Skriv inn et årstall");
        int year = Integer.parseInt(yearInput);

        boolean divisibleBy4 = year % 4 == 0;
        boolean divisibleBy100 = year % 100 == 0;
        boolean divisibleBy400 = year % 400 == 0;

        // The rule has an exception inside an exception: divisible by 4, but
        // not by 100 - unless it is also divisible by 400.
        if ((divisibleBy4 && !divisibleBy100) || divisibleBy400) {
            System.out.println(year + " har 366 dager");
        } else {
            System.out.println(year + " har 365 dager");
        }
    }
}
