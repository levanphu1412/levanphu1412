package Sorting_2;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] nums = {3, 65, 12, 75, 12, 4, 9, 10, 15, 56, 13, 99, 103, 45};
//        int[] a = {1,3,5,7,9,11,13};
//        int[] b = {2,4,6,8,10};
        long t0, t1, t2, t3;
        t0 = System.nanoTime();

        System.out.println(Arrays.toString(bubbleSort(nums)));
        t1 = System.nanoTime();

        System.out.println(Arrays.toString(insertionSort(nums)));
        t2 = System.nanoTime();

        System.out.println(Arrays.toString(selectionSort(nums)));
        t3 = System.nanoTime();


        System.out.println("Time BubbleSort: " + (t1 - t0));
        System.out.println("Time InsertionSort: " + (t2 - t1));
        System.out.println("Time SelectiionSort: " + (t3 - t2));


    }

    //Bubble Sort
    public static int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tem = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tem;
                }
            }
        }
        return nums;
    }

    //Insertion Sort
    public static int[] insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int tem = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > tem) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = tem;
        }
        return nums;
    }

    // Selection Sort
    public static int[] selectionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int tem = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = tem;
            }
        }
        return nums;
    }


}
