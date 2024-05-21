package arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {

        int [] nums = {1,4,3,2,6};
        System.out.println(missedN(nums));

    }

    public static int missedN(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]+1 != (nums[i+1])) {
                return nums[i] +1;
            }
        }
        return 0;
    }

}
