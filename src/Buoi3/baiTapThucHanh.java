package Buoi3;

import java.util.Scanner;
import java.time.LocalDateTime;

public class baiTapThucHanh {
    public static void main(String[] args) {
        do {
            LocalDateTime current = LocalDateTime.now();
            System.out.println("Nhập từ time để biết thời gian hiện tại ");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            switch (input) {
                case "exit":
                    return;
                case "time":
                    System.out.println("Thời gian hiện tại " + current);
                    break;
                default:
                    System.out.println("Tớ không hiểu");
                    break;
            }
        }
        while (true);
    }
}
