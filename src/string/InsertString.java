package string;

import java.util.Scanner;

public class InsertString {
    public static void main(String[] args) {

        /*Create an insertString method with the following signature:

        The method shall insert the toInsert String at the specified position of the input.
        Think about error handling if the position is greater than the length of the input.

        input: "Hello"
        toInsert: "Java"
        position: 1
        result: "HJavaello"*/

        System.out.println("Enter smthing: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Enter a letter or a word to insert: ");
        String toInsert = sc.nextLine();

        System.out.println("Choose the position from 0 to " + input.length() + ": ");
        String positionStr = sc.nextLine();
        int position = Integer.parseInt(positionStr);
        if (position < 0 || position > input.length()) {
            System.out.println("Invalid position");
        }
        else {
            System.out.println(insertString(input, toInsert, position));
        }

    }

        public static String insertString(String input, String toInsert, int position) {

            String newStr = (new StringBuilder(input)).insert(position, toInsert).toString();
            return newStr;

        }


}
