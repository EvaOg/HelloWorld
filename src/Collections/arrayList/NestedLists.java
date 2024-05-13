package Collections.arrayList;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class NestedLists {
    public static void main(String[] args) {

        //Create three (or more) lists each with three (or more) names.
        // List A only contains names that begin with A, list B with B and C with C.
        // All lists should then be placed in an nested alphabetical list of names.
        // E.g. like this:
        //ArrayList<ArrayList<String>> names = new ArrayList<ArrayList<String>>();

        ArrayList<String> list1 = new ArrayList<>(List.of("Anna", "Alla", "Arina"));
        ArrayList<String> list2 = new ArrayList<>(List.of("Bob", "Brain", "Bim"));
        ArrayList<String> list3 = new ArrayList<>(List.of("Carl", "Cira", "Cyan"));


        ArrayList<ArrayList<String>> list123 = new ArrayList<>();
        list123.add(list1);
        list123.add(list2);
        list123.add(list3);

        System.out.println(list123);

        //Exercise: Print all names in alphabetical order.

        for (ArrayList<String> list : list123) {
            Collections.sort(list);
        }

        System.out.println(list123);

    }
}
