/**
 * Created by User on 19.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Circle(3.0);
        Shape shape2 = new Rectangle(3.0, 4.0);
        Shape shape3 = new Rectangle(4.0, 3.0);
        System.out.println("The largest square is: " + getLargerShape(shape1, shape2).square());
        System.out.println("The least square is: " + getLessShape(shape1, shape2).square());
        System.out.println("The least square is: " + getLessShape(shape2, shape3).square());
    }

    private static Shape getLargerShape(Shape shape1, Shape shape2) {
//        if (shape1.square() == shape2.square()) {
//            return null;
//        } else {
        if ((shape1.square() > shape2.square())) {
            return shape1;
        } else {
            return shape2;
        }
    }

    //    }
    private static Shape getLessShape(Shape shape1, Shape shape2) {
//        if (shape1.square() == shape2.square()) {
//            return null;
//        } else {
        if (shape1.square() > shape2.square()) {
            return shape2;
        } else {
            return shape1;
        }
    }
//    }
}
