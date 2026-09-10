package COLLECTION_AND_ARGUMENT;
import java.util.Scanner;
public class Prectics_89 {
//    public static String concaitination(String str1, String str2){
//        return str1+str2;
//    }
    public static String add(String... str){
        String str1="";
        for (String s : str) {
            str1+=s;
        }
        return str1;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
//        String str1;
//        System.out.println("Enter the String");
//        str1=sc.nextLine();
//
//        String str2;
//        System.out.println("Enter the 2nd String: ");
//        str2=sc.nextLine();
//
//        System.out.println(concaitination(str1,str2));
        System.out.println(add("Rohit","prajapati","Varanasi"));
    }
}
