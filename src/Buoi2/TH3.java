package Buoi2;

import java.util.Scanner;

public class TH3 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập a ");
        a = sc.nextInt();
        System.out.println(" nhập b ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println(" Không có UCLN ");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(" UCLN " + a);
    }
}
