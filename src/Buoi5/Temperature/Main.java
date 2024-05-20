package Buoi5.Temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập C của bạn: ");
        int C = sc.nextInt();
        Temperature temp = new Temperature(C);
        System.out.println("Temperature to C : " + temp.getC());
        System.out.println("Temperature C to K: " + temp.CtoK());
        System.out.println("Temperature C to F: " + temp.CtoF());
    }
}
