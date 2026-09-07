import java.util.Scanner;

public class CalculatingAverageMarks {
    static void main() {
        Scanner sc=new Scanner(System.in);

        int[] arr={80,45,78,98,28,87};
        int n=arr.length;

        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        double avg=(double) sum/n;

        System.out.println("The average of the marks is "+avg);
    }
}
