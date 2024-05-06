package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayofIntegers {
    public static void main(String[] args) {

        //Implement the following ideas within one class. Use one method for each subtask:

        //find the longest consecutive sequence of elements in an array of integers.


        int[] arr1 = new int[]{1, 4, 5, 7, 20000, -511, 100, 100, -200, 400, 400, 500};
        int[] arr2 = new int[]{14, 6, 23, 7, 3455, -51, 100, 101, -200, 400, 430};

        // find the average of elements ("median") in an array of integers.
        findMedian(arr1);
        //rotate an array of integers by a given number of positions. E.g. {1, 2, 3, 4 ,5} rotated by 2 is {5, 4, 1, 2, 3}
        rotateArray(arr1);
        //remove duplicates from an array of integers.
        removeDublicates(arr1);
        //sort an array of integers in descending order.
        sortinDescendingOder(arr1);


    }

    private static void findMedian(int[] input) {
        int sum = 0;
        int median;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        median = sum / 2;
        System.out.println(median);
    }


    private static void sortinDescendingOder(int[] input) {
        Arrays.sort(input);

        // Swapping the first half elements with last Half Elements
        for (int i = 0; i < input.length / 2; i++) {

            // Storing the first half elements temporarily
            int temp = input[i];

            // Assigning the first half
            // to the last half
            input[i] = input[input.length - i - 1];

            // Assigning the last half
            // to the first half
            input[input.length - i - 1] = temp;
        }

        System.out.println(Arrays.toString(input));
    }

    private static void rotateArray(int[] input) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int rotateBy = sc.nextInt();
        int startIndex = input.length - rotateBy;
        int[] newInput = new int[input.length];
        int j;
        for (int i = 0; i < input.length; i++) {
            j = (i + startIndex)% input.length;
            newInput[i] = input[j];
        }
        System.out.println(Arrays.toString(newInput));
    }

    private static int[] removeDublicates(int[] input) {
        Arrays.sort(input);
        int newArrLen = 1;
        for (int i = 1; i < input.length; i++) {
            if(input[i] > input[i-1]) {
                newArrLen ++;
            }
        }

        int[] newInput = new int[newArrLen];
        newInput[0] = input[0];
        int j = 1;
        for (int i = 1; i < input.length; i++) {

            if(input[i] > input[i-1]) {
                newInput[j] = input[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newInput));
        return newInput;
    }

}
