import java.util.Scanner;
class myEmployee{
   private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
     public int getId(){
        return id;
     }
    public void setId(int id){
        this.id=id;
    }
}
public class Prectcs21 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        myEmployee e=new myEmployee();
//        e.id=12;
//        e.name="Rohit"; not acecssible due to private access modifier
        e.setName("Rohit Prajapati");
        System.out.println(e.getName());

        e.setId(102);
        System.out.println(e.getId());


    }
}
