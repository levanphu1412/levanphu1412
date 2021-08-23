package OnTap1;

import java.util.HashSet;
import java.util.Set;

public class _202_Happy_Number {
    public static void main(String[] args) {
        System.out.println(isHappy(82));
    }

    public static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = getNext(n);
        }
        return n == 1;
    }
}
