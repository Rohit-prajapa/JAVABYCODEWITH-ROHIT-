import java.util.Scanner;
class Circle{
    double radius;

    public void setRadius(double radius){
        this.radius=radius;
    }

    public double area(){
        return 3.14*radius*radius;
    }

    public double perimeter(){
        return 2*3.14*radius;
    }
}
public class Prectics17 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Circle c1=new Circle();
        c1.setRadius(5);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}
