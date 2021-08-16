package Sorting_2;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {3, 65, 12, 75, 12, 4, 9, 10, 15, 56, 13, 99, 103, 45};
        long start = System.nanoTime();
        quickSort(nums, 0, nums.length - 1);
        long end = System.nanoTime();
        System.out.println("Time QuickSort: " + (end - start));
    }

    public static void quickSort(int[] a, int left, int right) {
        if(left >= right) return;
        int key = a[(left + right) / 2];

        int k = partition(a, left, right, key);
        quickSort(a, left, k - 1);
        quickSort(a, k, right);
    }

    public static int partition(int[] a, int left, int right, int key) {
        while(left <= right) {
            while(a[left] < key) left++;
            while (a[right] > key) right--;
            if(left <= right) {
                int tem = a[left];
                a[left] = a[right];
                a[right] = tem;
                left++; right--;
            }
        }
        return left;
    }
}
