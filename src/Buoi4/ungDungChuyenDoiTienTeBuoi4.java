package Buoi4;

import java.util.Scanner;

public class ungDungChuyenDoiTienTeBuoi4 {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhập số tiền cần chuyển đổi \"USD\" ");
        usd = ip.nextDouble();
        System.out.println("số tiền của bạn " + UDCD(usd) + " VND ");
    }
    public static double UDCD (double usd) {
        double vnd = 23000;
        double exchange = 0;
        return exchange = usd * vnd;
    }
}
