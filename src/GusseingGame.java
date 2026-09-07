import java.util.Random;
import java.util.Scanner;

public class GusseingGame {
    static void main() {
        Scanner sc=new Scanner(System.in);

        Random random=new Random();
        int n=random.nextInt(100)+1;
        int guess;
        do{
            System.out.println("Guess the Number From (1-100)");
            guess=sc.nextInt();
            if(guess<n){
                System.out.println("guess Gretare NUmber");
            }
            else if (guess>n){
                System.out.println("pleas Guess smaller Number");
            }
            else{
                System.out.println("Congrulation you guess the number!");
            }
        }while(n!=100);
    }
}
