package string;

import java.util.Scanner;

import static java.lang.Character.isUpperCase;

public class InputValidation {
    public static void main(String[] args) {


        //## Input validation

        //we typically do input verification against various rules and conditions when we receive data from the user.
        //Write an application that returns `"Input Error"` if the input string is too long
        // (longer than 10 characters),
        //or `"OK"` if the input complies with the rules.


        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        char [] x = word.toCharArray();


        System.out.println(x.length > 10 ? "ok" : "Error");

        System.out.println(x.length > 5 && x.length < 10? "ok" : "Error");

        System.out.println(x.length > 4 && x.length < 8? "ok" : "Error");

        System.out.println(Character.isDigit(x[0])? "ok" : "Error");

        System.out.println(word.contains("chen")? "ok" : "Error");

        System.out.println(word.endsWith(":")? "ok" : "Error");

        System.out.println(word.equals(word.toUpperCase())? "ok" : "Error");



     //The input string must contain the characters '(' and ')'. And the ')' must come after the '('.

/*
boolean containsParentheses = false;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count > 0) {
                    containsParentheses = true;
                    break;
                }
            }
        }

        if (containsParentheses) {
            System.out.println("The string contains parentheses in the correct order.");
        } else {
            System.out.println("The string does not contain parentheses in the correct order.");
        }
 */
    }


}
