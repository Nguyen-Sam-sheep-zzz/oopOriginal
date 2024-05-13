package Buoi4;

import java.util.Scanner;

public class demSoKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kì");
        String chuoi = sc.nextLine();
        System.out.println("số lần lặp kí tự của bạn là " + demkitu(chuoi));
    }
    public static int demkitu(String chuoi) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kí tự bạn muốn biết số lần xuất hiện trong chuỗi ");
        char a = sc.next().charAt(0);
        int b = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == a) {
                b++;
            }
        }
        return b;
    }
}

