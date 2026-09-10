package COLLECTION_AND_ARGUMENT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestingCollection {
    static void main() {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(-76);
        list.add(25);

        for (Integer i : list) {
            System.out.print(i+" ");
        }

        Collections.sort(list);

        System.out.print(list+" ");
    }
}
