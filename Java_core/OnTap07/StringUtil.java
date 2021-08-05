package OnTap07;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class StringUtil {
  /*
   * Hãy viết hàm isContain để kiểm tra strA có chứa strB không mà không hàm có
   * sẵn trong String
   */

  /**
     *
     */

  public boolean isContain(String strA, String strB) {
    Boolean b = false;
    for (int a = 0; a < strA.length() - strB.length() + 1; a++) {

      if (strB.equals(strA.substring(a, a + strB.length()))) {
        b = true;
      }
    }
    return b;

  }

  /*
   * Nghịch đảo một chuỗi: Hello -> olleH
   */
  public String reverse() {
    Scanner input = new Scanner(System.in);
    System.out.println("nhập chuỗi cần đảo ngược:");
    String str = input.nextLine();
    // char[] in = str.toCharArray();
    // for(int i = 0; i < in.length/2; i++) {
    // char a = in[i];
    // in[i] = in[in.length - i -1];
    // in[in.length - i -1] = a;
    // }
    // return String.valueOf(in);
    String result = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      result += str.charAt(i);
    }
    return result;
  }

  /*
   * trả về vị trí mà strB được tìm thấy trong strA -1: không tìm thấy >= 0: là vị
   * trí tìm thấy
   */
  public int find(String strA, String strB) {
    return strA.indexOf(strB);
  }

  /*
   * Upper case ký tự đầu tiên của từ
   */
  public String camelCase() {
    Scanner input = new Scanner(System.in);
    System.out.println("Nhập chuỗi cần in hoa kí tự đầu");
    String strA = input.nextLine();
    String[] strB = strA.split(" ");
    String strC = "";
    for (int i = 0; i < strB.length; i++) {
      char[] data = strB[i].toCharArray();
      data[0] = Character.toUpperCase(data[0]);
      strC += String.valueOf(data) + " ";
    }
    return strC;
  }

  /*
   * "Không có gì quý hơn độc lập tự do" Từ dài nhất là "Không"
   */
  public String longestWord() {
    Scanner input = new Scanner(System.in);
    System.out.println("Nhập chuỗi để tìm từ dài nhất");
    String strA = input.nextLine();
    String[] strB = strA.split(" ");
    int index = 0;
    int lenMax = 0;
    for (int i = 0; i < strB.length; i++) {
      int len = strB[i].length();
      if (len > lenMax) {
        lenMax = len;
        index = i;
      }
    }

    return strB[index];

  }

  /*
   * Đếm số lần tự lặp lại
   */

  /*
   * "Một con mèo, hai con chó, chó đuổi mèo" Một: 1 con: 2 mèo: 2 hai: 1 chó: 2
   * đuổi: 1
   */
  public Map<String, Integer> countWords() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap chuoi can dem");
    String strA = sc.nextLine();
    String[] strB = strA.split(" ");
    Map<String, Integer> map = new HashMap<String, Integer>();
    
    for (int i = 0; i < strB.length; i++) {
      int count = 1;
      for (int j = i + 1; j < strB.length; j++) {
        if(strB[i].equals(strB[j])) {
          count++;
        }
      }
      if (!map.containsKey(strB[i])) {
        map.put(strB[i], count);
      }
    }
       
    return map;
  }
}
