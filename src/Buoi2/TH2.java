package Buoi2;

import java.util.Scanner;

public class TH2 {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Mời bạn nhập số tiền cần vay ");
        money = sc.nextDouble();
        System.out.println(" Số tháng bạn vay ");
        month = sc.nextInt();
        System.out.println(" Lãi xuất ");
        interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 1; i < month; i++) {
            totalInterest = money * (interestRate / 100) / 12 * month;
        }
        System.out.println(":))) " + totalInterest);
    }
}
