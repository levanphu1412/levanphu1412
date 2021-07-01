package InternetBanking;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Account account = null;
    public static void main(String[] args) {
        login();
        System.out.println("tiếp theo");

        int choose;
        do{
            showMenu();
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose){
                case 1:
                        account = new Account();
                        account.input();
                        account.display();
                    break;
                case 2:
                    if(account != null) {
                        account.transfer();
                    }else {
                        System.out.println("tài khoản không tồn tại");
                    }
                    break;
                case 3:
                    if(account != null) {
                        account.displayTransferHistory();
                    }else {
                        System.out.println("tài khoản không tồn tại");
                    }
                    break;
                case 4:
                    System.out.println("Thoát");
                    break;
                default:
                System.out.println("Nhập sai");
            }

        }while (choose != 4);
    }

    static void showMenu() {
        System.out.println("1. truy vấn tài khoản");
        System.out.println("2. chuyển tiền");
        System.out.println("3. xem lịch sử giao dịch");
        System.out.println("4. Chọn");
    }

    static void login() {
        System.out.println("Number Phone: ");
        String numberPhone = scanner.nextLine();
        System.out.println("passWord: ");
        String passWord = scanner.nextLine();
        if(numberPhone.equals("123456789") && passWord.equals("levanphu123")) {
            System.out.println("Đăng nhập thành công");
        }else {
            System.err.println("Đăng nhập thất bại");
            login();
        }
    }
}
