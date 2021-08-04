/**
 * Two Number Sum
 * 
 * Write a function that takes in a non-empty array of distinct integers and an integer representing a target
 * sum. If any two numbers in the input array sum up to the largest sum, the function should return them in
 * an array, in any order. If no two numbers sum up to the largest sum, the function should return an empty
 * array.
 * 
 * Note that the target sum has to be obtained by summing two different integers in an array; you can't add
 * a single integer to itself in order to obtain the target sum.
 * 
 * You can assume that there will be at most one pair of numbers summing up to the target sum.
 * 
 * Instructions copied from:
 * https://www.algoexpert.io/questions/Two%20Number%20Sum
 */

import java.util.Scanner;

public class TwoNumberSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {

            int result[] = {0,0};
            Boolean emptyArray = true;
            
            for (int i = 0; i < array.length - 1 && emptyArray == true; i++) {
                for (int j = i + 1; j < array.length && emptyArray == true; j++) {
                    if (array[i] + array[j] == targetSum) {
                        result[0] = array[i];
                        result[1] = array[j];
                        emptyArray = false;
                    }
                }
            }
            
            if (emptyArray == true)
                return new int[0];
            else
                return result;
      }

      public static void main(String[] args) {

        System.out.println("Input your own array or run test cases?\n1. Input array\n2. Run test cases");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("How many numbers are in your array?");
            int arraySize = scanner.nextInt();
            int userArray[] = new int[arraySize];
            int nextNumber;
            for (int i = 0; i < arraySize; i++) {
                System.out.println("Number " + i + ": ");
                nextNumber = scanner.nextInt();
                userArray[i] = nextNumber;
            }
            System.out.println("What is your target sum?");
            int userSum = scanner.nextInt();

            int userResult[] = {,};
            userResult = twoNumberSum(userArray, userSum);
            if (userResult.length > 1)
                System.out.println("[" + userResult[0] + ", " + userResult[1] + "]\n");
            else
                System.out.println("[]");

            scanner.close();
        }

        else if (choice == 2) {
            
        //#region Test Cases

        // Case 1
        int testArray[] = {3,5,-4,8,11,1,-1,6};
        int testTargetSum = 10;
        int arrayResult[] = {,};
        arrayResult = twoNumberSum(testArray, testTargetSum);

        System.out.println("Test Case 1");
        System.out.println("Correct Output:");
        System.out.println("[11, -1]");
        System.out.println("Your Output");        
        if (arrayResult.length > 1)
            System.out.println("[" + arrayResult[0] + ", " + arrayResult[1] + "]\n");
        else
            System.out.println("[]");

        // Case 2
        int testArray2[] = {4,6};
        int testTargetSum2 = 10;
        int arrayResult2[] = {,};
        arrayResult2 = twoNumberSum(testArray2, testTargetSum2);

        System.out.println("Test Case 2");
        System.out.println("Correct Output:");
        System.out.println("[4, 6]");
        System.out.println("Your Output");        
        if (arrayResult2.length > 1)
            System.out.println("[" + arrayResult2[0] + ", " + arrayResult2[1] + "]\n");
        else
            System.out.println("[]");

        // Case 3
        int testArray3[] = {4, 6, 1};
        int testTargetSum3 = 5;
        int arrayResult3[] = {,};
        arrayResult3 = twoNumberSum(testArray3, testTargetSum3);

        System.out.println("Test Case 3");
        System.out.println("Correct Output:");
        System.out.println("[4, 1]");
        System.out.println("Your Output");        
        if (arrayResult3.length > 1)
            System.out.println("[" + arrayResult3[0] + ", " + arrayResult3[1] + "]\n");
        else
            System.out.println("[]");

        // Case 4
        int testArray4[] = {4, 6, 1, -3};
        int testTargetSum4 = 3;
        int arrayResult4[] = {,};
        arrayResult4 = twoNumberSum(testArray4, testTargetSum4);

        System.out.println("Test Case 4");
        System.out.println("Correct Output:");
        System.out.println("[6, -3]");
        System.out.println("Your Output");        
        if (arrayResult4.length > 1)
            System.out.println("[" + arrayResult4[0] + ", " + arrayResult4[1] + "]\n");
        else
            System.out.println("[]");

        // Case 5
        int testArray5[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int testTargetSum5 = 17;
        int arrayResult5[] = {,};
        arrayResult5 = twoNumberSum(testArray5, testTargetSum5);

        System.out.println("Test Case 5");
        System.out.println("Correct Output:");
        System.out.println("[8, 9]");
        System.out.println("Your Output");        
        if (arrayResult5.length > 1)
            System.out.println("[" + arrayResult5[0] + ", " + arrayResult5[1] + "]\n");
        else
            System.out.println("[]");

        // Case 6
        int testArray6[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 15};
        int testTargetSum6 = 18;
        int arrayResult6[] = {,};
        arrayResult6 = twoNumberSum(testArray6, testTargetSum6);

        System.out.println("Test Case 6");
        System.out.println("Correct Output:");
        System.out.println("[3, 15]");
        System.out.println("Your Output");        
        if (arrayResult6.length > 1)
            System.out.println("[" + arrayResult6[0] + ", " + arrayResult6[1] + "]\n");
        else
            System.out.println("[]");

        // Case 7
        int testArray7[] = {-7, -5, -3, -1, 0, 1, 3, 5, 7};
        int testTargetSum7 = -5;
        int arrayResult7[] = {,};
        arrayResult7 = twoNumberSum(testArray7, testTargetSum7);

        System.out.println("Test Case 7");
        System.out.println("Correct Output:");
        System.out.println("[-5, 0]");
        System.out.println("Your Output");        
        if (arrayResult7.length > 1)
            System.out.println("[" + arrayResult7[0] + ", " + arrayResult7[1] + "]\n");
        else
            System.out.println("[]");

        // Case 8
        int testArray8[] = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int testTargetSum8 = 163;
        int arrayResult8[] = {,};
        arrayResult8 = twoNumberSum(testArray8, testTargetSum8);

        System.out.println("Test Case 8");
        System.out.println("Correct Output:");
        System.out.println("[210, -47]");
        System.out.println("Your Output");        
        if (arrayResult8.length > 1)
            System.out.println("[" + arrayResult8[0] + ", " + arrayResult8[1] + "]\n");
        else
            System.out.println("[]");

        // Case 9
        int testArray9[] = {-21, 301, 12, 4, 65, 56, 210, 356, 9, -47};
        int testTargetSum9 = 164;
        int arrayResult9[] = {,};
        arrayResult9 = twoNumberSum(testArray9, testTargetSum9);           

        System.out.println("Test Case 9");
        System.out.println("Correct Output:");
        System.out.println("[]");
        System.out.println("Your Output");        
        if (arrayResult9.length > 1)
            System.out.println("[" + arrayResult9[0] + ", " + arrayResult9[1] + "]\n");
        else
            System.out.println("[]");

        // Case 10
        int testArray10[] = {3, 5, -4, 8, 11, 1, -1, 6};
        int testTargetSum10 = 15;
        int arrayResult10[] = {,};
        arrayResult10 = twoNumberSum(testArray10, testTargetSum10);            

        System.out.println("Test Case 10");
        System.out.println("Correct Output:");
        System.out.println("[]");
        System.out.println("Your Output");       
        
        if (arrayResult10.length > 1)
            System.out.println("[" + arrayResult10[0] + ", " + arrayResult10[1] + "]\n");
        else
            System.out.println("[]");

        // Case 11
        int testArray11[] = {14};
        int testTargetSum11 = 15;
        int arrayResult11[] = {,};
        arrayResult11 = twoNumberSum(testArray11, testTargetSum11);

        System.out.println("Test Case 11");                                     
        System.out.println("Correct Output:");
        System.out.println("[]");
        System.out.println("Your Output");        
        if (arrayResult11.length > 1)
            System.out.println("[" + arrayResult11[0] + ", " + arrayResult11[1] + "]\n");
        else
            System.out.println("[]");

        // Case 12
        int testArray12[] = {15};
        int testTargetSum12 = 15;
        int arrayResult12[] = {,};
        arrayResult12 = twoNumberSum(testArray12, testTargetSum12);

        System.out.println("Test Case 12");
        System.out.println("Correct Output:");                 
        System.out.println("[]");
        System.out.println("Your Output");        
        if (arrayResult12.length > 1)
            System.out.println("[" + arrayResult12[0] + ", " + arrayResult12[1] + "]\n");
        else
            System.out.println("[]");

        //#endregion

        }

        else
            System.exit(0);         

      }
}
