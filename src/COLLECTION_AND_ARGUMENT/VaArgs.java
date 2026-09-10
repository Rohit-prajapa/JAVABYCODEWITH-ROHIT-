package COLLECTION_AND_ARGUMENT;

import java.util.Scanner;

public class VaArgs {
    public static int sum(int... a){
        int sum=0;
        for (int i : a) {
            sum=sum+i;
        }
        return sum;
    }
    public static int sum(int a, int b){
        return a+b;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println(sum(3,4));
        System.out.println(sum(2,3,4,5));
        System.out.println(sum(4,5,6,7,8,9));
    }
}
