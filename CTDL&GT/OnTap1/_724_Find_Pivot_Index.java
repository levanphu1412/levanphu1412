package OnTap1;

public class _724_Find_Pivot_Index {
    public static void main(String[] args) {
        int[] nums = {2,7,5,1,8,6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        int leftSum = 0;
        int sum = 0;
        for(int x : nums) {
            sum += x;
        }
        for (int i = 0; i < nums.length; i++) {
            if(sum - nums[i] - leftSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
