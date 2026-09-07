import java.util.Scanner;
class Rectangle{
    int length;
    int breadth;

    public void setvalue(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class Prectics15 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Rectangle r=new Rectangle();
        r.setvalue(4,5);

        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
}
