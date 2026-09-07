import java.util.Scanner;

public class Palindrome {
    public static boolean ispalindrome(String str, int i, int j){
        if(i>=j){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        return ispalindrome(str,i+1,j-1);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the string: ");
        str=sc.nextLine();

        if(ispalindrome(str,0,str.length()-1)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
