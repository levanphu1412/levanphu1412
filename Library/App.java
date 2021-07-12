package Library;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Toán","Giáo dục","Phú",2015,"Kim Đồng",100));
        books.add(new Book("Doremon","Truyện tranh","Phú",2015,"",100));
        books.add(new Book("Hoa học trò","Báo chí","Phú Lê",2015,"Phụ Nữ",100));
        books.add(new Book("Từ điển Anh-Việt","Tài liệu","Lê Văn Phú",2016,"Thanh Niên",100));
        books.add(new Book("văn","lop 8","Văn Phú",2016,"Hội nhà văn",100));
        books.add(new Book("lịch sử","lop 12","Lê Phú",2016,"Chính trị quốc gia",100));

        System.out.println("danh sách sách");
        for (Book b : books) {
            System.out.println(b);
        }

        List<Reader> readers = new ArrayList<>();
        Reader phu = new Reader("Lê Văn Phú", "Thanh Hóa", "levanphu5555@gmail.com", "01545454800");
        Reader hien = new Reader("Lê Thị Hiền", "Hà Nội", "lehien@gmail.com", "01234567899");
        Reader phuong = new Reader("Nguyễn Thành Phương", "HCM", "phuong123456@gmail.com", "01234567989");
        Reader ronaldo = new Reader("Cristiano Ronaldo", "Bồ Đào Nha", "ronaldo@gmail.com", "03218578421");
        Reader messi = new Reader("Leonel Messi", "Argentina", "messinopro999@gmail.com", "09745455455");
        Reader arhavin = new Reader("Andrey Arshavin", "Nga", "arsahvin456@gmail.com", "04578784121");
        System.out.println("danh sách người đọc");
        readers.add(phu);
        readers.add(phuong);
        readers.add(ronaldo);
        readers.add(messi);
        readers.add(arhavin);
        readers.forEach(reader -> {
            System.out.println(reader);
        });

//       khởi tạo lineitem
        ArrayList<LineItem> lineItem1 = new ArrayList<LineItem>();
        lineItem1.add(new LineItem("ID12", 5));
        lineItem1.add(new LineItem("ID23", 6));
        lineItem1.add(new LineItem("ID27", 4));
        ArrayList<LineItem> lineItem2 = new ArrayList<>();
        lineItem2.add(new LineItem("ID423", 5));
        lineItem2.add(new LineItem("ID105", 9));
        ArrayList<LineItem> lineItem3 = new ArrayList<LineItem>();
        lineItem3.add(new LineItem("ID65", 8));
        lineItem3.add(new LineItem("ID3", 10));
        lineItem3.add(new LineItem("ID257", 3));
        ArrayList<LineItem> lineItem4 = new ArrayList<LineItem>();
        lineItem4.add(new LineItem("ID123", 15));
        lineItem4.add(new LineItem("ID55", 20));
        lineItem4.add(new LineItem("ID1412", 7));


        //    tạo phiếu thuê
        LocalDateTime dateStart = LocalDateTime.now();
        List<RentalVoucher> list = new ArrayList<>();
        RentalVoucher r1 = new RentalVoucher("RV12", dateStart, dateStart.plusDays(5), lineItem1);
        RentalVoucher r2 = new RentalVoucher("MSN36", dateStart, dateStart.plusDays(6), lineItem2);
        RentalVoucher r3 = new RentalVoucher("MSN36", dateStart, dateStart.plusDays(6), lineItem3);
        RentalVoucher r4 = new RentalVoucher("MSN36", dateStart, dateStart.plusDays(6), lineItem4);
        list.add(r1);
        list.add(r2);
        list.add(r3);
        list.add(r4);
        System.out.println("Danh sách phiếu thuê");
        list.forEach(l -> {
            System.out.println(l);
        });
    }
}
