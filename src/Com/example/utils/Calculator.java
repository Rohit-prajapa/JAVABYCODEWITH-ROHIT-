package Com.example.utils;

import Com.example.geometry.Circle;
import Com.example.geometry.Rectangle;

public class Calculator {
    static void main() {
        Circle c=new Circle(5);
        Rectangle r=new Rectangle(3,4);

        System.out.println("Area of Circle is :"+c.getArea());
        System.out.println("Area of Reactangle is :"+r.getArea());

    }
}
