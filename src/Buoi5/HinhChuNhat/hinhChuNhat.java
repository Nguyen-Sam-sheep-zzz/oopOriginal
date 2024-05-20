package Buoi5.HinhChuNhat;

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
}
