import java.util.Scanner;

public class Prectics_54 {
    static void main() {
        Scanner sc=new Scanner(System.in);
//        int a;
//        System.out.println("Enter the 1st Number: ");
//        a=sc.nextInt();
//
//        int b;
//        System.out.println("Enter the 2nd Number: ");
//        b=sc.nextInt();
//
//        int result= a<b ? a: b;
//        System.out.println("Minimum number is :"+result);
        int n;
        System.out.println("Enter the Number");
        n=sc.nextInt();

//        String result=n%2==0? "Even": "Odd";
//        System.out.println("Number is :"+result);

        int result=n>=0? n: -n;
        System.out.println("Absolute Number is :"+result);
    }
}
