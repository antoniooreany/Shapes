/**
 * Created by User on 19.11.2016.
 */
class Rectangle implements Shape {
    private double width;
    private double hight;

    Rectangle(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    @Override
    public double square() {
        return width * hight;

    }
}
