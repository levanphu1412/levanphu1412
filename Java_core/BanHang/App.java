package BanHang;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
  public static void main(String[] args) {

    Database db = new Database();
//    db.customerRepo.add(new Customer("Tom", "tom@gmail.com", "0123456789", "Room 1101, Empire State, New York, USA"));
//    db.customerRepo.add(new Customer("Bob", "bob@gmail.com", "0223456788", "1 Láng Hạ"));
//    db.customerRepo.add(new Customer("Alice", "alice@gmail.com", "0323456788", "10 Trần Duy Hưng"));
//
//    db.productRepo.add(new Product("Aris Pro", "VinSmart", Country.Vietnam, "Android 5G"));
//    db.productRepo.add(new Product("MaiWei", "Xiaomi", Country.China, "Thùng đựng đồ thông minh 35-55 lít"));
//    db.productRepo.add(new Product("SUP Hyper 12.6", "AquaMarina", Country.China, "SUP touring 12.6, 2 khoang"));
//
    List<Customer> customers = db.customerRepo.getAll();
    for (Customer customer : customers) {
      System.out.println(customer);
    }

    List<Product> products = db.productRepo.getAll();
    for (Product product: products) {
      System.out.println(product);
    }

//    Optional<Customer> oCustomer = db.customerRepo.findById(1L);
//    if (oCustomer.isPresent()) {
////      System.out.println(oCustomer.get());
//      oCustomer.get().setAddress("phuong");
//      oCustomer.get().setEmail("phuong657@gmai.com");
//      db.customerRepo.update(oCustomer.get());
//    }

    db.customerRepo.deleteByID(1L);

    System.out.println("danh sach khach hang sau khi xoa");
    for (Customer customer : customers) {
      System.out.println(customer);
    }

    // db.customerRepo.update(t);

    db.productRepo.deleteByID(2L);
    System.out.println("danh sach san pham sau khi xoa");
    for (Product pro : products) {
      System.out.println(pro);
    }
//    thêm khách hàng
    Customer tom = new Customer("Tom", "tom@gmail.com", "0123456789", "Room 1101, Empire State, New York, USA");
    Customer bob = new Customer("Bob", "bob@gmail.com", "0223456788", "1 Láng Hạ");
    Customer alice = new Customer("Alice", "alice@gmail.com", "0323456788", "10 Trần Duy Hưng");

//    thêm sản phẩm
    Product pr1 = new Product("Aris Pro", "VinSmart", Country.Vietnam, "Android 5G");
    Product pr2 = new Product("MaiWei", "Xiaomi", Country.China, "Thùng đựng đồ thông minh 35-55 lít");
    Product pr3 = new Product("SUP Hyper 12.6", "AquaMarina", Country.China, "SUP touring 12.6, 2 khoang");

    List<LineItem> lineItems1 = new ArrayList<LineItem>();
    lineItems1.add(new LineItem(pr1, 1000, 3));
    lineItems1.add(new LineItem(pr2, 2000, 5));
    lineItems1.add(new LineItem(pr3, 3000, 2));

    List<LineItem> lineItems2 = new ArrayList<LineItem>();
    lineItems2.add(new LineItem(pr1, 1000, 4));
    lineItems2.add(new LineItem(pr2, 2000, 6));
    lineItems2.add(new LineItem(pr3, 3000, 5));
    lineItems2.add(new LineItem(pr1, 1000, 3));

    List<LineItem> lineItems3 = new ArrayList<LineItem>();
    lineItems3.add(new LineItem(pr1, 1000, 10));
    lineItems3.add(new LineItem(pr2, 2000, 15));
    lineItems3.add(new LineItem(pr3, 3000, 20));

//  tạo đơn hàng
    Order order1 = new Order(tom, LocalDateTime.now(), "ghi chú 1", lineItems1);
    Order order2 = new Order(bob, LocalDateTime.now(), "ghi chú 2", lineItems2);
    Order order3 = new Order(alice, LocalDateTime.now(), "ghi chú 3", lineItems3);

    db.orderRepo.add(order1);
    db.orderRepo.add(order2);
    db.orderRepo.add(order3);

    List<Order> order = db.orderRepo.getAll();
    for(Order o : order) {
      System.out.println(o);
    }

  }
}