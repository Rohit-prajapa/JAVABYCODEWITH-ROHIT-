import java.util.Scanner;
import calculator.Calculator;
import calculator.ScCalculator;
import calculator.HybridCalculator;
public class Prectics65 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Calculator c=new Calculator();
        ScCalculator Sc=new ScCalculator();
        HybridCalculator hy=new HybridCalculator();

        System.out.println("Addition: " + c.sum(10, 5));
        System.out.println("Subtraction: " + c.subTract(10, 5));

        System.out.println("Square Root: " + Sc.squareRoot(25));
        System.out.println("Cube root is "+Sc.CubeRoot(4));

        System.out.println("Multiplication: " + hy.multiply(10, 5));
        System.out.println("Division: " + hy.divide(10, 5));
    }
}
