package Sorting;

import java.util.Arrays;

public class _1051_Height_Checker {
    public static void main(String[] args) {
        int[] heights = {5,1,2,3,4};
        System.out.println(heightChecker(heights));
    }

    public static int heightChecker(int[] heights) {
        int[] tem = new int[heights.length];
        for (int i = 0; i < heights.length ; i++) {
                tem[i] = heights[i];
        }
        Arrays.sort(tem);
        int count = 0;
        for (int i = 0; i < heights.length ; i++) {
            if(heights[i] != tem[i]) {
                count++;
            }
        }
        return count;
    }
}
