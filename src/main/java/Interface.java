import java.util.Scanner;
interface byclycle{
    public void applyBreak(int Decrement);
    public void speedup(int increment);
}

class AoneCycle implements byclycle{
    void horn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBreak(int Decrement){
        System.out.println("ApplyBrak");
    }
    public void speedup(int increment){
        System.out.println("SpeedUp");
    }
}
public class Interface {
    static void main() {
        Scanner sc=new Scanner(System.in);
    }
}
