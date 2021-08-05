package baitap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GuessEmail {
    public void guessEmail() {
        Scanner input = new Scanner(System.in);
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        while(true) {
            System.out.println("Nhập email của bạn");
            String email = input.nextLine();
            if (email.equals("q")) {
                break;
            }else if(Pattern.matches(EMAIL_PATTERN, email) == true) {
                System.out.println("email bạn nhập vào là đúng");
            }else System.out.println("emali bạn nhập vào là sai");
        }
    }
}
