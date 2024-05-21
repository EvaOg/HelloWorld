package string;

import static java.lang.Integer.valueOf;

public class Occurence {
    public static void main(String[] args) {

String haystack = "rghthh";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));




    }

    public static int strStr(String haystack, String needle) {

        int a = haystack.indexOf(needle);

        return a;


    }

}
