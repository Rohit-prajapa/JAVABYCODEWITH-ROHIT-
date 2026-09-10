import java.util.Scanner;
interface BasicAnimal{
    void eat();
    void sleep();
}

class monkey{
    public void eat(){
        System.out.println("Monkey is Eating....");
    }
    public void jump(){
        System.out.println("Monkey is Jumping......");
    }
}

class Human extends monkey implements BasicAnimal{
    public void eat(){
        System.out.println("HUman is Eat...");
    }

    public void sleep(){
        System.out.println("Human is sleeping...");
    }
}
public class Prectics48 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Human h=new Human();
        h.eat();
        h.jump();
        h.sleep();
    }
}
