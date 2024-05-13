package Buoi4;

import java.util.Scanner;

public class tinhGiaiThua {
    public static void main(String[] args) {
        System.out.println("Nhập số mà bạn muốn tính giai thừa ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("Kết quả: "+ tinhGiaiThua(input));
    }
    public static int tinhGiaiThua(int n ) {
        int giaithua = 1;
        if (giaithua == 1 || giaithua == 0) {
            return giaithua;
        }
        else {
            for (int i = 2; i < n; i++) {
                giaithua = giaithua * i;
            }
            return giaithua - 1;
        }
    }
}
