import java.util.Scanner;

public class BankAccount {
    private String account_Number;
    private String account_Holder_Name;
    private double balance;

    public BankAccount(String account_Number, String account_Holder_Name, double balance) {
        this.account_Number = account_Number;
        this.account_Holder_Name = account_Holder_Name;
        this.balance = balance;
    }

    public void deposite(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Amount deposite Successfully ");
        }else{
            System.out.println("Invalid data");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("amount withdraw successfully ");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    public void displaybalance(){
        System.out.println("balance is :"+balance);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        BankAccount b=new BankAccount("12345","Rohit",10000);
        b.deposite(2000);
        b.withdraw(3000);
        b.displaybalance();
    }
}
