import java.util.Scanner;
class Ekclass{
    int a;
    public int getA(){
        return a;
    }
   public Ekclass(int a){
        this.a=a;
    }
}
public class Prectics26 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Ekclass e=new Ekclass(5);
        System.out.println(e.getA());
    }
}
