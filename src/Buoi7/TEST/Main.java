package Buoi7.TEST;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.addPhone(new Phone("IP15", 30));
        shop.addPhone(new Phone("IP14", 20));
        shop.addPhone(new Phone("IP13", 17));
        for (int i = 0; i < shop.getCount(); i++) {
            System.out.println(shop.getPhoneByIndex(i));
        }
        Phone phone = shop.getPhoneByModel("IP13");
        if (phone != null) {
            System.out.println(phone);
        } else {
            System.out.println("Khong tim thay");
        }
    }
}
