package methods;

import java.util.Scanner;

public class CaesarChiffre {
    public static void main(String[] args) {

        // Input a word to encrypt
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();

        //Variables
        int shift = 3;
        String encryptedMessage = "";
        String decryptedMessage = "";

        encryptedMessage = caesarCiper(message, shift, encryptedMessage);
        decryptedMessage = decryptingCaesarCiper(decryptedMessage, shift, encryptedMessage);


        System.out.println(encryptedMessage);
        System.out.println(decryptedMessage);

    }

    private static String caesarCiper(String message, int shift, String encryptedMessage) {
        //encrypting message
        for(int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            if(Character.isLetter(currentChar)) {
                char tolowerCase = Character.isUpperCase(currentChar)? 'A' : 'a';
                char rotateChar = (char)(((currentChar - tolowerCase + shift) % 26) + tolowerCase);
                encryptedMessage += rotateChar;
            }
            else{
                encryptedMessage += currentChar;
            }
        }
        return encryptedMessage;
    }


    private static String decryptingCaesarCiper(String decryptedMessage, int shift, String encryptedMessage) {
        //encrypting message
        for (int i = 0; i < encryptedMessage.length(); i++) {
            char currentChar = encryptedMessage.charAt(i);
            if (Character.isLetter(currentChar)) {
                char tolowerCase = Character.isUpperCase(currentChar) ? 'A' : 'a';
                char rotateChar = (char) (( (currentChar - tolowerCase - shift) < 0 ? (currentChar + shift +1) % 26 + tolowerCase : (currentChar - tolowerCase - shift) % 26 + tolowerCase));
                decryptedMessage += rotateChar;
            } else {
                decryptedMessage += currentChar;
            }
        }
        return decryptedMessage;
    }

}
