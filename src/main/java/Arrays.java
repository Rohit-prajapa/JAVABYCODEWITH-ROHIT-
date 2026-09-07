import java.util.Scanner;

public class Arrays {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of element: ");
        n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("Enter the Arrays Element: ");

        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(arr.length);

        for(int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
