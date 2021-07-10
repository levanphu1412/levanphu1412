package FPT;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ProductRepository p = new ProductRepository();
        p.productRepository();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("In thông tin dựa trên danh mục");
                    p.getProductByCategory();
                    break;
                case 2:
                    System.out.println("in thông tin theo hãng");
                    p.getProductByManufacturer();
                    break;
                case 3:
                    System.out.println("Nhập các mốc tiền:");
                    System.out.println("1: Dưới 2tr");
                    System.out.println("2: Từ 2tr - 4tr");
                    System.out.println("3: Từ 4tr - 7tr");
                    System.out.println("4: Từ 7tr - 13tr");
                    System.out.println("5: Trên 13tr");
                    p.getProductByPrice();
                    break;
                case 4:
                    p.getProductByName();
                    break;
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
    }
    public static void showMenu() {
        System.out.println("Lựa chọn của bạn:");
        System.out.println("1: In thông tin dựa trên danh mục");
        System.out.println("2: In thông tin các sản phẩm dựa theo hãng");
        System.out.println("3:  In thông tin sản phẩm dựa trên mức giá và danh mục.");
        System.out.println("4: Nhập vào một chuỗi bất kỳ và in ra các sản phẩm có tên tương tự chuỗi đó (tìm kiếm)");
    }

}
