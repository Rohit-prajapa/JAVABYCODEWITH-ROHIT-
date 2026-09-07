import java.util.Scanner;

public class MultiplicationTable {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Number that u want to print Table");
        n=sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(n+" X "+i+" ="+n*i+" ");
        }
    }
}
