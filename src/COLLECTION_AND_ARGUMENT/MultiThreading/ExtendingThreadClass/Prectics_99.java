package COLLECTION_AND_ARGUMENT.MultiThreading.ExtendingThreadClass;

class MyThread extends Thread {

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Prectics_99{
    public static void main(String[] args) throws InterruptedException {

        MyThread t = new MyThread();

        System.out.println("After creation: " + t.getState());

        t.start();

        System.out.println("After starting: " + t.getState());

        Thread.sleep(500);

        System.out.println("While running/sleeping: " + t.getState());

        t.join();

        System.out.println("After termination: " + t.getState());
    }
}
