// Reference solution for exercise 24: the class the exercise asks about. Both methods use nothing but their
// parameter and the constants, which is what makes them static.
public class TemperatureConverter {
    private static final double FREEZING_POINT_IN_FAHRENHEIT = 32.0;
    private static final double FAHRENHEIT_PER_CELSIUS = 1.8;

    public static double toFahrenheit(double celsius) {
        return celsius * FAHRENHEIT_PER_CELSIUS + FREEZING_POINT_IN_FAHRENHEIT;
    }

    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - FREEZING_POINT_IN_FAHRENHEIT) / FAHRENHEIT_PER_CELSIUS;
    }
}
