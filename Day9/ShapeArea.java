
class shape {

    double area(int radius) {
        return (Math.PI * radius * radius);
    }

    int area(int length, int width) {
        return (length * width);
    }
}

public class ShapeArea {

    public static void main(String[] args) {
        double Circleradius = 6.0;
        shape shape = new shape();

        double circleArea = shape.area(5);
        System.out.println("Area of Circle: " + circleArea);

        int rectangleArea = shape.area(4, 6);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
