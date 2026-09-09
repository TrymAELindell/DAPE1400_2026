// Reference solution for exercise 53. With input handling and the countdown in
// their own classes, the main program reads almost like the requirements.
//
// Fasit comment (the choice): this solution puts the three parts into
// static methods in two helper classes (module 05). None of the methods
// needs to store anything: everything a method needs comes in as a
// parameter, and two UserInput objects would always give exactly the
// same answers. Another solution is normal (non-static) methods on
// objects created in main. The disadvantage: the program must write
// new UserInput() and create an object that holds no data, so the code
// looks like it stores something when it does not. Private methods
// inside one class also works. The disadvantage: the UserInput class is
// the part the next program will want to use again, and then it must be
// cut out of the class first.
public class RocketCountdownV5 {
    public static void main(String[] args) {
        int rocketsLaunched = 0;

        while (UserInput.requestAndVerifyTargetString("Fortsett oppskytning? (j/n)", "j")) {
            int countFrom = UserInput.requestInt("Start nedtelling fra:");
            Countdown.startCountdown(countFrom);
            rocketsLaunched++;
        }

        System.out.println(rocketsLaunched + " raketter har blitt skutt opp");
    }
}
