import java.util.Scanner;

public class StringBuilderExample {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String[] str={"java"," is "," very "," easy"};
        StringBuilder result=new StringBuilder();
        for(String word:str){
            result.append(word).append(" ");
        }
        System.out.println(result);
    }
}
