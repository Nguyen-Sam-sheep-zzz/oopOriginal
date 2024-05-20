package Buoi5_2.ElectricLamp;

public class Main {
    public static void main(String[] args) {
        ElectricLamp lamp = new ElectricLamp(false, "Đèn 1");
        ElectricLamp lamp2 = new ElectricLamp(true, "Đèn 2");
        lamp2.turnOff();
        swichButton button1 = new swichButton();
        lamp.turnOn();
        button1.connectToLamp(lamp2);
        button1.switchOn();
    }
}
