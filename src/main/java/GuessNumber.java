import java.util.Random;
import java.util.Scanner;
class Game{
    private int randomNumber;
    private int userNumber;
    private int NoOfGuess=0;

    public Game(){
        Random random=new Random();
        randomNumber=random.nextInt(100)+1;
    }
    public void takeuserInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Guess......");
        userNumber=sc.nextInt();
    }

    public boolean isCorrectNumber(){
        NoOfGuess++;
        if(userNumber==randomNumber){
            System.out.println("Congratulation You Guess the Number");
            return true;
        }
        else if(randomNumber>userNumber){
            System.out.println("please Enter Higher Number:");
        }
        else{
            System.out.println("Please Enter lower Number: ");
        }
        return false;
    }
    public int getNoOfGuess(){
        return NoOfGuess;
    }

    public void setNoOfGuess(int NoofGuess){
        this.NoOfGuess=NoofGuess;
    }
}
public class GuessNumber {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Game g=new Game();
        do {
            g.takeuserInput();
        } while (!g.isCorrectNumber());

    }
}
