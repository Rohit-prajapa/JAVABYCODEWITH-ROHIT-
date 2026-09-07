import java.util.Scanner;
class one{
    public void greet(){
        System.out.println("Good Morning: ");
    }
    public void  name(){
        System.out.println("my name is Java");
    }
}

class two extends one{
    public void swagat(){
        System.out.println("Apka swagat hai");
    }
    public void name(){
        System.out.println("my name is Java in class Two");
    }
}
public class Dynamic_Method_disPatch {
    static void main() {
        Scanner sc=new Scanner(System.in);
//        one a=new one();
//        a.greet();
//        a.name();

        two b=new two();
        b.greet();
        b.name();
        b.swagat();
    }
}
