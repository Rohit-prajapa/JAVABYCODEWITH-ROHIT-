import java.util.Scanner;

public class doWhileLoop {
    static void main() {
        Scanner sc=new Scanner(System.in);

        int age;
        do{
            System.out.println("Enter your age: ");
            age=sc.nextInt();
        }while(age<0 || age>100);
        System.out.println("Your age is :"+age);
    }
}
