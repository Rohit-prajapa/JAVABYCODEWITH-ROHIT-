package COLLECTION_AND_ARGUMENT.MultiThreading.ExtendingThreadClass;

import java.util.Scanner;
class myThread extends Thread{
    private int Thread_Number;

    myThread(int Thread_Number){
        this.Thread_Number=Thread_Number;
    }

    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            System.out.println("Hello from Thread "+Thread_Number);
        }
    }
}

public class Prectics_98 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        myThread t1=new myThread(1);
        myThread t2=new myThread(2);
        t1.start();
        t2.start();

    }
}
