import java.util.Scanner;

public class ExceptionDemo {
    static void main() {
        Scanner sc=new Scanner(System.in);
        try {
            int a=10;
            int b=0;

            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("HaHa");
        }
        try{
            throw new IllegalAccessException();
        }catch(IllegalAccessException e){
            System.out.println("HiHi");
        }
    }
}
