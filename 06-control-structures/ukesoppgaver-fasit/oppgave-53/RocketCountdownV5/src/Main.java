// Reference solution for exercise 53. With input handling and the countdown in
// their own classes, the main program reads almost like the requirements.
//
// Denne løsningen legger de tre delene i statiske metoder i to
// hjelpeklasser (modul 05). Ingen av metodene trenger å lagre noe. Alt en
// metode trenger, kommer inn som parameter, og to UserInput-objekter ville
// alltid gitt nøyaktig de samme svarene. En annen løsning er vanlige
// (ikke-statiske) metoder på objekter som lages i main. Ulempen er at
// programmet må skrive new UserInput() og lage et objekt som ikke holder
// noen data. Koden ser da ut som den lagrer noe, selv om den ikke gjør det.
// Private metoder inne i én klasse virker også. Ulempen er at klassen
// UserInput er den delen neste program vil bruke igjen. Da må noen først
// flytte den ut av den store klassen.
public class Main {
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
