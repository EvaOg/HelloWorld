package collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class UnionIntersection {
    public static void main(String[] args) {


        List<Integer> listA = List.of (1,2,3,4,5,6);
        List<Integer> listB = List.of (4,5,6,7,8,9);

        //Union
        List<Integer> concatenatedList = union(listA, listB); //ListUtils.
        System.out.println(concatenatedList);

        //Intersection
        List<Integer> intersectionList = intersection(listA, listB);
        System.out.println(intersectionList);

        //symmetricDifference
        List<Integer> symmetricDifferenceList = symmetricDifference(listA, listB);
        System.out.println(symmetricDifferenceList);


    }

    //Union: Return a new List, which returns the elements from both lists, without duplicates.
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
        return listC;
    }

    //Intersection: Return the intersection of both lists, which contains only elements in both lists.
    public static List<Integer> intersection(List<Integer> l1, List<Integer> l2) {
        List<Integer> listD = new ArrayList<>();

        for(int el: l1){
            if(l2.contains(el)){
                listD.add(el);
            }
        }
        return listD;
    }

    //Symmetric difference: Return those elements, which are included in only one of the two lists.
    public static List<Integer> symmetricDifference(List<Integer> l1, List<Integer> l2) {
        List<Integer> listE = new ArrayList<>();

        for(int el: l1){
            if(!(l2.contains(el))){
                listE.add(el);
            }
        }

        for(int el: l2){
            if(!(l1.contains(el))){
                listE.add(el);
            }
        }
        return listE;
    }

        /*
         ArrayList<Integer> list = UnionOfList(list1,list2);
        ArrayList<Integer> difList = intersection(list1,list2);
        list.removeAll(difList);
        return list;
        */


}

