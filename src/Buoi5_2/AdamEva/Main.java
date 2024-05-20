package Buoi5_2.AdamEva;

public class Main {
    public static void main(String[] args) {
        int i =0;
        Apple apple = new Apple();
        Human Adam = new Human("Adam", true, 70);
        Human Eva = new Human("Eva", false, 70);
        while (i < 10) {
            Adam.eat(apple);
            i++;
        }
        System.out.println(Adam.getWeight());
        System.out.println(Adam.checkApple(apple));
        System.out.println(apple.getWeight());
        Adam.displayGender();
        Eva.displayGender();
    }
}
