package OnTap2;

public class _896_Monotonic_Array {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,4,5};
        System.out.println(isMonotonic(nums));
    }

        public static boolean isMonotonic(int[] nums) {
            int a = 0 ,b =0;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                    continue;
                }else if(nums[i]<nums[i+1]){
                    a++;
                }else{
                    b++;
                }
            }
            if(a>0 && b>0)return false;

            return true;
        }



}
