package File;

import java.io.FileWriter;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {

        String fileName = "java_Course.txt";

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Welcome to Java Course");

            writer.close();

            System.out.println("File written successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}