import java.util.Scanner;

public class Maximumnumber {
    static void main() {
        Scanner sc=new Scanner(System.in);

        int[] arr={1,2,4,5,6,7,8};
        int max=arr[0];
        for(int nums:arr){
            if(nums>max){
                max=nums;
            }
        }
        System.out.println("maximum element is : "+max);
    }
}
