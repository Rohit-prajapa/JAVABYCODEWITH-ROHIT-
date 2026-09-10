import java.util.Scanner;
class Library1{
    String[] book;
    int no_of_book;
    Library1(){
        this.book=new String[100];
        this.no_of_book=0;
    }

    void addBook(String book){
        this.book[no_of_book]=book;
        no_of_book++;
        System.out.println(book+" is added! ");
    }

    void showavailable(){
        System.out.println("Available Book are ");
        for(String book:this.book){
            if(book==null){
                break;
            }
            System.out.println("* "+book);
        }
    }
}
public class Prectics61 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Library1 l=new Library1();
        l.addBook("Java Programming ");
        l.addBook("CPP ");
        l.addBook("Python ");
        l.showavailable();

    }
}
