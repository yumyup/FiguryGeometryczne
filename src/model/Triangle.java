package model;

/**
 * Created by Helmut on 2017-03-11.
 */
public class Triangle {
private double a;
private double b;
private double c;
Triangle (double a, double b, double c){
    this.a = a;
    this.b = b;
    this.c = c;

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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
