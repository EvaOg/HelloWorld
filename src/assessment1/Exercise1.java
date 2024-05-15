package assessment1;

import assessment1.hike.FoodItem;
import assessment1.test.Test;

public class Exercise1 {

    private static final char[] VOWELS = {'A', 'E', 'I', 'O', 'U', 'Ä', 'Ö', 'Ü'};  // TODO: Your implementation of 1a

    public static boolean isUmlautOrVowel(char c) {
        // TODO: Your implementation of 1a
        boolean containsVowelsorUmlaud = false;
        for (char v : VOWELS) {
            if (Character.toUpperCase(c) == v) {
                containsVowelsorUmlaud = true;
                break;
            }
        }
        return containsVowelsorUmlaud;
    }

    public static double calculateShareOfVowels(String str) {
        // TODO: Your implementation of 1b
        //we take a string, convert it to apper case then convert it to char to compare &
        // find vowels and save their ammount of them (count ++) into count

        int count = 0;
        int charactersinString = str.length();

        for (char c : str.toUpperCase().toCharArray()) {
            for (char vowel : VOWELS) {
                if (c == vowel) {
                    count++;
                    break;
                }
            }
        }

        double vowelPercentage = (double) count / charactersinString * 100;
        return vowelPercentage/100;
    }

    public static boolean validateFoodName(FoodItem food) {
        // TODO: Your implementation of 1c

        String f;

        if (food.getName() == "") {
            return false;
        } else {
            f = food.getName();
        }

        // string with a capital letter?
        if (!Character.isUpperCase(f.charAt(0)) || f == "") {
            System.out.println("is nor capital");
            return false;
        }

        if (calculateShareOfVowels(f) < 0.5) {
            System.out.println("less then 5 vowels");
            return false;
        }

        return true;
    }


    public static void main(String[] args) {
        /*
        The students of a Java class are on a hike 🥾 - they are enjoying their free time and are motivated by spending time
        together. 👩🏻‍🤝‍👩🏻
        But as all of them are junior developers they always tend to model their situation in a programmatic way. 🤓

        Every Hiker (yes - there will be a class for them) has a set of properties which should be validated. Especially the FoodItems
        have to be checked: Their name should be a String which starts with a capital. Additionally at least 50% of the letters
        shall be vowels or "Umlaute".

        To solve this problem step-by-step the Java-hikers start with a set of helper methods:
         */

        /*
        Exercise 1a (10 P):
        Implement a method isUmlautOrVowel which takes a char as parameter and returns true
        if the passed character is a vowel or a German "Umlaut" (otherwise false).


        Use a constant char array to store your vowels and "Umlaute".
        The method shall work for uppercase letters as well as for lowercase letters.
         */

        // Examples of "good" cases ✅
        Test.equals(true, isUmlautOrVowel('A'));
        Test.equals(true, isUmlautOrVowel('Ö'));
        Test.equals(true, isUmlautOrVowel('u'));
        Test.equals(true, isUmlautOrVowel('ü'));

        // Examples of "bad" cases ❌
        Test.equals(false, isUmlautOrVowel('À'));
        Test.equals(false, isUmlautOrVowel('d'));
        Test.equals(false, isUmlautOrVowel(' '));
        Test.equals(false, isUmlautOrVowel('ß'));
        Test.equals(false, isUmlautOrVowel('!'));
        Test.equals(false, isUmlautOrVowel('z'));

        /*
        Exercise 1b (10P):
        Create a method calculateShareOfVowels which takes a String parameter and returns a double value indicating
        the percentage of vowels and "Umlaute" in the parameter. (e.g. calculateShareOfVowels("Banana") shall return 0.5)

        Use the method created in exercise 1a. If you did not succeed there you will get the points for 1b anyway.
         */

        // test cases
        Test.equals(0.5, calculateShareOfVowels("BanAna"));
        Test.equals(0.1, calculateShareOfVowels("xxxyyyzzzä"));
        Test.equals(1.0, calculateShareOfVowels("AEIOUaeiouÄÖÜäöü"));
        Test.equals(0.0, calculateShareOfVowels("qwXrtz123ß!., "));

        /*
        Exercise 1c (10P):
        Create a method validateFoodName which takes a food item and validates its name. The name shall:
         - start with a capital letter
         - contain at least 50 % vowels & Umlaute (>= 0.5).
        If the name is okay, return true - otherwise return false.

        Use the method created in exercise 1b.
         */

        // test cases
        Test.equals(true, validateFoodName(new FoodItem("BanAna", 120, 89)));
        Test.equals(false, validateFoodName(new FoodItem("Sucuk", 100, 340)));
        Test.equals(true, validateFoodName(new FoodItem("Sucuki", 100, 340)));
        Test.equals(false, validateFoodName(new FoodItem("bier", 500, 210)));
        Test.equals(true, validateFoodName(new FoodItem("BieR", 500, 210)));
        Test.equals(true, validateFoodName(new FoodItem("Öl", 100, 884)));
        Test.equals(true, validateFoodName(new FoodItem("Olivenöl", 100, 884)));
        Test.equals(false, validateFoodName(new FoodItem("Döner", 350, 750)));
        Test.equals(false, validateFoodName(new FoodItem("", 120, 89)));

    }




}
