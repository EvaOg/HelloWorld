package string;

import java.util.Scanner;



public class StrManipulation {

    public static void deleteFirstNumbers(String str) {
        System.out.println(str.startsWith("+49")? str.substring(3): str);
    }

    public static void deleteDots(String str) {
        System.out.println(str.contains(".")? str.replace(".", ""): str);
    }



    public static void main(String[] args) {

        //In the following exercises you need to clean the input by removing certain parts of the provided string.
        //Every step is independent and can be implemented separately.


        String str = "+49891.23.456";
        String str2 = "123.45.678";
        String str3 = "123, 45, -34.231, 0, -1, -12312, 12312, 23423";

        deleteFirstNumbers(str);
        deleteDots(str2);









    }
}
