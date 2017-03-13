package app;

import model.*;


public class CalcTest {
    public static void main(String[] args) {
//        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Square square = new Square(5.6);
        Rectangle rectangle = new Rectangle(8, 6.3);
        Circle circle = new Circle(7.2);
        Triangle triangle = new Triangle(2, 3, 5);


//        double circleArea = shapeCalculator.circleArea(circle);
//        double triangleParameter = shapeCalculator.triangleParimeter(triangle);
//        double squareArea = shapeCalculator.squareArea(square);
//        double recttangleParemeter = shapeCalculator.rectPerimeter(rectangle);

        double circleArea = circle.calculateArea ();
        double triangleParameter = triangle.calculateArea();
        double squareArea = square.calculateArea();
        double recttangleParemeter = rectangle.calculateArea();

        System.out.println("Pole koła " + circleArea);
        System.out.println("Pole kwadrat " + squareArea);
        System.out.println("Obwód prostokąta " + recttangleParemeter);
        System.out.println("Obwód trójkąta " + triangleParameter);
    }

}
