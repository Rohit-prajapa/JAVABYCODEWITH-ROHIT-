import java.util.Scanner;

public class Calculator {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the 1st Number: ");
        a=sc.nextInt();

        int b;
        System.out.println("Enter the 2nd Number: ");
        b=sc.nextInt();

        String ch;
        System.out.println("Enter the character: ");
        ch=sc.next();

        int result=switch(ch){
            case "+"-> a+b;
            case "-"-> a-b;
            case "*"->a*b;
            case "/"->a/b;
            default -> -1;
        };
        System.out.println("Your result is :"+result);
    }
}
