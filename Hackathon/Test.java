package Hackathon;

import java.util.Scanner;

public class Test {
    public void isTrangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("3 canh vua nhap la 3 canh cua 1 tam giac");
        }else {
            System.out.println("3 canh vua nhap ko phai 3 canh cua 1 tam giac");
        }
    }

    public void nhap() {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần chuẩn hóa");
        str = scanner.nextLine();
        chuanHoa(str);
    }

    public void chuanHoa(String s) {
        s = s.toLowerCase();
        String[] ss = s.split("\\s+");
        String strA ="";
        for(int i = 0; i < ss.length; i++) {
            char[] data = ss[i].toCharArray();
            data[0] = Character.toUpperCase(data[0]);
            strA += String.valueOf(data) + " ";
        }
        System.out.println("Chuỗi sau khi chuẩn hóa: " + strA);
    }
}
