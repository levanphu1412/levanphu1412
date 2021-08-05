package Book;

import java.util.Scanner;

public class Sach {
    private String maSach, tenSach, nhaSanXuat;
    private Integer namXuatBan;

    public Sach() {

    }

    public Sach(String maSach, String tenSach, String nhaSanXuat, Integer namXuatBan) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaSanXuat = nhaSanXuat;
        this.namXuatBan = namXuatBan;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public Integer getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(Integer namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public void
    inPut() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã sách");
        maSach = scanner.nextLine();
        System.out.println("nhập tên sách");
        tenSach = scanner.nextLine();
        System.out.println("nhập tên nhà sản xuất");
        nhaSanXuat = scanner.nextLine();
        System.out.println("nhập năm sản xuất");
        namXuatBan = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maSach='" + maSach + '\'' +
                ", tenSach='" + tenSach + '\'' +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                ", namXuatBan=" + namXuatBan +
                '}';
    }
}
