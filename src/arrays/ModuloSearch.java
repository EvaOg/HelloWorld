package arrays;

import java.util.Arrays;

public class ModuloSearch {
    public static void main(String[] args) {

        //Find all even numbers in one array and write them into another array. The resulting array should only be as long as the number of results.

        int[] input = new int[]{1, 4, 5, 7, 20000, -511, 100, -200, 400};
        int evenNumb = 0;


        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
              evenNumb += 1;
            }
        }

        int[] result = new int[evenNumb];
        int j = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                result[j] = input[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(result));




        // TODO: put even numbers of input into result

       for (int item : result) {
            System.out.println(item);
        }


    }
}
