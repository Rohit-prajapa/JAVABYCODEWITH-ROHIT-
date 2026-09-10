package POLYMORPHISM;

import java.util.Scanner;

public class methodOverlodding {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static String sum(String str1, String str2){
        return str1+str2;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int c=sum(2,3);
        int d=sum(1,2,3);
        System.out.println(sum("rohit","prajapati"));
        System.out.println(c+" "+d);
    }
}
