import javax.swing.plaf.SpinnerUI;
import java.util.Scanner;
class Reactangle{
    int length;
    int breadth;

    public Reactangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }
}

class cuboid extends Reactangle{
    int height;

    public cuboid(int length, int breadth, int height){
        super(length,breadth);
        this.height=height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int volume(){
        return length*breadth*height;
    }
}
public class Prectics34 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        cuboid b=new cuboid(10,20,30);
        System.out.println(b.area());
        System.out.println(b.volume());
        System.out.println(b.perimeter());
    }
}
