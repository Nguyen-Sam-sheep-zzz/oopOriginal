import java.util.Scanner;

public class giaiPhuongTrinhBac1 {
    public static void main(String[] args) {
        System.out.println("Chương trình giải phương trình bậc 1 ");
        System.out.println("nhập phương trình của bạn với ax + b = c, vui lòng nhập a,b,c");
        Scanner ip = new Scanner(System.in);
        double a,b,c;
        System.out.println("nhập a: " );
        a = ip.nextDouble();
        System.out.println("nhập b: " );
        b = ip.nextDouble();
        System.out.println("nhập c: " );
        c= ip.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("x = " + answer);
        }
        else if ( b == c) {
            System.out.println("Vô số nghiệm");
        }
        else {
            System.out.println("vô nghiệm !");
        }
    }
}
