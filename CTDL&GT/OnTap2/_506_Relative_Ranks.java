package OnTap2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _506_Relative_Ranks {
    public static void main(String[] args) {
        int[] nums = {7,3,9,8,6};
        System.out.println(Arrays.toString(findRelativeRanks(nums)));
    }

    public static String[] findRelativeRanks(int[] score) {
        int[] tem = score.clone();
        Arrays.sort(tem);
        Map<Integer, String> map = new HashMap<>();
        for (int i = score.length - 1; i >= 0 ; i--) {
            if(i == score.length - 1) {
                map.put(tem[i], "Gold Medal");
            }else if(i == score.length - 2) {
                map.put(tem[i], "Silver Medal");
            }else if(i == score.length - 3) {
                map.put(tem[i], "Bronze Medal");
            }else {
                map.put(tem[i], String.valueOf(score.length - i));
            }
        }
        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            result[i] = map.get(score[i]);
        }
        return result;
    }
}
