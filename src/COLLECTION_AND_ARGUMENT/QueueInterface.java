package COLLECTION_AND_ARGUMENT;

import java.util.*;

public class QueueInterface {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
//        for(int i:q){
//            System.out.println(i);
//        }
        System.out.println(q.peek());
        System.out.println(q.remove());
    }

    public static class Prectics_90 {
        static void main() {
            Scanner sc=new Scanner(System.in);
            List<String> list=new ArrayList<>();
            list.add("Rohit");
            list.add("Prajapati");
            list.add("Varanasi");
            list.add("Babtpur");

    //        for (String s : list) {
    //            System.out.println(s);
    //        }

            Collections.reverse(list);
            System.out.println(list);
        }
    }
}
