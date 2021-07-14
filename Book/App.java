package Book;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<SachGiaoKhoa> arrSachGiaoKhoa = new ArrayList<>();
        ArrayList<DoAn> arrDoAn = new ArrayList<>();
        ArrayList<TaiLieuDienTu> arrTaiLieuDienTu = new ArrayList<>();

//        int soSachGiaoKhoa, soDoAn, soTaiLieuDienTu;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhập số sách giáo khoa");
//        soSachGiaoKhoa = scanner.nextInt();
//        System.out.println("nhập số đồ án");
//        soDoAn = scanner.nextInt();
//        System.out.println("nhập số tài liệu điện tủ");
//        soTaiLieuDienTu = scanner.nextInt();
//// nhập thông tin sách giáo khoa
//        System.out.println("Nhập thông tin sách giáo khoa");
//        for(int i = 0; i < soSachGiaoKhoa; i++) {
//            System.out.println("nhập thông tin quyển sách thứ " + (i + 1) );
//            SachGiaoKhoa sachGiaoKhoa = new SachGiaoKhoa();
//            sachGiaoKhoa.inPut();
//            sachGiaoKhoa.viTri();
//            arrSachGiaoKhoa.add(sachGiaoKhoa);
////            System.out.println("vị trí quyển sách thứ " + (i + 1) + " là: " + sachGiaoKhoa.viTri());
//            System.out.println("số sách tồn kho của quyển sách thứ " + (i + 1) + " là: "+ sachGiaoKhoa.tonKho());
//        }
//        System.out.println();
//nhập thông tin đồ án
//        System.out.println("Nhập thông tin đồ án");
//        for(int i = 0; i < soDoAn; i++) {
//            System.out.println("nhập thông tin đồ án thứ " + (i + 1) );
//            DoAn doAn = new DoAn();
//            doAn.inPut();
//            arrDoAn.add(doAn);
//            System.out.println("");
//        }
//
////        nhập thông tin tài liệu điện tử
//        System.out.println("nhập thông tin tài liệu điện tử");
//        for(int i = 0; i < soTaiLieuDienTu; i++) {
//            System.out.println("nhập thông tin tài liệu điện tử thứ " + (i + 1));
//            TaiLieuDienTu taiLieuDienTu = new TaiLieuDienTu();
//            taiLieuDienTu.inPut();
//            arrTaiLieuDienTu.add(taiLieuDienTu);
//        }

//
//        arrSachGiaoKhoa.forEach(list -> {
//            System.out.println(list);
//        });

//        System.out.println();
//        System.out.println("---------------------------");
//        arrDoAn.forEach(list -> {
//            System.out.println(list);
//        });
//        System.out.println("---------------------------");
//        arrTaiLieuDienTu.forEach(list -> {
//            System.out.println(list);
//        });

        SachGiaoKhoa sach1 = new SachGiaoKhoa("Ms1", "toán", "Kim đồng", 2005, 250, "mới", 100, 15);
        SachGiaoKhoa sach2 = new SachGiaoKhoa("Ms2", "lí", "Kim đồng", 2006, 300, "cũ", 150, 25);
        SachGiaoKhoa sach3 = new SachGiaoKhoa("Ms3", "hóa", "Kim đồng", 2007, 290, "mới", 200, 30);
        SachGiaoKhoa sach4 = new SachGiaoKhoa("Ms4", "văn", "Kim đồng", 2008, 500, "mới", 70, 26);
        SachGiaoKhoa sach5 = new SachGiaoKhoa("Ms5", "anh", "Kim đồng", 2009, 700, "cũ", 90, 17);
        arrSachGiaoKhoa.add(sach1);
        arrSachGiaoKhoa.add(sach2);
        arrSachGiaoKhoa.add(sach3);
        arrSachGiaoKhoa.add(sach4);
        arrSachGiaoKhoa.add(sach5);
        arrSachGiaoKhoa.forEach(list -> {
            System.out.println(list);
        });
