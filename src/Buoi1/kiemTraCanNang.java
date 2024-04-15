package Buoi1;

import java.util.Scanner;

public class kiemTraCanNang {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double height, weight, bmi;
        System.out.println("Nhập chiều cao của bạn (m)");
        height = ip.nextDouble();
        System.out.println("Nhập cân nặng của bạn (Kg)");
        weight = ip.nextDouble();
        bmi = weight / Math.pow(height, 2);
        if (bmi < 18) {
            System.out.println("Skeleton à");
        } else if (bmi < 25) {
            System.out.println("Chuẩn đấy :))");
        } else if (bmi < 30) {
            System.out.println("hơi BÉO rồi đấy");
        } else {
            System.out.println("HỐC ÍT THOII bệnh đấy :)))");
        }
    }
}
