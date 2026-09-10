import java.util.Scanner;

public class AreaAndCircumFrence {
    public static double circumfrence(double radius){
        return 2*Math.PI*radius;
    }
    public  static double area(double radius){
        return Math.PI*radius*radius;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        double radius;
        System.out.println("Enter the Radius");
        radius=sc.nextDouble();
        double Area=area(radius);
        double circum=circumfrence(radius);
        System.out.println("Area of the Circle is :"+Area);
        System.out.println("Circumfrence of the circle is :"+circum);
    }
}
