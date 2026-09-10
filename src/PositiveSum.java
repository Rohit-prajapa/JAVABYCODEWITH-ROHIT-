import java.util.Scanner;

public class PositiveSum {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 Number: ");
        int sum=0;
        for(int i=1; i<=10; i++){
            int n=sc.nextInt();
            if(n<0) continue;
            sum=sum+i;
        }
        System.out.println("Sum is :"+sum);
    }
}
