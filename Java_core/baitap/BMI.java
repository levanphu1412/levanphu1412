package baitap;

import java.util.Scanner;

public class BMI {
    public void guessBMI() {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Nhập cân nặng của bạn hoặc gõ 'q để thoát");
            String weight = input.nextLine();
            if (weight.equals("q")) {
                break;
            }
            System.out.println("Nhập chiều cao của bạn hoặc gõ 'q' để thoát");
            String height = input.nextLine();
            if (height.equals("q")) {
                break;
            }else {
                float guessWeight = Float.parseFloat(weight);
                float guessHeight = Float.parseFloat(height);
                float BMI = guessWeight / (guessHeight * guessHeight);
                System.out.println("Chỉ số BMI của bạn là: " + BMI);
                if(BMI < 18.5) System.out.println("hơi gầy, bạn cần ăn thêm");
                else if (BMI < 24.9) System.out.println("Hãy giữ chỉ số này");
                else if (BMI < 29.9) System.out.println("Cần ăn ít lại");
                else System.out.println("Hãy giảm cân");
            }
        }
        input.close();
    }
}
