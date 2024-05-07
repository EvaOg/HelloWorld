package methods;


import java.util.Scanner;


public class CryptographaBinary {
    public static void main(String[] args) {

        // Input a word to encrypt
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        char [] wordCharArray = word.toCharArray();

        //encrypting into binary String
        String result = "";

        for (int i = 0; i < wordCharArray.length; i++) {
            result += Integer.toBinaryString(wordCharArray[i]) + " ";
        }

        System.out.println("Binary string as result: " + result);

        // Part 2. decryption
        String inputBinary = result;
        String[] binaryWords = inputBinary.split("\\s+");
        String resultText = "";

        for (String binaryWord : binaryWords) {
            int a = Integer.parseInt(binaryWord, 2);
            resultText += (char)(a);
        }

        System.out.println("Result of decrypted sentence: " + resultText);



    }
}
