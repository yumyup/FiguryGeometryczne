package model;

/**
 * Created by Helmut on 2017-03-11.
 */
public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculateArea (){
        double circle = 2*3.14*r;
        return circle;
    }
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
