package methods;

import java.util.Arrays;

public class ArrayHelperSet {
    public static void main(String[] args) {

        /*Create a class which should have the following static methods:
        maxNumber(...): A method which receives an integer-array as argument and returns the largest value in the array
        minNumber(...): A method which receives an integer-array as argument and returns the smallest value in the array
        sumArray(...): A method which receives an integer-array as input and returns the sum of all numbers in the array.
        Test these methods in a separate main method.*/

        int[] arr1 = new int[]{1, 4, 5, 7, 20000, -511, 100, 100, -200, 400, 400, 500};

        int max = maxNumber(arr1);
        int min = minNumber(arr1);
        System.out.println(max);
        System.out.println(min);
        int sum = sumArray(arr1);

    }

    private static int sumArray(int[] arr1) {
        return Arrays.stream(arr1).sum();
    }

    private static int minNumber(int[] arr1) {
        int min = Arrays.stream(arr1).min().getAsInt();
        return min;
    }

    private static int maxNumber(int[] arr1) {
        int max = Arrays.stream(arr1).max().getAsInt();
        return max;
    }
}
