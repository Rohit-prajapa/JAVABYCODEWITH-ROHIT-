import java.util.Scanner;

public class prectics1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int a;
        System.out.println("Enter the 1st Number: ");
        a=sc.nextInt();

        int b;
        System.out.println("Enter the 2nd Number: ");
        b=sc.nextInt();

        int c;
        System.out.println("Enter the 3rd Number: ");
        c=sc.nextInt();

        int sum=(a+b+c);

        System.out.println("The sum of "+a+" "+b+" and "+c+" is "+sum);

    }
}
