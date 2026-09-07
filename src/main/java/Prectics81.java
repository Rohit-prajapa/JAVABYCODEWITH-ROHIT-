import java.util.Scanner;

public class Prectics81 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a=4;
        int b=0;
        try{
            System.out.println("Welcome to India");
            try {
                System.out.println("Arethmetic Exception : ");
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println("Exception in level-1 ");
        }
    }
}
