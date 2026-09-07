import java.util.Scanner;
class Square{
    int side;

    public void setside(int side){
        this.side=side;
    }

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }

}
public class Prectivs14 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Square s=new Square();
        s.setside(5);
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}
