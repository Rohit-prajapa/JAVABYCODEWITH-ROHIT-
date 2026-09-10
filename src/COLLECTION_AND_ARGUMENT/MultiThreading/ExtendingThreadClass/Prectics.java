package COLLECTION_AND_ARGUMENT.MultiThreading.ExtendingThreadClass;

import java.util.Scanner;

public class Prectics {
    static void main() {
        Scanner sc=new Scanner(System.in);
       FirstTask t1=new FirstTask();
       SecondTask t2=new SecondTask();
       ThirdTask t3=new ThirdTask();
       t1.start();
       t2.start();
       t3.start();

    }
}
