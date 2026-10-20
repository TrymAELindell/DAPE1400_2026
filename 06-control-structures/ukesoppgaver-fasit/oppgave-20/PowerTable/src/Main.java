// Reference solution for exercise 20. Migrated from the archive solution;
// identifiers anglicised. The powers are computed with multiplication so
// the table stays in whole numbers — Math.pow returns a double and would
// put decimals in every cell.
public class Main {
    public static void main(String[] args) {
        String output = "N\tN^2\tN^3\tN^4\n";
        for (int i = 1; i <= 10; i++) {
            output += i + "\t" + i * i + "\t" + i * i * i
                    + "\t" + i * i * i * i + "\n";
        }
        System.out.print(output);
    }
}
