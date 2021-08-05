package KiemTraCuoiKi_1;

import java.awt.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        mainn();
    }

    public static void mainn(){
        Scanner scanner = new Scanner(System.in);
        Constroller constroller = new Constroller();
        constroller.getData();
        Menu.mainMenu();
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                constroller.login();
                //Đăng nhập
                break;
            case 2:
                constroller.createNewAccount();
                //Đăng ký
                break;
            default:
                break;
        }
    }

}