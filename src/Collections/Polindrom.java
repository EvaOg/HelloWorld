package Collections;

import java.util.*;

public class Polindrom {
    public static void main(String[] args) {

        String s = "madam";

        //creating a List of char and adding to it el from string
        List<Character> polindrom = new LinkedList<>();

        for(char c : s.toCharArray()){
            polindrom.add(c);
        }

        //creating two ListIterators from this List that will count from beginning & from end
        ListIterator<Character> iter = polindrom.listIterator();
        ListIterator<Character> iter2 = polindrom.listIterator(polindrom.size());


        //creating boolean to check true or false & check whether it has next & prev elements
        boolean isPolindrom = true;
        while (iter.hasNext() && iter2.hasPrevious()) {
            if (iter.next() != iter2.previous()) {
                isPolindrom = false;
                break;
            }
        }
        System.out.println(isPolindrom);

        }

    }

