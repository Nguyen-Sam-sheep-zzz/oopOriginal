package Buoi5_2;
import java.sql.SQLOutput;

public class remoteAndTivi {
    public static void main(String[] args) {
        Remote remote1 = new Remote(1);
        Tv Sony = new Tv("Sony",false);
        Sony.turnOn();
        Sony.changeTheChannelTv(7);
        remote1.changeTheChannel(3);
        System.out.println("Âm lượng ban đầu: " + Sony.getVolume());
        Sony.controlVolumeTv(2);
        System.out.println(Sony.getStatusTv());
    }
}
class Remote {

    boolean status = false;
    int id;
    Remote(int id) {
        this.id = id;
    }

    public void changeTheChannel(int change) {
        if(status){
            System.out.println("Đã chọn kênh: " + change + " bằng điều khiển");
        }
        else {
            System.out.println("Tv chưa bật");
        }
    }

    public void controlVolume(int Volume) {
        if (status) {
            System.out.println("Đã chỉnh âm lượng " + Volume + " bằng điều khiển");
        }
        else {
            System.out.println("Tv chưa bật");
        }
    }
}

class Tv {
    String name;
    String filmRunning;
    int volume;
    boolean statusTv = false;

    Tv(String name, boolean statusTv) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void changeTheChannelTv(int channel) {
        if(statusTv) {
            System.out.println("Kênh đã chọn: " + channel );
        }
        else {
            System.out.println("Tv chưa bật");
        }
    }

    public void controlVolumeTv(int volume) {
        if(statusTv) {
            System.out.println("Âm lượng sau khi chỉnh: " + volume);
        }
        else {
            System.out.println("Tv chưa bật");
        }
    }
    public boolean getStatusTv() {
        return statusTv;
    }

    public void setStatusTv(boolean statusTv) {
        this.statusTv = statusTv;
    }
    public void turnOn(){
        statusTv = true;
        System.out.println("Tv đã bật");
    }
}
