package Buoi6.StaticMethod.AccessModifier;

public class Main {
    public static void main(String[] args) {
        AccessModifier.Circle circle = new AccessModifier.Circle(4);
        System.out.println("Diện tích:" + circle.getArea() + ", " + "Bán kính:" + circle.getRadius());
    }
}
