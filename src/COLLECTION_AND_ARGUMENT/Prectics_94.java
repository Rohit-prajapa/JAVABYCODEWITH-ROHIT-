package COLLECTION_AND_ARGUMENT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prectics_94 {
    static void main() {
        Scanner sc=new Scanner(System.in);

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        Collections.reverse(list);

        System.out.println(list);
    }
}
