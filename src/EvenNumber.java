import java.util.Scanner;

public class EvenNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Number: ");
        n=sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i%2!=0) continue;
            System.out.print(i+" ");
        }
    }
}
