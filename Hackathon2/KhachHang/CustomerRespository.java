package Hackathon2.KhachHang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerRespository {
    List<Customer> customers;
    public void customerRespository() {
        customers = new ArrayList<>();
        customers.add(new Customer("012345678912", "Ronaldo", "5/2/1985", Gender.MALE.getValue(), "Bồ Đào Nha", "0123456789", "ronaldo@gmail.com"));
        customers.add(new Customer("012654668912", "Messi", "24/6/1987", Gender.MALE.getValue(), "Argentina", "0179879789", "messi@gmail.com"));
        customers.add(new Customer("012978326462", "Emma Watson", "15/4/1990", Gender.FEMALE.getValue(), "Pháp", "01245999999", "emma@gmail.com"));
        customers.add(new Customer("012150545412", "Nicki Minaj", "8/12/1982", Gender.FEMALE.getValue(), "Trinidad và Tobago", "05555444888", "minaj@gmail.com"));
        customers.add(new Customer("012349321241", "Chi Pu", "14/6/1993", Gender.FEMALE.getValue(), "Việt Nam", "01454989465", "chipupu@gmail.com"));
        customers.add(new Customer("012345424112", "Lee Min Ho", "22/5/1987", Gender.MALE.getValue(), "Korea", "01298794459", "leeminho@gmail.com"));
        customers.add(new Customer("012349644912", "Trần Đức Bo", "15/7/1990", Gender.GENDER.getValue(), "Đà Nẵng", "01288888789", "meomeomeo@gmail.com"));
    }

    public void showInfo() {
        customers.forEach(list -> System.out.println(list));
    }

    public void getByGender() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                customers.stream().filter(gender -> gender.getGender().equalsIgnoreCase(Gender.MALE.getValue()))
                        .forEach(list -> System.out.println(list));
                break;
            case 2:
                customers.stream().filter(gender -> gender.getGender().equalsIgnoreCase(Gender.FEMALE.getValue()))
                        .forEach(list -> System.out.println(list));
                break;
            case 3:
                customers.stream().filter(gender -> gender.getGender().equalsIgnoreCase(Gender.GENDER.getValue()))
                        .forEach(list -> System.out.println(list));
                break;
            default:
                System.out.println("không có lựa chọn này");
                break;
        }

    }

    public void addCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng");
        String maKhachHang = scanner.nextLine();
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh");
        String birthDay = scanner.nextLine();
        System.out.println("nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập quê quán");
        String country  = scanner.nextLine();
        System.out.println("nhập số điện thoại");
        String phone = scanner.nextLine();
        System.out.println("nhập email");
        String email = scanner.nextLine();

        try {
            for (Customer customer : customers) {
                if (customer.getMaKhachHang().equals(maKhachHang)) {
                    break;
                } else {
                    Customer customer1 = new Customer(maKhachHang, name, birthDay, gender, country, phone, email);
                    customers.add(customer1);
                    showInfo();
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void findByMaKhachHang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã khách hàng cần tìm");
        String str = scanner.nextLine();
        int count = 0;
        for(Customer customer : customers) {
            if(customer.getMaKhachHang().equalsIgnoreCase(str)){
                System.out.println("nhập tên khách hàng");
                customer.setName(scanner.nextLine());
                System.out.println("ngày sinh");
                customer.setBirthDay(scanner.nextLine());
                System.out.println("Nhập email");
                customer.setEmail(scanner.nextLine());
                System.out.println("Nhập số điện thoại");
                customer.setPhone(scanner.nextLine());
                System.out.println(customer);
                count++;
            }
        }if(count == 0) System.out.println("không tồn tại khách hàng này");
    }

}
