package Hackathon2.SoNguyenTo.KhachHang.KhachHang;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        CustomerRespository customerRespository = new CustomerRespository();
        customerRespository.customerRespository();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Thông tin khách hàng");
                        customerRespository.showInfo();
                    break;
                case 2:
                    System.out.println("Thông tin khách khàng theo giới tính (nhập 1 - 3)");
                    customerRespository.getByGender();
                    break;
                case 3:
                    customerRespository.addCustomer();
                    break;
                case 4:
                    customerRespository.findByMaKhachHang();
                    break;
                case 0:
                scanner.close();
                System.exit(0);
                default:
                    System.out.println("không có lựa chọn này");
                    break;
            }
        }

    }

    public static void showMenu() {
        System.out.println("1: Xem thông tin toàn bộ khách hàng");
        System.out.println("2: Xem thông tin khách hàng nữ hoặc xem thông tin khách hàng nam");
        System.out.println("3: Thêm thông tin 1 khách hàng vào danh sách");
        System.out.println("4: Tìm kiếm thông tin khách hàng dựa vào mã.");
        System.out.println("0: Thoát chương trình");
    }
}
