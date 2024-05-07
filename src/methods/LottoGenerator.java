package methods;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {


    public static void main(String[] args) {
         /*Create a LottoGenerator class with a method generateNumbers, which returns an array with 6 random numbers
         from 1 to 49. Call the method from your main class and print the result. When running the method multiple
         times you should see different results.
        Bonus: Make sure that the returned array contains unique values (no duplicates) */
        generateArray();
        generateArray();
        generateArray();
    }

    private static int [] generateArray() {
        Random rd = new Random(); // creating Random object
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(1, 50); // storing random integers in an array
            //check duplicates here would be better
        }
        System.out.println(Arrays.toString(arr)); // printing each array element


        //check dublicates
        int [] arrCopy = arr.clone();
        Arrays.sort(arrCopy);
        for (int i = 0; i < arrCopy.length -1; i++) {
            for (int j = i + 1; j < arrCopy.length; j++) {
                if (arrCopy[i] == arrCopy[j]) {
                    generateArray();
                }
            }
        }

        return arr;
    }
}
