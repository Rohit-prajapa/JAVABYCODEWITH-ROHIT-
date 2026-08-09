import java.util.Scanner;

public class Varag {
//    public static int sum(int a, int b){
//        return a+b;
//    }
//    public static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    public static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
  public static int sum(int ...arr){
        int res=0;
        for(int ele:arr){
            res+=ele;
        }
        return res;
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));


    }
}
