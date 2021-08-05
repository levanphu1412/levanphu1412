package baitap;
import java.util.Scanner;

public class Palindrome {
    public void palindrome() {
        String  rev = "";
        Scanner sc = new Scanner(System.in);
   
        System.out.println("Nhập chuỗi để kiểm tra đối xứng:");
        String str = sc.nextLine();
   
        for ( int i = str.length() - 1; i >= 0; i-- )
           rev = rev + str.charAt(i);
   
        if (str.equals(rev))
           System.out.println(str+" is a palindrome");
        else
           System.out.println(str+" is not a palindrome");
    }
}
