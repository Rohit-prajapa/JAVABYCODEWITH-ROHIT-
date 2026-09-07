import java.util.Scanner;

public class BreakExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      while(true){
          System.out.println("Enter Something...");
          String str=sc.nextLine();

          if(str.equalsIgnoreCase("exit")){
              break;
          }
          System.out.println("you enetred :"+str);
      }
    }
}