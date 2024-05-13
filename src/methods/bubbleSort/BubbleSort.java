package methods.bubbleSort;

public class BubbleSort {

    public static int[] sort(int[] nums) {
        int[] sortedArray = nums.clone();

        for (int i = 0; i < nums.length; i++)
            for (int j = i+1; j < nums.length; j++) {
            if (sortedArray[i] > sortedArray[j]) {
                int temp = sortedArray[i];
                sortedArray[i] = sortedArray[j];
                sortedArray[j] = temp;
            }
        }

        return sortedArray;
    }

}
