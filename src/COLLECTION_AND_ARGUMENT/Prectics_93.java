package COLLECTION_AND_ARGUMENT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prectics_93 {
    public static void swap( List<Integer> list,int idx1, int idx2){
        Collections.swap(list,idx1,idx2);
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Befour swapping :"+list);

        swap(list,1,3);
        System.out.println("after swapping :"+list);
    }
}
