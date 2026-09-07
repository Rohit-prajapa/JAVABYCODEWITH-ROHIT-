import java.util.Scanner;

public class Prectics9 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int m1;
        System.out.println("Enter the Math Marks: ");
        m1=sc.nextInt();

        int m2;
        System.out.println("Enter the Physics Marks: ");
        m2=sc.nextInt();

        int m3;
        System.out.println("Enter the Chemistry marks: ");
        m3=sc.nextInt();

        double avg=(m1+m2+m3)/3.0;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congratulation you have passed the Examination: ");
        }
        else{
            System.out.println("you fail in Examination: ");
        }
    }
}
