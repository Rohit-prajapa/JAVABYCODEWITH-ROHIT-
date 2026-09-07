import java.util.Scanner;
class Employee{
    int id;
    String name;
    int salary;

    public void printdetails(){
        System.out.println("MY Id is :"+id);
        System.out.println("my name is :"+name);
        System.out.println("my salary is :"+salary);
    }

}
public class OOPS {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Employee e1=new Employee();
        Employee e2=new Employee();

        e1.id=101;
        e1.name="Rohit";
        e1.salary=10000;

        e1.printdetails();

        e2.id=102;
        e2.name="Prajapati";
        e2.salary=400000;

        e2.printdetails();
//        System.out.println(e1.id);
//        System.out.println(e1.name);
    }
}
