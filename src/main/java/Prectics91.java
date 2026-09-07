import java.util.ArrayList;
import java.util.Scanner;

public class Prectics91 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(90);
        l2.add(80);
        l2.add(70);

        l1.add(10);
        l1.add(20);
        l1.add(10);
        l1.add(40);
        l1.add(3,40);
        l1.addAll(l2);
        System.out.println(l1.contains(10));
        System.out.println(l1.indexOf(90));
        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i));
        }
    }
}
