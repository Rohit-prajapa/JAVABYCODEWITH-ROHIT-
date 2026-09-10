import java.util.Scanner;

public class Pattern {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n+1-i); j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
