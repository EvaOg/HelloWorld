package collections.arrayList.Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        //Write a program, which uses a Stack to invert a list of whole numbers.
        //The output for the following example should be 4,3,2,1.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        Stack<Integer> stack = new Stack<>();
        stack.push(numbers.get(3));
        stack.push(numbers.get(2));
        stack.push(numbers.get(1));
        stack.push(numbers.get(0));
        System.out.println(stack);
    }
}
