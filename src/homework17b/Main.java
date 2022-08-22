package homework17b;

public class Main {
    public  static void main(String[]args){

        Triangle triangle=new Triangle(4);
        System.out.println("Triangle:     perimetr="+triangle.getPerimetr());

        Quadrate quadrate=new Quadrate(5);
        System.out.println("Quadrate:    perimetr="+quadrate.getPerimetr());

        Rectangle rectangle=new Rectangle(2,3.5);
        System.out.println("Rectangle:   perimetr="+rectangle.getPerimetr());

        Circle circle=new Circle(1,3.14);
        System.out.println("Circle:       perimetr="+circle.getPerimetr());

        Trapezoid trapezoid=new Trapezoid(1.2,2,1);
        System.out.println("Trapezoid:     perimetr="+trapezoid.getPerimetr());
    }
}
