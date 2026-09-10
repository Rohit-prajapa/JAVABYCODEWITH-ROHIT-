package COLLECTION_AND_ARGUMENT;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestingSet {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println(set);
        System.out.println(set.remove(10));
        System.out.println(set.contains(20));
        System.out.println(set.size());
    }
}
