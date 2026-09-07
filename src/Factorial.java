import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n==0 || n==1) return 1;
        return n*fact(n-1);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Number: ");
        n=sc.nextInt();

        int result=fact(n);
        System.out.println("Fctorial is :"+result);
    }
}
