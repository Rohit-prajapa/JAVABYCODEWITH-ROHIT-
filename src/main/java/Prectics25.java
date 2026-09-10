import java.util.Scanner;
class Ractangle{
   private int length;
   private int breadth;

   public Ractangle(){
       length=4;
       breadth=5;
   }
   public Ractangle(int length, int breadth){
       this.length=length;
       this.breadth=breadth;
   }



   public void setLength(int length){
       this.length=length;
   }

   public void setBreadth(int breadth){
       this.breadth=breadth;
   }

   public int area(){
       return length*breadth;
   }

   public int perimeter(){
       return 2*(length+breadth);
   }
}
public class Prectics25 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Rectangle r=new Rectangle();
        r.setvalue(4,5);

        System.out.println("area is :"+r.area());
        System.out.println("Perimeter is :"+r.perimeter());

    }
}
