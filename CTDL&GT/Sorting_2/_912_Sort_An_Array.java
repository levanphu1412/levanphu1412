package Sorting_2;

import java.util.Arrays;

public class _912_Sort_An_Array {
    public static void main(String[] args) {
//        int[] nums = {2,45,23,65,12,9,8,45,29,17,45,22,10,5};
//        System.out.println(Arrays.toString(sortArray(nums)));
        int[] a1 = {1,3,5,7,9};
        int[] a2 = {2,4,6,8,10};
//        System.out.println(Arrays.toString(sortArray(nums)));
        System.out.println(Arrays.toString(merge(a1, a2)));

    }

    public static int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while(i < n) {
            if(i1 < a1.length && i2 < a2.length) {
                if(a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++; i1++;
                }else {
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }else {
                if(i1 < a1.length) {
                    result[i] = a1[i1];
                    i++; i1++;
                }else {
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }
        }
        return result;
    }

    public static int[] mergeSort(int[] a, int left, int right) {
        if(left > right) {
            return new int[0];
        }
        if(left == right) {
            int[] singleElement = {a[left]};
            return singleElement;
        }
        int mid = (left + right) / 2;
        int[] a1 = mergeSort(a, left, mid );
        int[] a2 = mergeSort(a, mid + 1, right);

        int[] result = merge(a1, a2);
        return result;
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length -1);
    }
}
