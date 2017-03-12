package model;

/**
 * Created by Helmut on 2017-03-11.
 */
public class ShapeCalculator {



    public double squareArea(Square square) {

        double area = square.a * square.a;

        return area;

    }


    public double circleArea(Circle circle) {
        double area = (2 * 3.14 * circle.r);
        return area;
    }

    public double triangleParimeter(Triangle triangle) {
        double parimeter = (triangle.a + triangle.b + triangle.c);
        return parimeter;
    }

    public double rectPerimeter(Rectangle rectangle) {
        double parimeter = (2 * rectangle.a + 2 * rectangle.b);
        return parimeter;


    }
}


