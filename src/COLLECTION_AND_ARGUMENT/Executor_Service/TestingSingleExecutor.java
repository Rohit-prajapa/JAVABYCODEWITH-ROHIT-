package COLLECTION_AND_ARGUMENT.Executor_Service;

import COLLECTION_AND_ARGUMENT.MultiThreading.RunableThread.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingSingleExecutor {
    static void main() {
       ExecutorService service= Executors.newSingleThreadExecutor();
        PrintTask t1=new PrintTask('*');
        service.submit(t1);
        service.shutdown();

    }
}
