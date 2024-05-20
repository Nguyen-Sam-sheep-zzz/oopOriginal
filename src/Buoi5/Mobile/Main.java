package Buoi5.Mobile;

public class Main {
    public static void main(String[] args) {
        Mobile iphone = new Mobile("iphone", 100);
        Mobile nokia = new Mobile("Nokia", 100);
        iphone.turnOn();
        nokia.turnOn();
        nokia.sendMess(iphone, "Ngu");
        nokia.sendMess(iphone, "Pin m yeu vl");
        iphone.showAllInputMess();
        iphone.showInputMess(2);
        nokia.showAllOutputMess();
    }
}
