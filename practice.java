import java.io.*;
import java.util.Scanner;
public class practice{
    public static void main(String[] argv){
        Scanner scnr = new Scanner(System.in);
        System.out.println("First java program!");

        System.out.println("Enter first name of the author of the program: ");
        String fName = scnr.next();

        System.out.println("Enter last name of the author of the program: ");
        String lName = scnr.next();

        System.out.println("Enter your age: ");
        int age = scnr.nextInt();

        System.out.println("Author of the program is " + lName.toUpperCase() + " , " + fName);
        System.out.printf("The author is %d years old", age);

    }
}