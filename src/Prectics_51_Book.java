import java.util.Scanner;
class Book{
    String Title;
    String Author;
    String isbn;

    static int totalBook=0;

    Book(String Title,String Author, String isbn){
        this.Title=Title;
        this.Author=Author;
        this.isbn=isbn;
        totalBook++;
    }
    void borrowBook(){
        System.out.println(Title+" Book has been Issues");
    }

    void returnBook(){
        System.out.println(Title+" Book has been return");
    }
    static int getTotalBook(){
        return totalBook;
    }
}
public class Prectics_51_Book {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Book b1=new Book("java Programming","james","102");
        Book b2=new Book("python","john","101");
        b1.borrowBook();
        b1.returnBook();
        System.out.println("TOtal Book is :"+Book.getTotalBook());
    }
}
