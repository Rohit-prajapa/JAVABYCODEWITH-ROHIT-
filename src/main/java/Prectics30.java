import java.util.ArrayList;
import java.util.Scanner;
class Library{
    ArrayList<String> avilableBook=new ArrayList<>();
    ArrayList<String> issuedBook=new ArrayList<>();

    void addBook(String book){
        avilableBook.add(book);
        System.out.println(book+" is added to library");
    }

    void setIssuedBook(String book){
        if(avilableBook.contains(book)){
            avilableBook.remove(book);
            issuedBook.add(book);
            System.out.println(book+" is issued: ");
        }
        else{
            System.out.println(book+" is Not issued: ");

        }
    }
    void issueBook(String book) {
        if (avilableBook.contains(book)) {
            avilableBook.remove(book);
            avilableBook.add(book);
            System.out.println(book + " has been issued.");
        } else {
            System.out.println(book + " is not available.");
        }
    }

    void returnBook(String book){
        if(issuedBook.contains(book)){
            issuedBook.remove(book);
            avilableBook.add(book);
            System.out.println(book+" has been returned: ");
        }
        else{
            System.out.println(book+" was Not issue ");
        }
    }

    void showAvailableBooks() {
        System.out.println("Available Books:");

        if ( avilableBook.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (String book :  avilableBook) {
                System.out.println(book);
            }
        }
    }
}
public class Prectics30 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        library.addBook("java Programming");
        library.addBook("Python Programming");
        library.addBook("CPP Programming ");

        library.showAvailableBooks();
        library.issueBook("java Programming");
        library.showAvailableBooks();
        library.returnBook("java Programming");
        library.showAvailableBooks();

    }
}
