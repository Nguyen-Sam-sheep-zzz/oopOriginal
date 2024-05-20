package Buoi5.LopDate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm ");
        int nam = sc.nextInt();
        System.out.println("nhập tháng");
        int thang = sc.nextInt();
        System.out.println("nhập ngày");
        int ngay = sc.nextInt();
        lopDate date = new lopDate(3, 8, 2008);
        System.out.println(date.tozString());
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        date.setDay(ngay);
        date.setMonth(thang);
        date.setYear(nam);
        date.setDate(ngay, thang, nam);
        System.out.println(date.tozString());
    }
}
