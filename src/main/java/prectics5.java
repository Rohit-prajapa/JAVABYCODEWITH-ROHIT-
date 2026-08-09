import java.util.Scanner;

public class prectics5 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");

        if(sc.hasNextInt()){
            int a=sc.nextInt();
            System.out.println(a+" is Integer");
        }
        else{
            System.out.println("Enter Number is Not Integer: ");
        }
    }
}
