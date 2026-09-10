import java.util.Scanner;

public class Minimumelement {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int[] arr={34,76,29,90,54,87};
        int min=arr[0];
        for(int nums:arr){
            if(nums<min){
                min=nums;
            }
        }
        System.out.println("minimum element is :"+min);
    }
}
