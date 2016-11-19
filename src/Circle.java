import static java.lang.Math.PI;

/**
 * Created by User on 19.11.2016.
 */
class Circle implements Shape {
    private double diameter;

    Circle(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public double square() {
        double radius = diameter / 2.0;
        return PI * radius * radius;
    }
}
