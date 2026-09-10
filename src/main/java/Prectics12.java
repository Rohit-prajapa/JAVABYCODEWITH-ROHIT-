import java.util.Scanner;
class Employee2{
    int salary;
    String name;

    public int getsalary(){
        return salary;
    }
    public void getname(){
        System.out.println("My name is :"+name);
    }
    public void setname(String name){
        this.name=name;

    }
}
public class Prectics12 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Employee2 e=new Employee2();
        e.setname("rohit");
        e.salary=12000;
        System.out.println(e.getsalary());
        e.getname();

    }
}
