import java.util.Scanner;
class circle1{
    int radius;

    public void setRadius(int radius){
        this.radius=radius;
    }

    public int getRadius(){
        return radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }
}

class cylinder extends circle1{
    int height;

    public void setHeight(int height){
        this.height=height;
    }

    public int getHeight(){
        return height;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
    public double surfacearea(){
        return 2*Math.PI*radius*(radius+height);
    }
}
public class Prectics31 {
    static void main() {
        Scanner sc=new Scanner(System.in);

//        circle1 c=new circle1();
//        c.setRadius(5);
//        System.out.println(c.getRadius());
//        System.out.println("area is :"+c.area());
//        System.out.println("Perimeter is :"+c.perimeter());


        cylinder c=new cylinder();
        c.setRadius(5);
        System.out.println(c.getRadius());
        c.setHeight(10);
        System.out.println(c.getHeight());

        System.out.println("area of circle is :"+c.area());
        System.out.println("perimeter is :"+c.perimeter());

        System.out.println("Volume of cylinder is :"+c.volume());
        System.out.println("Surface area is :"+c.surfacearea());
    }
}
