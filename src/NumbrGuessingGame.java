import java.util.Random;
import java.util.Scanner;

public class NumbrGuessingGame {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int Number=(int)(Math.random()*100)+1;
        int guess;
        int attempt;
        do{
            System.out.println("Enter the Guess Number");
            guess=sc.nextInt();
            if(guess<Number){
                System.out.println("please enter Greater Number!");
            }
            else if(guess>Number){
                System.out.println("Please enter smaller Number!");
            }
            else{
                System.out.println("Congralutation you Guess the Number!");
            }
        }while(guess!=Number);
    }
}
