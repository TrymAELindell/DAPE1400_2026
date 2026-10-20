// Reference solution for exercise 27: the class the exercise asks about. Math.PI is a static field on the Math
// class - the same shape as Integer.MAX_VALUE, and as the constants
// declared here.
public class Circle {
    private static final double DEFAULT_RADIUS = 2.0;

    private double radius;

    public Circle() {
        this.radius = DEFAULT_RADIUS;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
