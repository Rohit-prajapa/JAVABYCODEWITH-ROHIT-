import java.util.Scanner;
class cellphone{
    public void ring(){
        System.out.println("Rining................");
    }
    public void vibrate(){
        System.out.println("Vibrating.....................");
    }
    public void callFriends(){
        System.out.println("Calling To Friends:");
    }
}
public class Prectics13 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        cellphone cl=new cellphone();
        cl.ring();
        cl.vibrate();
        cl.callFriends();

    }
}
