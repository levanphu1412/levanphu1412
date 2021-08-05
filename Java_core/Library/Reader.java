package Library;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private static Long genId =1L;
    private Long id;
    private String name;
    private String address;
    private String email;
    private String phone;


    public Reader(String name, String address, String email, String phone) {
        id = genId++;
        this.setName(name);
        this.address = address;
        this.setEmail(email);
        this.setPhone(phone);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Validation.lengthBetween(name, 3, 20);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Validation.validateEmail(email);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = Validation.validateMobile(phone);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
