import java.util.Scanner;

public class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "name is :"+name+" age is :"+age;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student("Rohit",20);
        System.out.println(s1);
    }
}
