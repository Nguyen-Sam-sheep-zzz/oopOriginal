package Buoi5_2.RemoteAndTV;

public class Main {
    public static void main(String[] args) {
        Remote remote1 = new Remote(1);
        Tv Sony = new Tv("Sony",false);
        Sony.turnOn();
        Sony.changeTheChannelTv(7);
        remote1.changeTheChannel(3);
        System.out.println("Âm lượng ban đầu: " + Sony.getVolume());
        Sony.controlVolumeTv(2);
        System.out.println(Sony.getStatusTv());
        remote1.connectToTv(Sony);
        remote1.turnOff();
    }
}
