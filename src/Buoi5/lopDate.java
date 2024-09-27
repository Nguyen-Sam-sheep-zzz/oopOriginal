package Buoi5;

import java.util.Scanner;

public class lopDate {
    int day, month, year;
    lopDate(int day, int month, int year ) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setDate (int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public String tozString() {
        return day + " " + month + " " + year;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập năm ");
        int nam = sc.nextInt();
        System.out.println("nhập tháng");
        int thang = sc.nextInt();
        System.out.println("nhập ngày");
        int ngay = sc.nextInt();
        lopDate date = new lopDate(3,8,2008);
        System.out.println(date.tozString());
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        date.setDay(ngay);
        date.setMonth(thang);
        date.setYear(nam);
        date.setDate(ngay,thang,nam);
        System.out.println(date.tozString());
    }
}
