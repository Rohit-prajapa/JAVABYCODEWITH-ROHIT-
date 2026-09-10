import java.util.Scanner;

public class PrimeOrNot {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Number");
        n=sc.nextInt();

        boolean isprime=true;
        if(n<=1){
            isprime=false;
        }
        for(int i=2; i<=n/2; i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println(n+" is prime ");
        }else{
            System.out.println(n+" is not Prime");
        }
    }
}
