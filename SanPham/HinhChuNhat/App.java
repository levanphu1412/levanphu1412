package SanPham.HinhChuNhat;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều cao");
        m = scanner.nextInt();
        System.out.println("Nhập chiều rộng");
        n = scanner.nextInt();
        for(int i = 0; i< m; i++) {
            for(int j = 0; j < n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
