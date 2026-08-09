import java.util.Scanner;

public class FoundElement {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int[] arr={12,3,4,56,89,45,90};

        int n;
        System.out.println("Enter the Number That u want to search: ");
        n=sc.nextInt();

        boolean flag=false;

        for(int ele: arr){
            if(ele==n){
                flag=true;
                break;
            }
        }

        if(flag==true){
            System.out.println("element Present in Arrays: ");
        }
        else{
            System.out.println("Element is not Present In Arrays: ");
        }
    }
}
