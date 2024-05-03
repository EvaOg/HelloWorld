package quiz1;

import java.util.Scanner;

public class Rounding_doubles {
    public static void main(String[] args) {

         //Write a program that takes a `double` as input and rounds it to the nearest `int`

        System.out.println("Enter a double: ");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();

        int result =  (input - (int) input >= 0.5) ? ((int) input + 1) : ((int) input);
        System.out.println(result);
    }
}
