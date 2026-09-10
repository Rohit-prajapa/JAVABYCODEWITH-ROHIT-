import java.util.Scanner;

public class addTwoMatrix {
    static void main() {
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.println("Enter the Number of Row of 1st matrix: ");
        n=sc.nextInt();

        int m;
        System.out.println("Enter the Number Of column of 1st matrix: ");
        m=sc.nextInt();

        int[][] arr=new int[n][m];
        System.out.println("Enter "+n*m+" Element ");

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

        int p;
        System.out.println("Enter the Number of row in 2nd Matrix: ");
        p=sc.nextInt();

        int q;
        System.out.println("Enter the Number of column in 2nd Matrix : ");
        q=sc.nextInt();

        int[][] brr=new int[p][q];
        System.out.println("Enter "+p*q+" Element ");

       for(int i=0; i<brr.length; i++){
           for(int j=0; j<brr[i].length; j++){
               brr[i][j]=sc.nextInt();
           }
       }

       for(int i=0; i<brr.length; i++){
           for(int j=0; j<brr[0].length; j++){
               System.out.print(brr[i][j]+" ");
           }
           System.out.println();
       }

       int[][] crr=new int[n][m];

       for(int i=0; i<crr.length; i++){
           for(int j=0; j<crr[i].length; j++){
               crr[i][j]=arr[i][j]+brr[i][j];
           }
       }

       for(int i=0; i<crr.length; i++){
           for(int j=0; j<crr[i].length; j++){
               System.out.print(crr[i][j]+" ");
           }
           System.out.println();
       }

    }
}
