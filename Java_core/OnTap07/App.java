package OnTap07;



public class App {
    public static void main(String[] args) {
        String strA = "Cuộc đời vốn đẹp";
        String strB = "Đẹp";
    
        if (strA.contains(strB)) {
          System.out.println("\"" + strA + "\" chứa \"" +  strB + "\"");
        } else {
          System.out.println("\"" + strA + "\" không chứa \"" +  strB + "\"");
        }
    
        StringUtil stringUtil  = new StringUtil();
        // stringUtil.camelCase();
        // stringUtil.longestWord();
        System.out.println(stringUtil.isContain("abcdefgh", "aBc"));

        System.out.println("từ dài nhất là: " + stringUtil.longestWord());

        
        System.out.println(stringUtil.camelCase());

        
        System.out.println(stringUtil.reverse());

        System.out.println("vi tri cua strB: " + stringUtil.find("hom nay troi nong qua", "nong"));

        System.out.println(stringUtil.countWords());
      }
}
