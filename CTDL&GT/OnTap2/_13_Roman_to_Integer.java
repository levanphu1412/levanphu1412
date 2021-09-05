package OnTap2;

import java.util.HashMap;
import java.util.Map;

public class _13_Roman_to_Integer {
    public static void main(String[] args) {
        String  s = "IMCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        sum += map.get(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            sum += map.get(s.charAt(i));
            if(map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                sum -= map.get(s.charAt(i - 1)) * 2;
            }
        }
        return sum;
    }
}
