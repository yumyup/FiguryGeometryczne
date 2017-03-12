package model;

/**
 * Created by Helmut on 2017-03-11.
 */
public class Rectangle {
    private double a;
    private double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}
