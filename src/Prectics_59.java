import java.util.Scanner;

public class Prectics_59 {
    static void main() {
        Scanner sc=new Scanner(System.in);
       String password;
       do{
           System.out.println("Enter your password");
           password=sc.nextLine();

           if(!password.equals("java123")){
               System.out.println("Invalid password , Try again");
           }
       }while(!password.equals("java123"));
        System.out.println("valid password!");
    }
}
