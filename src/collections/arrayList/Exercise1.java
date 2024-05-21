package collections.arrayList;

import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Exercise1 {



    public static void main(String[] args) {
        // List of whole numbers

        List<Integer> wholeNumbers = new ArrayList<>();

    /*Create an ArrayList and fill it with different whole numbers
    (predefined or randomized).
    Implement a method to find the maximum value in an ArrayList of Integers.
    Implement a method to print only the even numbers to the console.*/
        wholeNumbers.add(1);
        wholeNumbers.add(2);
        wholeNumbers.add(3);

        int max = Collections.max(wholeNumbers);
        System.out.println(max);

        for (int i = 0; i < wholeNumbers.size(); i++) {
            if (wholeNumbers.get(i) % 2 == 0) {
                System.out.print(i);
            }
        }

        /*
        Exercise: Implement different set operations for lists of whole numbers:

        Union: Return a new List, which returns the elements from both lists, without duplicates.
        Intersection: Return the intersection of both lists, which contains only elements in both lists.
        Symmetric difference: Return those elements, which are included in only one of the two lists.*/

        List<Integer> listA = List.of (1,2,3,4,5,6);
        List<Integer> listB = List.of (4,5,6,7,8,9);

        // newListC.add(listA)
        //union
        List<Integer> concatenatedList = union(listA, listB); //ListUtils.

        //listB.addAll(listA);
        //System.out.println(listB);

        //LinkedHashSet
        //Set<Integer> withoutDublicates = new HashSet<Integer>(listB);
        //System.out.println(withoutDublicates);
        System.out.println(concatenatedList);

    }

    public static List<Integer> union(List<Integer> l1, List<Integer> l2) {
        List<Integer> listC = new ArrayList<>();

        for(int el: l1){
            if(!listC.contains(el)){
                listC.add(el);
            }
        }

        for(int el: l2){
            if(!listC.contains(el)){
                listC.add(el);
            }
        }

        /*for (int i = 0; i < l1.size(); i++) {
            for (int j = i + 1; j < l2.size(); j++) {
                if (l1.get(i) == l2.get(j)) {
                    break;
                }
                listC.add(l1.get(i));
            }
        }*/

        return listC;
    }



}
