package Buoi2;

import java.util.Scanner;

public class TH1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần kiểm tra ");
        int number = sc.nextInt();
        if (number < 2) {
            System.out.println(number + "Không là số nguyên tố");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % 2 == 0) {
                    check = false;
                }
            }
            if (check) {
                System.out.println(number + " là số nguyên tố");
            } else {
                System.out.println(number + " không là số nguyên tố");
            }
        }

    }
}
