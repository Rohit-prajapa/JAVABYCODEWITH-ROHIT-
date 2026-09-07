import java.util.Scanner;

public class FinalFields {
    final String name;
    final int age;

    FinalFields(String name, int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        FinalFields f=new FinalFields("Rohit",20);
        f.display();

    }
}
