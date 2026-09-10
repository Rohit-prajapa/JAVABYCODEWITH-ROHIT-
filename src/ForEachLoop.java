import java.util.Scanner;

public class ForEachLoop {
    static void main() {
        Scanner sc=new Scanner(System.in);

        String[] name=new String[]{
                "Rahul","Sohan","Mohan","Shyam"
        };
        printarrya(name);
    }
    public static void printarrya(String[] name){
//        for(int i=0; i<name.length; i++){
//            System.out.print(name[i]+" ");
//        }

        for(String names:name){
            System.out.println(names);
        }
    }
}
