import java.util.Scanner;
class Base1{
    Base1(){
        System.out.println("this is Base Constructor: ");
    }
}
class derived1 extends Base1{
    derived1(){
        System.out.println("This is derived1 Constructor: ");
    }
}

class derived2 extends derived1{
    derived2(){
        System.out.println("this is Derived 2 Constructor: ");
    }
}
public class Prectics45 {
    static void main() {
        Scanner sc=new Scanner(System.in);

        derived2 d=new derived2();

    }
}
