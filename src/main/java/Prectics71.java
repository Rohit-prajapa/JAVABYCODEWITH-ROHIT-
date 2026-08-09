import java.util.Scanner;
class myThread implements Runnable{
    public void run(){
        int i=1;
        while(i<=10) {
            System.out.println("This is Thread 1");
            i++;
        }
    }
}

class myThread2 implements Runnable{
    public void run(){
        int i=1;
        while(i<=10) {
            System.out.println("This is Thread2");
            i++;
        }
    }
}
public class Prectics71 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        myThread task=new myThread();
        Thread t=new Thread(task);

        myThread2 task2=new myThread2();
        Thread t2=new Thread(task2);

        t.start();
        t2.start();
    }
}
