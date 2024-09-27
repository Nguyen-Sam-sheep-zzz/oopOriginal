package Buoi1;

import java.util.Scanner;

public class kiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập năm cần kiểm tra ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" Năm nhuận ok ");
        } else {
            System.out.println(" Năm không nhuận ");
        }
    }
}
