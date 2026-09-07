import java.util.Scanner;

public class MaximumElement {
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

        int mx=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        System.out.println("maximum Element in Arrays is :"+mx);
    }
}
