package Recursion;

public class TimKiemTuanTu {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(find(a, 5, 0));
    }

    public static int find(int[] a, int x, int i) {
       if(i >= a.length) {
           return -1;
       }else {
           if(a[i] == x) {
               return i;
           }else {
               return find(a, x, i + 1);
           }
       }
    }
}
