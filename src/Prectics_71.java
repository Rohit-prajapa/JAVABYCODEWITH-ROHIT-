import java.util.Scanner;

public class Prectics_71 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str1;
        System.out.println("Enter the String 1st");
        str1=sc.nextLine();

        String str2;
        System.out.println("Enter the 2nd String :");
        str2=sc.nextLine();

        String str3=(str1+str2).toUpperCase();
        System.out.println("Final String is :"+str3);
    }
}
