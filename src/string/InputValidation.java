package string;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

// Alternatively I can transfer if to a char array: char [] x = word.toCharArray();


        System.out.println(word.length() > 10 ? "ok" : "Error");

        System.out.println(word.length() > 5 && word.length() < 10? "ok" : "Error");

        System.out.println(word.length() > 4 && word.length() < 8? "ok" : "Error");

        System.out.println(word.matches("\\d+")? "ok" : "Error");

        System.out.println(word.contains("chen")? "ok" : "Error");

        System.out.println(word.endsWith(":")? "ok" : "Error");

        System.out.println(word.equals(word.toUpperCase())? "ok" : "Error");



     //The input string must contain the characters '(' and ')'. And the ')' must come after the '('.


        Pattern pattern = Pattern.compile(".*\\(.*\\).*");
        System.out.println((pattern.matcher(word)).find()? "ok" : "Error");


    }



}

