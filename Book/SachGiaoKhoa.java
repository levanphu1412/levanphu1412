package Book;


import java.util.Scanner;

public class SachGiaoKhoa extends Sach implements IMuon, IKho{
    private Integer soTrang;
    private String tinhTrang;
    private Integer tongSoLuong;
    private Integer soLuongMuon;
   Scanner scanner = new Scanner(System.in);

   public SachGiaoKhoa() {
       super();

   }

    public SachGiaoKhoa(String maSach, String tenSach, String nhaSanXuat, Integer namXuatBan, Integer soTrang, String tinhTrang, Integer tongSoLuong, Integer soLuongMuon) {
        super(maSach, tenSach, nhaSanXuat, namXuatBan);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
        this.tongSoLuong = tongSoLuong;
        this.soLuongMuon = soLuongMuon;
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

    public Integer getTongSoLuong() {
        return tongSoLuong;
    }

    public void setTongSoLuong(Integer tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    public Integer getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(Integer soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

    public void inPut() {
        super.inPut();
        System.out.println("nhập số trang");
        soTrang = scanner.nextInt();
        System.out.println("nhập tình trạng sách");
        tinhTrang = scanner.next();
        System.out.println("nhập tổng số lượng sách");
        tongSoLuong = scanner.nextInt();
        System.out.println("nhập số lượng mượn");
        soLuongMuon = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+ " - SachGiaoKhoa{" +
                "soTrang=" + soTrang +
                ", tinhTrang='" + tinhTrang + '\'' +
                ", tongSoLuong=" + tongSoLuong +
                ", soLuongMuon=" + soLuongMuon +
                "}";
    }

    @Override
    public String viTri() {
        System.out.println("nhập vị trí");
        return scanner.nextLine();
    }

    @Override
    public Integer tonKho() {
        return tongSoLuong - soLuongMuon;
    }
}
