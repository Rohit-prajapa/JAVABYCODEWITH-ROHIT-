import java.util.Scanner;

public class StringTester {
    static void main() {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder("this is a Cow");
        str.append("  How are you");
        System.out.println(str);
    }
}
