import java.util.Scanner;

public class ReverseArrays2DArrays {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Row: ");
        n=sc.nextInt();

        int m;
        System.out.println("Enter the Number of column: ");
        m=sc.nextInt();

        int[][] arr=new int[n][m];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0; i<arr.length; i++){
            for(int j=arr[i].length-1; j>=0; j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
