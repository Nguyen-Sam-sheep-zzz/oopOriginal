package Buoi4;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class hamTinhPTbac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập c: ");
        double c = sc.nextDouble();
        String result = giaiPTBac2(a, b, c);
        System.out.println(result);
    }

    public static String giaiPTBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0 && c == 0) {
                return "Phương trình vô số nghiệm ";
            } else if (b == 0 && c != 0) {
                return "Phương trình vô nghiệm ";
            } else {
                return "Phương trình có nghiệm " + (-c / b);
            }
        } else {
            double delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                return "Phương trình vô nghiệm ";
            } else if (delta == 0) {
                return "Phương trình có nghiệm kép " + (-b / 2 * a);
            } else {
                double x1 = ((-b + Math.sqrt(delta)) / 2 * a);
                double x2 = ((-b - Math.sqrt(delta)) / 2 * a);
                return "Phương trình có 2 nghiệm phân biệt x1 = " + x1 + " ; " + " x2 = " + x2;
            }
        }
    }
}
