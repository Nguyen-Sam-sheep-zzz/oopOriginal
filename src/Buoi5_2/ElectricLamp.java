package Buoi5_2;

public class ElectricLamp {
    boolean Status;
    String name;
    ElectricLamp(boolean Status, String name) {
        this.Status = Status;
        this.name = name;
    }

    public void turnOn() {
        Status = true;
        System.out.println("Đèn " + this.name + " đang bật ");
    }

    public void turnOff() {
        Status = false;
        System.out.println("Đèn " + this.name + " đang tắt ");
    }
}

class swichButton {
    boolean status;
    ElectricLamp Lamp;

    swichButton() {

    }


    public void connectToLamp(ElectricLamp name) {
        this.Lamp = name;
    }

    public void switchOff() {
        status = false;
        System.out.println("Đèn " + Lamp.name + " tắt bởi nút ");
    }

    public void switchOn() {
        status = true;
        System.out.println("Đèn " + Lamp.name + " bật bởi nút ");
    }

    public static void main(String[] args) {
        ElectricLamp lamp = new ElectricLamp(true, "Đèn 1");
        ElectricLamp lamp2 = new ElectricLamp(true, "Đèn 2");
        lamp2.turnOff();
        swichButton button1 = new swichButton();
        lamp.turnOn();
        button1.connectToLamp(lamp2);
        button1.switchOn();
    }
}


