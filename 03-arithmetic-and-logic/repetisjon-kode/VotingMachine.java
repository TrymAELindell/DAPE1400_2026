import static javax.swing.JOptionPane.*;

public class VotingMachine {
    public static void main(String[] args) {
        // The task: write a program that tells the user whether they can
        // vote in the parliamentary election (stortingsvalget) or not.
        // In municipal elections you can vote without citizenship, but in
        // parliamentary elections Norwegian citizenship is required.
        // In both cases you must also be 18 or older.
        // So there are two things to check to find out whether a person
        // can vote: are they old enough, and do they have Norwegian
        // citizenship.

        // The first thing we can do is find out whether the user is old
        // enough. For that we need user input.
        // As we remember from module 02, this is done with
        // showInputDialog, which gives us a String:
        String ageInput = showInputDialog("Hvor gammel er du?");
        // We then have to convert the String input to a number.
        // Think about what could go wrong here and improve the code
        // yourself (check module 02):
        int age = Integer.parseInt(ageInput);
        // Whether a person is old enough to vote is either true or false,
        // so we need a boolean variable to store that information.
        // Since you can vote the moment you turn 18, it makes sense to
        // check whether the user is 18 *or older*, which we do with the
        // >= operator. Had we used > instead, the program would not let a
        // person who is exactly 18 vote.
        boolean ofVotingAge = age >= 18;

        // The next thing we need is citizenship. We can ask the user via
        // showInputDialog by having them answer yes or no:
        String citizenshipInput = showInputDialog("Har du norsk statsborgerskap? Svar ja eller nei");
        // When comparing String variables it is best to use the
        // .equals("string value") method (methods come later), because
        // String is not a primitive data type like the other data types
        // we have learned about. Two Strings with the same value will not
        // always give the right answer with the == operator.
        boolean citizenship = citizenshipInput.equals("ja");

        // Finally we want to give the user one of two different messages,
        // depending on whether they meet both requirements or not.
        // We achieve that with an if else statement.
        if (citizenship && ofVotingAge) { // both requirements must be true, so we check them with the && operator
            // The code inside these curly brackets, which belongs to
            // if (citizenship && ofVotingAge), only runs if both
            // citizenship and ofVotingAge are true.
            showMessageDialog(null, "Du kan stemme i år");
        } else {
            // In every other case this code runs instead, before the
            // program continues.
            showMessageDialog(null, "Du kan ikke stemme i år");
        }
    }
}
