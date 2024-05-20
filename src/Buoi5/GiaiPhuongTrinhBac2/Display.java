package Buoi5.GiaiPhuongTrinhBac2;

public class Display {
    public void giaiPhuongTrinhBac2(double a, double b, double c) {
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
