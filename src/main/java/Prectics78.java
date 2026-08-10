import java.util.Scanner;
class myThread3 extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}
public class Prectics78 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        myThread3 t1=new myThread3(); 
        System.out.println("state is :"+t1.getState());
        t1.start();
        System.out.println("After start :"+t1.getState());
    }
}
