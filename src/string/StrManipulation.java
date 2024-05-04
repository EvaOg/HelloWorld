package string;

import java.util.Arrays;
import java.util.Scanner;



public class StrManipulation {

    public static void deleteFirstNumbers(String str) {
        System.out.println(str.startsWith("+49")? str.substring(3): str);
    }

    public static void deleteDots(String str) {
        System.out.println(str.contains(".")? str.replace(".", ""): str);
    }

    private static void deleteNegativeNumbers(String str3) {
        String newStr3 = str3.replace(".", "");
        String[] arr3 = newStr3.split(",\\s");
        int [] arrInt = new int[arr3.length];

        for(int i=0; i<arr3.length; i++) arrInt[i] = Integer.parseInt(arr3[i]);

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] < 0) {
                arrInt[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arrInt));
    }

    private static void addDot(String str3){
        String[] arr3 = str3.split(",\\s");

        if (!(arr3[arr3.length - 1].equals("."))) {
            String[] newArray = new String[arr3.length + 1];
            for (int i = 0; i < arr3.length; i++) {
                newArray[i] = arr3[i];
                newArray[newArray.length - 1] = ".";
            }
            System.out.print(Arrays.toString(newArray));
        }
    }


    public static void main(String[] args) {

        //In the following exercises you need to clean the input by removing certain parts of the provided string.
        //Every step is independent and can be implemented separately.


        String str = "+49891.23.456";
        String str2 = "123.45.678";
        String str3 = "123, 45, -34.231, 0, -1, -12312, 12312, 23423";

        deleteFirstNumbers(str); //When the input starts with „+49“, remove that part. For example „+4989123456“ becomes „89123456“.

        deleteDots(str2); //Remove all dots '.' from the input, e.g. "127.0.0.1" should become 127001

        deleteNegativeNumbers(str3);
        // String of numbers my contain negative numbers. E.g.
        // "123, 45, -34.231, 0, -1, -12312, 12312, 23423". Replace all negative values with null (“0”).
        // A new, comma separated string should be created, e.g.
        // "123,45,0,231,0,0,0,12312,23423".  Also, all spaces should be removed, if any.

        addDot(str3); // Add a dot at the end, if there is no



    }
}
