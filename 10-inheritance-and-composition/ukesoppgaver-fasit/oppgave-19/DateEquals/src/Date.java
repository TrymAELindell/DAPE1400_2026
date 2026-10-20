// Reference solution for exercise 19: a date that prints with the month name and compares by content.
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

    public boolean equals(Object other) {
        if (other instanceof Date) {
            Date date = (Date) other;
            return day == date.day && month == date.month && year == date.year;
        }
        return false;
    }
}
