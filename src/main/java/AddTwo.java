import java.util.Scanner;

public class AddTwo {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the First NUmber: ");
        a=sc.nextInt();

        int b;
        System.out.println("Enter the 2nd Number: ");
        b=sc.nextInt();

        int c=a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+c);
    }
}
