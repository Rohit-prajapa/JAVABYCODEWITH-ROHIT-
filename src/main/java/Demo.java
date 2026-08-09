import java.util.Scanner;

public class Demo {
    static void main() {
        Scanner sc=new Scanner(System.in);

//        String name=new String("Rohit");
//        System.out.println(name);

        String name="Rohit";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(0));
        System.out.println(name.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));
        System.out.println(name.replace('R','M'));
        System.out.println(name.startsWith("Ro"));
        System.out.println(name.endsWith("t"));
        System.out.println(name.indexOf('R'));
        System.out.println(name.equals("Rohit"));
        System.out.println(name.equalsIgnoreCase("rohit"));
    }
}
