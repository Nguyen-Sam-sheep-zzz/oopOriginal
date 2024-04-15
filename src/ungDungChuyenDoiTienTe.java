import java.util.Scanner;

public class ungDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhập số tiền cần chuyển đổi \"USD\" ");
        usd = ip.nextDouble();
        double exchange = usd * vnd;
        System.out.println("số tiền của bạn " + exchange + " VND ");
    }
}
