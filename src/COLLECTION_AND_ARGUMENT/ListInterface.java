package COLLECTION_AND_ARGUMENT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListInterface {
    static void main() {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
//        System.out.println(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
