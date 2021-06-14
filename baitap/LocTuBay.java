package baitap;

import java.util.Scanner;

public class LocTuBay {
    public static void locTuBay() {
        String[] strA = {"fuck", "sex", "rape", "shit", "bitch", "damn"};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tu bay de loc");
        String strB = input.nextLine();
        String[] strC = strB.split(" ");
        for(int i = 0; i < strC.length; i++) {
            for (int j = 0; j < strA.length; j++) {
                if(strC[i].equals(strA[j])) {
                    strC[i]= strC[i].replace(strC[i].charAt(1), '*');
                }
            }
            System.out.print(strC[i] + " ");
        }
    }

}
