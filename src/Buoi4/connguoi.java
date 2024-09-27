package Buoi4;

public class connguoi {
    private String name;
    private int age;
    private String sex;

    connguoi(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public void noi() {
        System.out.println(this.name + " noi: nhang");
    }

    public void an(String food) {
        System.out.println(this.name + " dang an " + food);
    }

    public void setSex(String sex) {
        this.sex = sex;
        System.out.println(this.name + " la " + this.sex);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println(this.name + " tuoi: " + this.age);
    }


    public static void main(String[] args) {
        connguoi Sam = new connguoi("Sam", 19, "nam");
        connguoi Nhan = new connguoi("Nhan", 19, "nam");
        Sam.noi();
        Nhan.noi();
        Sam.an("com");
        System.out.println(Sam.sex);
        Sam.setSex("nu");
        System.out.println(Sam.sex);
        Sam.setAge(18);
    }

    public static class hienThi20SoNguyenToDauTienBuoi4 {

    }
}
