package Buoi4;

import java.util.Scanner;

public class giaiPhuongTRinhBac1Buoi4 {
    public static void main(String[] args) {
        System.out.println("Chương trình giải phương trình bậc 1 ");
        System.out.println("nhập phương trình của bạn với ax + b = c, vui lòng nhập a,b,c");
        Scanner ip = new Scanner(System.in);
        double a, b, c;
        System.out.println("nhập a: ");
        a = ip.nextDouble();
        System.out.println("nhập b: ");
        b = ip.nextDouble();
        System.out.println("nhập c: ");
        c = ip.nextDouble();
        System.out.println(displayGiaiPTBac1(a,b,c));
    }

    public static String displayGiaiPTBac1(double a, double b, double c) {
        if (a != 0) {
            double answer = (c - b) / a;
            return "x = " + answer;
        } else if (b == c) {
            return "Vô số nghiệm";
        } else {
            return " Vô nghiệm ";
        }
    }
}
