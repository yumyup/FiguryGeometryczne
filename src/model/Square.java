package model;

/**
 * Created by Helmut on 2017-03-11.
 */
public class Square {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double calculateArea() {
        double square = a * a;
        return square;

    }


    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;

    }
}
