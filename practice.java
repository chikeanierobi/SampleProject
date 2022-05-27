import java.io.*;
import java.util.Scanner;
public class practice{
    public static void main(String[] argv){
        int[] array1;
        int array2[] = new int[10];
        Scanner scnr = new Scanner(System.in);
        System.out.println("First java program! Let's see who the author of the program is");

        System.out.println("Enter first name of the author of the program: ");
        String fName = scnr.next();

        System.out.println("Enter last name of the author of the program: ");
        String lName = scnr.next();

        System.out.println("Enter your age: ");
        int age = scnr.nextInt();

        System.out.println("Enter your 11-digit phone number: ");
        long phoneNum = scnr.nextLong();

        int countryCode;
        int areaCode;
        int prefix;
        int lineNum;

        lineNum = (int) (phoneNum % 10000);
        System.out.print(lineNum);
        phoneNum /= 10000;
        prefix = (int) (phoneNum % 1000);
        phoneNum /= 1000;
        areaCode = (int) (phoneNum % 1000);
        countryCode = (int) (phoneNum / 1000);
        

        System.out.println("Author of the program is " + lName.toUpperCase() + " , " + fName);
        System.out.printf("The author is %d years old", age);
        System.out.println("");
        System.out.println("The author can be reached at " + "+ " + countryCode + " (" + areaCode + ") " + prefix + "-" + lineNum);

        System.out.println("Now we can go ahead.");
        
        
        for (int i = 0; i < array2.length; i++){
            System.out.println("Enter a number from 1 to 100");
            int userNum;
            // Scanner scnr1 = new Scanner(System.in);
            userNum = scnr.nextInt();
            if ((userNum >= 0) && (userNum <= 100)){
                array2[i]=userNum;
            }
            else{
                System.out.println("Error!!! Number is not within specified range, please enter a valid number");
                i--;
            }
            //scnr1.close();
        }

        for (int i = 0; i < array2.length; i++){
            System.out.println("Number " + (i+1) + " in array : " + array2[i]);
        }
    }
}