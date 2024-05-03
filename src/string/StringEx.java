package string;

import java.util.Arrays;

public class StringEx {
    public static void main(String[] args) {


        // 1. Write a program which prints the following character array with a reverse for loop.
        //   `char[] name = {'A', 'W', ' ', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};`

        char[] name = {'A', 'W', ' ', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};

        for (int i = name.length -1; i >= 0; i--) {
            System.out.print(name[i] + " ");
        }

        //2. Write a program that outputs every second character of the array. Output should be `"A cdm"

        for (int i = 0; i < name.length; i += 2) {
            System.out.print(name[i]);
        }

        //3. Write a program which converts the array from exercise 1 into a String and prints it out.

        String str = Arrays.toString(name);
        System.out.print(str);

        // 4. Write a program which converts a String into a char array. Print the array.

        char [] chars = str.toCharArray();
        System.out.println(chars);

        //5. Write a program to convert the String `"1, 2, 4, 9, 8, 7, 6, 4, 1"` into an array of integers.
        // Print the array.

        String str2 = "1, 2, 4, 9, 8, 7, 6, 4, 1";

        String[] arr2 = str2.split(",");

        System.out.println(Arrays.toString(arr2));

        int [] arr3 = new int [arr2.length];

        for(int i=0; i< arr2.length; i++) {

            arr3[i] = Integer.parseInt(arr2[i].trim());

        }

        System.out.println(Arrays.toString(arr3));


    // ## ASCII Table
        // 1. Write a program which prints the ASCII table on screen. Research, what the ASCII table is and how to format it.
        //
        //Hints:
        //- Which characters are part of the ASCII table? 0-127 oder 0-255?
        //- Read more about ASCII: <https://en.wikipedia.org/wiki/ASCII>

        char ch1 = 'a';
        char ch2 = 'b';
// variable that stores the integer value of the character
        int asciivalue1 = ch1;
        int asciivalue2 = ch2;
        System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);
        System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);




    }

}
