import java.util.Scanner;
class circle2{
    int radius;

    circle2(int radius){
        this.radius=radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}

class cylinder4 extends circle2{
    int height;

    cylinder4(int radius, int height){
        super(radius);
        this.height=height;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }

}
public class Prectics32 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        cylinder4 c=new cylinder4(5,10);
        System.out.println("area if circle is :"+c.area());
        System.out.println("Volume of the cylinder is :"+c.volume());
    }
}
