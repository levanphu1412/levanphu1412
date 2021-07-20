package Hackathon2.SoNguyenTo.KhachHang.KhachHang;

public enum Gender {
    MALE("Nam"), FEMALE("Nữ"), GENDER("Khác");

    private String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
