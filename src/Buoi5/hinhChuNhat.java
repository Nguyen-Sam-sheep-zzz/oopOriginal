package Buoi5;

public class hinhChuNhat {
    int width, height;

    hinhChuNhat(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPer() {
        return this.width + this.height;
    }
    public void display() {
        System.out.println("Diện tích là: " + getArea());
        System.out.println("Chu vi là:" + getPer());
        System.out.println();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        hinhChuNhat hinhChuNhat = new hinhChuNhat(3, 7);
        hinhChuNhat.display();
    }
}
