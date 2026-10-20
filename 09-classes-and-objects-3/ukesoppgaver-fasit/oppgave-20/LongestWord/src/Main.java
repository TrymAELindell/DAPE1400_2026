// Reference solution for exercise 20: find the longest word and its index.
public class Main {
    public static void main(String[] args) {
        String[] words = {"sol", "regnbue", "sky", "torden", "tåke"};

        // Begge variablene er deklarert før loopen, slik at de finnes etter den.
        String longestWord = words[0];
        int longestIndex = 0;
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
                longestIndex = i;
            }
        }

        System.out.println("Lengste ord: " + longestWord);
        System.out.println("Indeks: " + longestIndex);
    }
}
