package COLLECTION_AND_ARGUMENT.MultiThreading.ExtendingThreadClass;

public class FirstTask extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=100; i++){
            System.out.printf("%d* ",i);
        }
        System.out.println();
        System.out.println("* task completed");
    }
}
