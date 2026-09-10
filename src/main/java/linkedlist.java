import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(90);
        l2.add(80);
        l2.add(70);

        l1.add(10);
        l1.add(20);
        l1.add(10);
        l1.add(40);

        l1.add(3, 40);

        l1.addAll(l2);

        System.out.println(l1.contains(10));
        System.out.println(l1.indexOf(90));

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        sc.close();
    }
}