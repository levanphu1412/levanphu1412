package Array;

import java.util.Arrays;

public class _977_Squares_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {-9,-7-5,0,2,3,4};

        System.out.println(sortedSquares(nums));
    }

    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {

            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        return nums;
    }


}
