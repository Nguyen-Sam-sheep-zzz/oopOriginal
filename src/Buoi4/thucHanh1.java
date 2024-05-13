package Buoi4;

import java.util.Scanner;

public class thucHanh1 {
    public static void main(String[] args) {
        int input = -1;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Chuyển đổi từ C - F");
            System.out.println("2. Chuyển đổi từ F - C");
            System.out.println("0. Exit");
            input = sc.nextInt();
            switch (input) {
                case 0:
                    return;
                case 1:
                    System.out.println("enter C to F");
                    double c = sc.nextDouble();
                    System.out.println(FtoC(c) + " C");
                    break;
                case 2:
                    System.out.println("enter F to C");
                    double f = sc.nextDouble();
                    System.out.println(CtoF(f) + " C");
                    break;
                default:
                    System.out.println("vui lòng chọn theo menu ");
                    break;
            }
        }
        while (input != 0);
    }

    public static double FtoC(double f) {
        double c;
        c = (5.0 / 9) * (f - 32);
        return c;
    }

    public static double CtoF(double c) {
        double f;
        f = c / (5.0 / 9) + 32;
        return f;
    }
}
