package arrays;

import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(romanToInt(s));

    }

    private static int NumValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral character: " + ch);
        }

    }

    public static int romanToInt(String s) {

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = NumValue(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = NumValue(s.charAt(i + 1));
                if (s1 >= s2) {
                    sum = sum + s1;
                } else {
                    sum = sum - s1;
                }
            } else {
                sum = sum + s1;
            }
        }
        return sum;

    }
}