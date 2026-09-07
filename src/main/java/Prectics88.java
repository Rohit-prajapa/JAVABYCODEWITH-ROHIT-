import java.util.Scanner;

public class Prectics88 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        //int a=10 //missing semicolon

//        int a=10;
//        int b=20;
//        int c=a-b;
//        System.out.println("Logical error is :"+c);

        int a=10;
        int b=0;
        try {
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
