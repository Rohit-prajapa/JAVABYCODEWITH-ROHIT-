import java.util.Scanner;

public class Website {
    static void main() {
        Scanner sc=new Scanner(System.in);

        String web;
        System.out.println("Enter your Website url: ");
        web=sc.nextLine();

        if(web.equals(".com")){
            System.out.println("It is a commerrial Website: ");
        }
        else if(web.equals(".org")){
            System.out.println("it is a Organization Website ");
        }
        else if(web.equals(".in")){
            System.out.println("Indian Website: ");
        }
        else{
            System.out.println("Invalid Url");
        }
    }
}
