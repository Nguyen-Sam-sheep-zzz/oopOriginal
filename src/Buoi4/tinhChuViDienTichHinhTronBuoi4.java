package Buoi4;

import java.util.Scanner;

public class tinhChuViDienTichHinhTronBuoi4 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhập bán kính ( r )");
        double r = ip.nextDouble();
        System.out.println("Chu vi hình tròn là " + cv(r));
        System.out.println("Diện tích hình tròn là " + dt(r));
    }

    public static double cv(double r) {
        double cv = 0;
        return cv = 2 * Math.PI * r;
    }
    public static double dt(double r) {
        double dt = 0;
        return Math.PI * Math.pow(r, 2);
    }
}
