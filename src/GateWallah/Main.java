package GateWallah;
abstract class Shape{
    abstract void calculateArea();
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }

    @Override
    void calculateArea() {
        double area=Math.PI*radius*radius;
        System.out.println("area of the Circle is :"+area);
    }
}

class Square extends Shape{
    double side;
    Square(double side){
        this.side=side;
    }

    @Override
    void calculateArea() {
        double area=side*side;
        System.out.println("Area of the square is :"+area);
    }
}
public class Main {
    static void main() {
        Circle c=new Circle(5);
        Square s=new Square(4);
        c.calculateArea();
        s.calculateArea();
    }
}
