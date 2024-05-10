package methods;

import java.util.Arrays;
import java.util.Scanner;

public class CryptographyMy {

    String encryptedResult = "";

    public void main(String[] args) {
        //Part 1 Encryption//

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '.', ',', '?', '&', '%', '!', ':', '-', ' '};

        // Input a word to encrypt
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String wordlowerCase = word.toLowerCase();
        char[] wordCharArray = wordlowerCase.toCharArray();

        System.out.println(encripting (wordCharArray,alphabet));
        System.out.println("Encrypted result: " + encryptedResult.trim());
    }

    public String encripting ( char[] wordCharArray, char[] alphabet){
        // go through inputted sentence

            // Find the index of the current character in the alphabet array
            for (int j = 0; j < alphabet.length; j++) {
                for (int i = 0; i < wordCharArray.length; i++) {
                if (alphabet[j] == wordCharArray[i]) {
                    int index = j;
                    int encryptedIndex = index + 3;
                    encryptedResult += encryptedIndex + " ";
                    break;
                }
            }
        }
        return encryptedResult;
    }



}
