import java.util.Scanner;

public class ArraysIsSortOrNot {
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

        boolean IsSort=true;

      for(int i=0; i<arr.length; i++){
          if(arr[i]>arr[i+1]){
              IsSort=false;
              break;
          }
      }
      if(IsSort==true){
          System.out.println("Arrays is Sort: ");
      }
      else{
          System.out.println("Arrays is Not Sort: ");
      }
    }
}
