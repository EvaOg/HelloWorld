package string;

public class QuizEx1 {
    public static void main(String[] args) {

        /*Test.equals(true, isValidPassword("lUggi105"));
        Test.equals(true, isValidPassword("fAmouss77"));
        Test.equals(true, isValidPassword("aBCDEFGH7"));

        // Examples of invalid passwords
        Test.equals(false, isValidPassword("ABCDEFGH7"));
        Test.equals(false, isValidPassword(""));
        Test.equals(false, isValidPassword("a14Abcdef"));
        Test.equals(false, isValidPassword("aA21"));
        Test.equals(false, isValidPassword("fAmouss78"));*/


        System.out.println(isValidPassword("fAmouss78"));

        System.out.println(checkDigit("1dfvdf7"));



    }


    public static boolean isValidPassword(String password) {


        //TODO: 1a
        //- contains at least 8 characters
        if (password.length() < 8) {
            System.out.println("Password length must be at least 8 characters");
            return false;
        }

        //- starts with a lowercase letter
        if (!Character.isLowerCase(password.charAt(0))) {
            System.out.println("Password doesn't contain lower case characters");
            return false;
        }

        //- contains at least one uppercase letter
        boolean hasUpperCase = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                hasUpperCase = true;
                break;
            }
        }
        if (!hasUpperCase) {
            System.out.println("Password doesn't contain lower case characters");
            return false;
        }

        //- ends with a number, which can be divided by 7 (e.g. 7, 21, 105)
        //getting the last element & checking whether it is number && whether it can be deleted on 7
        char lastEl = password.charAt(password.length() - 1);
        if (!Character.isDigit(lastEl) || (Character.getNumericValue(lastEl) % 7 != 0)) {
            System.out.println("Password last element cannot be deleted on 7 or is not digital");
            return false;
        }

        return true;
    }


    public static boolean checkDigit(String password) {
        String lastDigits = "";

        for (int i = password.length() - 1; i >= 0; i--) {
            char currentChar = password.charAt(i);
            // Check if the current character is a digit
            if (Character.isDigit(currentChar)) {
                // Add the digit to the beginning of the lastDigits variable
                lastDigits = currentChar + lastDigits;
            } else {
                // If a non-digit character is encountered, break out of the loop
                break;
            }
        }
        System.out.println(lastDigits);
        if (lastDigits.length() == 0 || !((Integer.parseInt(lastDigits)) % 7 == 0)) {
            System.out.println("Password doesn't contain lower case characters");
            return false;
        }
        return true;
    }


    }














