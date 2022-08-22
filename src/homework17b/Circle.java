package homework17b;

public class Circle extends Shape {
    double r;
    double pi;

    public  Circle(double r, double pi){
        this.r=r;
        this.pi=pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getPi() {
        return pi;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double getPerimetr() {
        double p=2*pi*r;
        return p;
    }
}
