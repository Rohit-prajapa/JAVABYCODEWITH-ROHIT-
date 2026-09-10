package FilterAndReduce;

import java.awt.*;
import java.util.List;
import java.util.function.Consumer;

public class FilterAndReduce {
    static void main() {
        List<String> list=List.of("Apple","Banana","Papaya","Orange","Mango");
//        System.out.println(list.size());
//        for (String s : list) {
//            System.out.println(s);
//        }

        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String list) {
                System.out.println(list);
            }
        });
    }
}
