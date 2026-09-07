import java.util.Scanner;
class cylinder3{
   private int radius;
   private int height;

   public cylinder3(int radius, int height){
       this.radius=radius;
       this.height=height;
   }
   public int getRadius(){
       return radius;
   }

   public int getHeight(){
       return height;
   }
}
public class Prectics24 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        cylinder3 c=new cylinder3(6,8);
        System.out.println("Radius is :"+c.getRadius());
        System.out.println("Height is :"+c.getHeight());
    }
}
