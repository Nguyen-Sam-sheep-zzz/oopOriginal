import java.util.Scanner;

public class tinhChuViDienTichHinhTron {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhập bán kính ( r )");
        double r = ip.nextDouble();
        double cv = 2 * Math.PI * r;
        double dt = Math.PI * Math.pow(r,2);
        System.out.println("Chu vi hình tròn là " + cv);
        System.out.println("Diện tích hình tròn là " + dt);
    }
}
