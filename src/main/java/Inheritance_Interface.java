import java.util.Scanner;
interface sampleInterface{
    void meth1();
    void meth2();
}
interface childsampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class  mysampleInterface implements childsampleInterface {
    public void meth1() {
        System.out.println("this is Meth1: ");
    }

    public void meth2() {
        System.out.println("this is meth2: ");
    }

    public void meth3() {
        System.out.println("this is Meth3: ");
    }

    public void meth4() {
        System.out.println("this is meth4: ");
    }
}
public class Inheritance_Interface {
    static void main() {
        Scanner sc=new Scanner(System.in);
        mysampleInterface obj=new mysampleInterface();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
