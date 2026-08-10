import java.util.Scanner;

public class ArrayAccess {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        int c=0;
        while(true){
            System.out.println("Enter Array Index: ");
            int idx=sc.nextInt();
            try {
                System.out.println("Element is :"+arr[idx]);
                break;
            }
            catch(ArrayIndexOutOfBoundsException e){
                c++;
                System.out.println("Invalid Index: ");

                if(c>5){
                    System.out.println("Error");
                    break;
                }
            }
        }
    }
}
