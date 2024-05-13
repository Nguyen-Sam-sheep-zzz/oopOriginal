package Buoi1;

import java.util.Scanner;

public class anhKhanhCCTSenglish {
    public static void main(String[] args) {
        Scanner infor = new Scanner(System.in);
        System.out.println("Hãy nhập số mà bạn muốn đọc thành chữ vào đây: ");
        int number = infor.nextInt();
        while (number >= 1000 || number < 0) {
            System.out.println("Ứng dụng chỉ có thể nhập được số có nguyên dương có 3 chữ số; bạn hãy nhập lại số mà bạn muốn chuyển đổi xuống đây:");
            number = new Scanner(System.in).nextInt();
        }
        int hundred = number / 100;
        int ten = (number % 100) / 10;
        int one = number % 10;
        String[] hundredarray = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
        String[] tenarray = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] onearray = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        if ( number < 20) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number > 100 && ten == 0) {
            System.out.println(hundredarray[hundred] + onearray[one]);
        } else if (number > 100 && ten == 1) {
            switch (one) {
                case 0:
                    System.out.println(hundredarray[hundred] + " ten");
                case 1:
                    System.out.println(hundredarray[hundred] + " eleven");
                    break;
                case 2:
                    System.out.println(hundredarray[hundred] + " twelve");
                    break;
                case 3:
                    System.out.println(hundredarray[hundred] + " thirteen");
                    break;
                case 4:
                    System.out.println(hundredarray[hundred] + " fourteen");
                    break;
                case 5:
                    System.out.println(hundredarray[hundred] + " fifteen");
                    break;
                case 6:
                    System.out.println(hundredarray[hundred] + " sixteen");
                    break;
                case 7:
                    System.out.println(hundredarray[hundred] + " seventeen");
                    break;
                case 8:
                    System.out.println(hundredarray[hundred] + " eighteen");
                    break;
                case 9:
                    System.out.println(hundredarray[hundred] + " nineteen");
                    break;
            }
        } else {
            System.out.println(hundredarray[hundred] + " " + tenarray[ten] + " " + onearray[one]);
        }
    }
}
