import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("===== Rock Paper Scissors =====");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        System.out.print("Enter your choice (1-3): ");
        int user = sc.nextInt();

        int computer = random.nextInt(3) + 1;

        String[] choice = {"", "Rock", "Paper", "Scissors"};

        System.out.println("\nYou chose: " + choice[user]);
        System.out.println("Computer chose: " + choice[computer]);

        if (user == computer) {
            System.out.println("Match Draw!");
        } else if ((user == 1 && computer == 3) ||
                (user == 2 && computer == 1) ||
                (user == 3 && computer == 2)) {
            System.out.println("🎉 You Win!");
        } else {
            System.out.println("💻 Computer Wins!");
        }

        sc.close();
    }
}