package Buoi4;

import java.util.Scanner;

public class kiemTraCanNangBuoi4 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        double height, weight;
        System.out.println("Nhập chiều cao của bạn (m)");
        height = ip.nextDouble();
        System.out.println("Nhập cân nặng của bạn (Kg)");
        weight = ip.nextDouble();
        System.out.println("BMI của bạn là " + bmi(weight,height));
        System.out.println(KTCN(bmi(weight,height)));
    }

    public static double bmi(double weight, double height) {
        double bmi = 0;
        return bmi = weight / Math.pow(height, 2);
    }

    public static String KTCN(double bmi) {
        if (bmi < 18) {
            return "Skeleton à";
        } else if (bmi < 25) {
            return "Chuẩn đấy :))";
        } else if (bmi < 30) {
            return "hơi BÉO rồi đấy";
        } else {
            return "HỐC ÍT THOII bệnh đấy :)))";
        }
    }
}
