import java.util.Scanner;

public class PrecticsSet {
//    public static void multiplication(int n){
//        for(int i=1; i<=10; i++){
//            System.out.print(n*i+" ");
//        }
//    }

//    public static void patter(int n){
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static int sum(int n){
//        if(n==1){
//            return 1;
//        }
//        return n+sum(n-1);
//    }
//    public static void pattern(int n){
//        for(int i=1; i<=n; i++){
//            for(int j=1; j<=(n+1-i); j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//    public static int fibbo(int n){
//        if(n==1 || n==2){
//            return 1;
//        }
//        return fibbo(n-1)+fibbo(n-2);
//    }
public static float avg(int ...arr){
    int n=arr.length;
    int  sum=0;
    for(int ele:arr){
        sum=sum+ele;
    }
    return (float) sum/n;
}
    static void main() {
        Scanner sc=new Scanner(System.in);
//        int n;
//        System.out.println("Enter the NUmber: ");
//        n=sc.nextInt();

        //multiplication(n);
       // patter(n);

//        int c=sum(n);
//        System.out.println("sum is :"+c);
//        pattern(n);

//        int c=fibbo(n);
//        System.out.println(c);
        float c=avg(2,3,4,5);
        System.out.println(c);

        float d=avg(3,4,5,6,7,8);
        System.out.println(d);
    }
}
