// Reference solution for exercise 5.
public class Wind {
    private double windSpeed;

    public Wind(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getWindSpeed() {
        return this.windSpeed;
    }

    public boolean isHurricane() {
        return this.windSpeed > 120;
    }

    public boolean isCalm() {
        return this.windSpeed < 2;
    }

    // One knot is 1.852 km/h
    public double getKnots() {
        return this.windSpeed / 1.852;
    }

    // Math.pow is a static method, like the ones we write this week
    public int getBeaufort() {
        return (int) (Math.pow(this.windSpeed / 3.01, 0.6666) + 0.5);
    }
}
