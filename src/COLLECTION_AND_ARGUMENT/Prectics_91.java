package COLLECTION_AND_ARGUMENT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prectics_91 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(45);
        list.add(10);
        list.add(12);
        list.add(10);

//        System.out.println(list.contains(10));
        for (Integer i : list) {
            System.out.print(i+" ");
        }
        System.out.println();
        int ele;
        System.out.println("Enter the element that u want to count");
        ele=sc.nextInt();

        int count=0;
        for (Integer i : list) {
            if(i==ele){
                count++;
            }
        }
        System.out.println(count);
    }
}
