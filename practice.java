import java.io.*;
import java.util.Scanner;
public class practice{
    public static void main(String[] argv){
        int[] array1 = new int[10];
        int array2[] = {23,435,445,1120,333,555,677,5,554,543,232,112,4350,559,99804,121,34243,545,66,443,2232,445,33,6996,485,4853,3436,458,23,55,45,22343,678,565,453};
        int[][] matrix = {{1,4,5},{55,77,342},{5,66,99},{2,433,21}};
        int matrixB[][] = new int[5][6];
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
        
        
        for (int i = 0; i < array1.length; i++){
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

        for (int i = 0; i < array1.length; i++){
            System.out.println("Number " + (i+1) + " in array : " + array2[i]);
        }

        int divi3 = 0;
        int divi4 = 0;
        int divi5 = 0;
        int divi8 = 0;
        for (int i = 0; i < array2.length; i++){
            if ((array2[i] % 3) == 0){
                divi3 += 1;
            }
            if ((array2[i] % 4) == 0){
                divi4 += 1;
            }
            if ((array2[i] % 5) == 0){
                divi5 += 1;
            }
            if ((array2[i] % 8) == 0){
                divi8 += 1;
            }
        }

        System.out.println("Numbers divisible by 3 in array are " + divi3);
        System.out.println("Numbers divisible by 4 in array are " + divi4);
        System.out.println("Numbers divisible by 5 in array are " + divi5);
        System.out.println("Numbers divisible by 8 in array are " + divi8);

        System.out.println("Elements in matrix");
        System.out.println("----------------------------");
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
    
            }
        }
        System.out.println("");
        for (int i = 0 ; i < matrixB.length ; i++){
            for (int j = 0; j < matrixB[0].length; j++){
                int random;
                System.out.println("Enter a random number:");
                random = scnr.nextInt();
                matrixB[i][j] = random;
            }
        }

        System.out.println("Elements in Matrix B");
        System.out.println("----------------------------");
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0; j < matrixB[0].length; j++){
                System.out.print(matrixB[i][j] + " ");
    
            }
        }
    }

    
}