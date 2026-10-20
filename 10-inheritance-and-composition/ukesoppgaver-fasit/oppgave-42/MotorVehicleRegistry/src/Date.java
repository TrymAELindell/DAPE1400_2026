// Reference solution for exercise 42 (Del 4): a date that prints as readable text.
public class Date {
    private int day, month, year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private static String getMonthName(int month) {
        String[] names = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober",
                "november", "desember" };
        if (month > 0 && month < 13) {
            return names[month - 1];
        } else {
            return "ukjent måned";
        }
    }

    public String toString() {
        return day + " " + getMonthName(month) + " " + year;
    }
}
