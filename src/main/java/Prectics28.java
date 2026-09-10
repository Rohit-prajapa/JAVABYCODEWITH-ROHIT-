import java.util.Scanner;
class A{
   public int a=5;
    public int rohit(int x){
        return 5;
    }

    public void meth2(){
        System.out.println("i am meth 2 of class A");
    }

}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("I am meth 2 of class B");
    }
    public void meth3(){
        System.out.println("i am meth 3 of class B");
    }
}
public class Prectics28 {
   public static void main() {
        Scanner sc=new Scanner(System.in);

        B b=new B();
       System.out.println(b.rohit(5));
        b.meth2();
        b.meth3();
    }
}
