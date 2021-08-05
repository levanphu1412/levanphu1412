package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3};
//        bubbleSort(nums);
        insertionSort(nums);
//        selectionSort(nums);
    }

    public static void bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if(nums[j] > nums[j + 1]) {
                    int tem = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void insertionSort(int[] nums) {
       int n = nums.length;
        int count = 0;
        for (int i = 1; i < n ; i++) {

            int tem = nums[i];
            int j = i - 1;
            while(j >= 0 && tem <= nums[j]) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = tem;


        }
        System.out.println(count + 1);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                int tem = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = tem;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
