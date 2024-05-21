package arrays;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int [] nums = {3,2,3};
        System.out.println(majorityN(nums));

    }

    public static int majorityN(int[] nums) {

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        int x = nums[nums.length/2];

        return x;

        }
}
