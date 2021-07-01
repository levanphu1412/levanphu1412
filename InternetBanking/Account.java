package InternetBanking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    private String fullName, stk, phoneNumber, address;
    private int money;
    List<Transfer> transferList = new ArrayList<>();

    public Account() {
    }

//    public Account(String fullName, String stk, String phoneNumber, String address, int money) {
//        this.fullName = fullName;
//        this.stk = stk;
//        this.phoneNumber = phoneNumber;
//        this.address = address;
//        this.money = money;
//    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập họ và tên");
        fullName = scanner.nextLine();
        System.out.println("nhập stk");
        stk = scanner.nextLine();
        System.out.println("nhập sđt");
        phoneNumber = scanner.nextLine();
        System.out.println("nhập address");
        address = scanner.nextLine();
        money = 10000000;
    }

    public void displayTransferHistory() {
        System.out.println("lịch sử chuyển tiền");
        for(Transfer transfer : transferList) {
            transfer.display();
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "fullName='" + fullName + '\'' +
                ", stk='" + stk + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", money=" + money +
                '}';
    }

    public void display() {
        System.out.println(toString());
        displayTransferHistory();
    }

    public void transfer() {
        Transfer transfer = new Transfer();
        transfer.input(money);
        transferList.add(transfer);
    }
}
