package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ConsecutiveofArray {
    public static void main(String[] args) {

        int[] arr1 = new int[]{1, 4, 5, 6, 7, 20000, -511, 100, 100, -200, 400, 401, 402, 400, 500, 501, 502, 503, 504};

        ArrayList maxConsec = new ArrayList();
        ArrayList curConsec = new ArrayList();

        boolean isConsecutive = false;

        if (arr1.length == 0) {
            System.out.println("The array is too short");
            return;
        }
         if (arr1.length == 1) {
             System.out.println(Arrays.toString(arr1));
             return;
         }

         //arr1.length > 1
        for (int i = 1; i < arr1.length; i++) {
            if(arr1[i] == arr1[i-1] +1 ) {
                isConsecutive = true;
                curConsec.add(arr1[i-1]);

                if(i == arr1.length - 1) {
                    curConsec.add(arr1[i]);
                    if (curConsec.size() > maxConsec.size()) {
                        maxConsec = curConsec;
                    }
                }
            } else {
                if (isConsecutive) {
                    curConsec.add(arr1[i-1]);
                    if (curConsec.size() > maxConsec.size()) {
                        //maxConsec = curConsec;
                         maxConsec = new ArrayList<>(curConsec);
                    }
                    curConsec.clear();
                }
                isConsecutive = false;
            }
        }

        System.out.println(Arrays.toString(maxConsec.toArray()));

    }
}
