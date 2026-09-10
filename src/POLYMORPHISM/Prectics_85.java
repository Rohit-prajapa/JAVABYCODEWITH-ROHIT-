package POLYMORPHISM;

import java.util.Scanner;

public class Prectics_85 {
    public static int add(int a, int b){
        return a+b;
    }

    public static int add(int a, int b, int c){
        return a+b+c;
    }

    public static double add(double a, double b){
        return a+b;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println(add(2,3));
        System.out.println(add(1,2,3));
        System.out.println(add(2.3,4.5));
    }
}
