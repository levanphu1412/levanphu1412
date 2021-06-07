package Lab;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Logic {
    public void demoLoop() {
        System.out.println("While, Scan input from console");
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        int k = 0;
        while (k < 10) {
            System.out.println("k = " + k);
            k++;
        }
    }

    public void getName() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào tên của bạn, hoặc gõ 'q' để thoát");
            String name = input.nextLine();
            if (name.equals("q")) {
                break; //thoát ra khỏi vòng lặp while
            } else if (name.length() < 3) {
                continue; //Tiếp tục vòng lặp, bỏ qua lệnh tiếp theo
            } else {
                System.out.println("Tên của bạn thật là đẹp " + name);
            }
        }
        input.close();
    }

    public void guessName() throws IOException {
        ArrayList<String> manNames = new ArrayList<>();

        manNames.add("Cường");
        manNames.add("Dũng");
        manNames.add("Thắng");
        manNames.add("Kiên");
        manNames.add("Long");
        manNames.add("Trung");
        manNames.add("Thành");
        manNames.add("Quân");

        List<String> womanNames = List.of("Hoa", "Lan", "Hương", "Hằng", "Thuỷ", "Dung", "Hiền", "Khuê", "Trinh");
        List<String> neutralNames = List.of("Bình", "Thanh", "Linh");


        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập vào tên của bạn, hoặc gõ 'q' để thoát");
            String name = input.nextLine();
            if (name.equals("q")) {
                break;
            } else {
                //Kiểm tra nếu tên nằm trong danh sách tên của Nam
                for (String s : manNames) {
                    if (s.equals(name)) {
                        System.out.println("Nam giới");
                        break;
                    }
                }
                //Kiểm tra nếu tên nằm trong danh sách tên của Nữ
                for (String s : womanNames) {
                    if (s.equals(name)) {
                        System.out.println("Nữ giới");
                        break;
                    }
                }

                //Kiểm tra nếu tên nằm trong danh sách tên không rõ Nam hay Nữ
                for (String s : neutralNames) {
                    if (s.equals(name)) {
                        System.out.println("Giới tính của bạn là gì?");
                        String gender = input.nextLine();
                        System.out.println(name + " có giới tính là " + gender);
                        break;
                    }
                }
            }
        }
        input.close();

    }

    public void guessNumber() {
        Random r = new Random();
        int number = r.nextInt(100);

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Hãy đoán số hoặc gõ 'q' để thoát");
            String str = input.nextLine();
            if (str.equals("q")) {
                break;
            } else {
                int guessNumber = Integer.parseInt(str);
                if (guessNumber > number) {
                    System.out.println("Số bạn nhập vào lớn hơn");
                } else if (guessNumber < number) {
                    System.out.println("Số bạn nhập vào nhỏ hơn");
                } else {
                    System.out.println("Bạn đã đoán đúng số " + number);
                }
            }
        }
        input.close();
    }

    public void guessBMI() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("nhập cân nặng của bạn hoặc gõ 'q' để thoát");
            String weight = input.nextLine();
            if(weight.equals("q")) {
                break;
            }
            System.out.println("nhập chiều cao của bạn hoặc gõ 'q' để thoát");
            String height = input.nextLine();
            if (height.equals("q")) {
                break;
            } else {
                float guessWeight = Float.parseFloat(weight);
                float guessHeight = Float.parseFloat(height);

                float BMI = guessWeight/ (guessHeight * guessHeight);
                System.out.println("chỉ số BMI của bạn là: " + BMI);
                if (BMI < 18.5) {
                    System.out.println("hãy ăn thêm nhiều");
                }
                if (18.5 < BMI && BMI < 24.9) {
                    System.out.println("hãy giữ chỉ số này");
                }
                if (BMI > 24.9 && BMI < 30) {
                    System.out.print("cần ăn ít lại");
                } if(BMI > 30) {
                    System.out.println("cần giảm cân");
                }
            }
        }
        input.close();
    }

    public void guessEmail() {
        Scanner input = new Scanner(System.in);
        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        while (true) {
            System.out.println("nhập email của bạn hoặc nhập 'q' để thoát");
            String email = input.nextLine();
            if(email.equals("q")) {
                break;
            }else if (Pattern.matches(EMAIL_PATTERN, email) == true) {
                System.out.println("Email bạn nhập vào đúng");
            }else {
                System.out.println("Email bạn nhập vào là sai");
            }
        }
        input.close();
    }

    public void primeArray() {
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.println("nhập vào 1 số nguyên dương < 100 hoặc nhập 'q' để thoát");
        String a = input.nextLine();
        if(a.equals("q")) {
            break;
        }else {
            int b = Integer.parseInt(a);
            int num = 0;
            String primeNumbers = " ";
            for (int i = 1; i <= b ; i++) {
                int counter = 0;
                for (num = 1; num <= i; num++) {
                    if(i % num == 0) {
                        counter++;
                    }
                }
                if (counter == 2) {
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Các số nguyên tố từ 1 đến " + a + " là:");
            System.out.println(primeNumbers);
        }
    }
    input.close();
    }  
    
}
