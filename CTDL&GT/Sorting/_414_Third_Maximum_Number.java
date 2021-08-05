package Sorting;

import java.util.Arrays;

public class _414_Third_Maximum_Number {
    public static void main(String[] args) {
        int[] nums = {3, 5, 1, 2, 4, 5, 4, 5, 6,7,8, 7,8,9};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        } else if (n == 2) {
            return Math.max(nums[0], nums[1]);
        } else {
            Arrays.sort(nums);
            int count = 0;
            int tem = 0;
            for (int i = n - 1; i > 0; i--) {
                if (nums[i] != nums[i - 1]) {
                    count++;
                }
                if(count <= 1) {
                    tem = nums[n - 1];
                }
                if (count == 2) {
                    tem = nums[i - 1];
                }
            }

            return tem;
        }

    }

}