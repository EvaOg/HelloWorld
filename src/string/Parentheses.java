package string;
import java.util.ArrayList;
import java.util.Arrays;


public class Parentheses {
    public static void main(String[] args) {


        System.out.println(isValid2("()"));
        System.out.println(isValid2("()[]{}1"));
        System.out.println(isValid2("(]"));

    }


    public static char getMatchingOpeningBracket(char c) {
        if (c == ')') {
            return '(';
        } else if (c == '}') {
            return  '{';
        } else if (c== ']') {
            return '[';
        }
        // invalid input
        return ' ';
    }

    public static boolean isValid2(String inputString) {

        ArrayList<Character> brackets = new ArrayList();

        ArrayList<Character> validChars = new ArrayList<>(Arrays.asList('(', ')', '{', '}', '[', ']'));

        for (char c: inputString.toCharArray()) {

            if (! validChars.contains(c)) {return false;}

            // now we know, c is valid char
            if (c == '(' || c == '{' || c == '[') {
                brackets.add(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (brackets.size() != 0 && brackets.get(brackets.size() - 1) == getMatchingOpeningBracket(c)) {
                    brackets.remove(brackets.size() - 1);
                } else {
                    return false;
                }
            }
        }
        if (!(brackets.size() == 0)) {
            return false;
        }
        return true;
    }
}

   /* public static boolean isValid(String s) {

            if (s.isEmpty() || (s.length()%2 != 0)){
                return false;
            }

            ArrayList<Character> parentheses = new ArrayList<>(Arrays.asList('(', ')', '{', '}', '[', ']'));
            ArrayList<Character> openParenthesesArr = new ArrayList<>(Arrays.asList('(', '{', '['));
            ArrayList<Character> closeParenthesesArr = new ArrayList<>(Arrays.asList(')', '}', ']'));

            ArrayList<Character> openParentheses = new ArrayList<Character>();
            ArrayList<Character> closeParentheses = new ArrayList<Character>();

            for (char c : s.toCharArray()){
                if(!parentheses.contains(c)){
                    return false;
                }
                if (openParenthesesArr.contains(c)){
                    openParentheses.add(c);
                } else {
                    closeParentheses.add(c);
                }
            }

            if (openParentheses.size() != closeParentheses.size()){
                return false;
            }

        return true;
    }
*/





