import java.util.Scanner;
class TommyVecetti{

    public void hit(){
        System.out.println("Hitting..........");
    }

    public void run(){
        System.out.println("Running..........");
    }
    public void fire(){
        System.out.println("Firring........");
    }

}
public class Prectics16 {
    static void main() {
        Scanner sc=new Scanner(System.in);

        TommyVecetti t=new TommyVecetti();
        t.hit();
        t.run();
        t.fire();

    }
}
