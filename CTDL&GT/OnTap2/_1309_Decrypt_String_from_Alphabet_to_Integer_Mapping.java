package OnTap2;

public class _1309_Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public static void main(String[] args) {
        String s = "12#2125#79823#12#";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '#') {
                int num = Integer.parseInt(s.substring((i - 2), i));
                str.append((char)('a' + num - 1));
                i -= 2;
            }else {
                str.append((char)('0' + s.charAt(i)));
            }
        }
        return str.reverse().toString();
    }
}
