package Buoi3;

import java.util.Scanner;

public class Bai8_demSoLanXuatHienKiTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kì");
        String chuoi = sc.nextLine();
        System.out.println("Nhập kí tự bạn muốn biết số lần xuất hiện trong chuỗi ");
        char a = sc.next().charAt(0);
        int b = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == a) {
                b++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự " + a + " trong chuỗi " + chuoi + " = " + b);
    }
}
