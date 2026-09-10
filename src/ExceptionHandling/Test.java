package ExceptionHandling;

import java.util.Scanner;

public class Test {
    static void main() {
        Scanner sc=new Scanner(System.in);

        int a;
        System.out.println("Enter the 1st Number: ");
        a=sc.nextInt();

        int b;
        System.out.println("Enter the 2nd Number: ");
        b=sc.nextInt();
        try{
            int c=a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("Divide by zero");
        }
    }
}
