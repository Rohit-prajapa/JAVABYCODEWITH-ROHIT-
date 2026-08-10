import java.util.Scanner;

public class EroorAnsException {
    static void main() {

       Scanner sc=new Scanner(System.in);
       int a=6000;
       int b=2;
       try{
           int c=a/b;
           System.out.println("Result is :"+c);
       }catch(Exception e){
           System.out.println("We fail to divide ");
           System.out.println(e);
       }
    }
}
