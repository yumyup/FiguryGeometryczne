package model;

/**
 * Created by Helmut on 2017-03-11.
 */
public class ShapeCalculator {


    public double squareArea(Square square) {

        double area = square.getA() * square.getA();

        return area;

    }


    public double circleArea(Circle circle) {
        double area = (2 * 3.14 * circle.getR());
        return area;
    }

    public double triangleParimeter(Triangle triangle) {
        double parimeter = (triangle.getA() + triangle.getB()+ triangle.getC());
        return parimeter;
    }

    public double rectPerimeter(Rectangle rectangle) {
        double parimeter = (2 * rectangle.getA() + 2 * rectangle.getB());
        return parimeter;


    }
}


