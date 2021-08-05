package InternetBanking;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Transfer {
    private String transferStk;
    private String note;
    private int money;
    private Date createdAt;

    public Transfer() {
    }

    public String getTransferStk() {
        return transferStk;
    }

    public void setTransferStk(String transferStk) {
        this.transferStk = transferStk;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    

    public void input(int maxMoney) {
        System.out.println("nhập thông tin chuyển tiền");
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập skt cần chuyển");
        transferStk = scanner.nextLine();
        System.out.println("Ghi chú");
        note = scanner.nextLine();
        for(;;) {
            System.out.println("nhập số tiền chuyển");
            this.money = Integer.parseInt(scanner.nextLine());
            if(money <= maxMoney - 50000) {
                break;
            }else {
                System.out.println("số tiền chuyển vượt quá quy định");
            }
        }
        createdAt = new Date();

    }

    @Override
    public String toString() {
        return "Transfer{" +
                "transferStk='" + transferStk + '\'' +
                ", note='" + note + '\'' +
                ", money=" + money +
                ", createdAt=" + getCreatedAtString() +
                '}';
    }

    public String getCreatedAtString() {
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss dd/mm/yyyy");
        String str = format.format(createdAt);
        return str;
    }

    public void display() {
        System.out.println(toString());
    }
}
