import java.util.Scanner;
abstract class pen{
    abstract void write();
    abstract void refill();
}

class Ballpen extends pen{
    public void write(){
        System.out.println("You can write: ");
    }

    public void refill(){
        System.out.println("You can refill the Pen");
    }
}

class fountainpen extends pen{
    public void write(){
        System.out.println("you can write: ");
    }

    public void refill(){
        System.out.println("you can refill");
    }

    public void cangeNib(){
        System.out.println("you can change Nib");
    }
}
public class Prectics41 {
    static void main() {
        Scanner sc=new Scanner(System.in);
//        Ballpen p=new Ballpen();
//        p.write();
//        p.refill();

        fountainpen p=new fountainpen();
        p.write();
        p.refill();
        p.cangeNib();
    }
}
