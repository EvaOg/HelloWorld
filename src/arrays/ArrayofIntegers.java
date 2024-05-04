package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayofIntegers {
    public static void main(String[] args) {
        /*
        Implement the following ideas within one class. Use one method for each subtask:

        remove duplicates from an array of integers.
        sort an array of integers in descending order.
        find the longest consecutive sequence of elements in an array of integers.
        find the intersection of two arrays of integers. */

        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};

        // find the average of elements ("median") in an array of integers.
        findMedian(input);
        //rotate an array of integers by a given number of positions. E.g. {1, 2, 3, 4 ,5} rotated by 2 is {5, 4, 1, 2, 3}
        rotateArray(input);
        //remove duplicates from an array of integers.
        removeDublicates(input);
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
        int length = 0;
        for (int i = 1; i < input.length; i++) {
            if(input[i] > input[i-1]) {
                length ++;
            }
        }
        int[] newInput = new int[length];
        for (int i = 1; i < input.length; i++) {
            if(input[i] > input[i-1]) {
                newInput[i - 1] = input[i];
            }
        }
        System.out.println(Arrays.toString(newInput));
        input = newInput;
        return input;
    }

}
