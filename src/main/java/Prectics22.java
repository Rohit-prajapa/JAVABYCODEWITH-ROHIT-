import java.util.Scanner;
class cylinder1 {
   private int radius;
   private int height;

   public void setRadius(int radius){
       this.radius=radius;
   }

   public int getRadius(){
       return radius;
   }

   public void setHeight(int height){
       this.height=height;
   }

   public int getHeight(){
       return height;
   }

}
public class Prectics22 {
    static void main() {
       Scanner sc=new Scanner(System.in);
       cylinder1 c=new cylinder1();
       c.setRadius(5);
       c.setHeight(10);

        System.out.println(c.getRadius());
        System.out.println(c.getHeight());
    }
}
