import java.util.Scanner;

public class prectics2 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int marks1;
        System.out.println("Enter the Math Marks: ");
        marks1=sc.nextInt();

        int marks2;
        System.out.println("Enter the Physics marks: ");
        marks2=sc.nextInt();

        int marks3;
        System.out.println("Enter the Chemistry marks: ");
        marks3=sc.nextInt();

        int marks4;
        System.out.println("enter the Social_Science Marks: ");
        marks4=sc.nextInt();

        int marks5;
        System.out.println("Enter the Music marks: ");
        marks5=sc.nextInt();

        System.out.println(marks1+" "+marks2+" "+marks3+" "+marks4+" "+marks5);

        double percentage=(marks1+marks2+marks3+marks4+marks5)/5.0;
        System.out.println(percentage+"%");
    }
}
