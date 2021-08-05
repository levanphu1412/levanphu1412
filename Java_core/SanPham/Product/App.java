package SanPham.Product;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ProductRespository respository = new ProductRespository();
        respository.productRespository();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Danh sách sản phẩm:");
                    respository.showProduct();
                    break;
                case 2:
                    respository.addProduct();
                    break;
                case 3:
                    respository.findByMaAndUpdate();
                    break;
                case 4:
                    respository.findByMaAnDelete();
                    break;
                case 5:
                    System.out.println("danh sách sản phẩm vs số lượng bán được");
                    respository.showMap_1();
                    break;
                case 6:
                    System.out.println("danh sách loại sản phẩm và số lượng");
                    respository.showMap_2();
                    break;
                case 7:
                    System.out.println("danh sách sản phẩm sau khi sắp xếp");
                    respository.sortByName();
                    break;
                case 0:
                    scanner.close();
                   System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
    }

    public static void showMenu() {
        System.out.println("1 - Xem sản phẩm");
        System.out.println("2 - Thêm mới sản phẩm");
        System.out.println("3 - Tìm sản phẩm theo mã sản phẩm và sửa sản phẩm đó");
        System.out.println("4 - Tìm sản phẩm theo mã sản phẩm và xoá sản phẩm đó");
        System.out.println("5 - Xem sản phẩm và số lượng bán được ");
        System.out.println("6 - Liệt kê loại sản phẩm và số lượng sản phẩm thuộc loại đó");
        System.out.println("7 - Sắp xếp sản phẩm theo tên");
        System.out.println("0 - Thoát chương trình");
    }
}
