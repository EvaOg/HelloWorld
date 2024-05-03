package quiz1;

import java.util.Scanner;

public class Find_vowels {
    public static void main(String[] args) {
        // Write a program that takes a `String` as input and outputs the number of vowels in the string. For example, if the input is `"Hello World"`, the output should be `3` a, e, i, o, u


       System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
       // String word = String.valueOf(sc.nextInt());
        char [] x = word.toCharArray();

        for(char element: x){

        }

        System.out.println(word);
        int sum = 0;

        for (int i=0; i<word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                sum += 1;
            }
        }

        System.out.println(sum);
    }
}
