package Exercises1_2_EvaOgandzhanian;

public class Strings {
    public static void main(String[] args) {

        String str = "Everybody said, it can’t be done. Then came one who did not know that and just made it.";
        System.out.print(str.charAt(0));
        System.out.print(str.charAt(34));
        System.out.println("");

        String name = "Eva";
        System.out.println(str.compareTo(name));

        String surName = "Ogandzhanian";
        System.out.println(name + " " + surName);

        System.out.println(str.contains("made"));
        System.out.println(str.contains("Java"));

        System.out.println(str.equals(name));

        System.out.println(str.indexOf("d"));

        System.out.println(str.isEmpty());

        System.out.println(str.equals("null"));

        System.out.println(str.length());

        int startSaid = str.indexOf("said");
        //System.out.println(startSaid);
        int startMade = str.indexOf("made");
        //System.out.println(startMade);
        System.out.println(str.substring(startSaid, 14));
        System.out.println(str.substring(startMade, 83));

       comparingStrings();
    }

    public static void comparingStrings() {
        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);

        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);

        /* str1 & str2 point to the same String literal, that is why they are equal.
        When we use “==” to compare str, it only checks the referential equality of two Strings,
        meaning if they reference the same object or not. That is why the result of the last comparison is false.*/

        }

    }

