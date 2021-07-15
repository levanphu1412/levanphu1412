package Thread;

import java.util.ArrayList;
import java.util.List;

public class KiemChungVien extends NhanVien implements Runnable, ILuong {
    private static Long genID = 1L;
    private Long maId;
    private int soLoiPhatHien;

    public KiemChungVien(String hoTen, int age, String phone, String email, Long luongCoBan, int soLoiPhatHien) {
        super(hoTen, age, phone, email, luongCoBan);
        this.maId = genID++;
        this.soLoiPhatHien = soLoiPhatHien;
    }

    public KiemChungVien() {

    }

    public int getSoLoiPhatHien() {
        return soLoiPhatHien;
    }

    public void setSoLoiPhatHien(int soLoiPhatHien) {
        this.soLoiPhatHien = soLoiPhatHien;
    }

    public Long tongLuong() {
        return getLuongCoBan() + soLoiPhatHien * 50000;
    }

    @Override
    public String toString() {
        return "KiemChungVien{" +
                "maId=" + maId +
                ", hoTen='" + super.getHoTen() + '\'' +
                ", age=" + super.getAge() +
                ", phone='" + super.getPhone() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", luongCoBan=" + super.getLuongCoBan() +
                ", soLoiPhatHien=" + soLoiPhatHien +
                '}';
    }

    @Override
    public void run() {
        List<KiemChungVien> kiemChungViens = new ArrayList<KiemChungVien>();
        kiemChungViens.add(new KiemChungVien("Cristiano Ronaldo", 36, "0148727988", "ronaldo@gmail.com", 20000000L, 17));
        kiemChungViens.add(new KiemChungVien("Leonel Messi", 34, "0134867896", "messi@gmail.com", 30000000L, 30));
        kiemChungViens.add(new KiemChungVien("Bukayo Saka", 20, "03734934145", "saka@gmail.com", 15000000L, 15));
        kiemChungViens.add(new KiemChungVien("Jesse Lingard", 29, "0546457152", "lingard@gmail.com", 14000000L, 19));
        kiemChungViens.add(new KiemChungVien("Nicklast Bendtner", 33, "0673212442", "bendtner@gmail.com", 9000000L, 15));
        kiemChungViens.add(new KiemChungVien("Raheem Sterling", 27, "01963674415", "sterling@gmail.com", 13000000L, 10));
        for(int i = 0; i < kiemChungViens.size(); i++) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(kiemChungViens.get(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tổng Lương = " + kiemChungViens.get(i).tongLuong());
        }
    }


}
