package Buoi5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class giaiPhuongTrinhBac2 {
    private static double a, b, c, delta;
    private static Scanner sc = new Scanner(System.in);

    public static double getA() {
        return a;
    }

    public static double getB() {
        return b;
    }

    public static double getC() {
        return c;
    }

    public static double getDiscriminant() {
        return delta = (b * b) - (4 * a * c);
    }

    public static double getRoot1() {
        return (-b + Math.sqrt(delta));
    }

    public static double getRoot2() {
        return (-b - Math.sqrt(delta));
    }

    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2");
        System.out.println("Nhập a ");
        double a = sc.nextDouble();
        System.out.println("Nhập b ");
        double b = sc.nextDouble();
        System.out.println("Nhập c ");
        double c = sc.nextDouble();
        giaiPhuongTrinhBac2(a, b, c);
    }

    public static void giaiPhuongTrinhBac2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm ");
            } else {
                System.out.println("Phương trình có một nghiệm: x = " + (-c / b));
            }
        }
        double delta = (b * b) - (4 * a * c);
        double x1 = 0;
        double x2 = 0;
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.println("x1 = " + (-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b / 2 * a));
        } else {
            System.out.println("Phương trình vô nghiệm ");
        }
    }
}
