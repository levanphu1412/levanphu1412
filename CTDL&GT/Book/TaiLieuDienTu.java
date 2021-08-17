package Book;

import java.util.Scanner;

public class TaiLieuDienTu extends Sach implements IDownload{
    private String dungLuong;
    private Long luotTai;
    private Long giaThanh;
    Scanner scanner = new Scanner(System.in);

    public TaiLieuDienTu() {
        super();
    }

    public TaiLieuDienTu(String maSach, String tenSach, String nhaSanXuat, Integer namXuatBan, String dungLuong, Long luotTai, Long giaThanh) {
        super(maSach, tenSach, nhaSanXuat, namXuatBan);
        this.dungLuong = dungLuong;
        this.luotTai = luotTai;
        this.giaThanh = giaThanh;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public Long getLuotTai() {
        return luotTai;
    }

    public void setLuotTai(Long luotTai) {
        this.luotTai = luotTai;
    }

    public Long getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(Long giaThanh) {
        this.giaThanh = giaThanh;
    }

    public void inPut() {
        super.inPut();
        System.out.println("Nhập dung lượng");
        dungLuong = scanner.nextLine();
        System.out.println("nhập lượt tải");
        luotTai = scanner.nextLong();
        System.out.println("nhập giá thành");
        giaThanh = scanner.nextLong();

    }

    @Override
    public String toString() {
        return super.toString()+ " - TaiLieuDienTu{" +
                "dungLuong='" + dungLuong + '\'' +
                ", luotTai=" + luotTai +
                ", giaThanh=" + giaThanh +
                "}";
    }

    @Override
    public Long tongTien() {
        return luotTai * giaThanh;
    }
}
