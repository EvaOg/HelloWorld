package arrays;

import java.util.Arrays;

public class IsnbValidation {

    private static int number13;
    private static boolean isCorrect;

    public static void main(String[] args) {


        /////////////////////////////////First Exercise/////////////////////////

        //public static int calculateChecksumISBN13(int[] digits) { ... }
        int[] isbn12 = new int[] {9, 7, 8, 6, 0, 0, 1, 1, 9, 1, 2, 5};
        int[] isbn14 = new int[] {9, 7, 8, 6, 0, 0, 1, 1, 9, 1, 2, 5};

        calculateChecksumISBN13(isbn12, isbn14);
        System.out.println(number13);


        /////////////////////////////////Second Exercise/////////////////////////

        // creating new array and adding 13th number to it
        int [] isbn13 = new int[isbn12.length + 1];

        for (int i = 0; i < isbn12.length; i++) {
            isbn13[i] = isbn12[i];
        }

        isbn13[12] = number13;

        System.out.println(Arrays.toString(isbn13));



        //convert array into string

        String isbnString = Arrays.toString(isbn13);
        String splitArray = isbnString.replaceAll("[^0-9]", "");

        int[] isbnInt = new int[splitArray.length()];
        for (int i = 0; i < isbnInt.length; i++) {
            isbnInt[i] = Character.getNumericValue(splitArray.charAt(i));
        }

        System.out.println(Arrays.toString(isbnInt));

        System.out.println(isValidISBN13(isbnInt));

    }

    private static boolean isValidISBN13(int[] isbnInt) {
        if (isbnInt[12] != calculateAllNumber(isbnInt)) {
             return false;
        }
         return true;
    }

    static public int calculateAllNumber(int [] isbnInt){
        int sum = 0;
        for (int i = 0; i < isbnInt.length - 1 ; i++) {
            sum += isbnInt[i];
            System.out.print(sum + " ");
        }

        number13 = sum % 9;
        System.out.println("number13 ist " + number13);
        return number13;
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
