import static javax.swing.JOptionPane.*;

public class WineMonopolyAgeCheck {
    public static void main(String[] args) {
        // In this program our job is to tell a customer what they are
        // allowed to buy at the wine monopoly (vinmonopolet), based on
        // their age. There are three possible outcomes:
        // - The user is too young to shop there at all (under 18)
        // - The user can buy beer and wine, but not spirits (18, but under 20)
        // - The user can buy whatever they want (20 or older)

        // First we read in the user's age:
        String ageInput = showInputDialog("Hvor gammel er du?");

        // We then have to convert the String input variable to an int.
        // This can go wrong, so we put it inside a try catch block to
        // catch the exception that occurs if the user does not enter a
        // whole number.
        int age; // the int variable holding the age is created outside the try catch block —
        // if it were created inside it, we would get a bug
        try {
            age = Integer.parseInt(ageInput);
        } catch (Exception e) {
            age = 0;
            showMessageDialog(null, "Du tastet ikke inn et heltall");
        }

        // The two ages we want to compare against are created here, so
        // that the if blocks below communicate clearly what they check:
        int ageOfBeerAndWine = 18;
        int ageOfSpirits = 20;

        // Since there are three possible outcomes, we use if, else if and
        // else. else if lets us check one more condition after the first
        // if statement, before an else statement that runs in every other
        // case.
        if (age < ageOfBeerAndWine) {
            // We check whether the user is under 18 *first*. If we had
            // checked whether they were under 20 first, we could not
            // afterwards tell 18–19-year-olds apart, because only the
            // code belonging to the first true if / else if statement
            // runs.
            showMessageDialog(null, "Du er ikke gammel nok til å handle på polet");
        } else if (age < ageOfSpirits) {
            // If this else if is even checked, we know the user is 18 or
            // older, since the first if statement must have been false.
            // So if age < 20 is true here, the user is 18 or 19, and we
            // can tell them they can buy beer and wine.
            showMessageDialog(null, "Du kan handle øl og vin på polet");
        } else {
            // If we get all the way to else, we know the user is 20 or
            // older — both checks above were false — so they can buy
            // whatever they want.
            showMessageDialog(null, "Du kan handle hva du vil på polet");
        }
    }
}
