import java.util.Scanner;

public class EncryptGrade {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Grade(A,B,C)");
        char grade=sc.next().charAt(0);

        char encrypt= (char) (grade+8);
        System.out.println("Encrypted Grade: "+encrypt);

        char decrypt=(char)(grade-8);
        System.out.println("Decrypted Grade :"+decrypt);
    }
}
