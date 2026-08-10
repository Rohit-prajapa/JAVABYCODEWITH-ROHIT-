import java.security.spec.ECFieldF2m;
import java.util.Scanner;
class myException extends Exception{
    @Override
    public String toString() {
        return super.toString()+"I am toString";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+"I am getMessage";
    }
}
public class Prectics83 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter the Value of A");
        a=sc.nextInt();
        if(a<99){
            try{
                throw new myException();
            }
           catch(Exception e){
               System.out.println(e.getMessage());
           }
        }
    }
}
