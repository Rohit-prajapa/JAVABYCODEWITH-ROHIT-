import java.util.Scanner;

public class Method {
    public  static int sum(int a, int b){
        return a+b;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);

        int a;
        System.out.println("Enter the 1st Number: ");
        a=sc.nextInt();

        int b;
        System.out.println("Enter the 2nd NUmber: ");
        b=sc.nextInt();

        int c=sum(a,b);
        System.out.println(c);
    }
}
