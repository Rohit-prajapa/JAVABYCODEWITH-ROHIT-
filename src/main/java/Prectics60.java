import java.util.Scanner;
abstract class pen1{
    abstract void write();
    abstract void refill();
}

class Foundtain extends pen1{
    public void write(){
        System.out.println("You are writting...");
    }
    public void refill(){
        System.out.println("You are refill..");
    }
}

class monkey1{
    public void jump(){
        System.out.println("Jumping...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
}

class Human1 extends monkey1{
   public void speak(){
       System.out.println("Speaking....");
    }
}
public class Prectics60 {
    static void main() {
        Scanner sc=new Scanner(System.in);
//        Foundtain f=new Foundtain();
//        f.write();
//        f.refill();
        Human1 h=new Human1();
        h.eat();
        h.speak();
        h.jump();
    }
}
