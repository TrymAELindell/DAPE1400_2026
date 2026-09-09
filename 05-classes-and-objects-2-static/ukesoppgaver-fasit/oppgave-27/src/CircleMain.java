// Reference solution for exercise 27: the run the exercise asks about.
public class CircleMain {
    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle bigCircle = new Circle(10.0);

        System.out.println(defaultCircle.getArea());
        System.out.println(bigCircle.getArea());
    }
}
