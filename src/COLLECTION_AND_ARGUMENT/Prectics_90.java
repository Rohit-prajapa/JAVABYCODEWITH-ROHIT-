package COLLECTION_AND_ARGUMENT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prectics_90 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        list.add("Rohit");
        list.add("java");
        list.add("Html");
        list.add("Css");
        list.add("JavaScript");

        for (String s : list) {
            System.out.print(s+" ");
        }

        Collections.sort(list);

        System.out.println(list);
    }
}
