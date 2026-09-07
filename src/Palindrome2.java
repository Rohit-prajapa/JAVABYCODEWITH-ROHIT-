import java.util.Scanner;

public class Palindrome2 {
    public static boolean ispailndrome(String str, int i, int j){
        if(i>=j){
            return true;
        }
        return ispailndrome(str,i+1,j-1);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the String: ");
        str=sc.nextLine();

       if(ispailndrome(str,0,str.length()-1)){
           System.out.println(str+" is palindrome");
       }
       else{
           System.out.println(str+" is not palindrome");
       }
    }
}
