import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) {
        System.out.println("Hello");
        Circle c1 = new Circle("red", "hinh tron 1",
                50.0,10.0, 20.0);
        Circle c2 = new Circle("green", "hinh tron 2",
                60.0,10.0, 20.0);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        c2.doSomething();
        Rectangle r1 = new Rectangle("yellow", "hcn 1",
                                    100.0, 200.2);
        Rectangle r2 = new Rectangle("yellow", "hcn 2",
                102.0, 201.2);
        Rectangle r3 = new Rectangle("yellow", "hcn 3",
                103.0, 202.2);
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());

        System.out.println(String.format("r1's area = %.2f",r1.getArea()));
        System.out.println(String.format("c1's area = %.2f",c1.getArea()));
        c1.doTaskA();
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(r1);
        shapes.add(r2);
        shapes.add(c1);
        shapes.add(c2);
        for(Shape shape: shapes){
            if(shape instanceof Rectangle) {
                System.out.println("this is a Rectable");
            }else if(shape instanceof Circle) {
                System.out.println("this is a Circle");
            }
        }
    }
}
