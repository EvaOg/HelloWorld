package methods;

import java.util.Arrays;
import java.util.Scanner;

public class CryptographyMy {
    public static void main(String[] args) {
         /*Write a class that contains the following two methods:
        public String encrypt(String input) { ... }
        public String decrypt(String input) { ... }
        Invent your own secret cryptoalgorithm. If you really don't get an idea use 1337 (Leetspeak)
        Bonus (if you used an appropriate algorithm): allow the user to specify his own key value, which can be used to encrypt and decrypt a message.*/
        //Part 1 Encryption//

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g','h', 'i', 'j', 'k', 'l','m', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ',', '?', '!', ':', '-', ' '};

        // Input a word to encrypt
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String wordlowerCase = word.toLowerCase();
        char [] wordCharArray = wordlowerCase.toCharArray();

        String encryptedResult = " ";


    // go through inputted sentence
        for (int i = 0; i < wordCharArray.length; i++) {
            // Find the index of the current character in the alphabet array
            for (int j = 0; j < alphabet.length; j++) {
                if (alphabet[j] == wordCharArray[i]) {
                    int index = j;
                    int encryptedIndex = index + 3;
                    encryptedResult += encryptedIndex + " ";
                    break; // Exit loop once the character is found
                } else {

                }
            }
        }

        System.out.println("Encrypted result: " + encryptedResult.trim());





    }
}
