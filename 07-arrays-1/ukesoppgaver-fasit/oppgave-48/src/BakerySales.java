import static javax.swing.JOptionPane.showInputDialog;

// Reference solution for exercise 48. Dialog-based, so it is checked by hand.
// One acceptable solution among several.
public class BakerySales {

    // Assumption: Halyna types whole numbers, as a note on paper holds
    // whole bun counts.
    public static int[] readWeek(String weekName, String[] days) {
        int[] sales = new int[days.length];
        for (int i = 0; i < sales.length; i++) {
            String input = showInputDialog("Antall boller " + days[i] + " " + weekName + ":");
            sales[i] = Integer.parseInt(input);
        }
        return sales;
    }

    public static void main(String[] args) {
        String[] days = {"mandag", "tirsdag", "onsdag", "torsdag", "fredag", "lørdag", "søndag"};

        int[] thisWeek = readWeek("denne uka", days);
        int[] lastWeek = readWeek("forrige uke", days);

        int total = 0;
        for (int sold : thisWeek) {
            total += sold;
        }

        // Assumption: when two days share the top count, the first of
        // them is named as the best day.
        int bestDay = 0;
        for (int i = 1; i < thisWeek.length; i++) {
            if (thisWeek[i] > thisWeek[bestDay]) {
                bestDay = i;
            }
        }

        String report = "Totalt denne uka: " + total + " boller\n";
        report += "Beste dag: " + days[bestDay] + " (" + thisWeek[bestDay] + " boller)\n";

        // Assumption: the brief never mentions equal days; a day with
        // the same count both weeks is reported as "likt som forrige uke".
        for (int i = 0; i < days.length; i++) {
            int difference = thisWeek[i] - lastWeek[i];
            if (difference > 0) {
                report += days[i] + ": " + difference + " flere enn forrige uke\n";
            } else if (difference < 0) {
                report += days[i] + ": " + (-difference) + " færre enn forrige uke\n";
            } else {
                report += days[i] + ": likt som forrige uke\n";
            }
        }

        System.out.print(report);
    }
}
