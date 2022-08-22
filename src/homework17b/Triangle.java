package homework17b;

public class Triangle extends Shape {
      private double a;

      public Triangle(double a){
          this.a=a;
      }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    @Override
    public double getPerimetr(){
          double p= 3*a;
          return p;
     }

}
