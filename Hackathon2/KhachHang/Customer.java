package Hackathon2.KhachHang;

import java.util.Scanner;

public class Customer {
    private String maKhachHang;
    private String name;
    private String birthDay;
    private String gender;
    private String country;
    private String phone;
    private String email;

    public Customer(String maKhachHang, String name, String birthDay, String gender, String country, String phone, String email) {
        this.setMaKhachHang(maKhachHang);
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
        this.country = country;
        this.setPhone(phone);
        this.setEmail(email);
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = Validation.validateMaKhachHang(maKhachHang);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = Validation.validatePhone(phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Validation.validateEmail(email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", name='" + name + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setTen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên thay đổi");
        name = scanner.nextLine();
    }
}
