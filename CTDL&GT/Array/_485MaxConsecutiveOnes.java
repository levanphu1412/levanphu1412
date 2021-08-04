package Array;

public class _485MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,1,1,1,0,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for(int i : nums) {
            if(i == 1) {
                count++;
                if(count > maxCount) {
                    maxCount = count;
                }
            }else {
                count = 0;
            }
        }
        return maxCount;
    }



}
