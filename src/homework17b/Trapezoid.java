package homework17b;

public class Trapezoid extends Shape{

    private double a;
    private  double b;
    private  double c;

    public Trapezoid(double a,double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    @Override
    public double getPerimetr() {
        double p=a+b+2*c;
        return p;
    }
}
