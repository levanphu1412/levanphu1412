package baitap;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public void guessNumber() {
        Random r = new Random();
        int number = r.nextInt(100);
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("hãy đoán số hoặc gõ q để thoát");
            String str = input.nextLine();
            if (str.equals("q")) {
                break;
            }else {
                int guessNumber = Integer.parseInt(str);
                if(guessNumber > number) System.out.println("Số bạn nhập vào lớn hơn");
                else if(guessNumber < number) System.out.println("Số bạn nhập vào nhỏ hơn");
                else System.out.println("Số bạn nhập vào là đúng " + number);
            }
        }input.close(); 
    }   
}
