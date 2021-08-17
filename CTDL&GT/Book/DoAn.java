package Book;

import java.util.Scanner;

public class DoAn extends Sach implements IKho{
    private Integer soTrang;
    private String tinhTrang;
    private Integer namBaoVe;
    Scanner scanner = new Scanner(System.in);

    public DoAn() {
        super();
    }

    public DoAn(String maSach, String tenSach, String nhaSanXuat, Integer namXuatBan, Integer soTrang, String tinhTrang, Integer namBaoVe) {
        super(maSach, tenSach, nhaSanXuat, namXuatBan);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.namBaoVe = namBaoVe;
    }

    public Integer getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(Integer soTrang) {
        this.soTrang = soTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public Integer getNamBaoVe() {
        return namBaoVe;
    }

    public void setNamBaoVe(Integer namBaoVe) {
        this.namBaoVe = namBaoVe;
    }

    public void inPut() {
        super.inPut();
        System.out.println("nhập số trang");
        soTrang = scanner.nextInt();
        System.out.println("nhập tình trạng đồ án");
        tinhTrang = scanner.next();
        System.out.println("nhập năm bảo vệ");
        namBaoVe = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+ " - DoAn{" +
                "soTrang=" + soTrang +
                ", tinhTrang='" + tinhTrang + '\'' +
                ", namBaoVe=" + namBaoVe +
                "}";
    }

    @Override
    public String viTri() {
        return scanner.nextLine();
    }
}
