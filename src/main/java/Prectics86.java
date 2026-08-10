import java.util.Scanner;

public class Prectics86 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        try{
            int a=5;
            int b=0;
            int c=a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("End is Programm ");
        }

    }
}
