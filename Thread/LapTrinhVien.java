package Thread;

import java.util.ArrayList;
import java.util.List;

public class LapTrinhVien extends NhanVien implements Runnable, ILuong{
    private static Long genID = 1L;
    private Long maId;
    private int soGioOvertime;

    public LapTrinhVien(String hoTen, int age, String phone, String email, Long luongCoBan, int soGioOvertime) {
        super(hoTen, age, phone, email, luongCoBan);
        this.maId = genID++;
        this.soGioOvertime = soGioOvertime;
    }

    public LapTrinhVien() {
        super();
    }

    public int getSoGioOvertime() {
        return soGioOvertime;
    }

    public void setSoGioOvertime(int soGioOvertime) {
        this.soGioOvertime = soGioOvertime;
    }

    public Long tongLuong() {
        return getLuongCoBan() + soGioOvertime * 200000;
    }

    @Override
    public void run() {
        List<LapTrinhVien> lapTrinhViens = new ArrayList<LapTrinhVien>();
        lapTrinhViens.add(new LapTrinhVien( "Lê Văn Phú", 23, "0123456789","levanphu@gmail.com", 5000000L, 2 ));
        lapTrinhViens.add(new LapTrinhVien( "Lê Thị Hiền", 25, "0123456789","lethihien@gmail.com", 4500000L, 3 ));
        lapTrinhViens.add(new LapTrinhVien( "Nguyễn Thành Phương", 25, "0123456789","nguyenthanhphuong@gmail.com", 15000000L, 5 ));
        lapTrinhViens.add(new LapTrinhVien( "Lê Văn An", 56, "0123456789","lethihuong@gmail.com", 6000000L, 3 ));
        lapTrinhViens.add(new LapTrinhVien( "Lê Thị Hương", 27, "0123456789","levanan@gmail.com", 4000000L, 2 ));
        lapTrinhViens.add(new LapTrinhVien( "Lê Văn Phong", 29, "0123456789","levanphong@gmail.com", 5500000L, 4 ));

        for(int i = 0; i < lapTrinhViens.size(); i++ ) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(lapTrinhViens.get(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tổng lương = " + lapTrinhViens.get(i).tongLuong());
        }
        System.out.println("--------------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "LapTrinhVien{" +
                "maId=" + maId +
                ", hoTen='" + super.getHoTen() + '\'' +
                ", age=" + super.getAge() +
                ", phone='" + super.getPhone() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", luongCoBan=" + super.getLuongCoBan() +
                ", soGioOvertime=" + soGioOvertime +
                '}';
    }


}
