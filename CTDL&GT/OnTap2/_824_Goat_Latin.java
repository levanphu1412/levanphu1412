package OnTap2;

public class _824_Goat_Latin {
    public static void main(String[] args) {
        String s = "Le Van Phu An";
        System.out.println(toGoatLatin(s));
    }

    public static String toGoatLatin(String sentence) {
        String[] tem = sentence.split(" ");
        String res = "";
        int index = 1;
        for (int i = 0; i < tem.length; i++) {
            char ch = tem[i].charAt(0);
            if(index > 1) {
                res += " ";
            }
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                res = res + tem[i] + "ma";
            }
            else {
                res = res + tem[i].substring(1) + ch + "ma";
            }
            for (int j = 0; j < index; j++) {
                res += "a";
            }
            index +=1;
        }
        return res;
    }
}
