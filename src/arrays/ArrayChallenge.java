package arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
    printArray(sortIntegers(getIntegers(arrayLength())));
    }

    public static int arrayLength() {
        int arrayLength;
        System.out.println("Enter an integer to set array length");
        arrayLength = getNumber();
        return arrayLength;
    }

    private static int getNumber() {
        int number;
        while (true) {

            try {
                Scanner sc = new Scanner(System.in);
                number = sc.nextInt();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Error. Enter an Integer");
            }
        }
        return number;
    }

    public static int[] getIntegers(int arrayLength)
    {   int[] numbers = new int[arrayLength];
        System.out.println("Enter Integers to add to an array");
        for (int i = 0; i < arrayLength; i++) {
            numbers[i] = getNumber();
            System.out.println("Element " + i + " = "+ numbers[i]);
        }
        return numbers;
    }
    public static int[] sortIntegers(int[] integerArray) {
        int[] sortedArray = Arrays.copyOf(integerArray, integerArray.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < integerArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                temp = sortedArray[i];
                sortedArray[i] = sortedArray[i+1];
                sortedArray[i+1] = temp;
                flag = true;
                }
            }

        }
        return sortedArray;

    }
    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
}
