package Thread;

public class NhanVien {
    private String hoTen;
    private int age;
    private String phone;
    private String email;
    private Long luongCoBan;

    public NhanVien(String hoTen, int age, String phone, String email, Long luongCoBan) {
        this.hoTen = hoTen;
        this.age = age;
        this.setPhone(phone);
        this.setEmail(email);
        this.luongCoBan = luongCoBan;
    }

    public NhanVien() {

    }


    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = Validation.validateMobile(phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Validation.validateEmail(email);
    }

    public Long getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(Long luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "hoTen='" + hoTen + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", luongCoBan=" + luongCoBan +
                '}';
    }
}
