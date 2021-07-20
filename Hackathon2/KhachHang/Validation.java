package Hackathon2.KhachHang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static final Pattern EmailRegex = Pattern.compile("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern PhoneRegex = Pattern.compile("^\\d{10,11}$");
    public static final Pattern Cmnd_CccdRegex = Pattern.compile("^\\d{9,12}$");

    public Validation() {
    }

    public static String validateEmail(String email) {
        Matcher matcher = EmailRegex.matcher(email);
        if(matcher.find()){
            return email;
        }else {
            throw new RuntimeException("Email không hợp lệ");
        }
    }

    public static String validatePhone(String phone) {
        Matcher matcher = PhoneRegex.matcher(phone);
        if(matcher.find()){
            return phone;
        }else {
            throw new RuntimeException("Số điện thoại không hợp lệ");
        }
    }

    public static String validateMaKhachHang (String makhachhang) {
        Matcher matcher = Cmnd_CccdRegex.matcher(makhachhang);
        if(matcher.find()){
            return makhachhang;
        }else {
            throw new RuntimeException("Mã khách hàng không hợp lệ");
        }
    }
}
