package COLLECTION_AND_ARGUMENT.MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Country {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Map<String,String> map=new HashMap<>();
        map.put("India","Delhi");
        map.put("China","Shiong");
        map.put("USA","Washington DC");
        map.put("France","Peris");
        map.put("japan","Tokyo");
        map.put("Grmany","Berline");

        String str;
        System.out.println("Enter th Country Name: ");
        str=sc.nextLine();

        if(map.containsKey(str)){
            System.out.println("Capital is :"+map.get(str));
        }
        else{
            System.out.println("Country not found");
        }
    }
}
