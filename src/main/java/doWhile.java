import java.util.Scanner;

public class doWhile {
    static void main() {
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.println("Enter the Number: ");
        n=sc.nextInt();

//        int i=1;
//        do{
//            System.out.println(i+" ");
//            i++;
//        }while(i<=n);

        for(int i=n; i>=1; i--){
            System.out.print(i+" ");
        }
    }
}
