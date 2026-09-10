import java.util.Scanner;

public class ElementOccurrence {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int[] arr = {10, 20, 10, 30, 10, 40, 50};
        System.out.println("Enter the number that u want to fine");
        int target=sc.nextInt();
        int count=0;
        for(int num:arr){
            if(num==target){
                count++;
            }
        }
        System.out.println("occurance is :"+count);
    }
}
