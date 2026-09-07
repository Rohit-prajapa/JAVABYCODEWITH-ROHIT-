import java.util.Scanner;

public class MinimumElement {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Element: ");
        n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter "+n+" Element ");

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

        int min=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum Element in Arrays Is :"+min);
    }
}
