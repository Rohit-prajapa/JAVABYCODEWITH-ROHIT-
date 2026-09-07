import java.util.Scanner;

public class DiceRoll {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int DiceRoll=(int)(Math.random()*6)+1;
        System.out.println(DiceRoll);
    }
}
