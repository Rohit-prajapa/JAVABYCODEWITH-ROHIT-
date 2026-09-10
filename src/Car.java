import java.util.Scanner;

public class Car {
    int noOfWheels;
    double FuelInLiters;
    String name;
    String color;

    public void driver(){
        System.out.println("Car is Drive: ");
    }

    public String Name(String name){
        return name;
    }

    static void main() {
        Scanner sc=new Scanner(System.in);

        Car c=new Car();
        c.driver();
    }
}
