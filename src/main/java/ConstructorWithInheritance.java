import java.util.Scanner;
class Base{
    int x;

    public void setX(int x){
        this.x=x;
    }

    public int getX(){
        return x;
    }
}

class Derived extends Base{
    int y;

    public void setY(int y){
        this.y=y;
    }

    public int getY(){
        return y;
    }
}
public class ConstructorWithInheritance {
    static void main() {
        Scanner sc=new Scanner(System.in);
//        Base b=new Base();
//        b.setX(5);
//        System.out.println(b.getX());

        Derived d=new Derived();
        d.setX(5);
        d.setY(8);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}
