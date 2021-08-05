package Hackathon2.SoNguyenTo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Nhập vào một số");
            String a = scanner.nextLine();
            if(a.equalsIgnoreCase("q") || a.equalsIgnoreCase("x")){
                break;
            }
            else{
               int b = Integer.parseInt(a);
               int count = 0;
               for(int i = 2; i < b; i++) {
                   if(b % i == 0){
                       count++;
                   }
               }if(b > 1 && count == 0) {
                    System.out.println(b + " là số nguyên tố");
                }else System.out.println(b + " không là số nguyên tố");
            }
        }
    }
}
