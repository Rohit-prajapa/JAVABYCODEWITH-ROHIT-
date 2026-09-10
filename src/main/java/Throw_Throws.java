import java.util.Scanner;

public class Throw_Throws {
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the 1st Number: ");
        a=sc.nextInt();

        int b;
        System.out.println("Enter the 2nd Number: ");
        b=sc.nextInt();
        try{
            int c=divide(a,b);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Exception is :"+e);
        }

    }
}
