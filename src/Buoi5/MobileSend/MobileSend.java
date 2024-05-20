package Buoi5.MobileSend;

import java.util.ArrayList;

public class MobileSend {
    boolean status = false;
    String name;
    int pin;
    ArrayList<String> input;
    ArrayList<String> output;

    MobileSend(String name, int pin) {
        this.name = name;
        this.pin = pin;
        this.input = new ArrayList<>();
        this.output = new ArrayList<>();
        if (pin > 100) {
            this.pin = 100;
        }
    }

    public void pinNt() {
        this.pin -= 1;
    }

    public void displayStatus() {
        if (this.status) {
            System.out.println(this.name + " Đang bật");
        } else {
            System.out.println(this.name + " Đang tắt ");
        }
    }

    public void sendMess(MobileSend phone, String mess) {
        if (this.status) {
            phone.input.add(mess);
            this.output.add(mess);
            pinNt();
        }
    }

    public void showInput(int n) {
        if (this.status) {
            for (int i = 0; i < input.size(); i++) {
                if (i + 1 == n) {
                    System.out.println(this.input.get(i));
                }
            }
            pinNt();
        }
    }

    public void showOutput(int n) {
        if (this.status) {
            for (int j = 0; j < output.size(); j++) {
                if (j + 1 == n) {
                    System.out.println(this.output.get(j));
                }
            }
            pinNt();
        }
    }

    public void setPin(int a) {
        if (a > 100) {
            this.pin = 100;
        }
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }
}
