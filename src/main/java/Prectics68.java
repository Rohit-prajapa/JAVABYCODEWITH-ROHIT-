import java.util.Scanner;
class mythread extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Hello Rohit!");
            System.out.println("I am happy");
        }

    }
}

class mythread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("Hello Rahul!");
            System.out.println("Are u sad!");
        }

    }
}
public class Prectics68 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        mythread t1=new mythread();
        mythread2 t2=new mythread2();
        t1.start();
        t2.start();
    }
}
