import java.util.Scanner;
class cylinder2{
  private   int radius;
  private int height;

  public void setRadius(int radius){
      this.radius=radius;
  }

  public void setHeight(int height){
      this.height=height;
  }

  public double surfacearea(){
      return 2*3.14*radius*(radius+height);
  }

  public double volume(){
      return 3.14*radius*radius*height;
  }

}
public class Prectics23 {
    static void main() {
        Scanner sc=new Scanner(System.in);

        cylinder2 c=new cylinder2();
        c.setRadius(5);
        c.setHeight(10);
        System.out.println("Surface area is :"+c.surfacearea());
        System.out.println("Volume is :"+c.volume());
    }
}
