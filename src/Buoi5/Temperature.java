package Buoi5;

import java.util.Scanner;

public class Temperature {
    private static double C;

    Temperature(double C) {
        Temperature.C = C;
    }

    public static double getC() {
        return C;
    }

    public static double getF() {
        return (C * 9 / 5) + 32;
    }

    public static double getK() {
        return (C + 274.15);
    }

    public static void display() {
        System.out.println("Temperature to C : " + getC());
        System.out.println("Temperature C to K: " + getK());
        System.out.println("Temperature C to F: " + getF());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập C của bạn: ");
        int C = sc.nextInt();
        Temperature temp = new Temperature(C);
        temp.display();
    }
}
