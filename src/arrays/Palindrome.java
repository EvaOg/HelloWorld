package arrays;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(isPalindrome(str));

    }


        static boolean isPalindrome(String word) {

            //String word = String.valueOf(number); Если прилетает номер как параметр
            int length = word.length();
            // Двигаемся с обоих концов слова к серидине
            for (int i = 0; i < (length / 2); i++) {
                if (word.charAt(i) != word.charAt(length - i - 1)) {
                    // Если найдено несоответствие - слово не палиндром
                    return false;
                }
            }
            return true;
        }

}