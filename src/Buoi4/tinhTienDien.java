package Buoi4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class tinhTienDien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền điện của bạn ");
        double input = sc.nextDouble();
        System.out.println("Số tiền điện của bạn là " + tinhTienDien(input) + " VND");
    }
    public static double tinhTienDien(double a) {
        double result = 0;
        if (a > 400) {
            result += (a - 400) * 2701;
            a = 400;
        }
        if (a >= 300 && a <= 400) {
            result += (a - 300) * 2615;
            a = 300;
        }
        if (a > 200 && a <= 300) {
            result += (a - 200) * 2340;
            a = 200;
        }
        if (a > 100 && a <= 200) {
            result += (a - 100) * 1858;
            a = 100;
        }
        if (a > 50 && a <= 100) {
            result += (a - 50) * 1600;
            a = 50;
        }
        if (a <= 50) {
            result += a * 1549;
        }
        return result;
    }
}
