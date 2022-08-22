package homework17b;

public class Quadrate extends Shape {

    private double b;

    public  Quadrate(double b){
        this.b=b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    @Override
    public double getPerimetr(){
        double p=4*b;
        return  p;
    }
}
