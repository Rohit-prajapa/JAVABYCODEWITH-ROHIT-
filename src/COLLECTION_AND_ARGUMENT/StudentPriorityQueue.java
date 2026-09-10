package COLLECTION_AND_ARGUMENT;

import java.util.PriorityQueue;
import java.util.Scanner;
class Student{
    String name;
    int grade;

    Student(String name, int grade){
        this.name=name;
        this.grade=grade;
    }
    @Override
    public String toString() {
        return "Name is :"+name+" Grade is :"+grade;
    }
}
public class StudentPriorityQueue {
    static void main() {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Student> queue =
                new PriorityQueue<>((s1, s2) ->
                        Integer.compare(s2.grade, s1.grade));
        queue.add(new Student("Rohit",89));
        queue.add(new Student("Ravi",90));
        queue.add(new Student("Ankit",40));

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }
}
