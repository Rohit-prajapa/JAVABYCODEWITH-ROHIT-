import java.util.Scanner;
abstract class Parents{

    public void parents(){
        System.out.println("I am Base3 constructor: ");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
}

class child extends Parents{
    public void greet(){
        System.out.println("Good Morning");
    }
}
public class AbstractAndInterface {
    static void main() {
        Scanner sc=new Scanner(System.in);


    }
}
