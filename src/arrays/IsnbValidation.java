package arrays;

import java.util.Arrays;

public class IsnbValidation {
    public static void main(String[] args) {
        /*You probably know about the International Standard Book Number (ISBN) which is used to identify books.
        There are two variants of the ISBN:

        ISBN-10: consists of 10 digits
        ISBN-13: consists of 13 digits
        In most of the books in Germany the variant ISBN-13 is used.

        Create a class with a main-method, which should call two different methods (implemented by you):

        1. public static int calculateChecksumISBN13(int[] digits) { ... }
        This method shall calculate the 13th digit (which is the checksum) for 12 digits that are passed as parameter array digits.
        The checksum shall be returned

        2. public static boolean isValidISBN13(String isbn) { ... }
        This method shall check a String parameter isbn if it is a valid ISBN13 number.
        Therefore you'll need to convert the String into an int-Array, pass the first twelve elements of this array to the
         calculateChecksumISBN13() method and compare the result to the 13th number. Try to be as error tolerant as possible when converting the String.
         */


        //public static int calculateChecksumISBN13(int[] digits) { ... }
        int[] isbn13 = new int[] {9, 7, 8, 6, 0, 0, 1, 1, 9, 1, 2, 5};
        int[] isbn14 = new int[] {9, 7, 8, 6, 0, 0, 1, 1, 9, 1, 2, 5};
        calculateChecksumISBN13(isbn13, isbn14);


        //2. Delete symbols
        /*String isbn1WithoutHyphens = isbn1.replaceAll("-", "");
        System.out.println(isbn1WithoutHyphens);

        //3. convert to an array of int
        int[] isbnInt = new int[isbn1WithoutHyphens.length()];

        for (int i = 0; i < isbn1WithoutHyphens.length(); i++) {
            isbnInt[i] = Character.getNumericValue(isbn1WithoutHyphens.charAt(i));
        }

        System.out.println(Arrays.toString(isbnInt));

        //4. calculate the sum

        int sum = 0;
        for (int i = 0; i < isbnInt.length; i++) {
            sum += isbnInt[i];
        }
        System.out.println(sum);*/

    }

    private static int calculateChecksumISBN13(int[] isbn13, int[] isbn14) {
        int sum = 0;
        int number13;

        for (int i = 1; i < isbn13.length; i += 2) {
            isbn14[i] = isbn13[i] * 3;
        }
        for (int i = 0; i < isbn14.length; i ++) {
            sum += isbn14[i];
        }

        number13 = sum % 9;
        System.out.println(number13);
        return number13;
    }
}
