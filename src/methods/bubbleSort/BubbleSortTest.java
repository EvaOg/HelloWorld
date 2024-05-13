package methods.bubbleSort;

import java.util.Arrays;

import static java.lang.System.*;

public class BubbleSortTest {
    public static void main(String[] args) {

        int[] nums = new int[] {9, 7, 5, 3, 2, 7, 8, 1, 5, 9};

        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(result));
    }
}
