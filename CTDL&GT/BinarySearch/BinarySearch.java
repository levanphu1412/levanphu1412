package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        String[] name = {"Bùi Giang Sơn", "Lê Văn Phú", "Duong Văn Thắng", "Nguyễn Công Khanh", "Nguyễn Quang Tùng", "Chử Văn Long",
                "Lê Văn Tốt", "Nguyễn Thành Trung", "Hoàng Trọng Khoa", "Nguyễn Minh An", "Nguyễn Việt Anh"};

        Arrays.sort(name);

        System.out.println("nhập STT để tìm vị trí");
        int a = Integer.parseInt(input.nextLine());
        System.out.println(bSearch1(nums, a));
        System.out.println("Nhập tên cần tìm");
        String b = input.nextLine();
        System.out.println(bSearch2(name, b));
    }

    public static int bSearch1(int[] nums, int x) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == x) {
                return mid;
            } else if (nums[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int bSearch2(String[] name, String x) {
        int n = name.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (name[mid].equals(x)) {
                return mid;
            } else if (name[mid].compareTo(x) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
