package arrays;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 15, 3, 6};
        int target = 9;
        int[] result = new int[2];
        System.out.println((Arrays.toString(findSum(nums,result,target))));

    }

    public static int[] findSum(int[] nums, int[] result, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i; // Assign i to result[0]
                    result[1] = j; // Assign j to result[1]
                    return result;
                }
            }
        }
        return result;
    }
}
