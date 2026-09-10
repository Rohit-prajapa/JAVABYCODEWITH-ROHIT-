package COLLECTION_AND_ARGUMENT.MultiThreading.RunableThread;

public class PrintTask implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=100; i++){
            System.out.printf("%d* ",i);
        }
        System.out.println();
        System.out.println("* task completed");
    }

    private final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
