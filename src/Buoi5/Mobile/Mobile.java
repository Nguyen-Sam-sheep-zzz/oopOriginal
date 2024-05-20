package Buoi5.Mobile;

import java.util.ArrayList;

public class Mobile {
    int pin;
    boolean status = false;
    ArrayList<String> input;
    ArrayList<String> output;
    String name;

    Mobile(String name, int pin) {
        this.name = name;
        this.pin = pin;
        this.output = new ArrayList<>();
        this.input = new ArrayList<>();
        if (this.pin > 100) {
            this.pin = 100;
        }
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public void displayStatus() {
        if (this.status) {
            System.out.println(this.name + " đang bật");
            decreasePin();
        } else {
            System.out.println(this.name + " đang tắt");
        }
    }

    public void setPin(int num) {
        if (this.status) {
            this.pin = num;
            if (this.pin > 100) {
                this.pin = 100;
            }
        }
    }

    public void decreasePin() {

        this.pin -= 1;
    }

    public void sendMess(Mobile phone, String mess) {
        if (this.status) {
            phone.receive(mess);// "Gửi đi tin nhắn" và tin nhắn đc lưu vào input của người nhận;
            this.output.add(mess);
            decreasePin();
        }
    }

    public void receive(String mess) {
        input.add(mess);
    }

    public void showAllInputMess() {
        if (this.status) {
            for (String i : this.input) {
                System.out.println(i);
            }
            decreasePin();
        }
    }

    public void showInputMess(int i) {
        if (this.status) {
            for (int j = 0; j < this.input.size(); j++) {
                if (j + 1 == i) {
                    System.out.println(this.input.get(j));
                }
            }
            decreasePin();
        }
    }

    public void showAllOutputMess() {
        if (this.status) {
            for (String i : this.output) {
                System.out.println(i);
            }
            decreasePin();
        }
    }

    public void showOutputMess(int i) {
        if (this.status) {
            for (int j = 0; j < this.output.size(); j++) {
                if (j + 1 == i) {
                    System.out.println(this.output.get(j));
                }
            }
            decreasePin();
        }
    }
}
