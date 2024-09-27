package Buoi4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class kiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm của bạn");
        int n = sc.nextInt();
        if (kiemTraNamNhuan(n) == false) {
            System.out.println("Năm không nhuận");
        } else {
            System.out.println("Là năm nhuận");
        }
        System.out.println("Liệt kê năm nhuận từ 2000 - 3000 ");
        for (int i = 2000; i <= 3000; i++) {
            if (kiemTraNamNhuan(i) == true) {
                System.out.println(i);
            }
        }
    }
    public static boolean kiemTraNamNhuan(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
