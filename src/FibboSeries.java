import java.util.Scanner;

public class FibboSeries {
    public static int fibbo(int n){
        if(n==1 || n==2) return 1;
        return fibbo(n-1)+fibbo(n-2);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.println("Enter the Number ");
        n=sc.nextInt();

        int c=fibbo(n);
        System.out.println("Fibbonacci series is :"+c);
    }
}
