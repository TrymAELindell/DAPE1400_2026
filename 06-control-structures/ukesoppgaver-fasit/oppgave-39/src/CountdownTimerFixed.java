// Reference solution for exercise 39: the corrected version. The handout's snippet has a
// semicolon right after the while condition — an empty statement that
// becomes the loop's whole body, leaving an infinite loop. The fix is to
// remove it, so the block below becomes the body.
public class CountdownTimerFixed {
    public static void main(String[] args) {
        int secondsLeft = 3;
        while (secondsLeft > 0) {
            System.out.println(secondsLeft);
            secondsLeft--;
        }
        System.out.println("Tid!");
    }
}
