import java.util.Scanner;
class myThread1 extends Thread{
    public void run(){
        System.out.println("Hello Rohit");
    }
}
public class Prectics77 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        myThread1 t1=new myThread1();
        System.out.println("default priority: "+t1.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Priority is :"+t1.getPriority());
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Priority is : "+t1.getPriority());
    }
}
