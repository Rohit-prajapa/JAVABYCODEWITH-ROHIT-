import java.util.Scanner;

public class Year {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Year: ");
        n=sc.nextInt();

        if((n%400==0) || (n%4==0 && n%100!=0)){
            System.out.println(n+" is Leap Year! ");
        }
        else{
            System.out.println(n+" is Not a Leap Year! ");
        }
    }
}
