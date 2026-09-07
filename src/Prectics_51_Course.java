import java.util.ArrayList;
import java.util.Scanner;
class course{
    String courseName;
    ArrayList<String> enrollStudent;
    static int maxCapacity=30;

    course(String courseName){
        this.courseName=courseName;
        enrollStudent=new ArrayList<>();
    }
    void enrollStudent(String StudentName){
        if(enrollStudent.size()<maxCapacity){
            enrollStudent.add(StudentName);
            System.out.println(StudentName+" enroll successfully..");
        }
        else{
            System.out.println("Course is Full..");
        }
    }

    void unenrollStudents(String StudentName){
        if(enrollStudent.remove(StudentName)){
            System.out.println(StudentName+" unenroll SuccessFully");
        }
        else{
            System.out.println(StudentName+" is not enrolled");
        }
    }

    static void  setMaxCapacity(int capacity){
        maxCapacity=capacity;
    }
}
public class Prectics_51_Course {
    static void main() {
        Scanner sc=new Scanner(System.in);
        course c1 = new course("Java Programming");

        course.setMaxCapacity(2);

        c1.enrollStudent("Rohit");
        c1.enrollStudent("Amit");
        c1.enrollStudent("Rahul");

        c1.unenrollStudents("Amit");
    }
}
