package COLLECTION_AND_ARGUMENT.MAP;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {
    static void main() {
        Map<String,Integer> map=new HashMap<>();
        map.put("Apple",10);
        map.put("Banana",20);
        map.put("Orange",30);
        map.put("Mango",50);
//        System.out.println(map);
        System.out.println(map.get("Apple"));
        System.out.println(map.containsKey("Banana"));
        System.out.println(map.size());
        for (String s : map.keySet()) {
            System.out.println(s+" "+map.get(s));
        }
    }
}
