package ExceptionHandling;

import java.util.Scanner;

public class Prectics_87 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the 1st NUmber: ");
        a=sc.nextInt();

        int b;
        System.out.println("Enter the 2nd Number: ");
        b=sc.nextInt();

        try{
            int c=a/b;
            System.out.print(c+" ");
        }catch (ArithmeticException e){
            System.out.println("Divide by zero");
        }
    }
}
