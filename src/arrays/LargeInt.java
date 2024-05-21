package arrays;

import java.util.Arrays;

public class LargeInt {
    public static void main(String[] args) {
        int [] nums = {9,9,9};
        int[] nums2 = nums.clone();
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(plusOne(nums)));
        System.out.println(Arrays.toString(plusNumberNCV(nums2, 7)));
    }

    public static int[] plusOne(int[] nums) {

        for(int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 9) {
                nums[i] += 1;
                break;
            } else {
                    if (i == 0 && nums[i] == 9) {
                        int [] newNums = new int[nums.length + 1];
                        newNums[0] = 1;
                        return newNums;
                    }
                    nums[i] = 0;
                    continue;
                }
        }


        return nums;
    }

    public static int[] plusNumberNCV(int[] nums, int toAdd) {
        int currentVal;
        int i;
        for(i = nums.length - 1; i >= 0; i--) {
            currentVal = nums[i];
            if (currentVal + toAdd < 10) {
                nums[i] += toAdd;
                toAdd = 0;
                break;
            } else {
                nums[i] = (currentVal + toAdd) % 10;
                toAdd = (currentVal + toAdd) / 10;
            }
        }
        if (toAdd != 0) {
            int [] newNums = new int[nums.length + 1];
            newNums[0] = toAdd;
            System.arraycopy(nums, 0, newNums, 1, nums.length);
            return newNums;
        }
        return nums;
    }


}


/*
    String s = Arrays.toString(nums)
                .replaceAll(" ", "")
                .replaceAll(",", "")
                .replace("[", "")
                .replace("]", "");
    long sInt = Long.parseLong(s) +1;
    s = Long.toString(sInt);
    System.out.println("s string: " + s);
    int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            // Convert the character to an integer and store it in the array
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
*/