//    xóa sách
        arrSachGiaoKhoa.remove(2);
        System.out.println("danh sách sau khi xóa");
        arrSachGiaoKhoa.forEach(list -> {
            System.out.println(list);
        });
//         số sách tồn kho
        System.out.println("sách tồn kho trong sách 1: " + sach1.tonKho());
        System.out.println("sách tồn kho trong sách 2: " + sach2.tonKho());
        System.out.println("sách tồn kho trong sách 3: " + sach3.tonKho());
//        vị trí
        System.out.println("vị trí sách 1 là " + sach1.viTri());
        System.out.println("-------------------------------------------------");

        DoAn doAn1 = new DoAn("DA1", "java web", "techmaster", 2017, 150, "mới", 2021);
        DoAn doAn2 = new DoAn("DA2", "java core", "techmaster", 2018, 50, "mới", 2021);
        DoAn doAn3 = new DoAn("DA3", "java back-end", "techmaster", 2019, 250, "mới", 2021);
        DoAn doAn4 = new DoAn("DA4", "java nâng cao", "techmaster", 2019, 370, "mới", 2021);
        DoAn doAn5 = new DoAn("DA5", "web frontend", "techmaster", 2020, 178, "mới", 2021);
        DoAn doAn6 = new DoAn("DA6", "html/ css", "techmaster", 2021, 295, "mới", 2021);
        arrDoAn.add(doAn1);
        arrDoAn.add(doAn2);
        arrDoAn.add(doAn3);
        arrDoAn.add(doAn4);
        arrDoAn.add(doAn5);
        arrDoAn.add(doAn6);
        arrDoAn.forEach(list -> {
            System.out.println(list);
        });
//        sửa đồ án
        arrDoAn.set(2, doAn4);
        arrDoAn.set(4, new DoAn("DA10", "javaScrip", "techmaster", 2021, 255, "mới", 2021));
        System.out.println("đồ án sau khi cập nhật");
        arrDoAn.forEach(list -> {
            System.out.println(list);
        });
        System.out.println("-----------------------------------------");

        TaiLieuDienTu taiLieuDienTu1 = new TaiLieuDienTu("TL1", "toán", "Đại học quốc gia", 2015, "150MB", 10500L, 15000L);
        TaiLieuDienTu taiLieuDienTu2 = new TaiLieuDienTu("TL2", "lí", "Đại học quốc gia", 2016, "1990MB", 15009L, 17000L);
        TaiLieuDienTu taiLieuDienTu3 = new TaiLieuDienTu("TL3", "hóa", "Đại học sư phạm", 2017, "2730MB", 23456L, 18000L);
        TaiLieuDienTu taiLieuDienTu4 = new TaiLieuDienTu("TL4", "văn học", "Đại học quốc gia", 2018, "1350MB", 13795L, 18000L);
        TaiLieuDienTu taiLieuDienTu5 = new TaiLieuDienTu("TL5", "lịch sử", "Đại học sư phạm", 2019, "260MB", 29974L, 25000L);
        arrTaiLieuDienTu.add(taiLieuDienTu1);
        arrTaiLieuDienTu.add(taiLieuDienTu2);
        arrTaiLieuDienTu.add(taiLieuDienTu3);
        arrTaiLieuDienTu.add(taiLieuDienTu4);
        arrTaiLieuDienTu.add(taiLieuDienTu5);

        arrTaiLieuDienTu.forEach(list->{
            System.out.println(list);
        });

        System.out.println("tổng tiền của tài liệu điện tử 1 là: " + taiLieuDienTu1.tongTien());
        System.out.println("tổng tiền của tài liệu điện tử 2 là: " + taiLieuDienTu2.tongTien());
        System.out.println("tổng tiền của tài liệu điện tử 3 là: " + taiLieuDienTu3.tongTien());
    }
}
