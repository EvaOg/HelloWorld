package arrays;

import java.util.Arrays;

public class IsnbValidation {

    private static int number13;

    public static void main(String[] args) {

        //public static int calculateChecksumISBN13(int[] digits) { ... }
        int[] isbn12 = new int[] {9, 7, 8, 6, 0, 0, 1, 1, 9, 1, 2, 5};
        int[] isbn14 = new int[] {9, 7, 8, 6, 0, 0, 1, 1, 9, 1, 2, 5};


        calculateChecksumISBN13(isbn12, isbn14);
        System.out.println(number13);

    }

    private static int calculateChecksumISBN13(int[] isbn12, int[] isbn14) {
        int sum = 0;
        for (int i = 1; i < isbn12.length; i += 2) {
            isbn14[i] = isbn12[i] * 3;
        }
        System.out.println(isbn14);
        for (int i = 0; i < isbn14.length; i ++) {
            sum += isbn14[i];
        }
        System.out.println(Arrays.toString(isbn14));
        System.out.println(sum);

        return number13 = sum % 9;
    }



}
