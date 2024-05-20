package Buoi5.MobileSend;

public class Main {
    public static void main(String[] args) {
        MobileSend iphone = new MobileSend("Iphone", 100);
        MobileSend nokia = new MobileSend("Nokia", 100);
        iphone.turnOn();
        nokia.turnOn();
        nokia.sendMess(iphone,"dcmm");
        iphone.showInput(1);
    }
}
