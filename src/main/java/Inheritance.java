import java.util.Scanner;
class Animal{
    void eat(){
        System.out.println("Animal are eat:  ");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog are  bark: ");
    }
}
public class Inheritance {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Dog d=new Dog();
        d.bark();
        d.eat();
    }
}
