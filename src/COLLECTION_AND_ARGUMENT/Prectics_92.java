package COLLECTION_AND_ARGUMENT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Prectics_92 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("Cpp");
        list.add("Java");
        list.add("HTML");
        list.add("Java");
        int count= Collections.frequency(list,"Java");
        System.out.println(count);
    }
}
