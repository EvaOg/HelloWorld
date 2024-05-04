package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofArrays {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 4, 5, 7, 20000, -511, 100, 100, -200, 400, 400, 500};
        int[] arr2 = new int[]{14, 6, 23, 7, 3455, -51, 100, 101, -200, 400, 430};
        ArrayList result = new ArrayList();

        //find the intersection of two arrays of integers.
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int lengthArr1 = arr1.length;
        int lengthArr2 = arr2.length;
        int i = 0;
        int j = 0;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        while (i < lengthArr1 && j < lengthArr2) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {  // arr1[i]==arr2[j]
                //save this element
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        //remove dublicates from array

        System.out.println(result);




    }
}
