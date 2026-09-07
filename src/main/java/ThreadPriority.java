import java.util.Scanner;
class GoodMorning extends Thread{
    public void run(){
        while(true){
            System.out.println("GoodMorning");
        }
    }
}

class welcome extends Thread{
    public void run(){
        while (true){
            System.out.println("Your are Welcome!");
        }

    }
}
public class ThreadPriority {
    static void main() {
        Scanner sc=new Scanner(System.in);
        GoodMorning g=new GoodMorning();
        welcome w=new welcome();
        g.start();
        w.start();
    }
}
