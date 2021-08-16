package Sorting_2;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {3, 65, 12, 75, 12, 4, 9, 10, 15, 56, 13, 99, 103, 45};
        long start = System.nanoTime();
        System.out.println(Arrays.toString(sortArray(nums)));
        long end = System.nanoTime();
        System.out.println("Time MergeSort: " + (end - start));
    }

    public static int[] merge(int[] a, int[] b) {
        int n = a.length + b.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while(i < n) {
            if(i1 < a.length && i2 < b.length) {
                if(a[i1] <= b[i2]) {
                    result[i] = a[i1];
                    i++; i1++;
                }else {
                    result[i] = b[i2];
                    i++; i2++;
                }
            }else {
                if(i1 < a.length) {
                    result[i] = a[i1];
                    i++; i1++;
                }else {
                    result[i] = b[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }

    public static int[] mergeSort(int[] nums, int left, int right) {
        if(left > right) {
            return new int[0];
        }
        if(left == right) {
            int[] singleElement = {nums[left]};
            return singleElement;
        }
        int mid = (left + right) / 2;

        int[] a1 = mergeSort(nums, left, mid);
        int[] a2 = mergeSort(nums, mid + 1, right);

        int[] result = merge(a1, a2);
        return result;
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}
