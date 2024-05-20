package Buoi5_2.RemoteAndTV;

public class remoteAndTivi {

}
class Remote {
    boolean status = false;
    int id;
    Tv Tv;
    Remote(int id) {
        this.id = id;
    }

    public void connectToTv(Tv tv) {
        this.Tv = tv;
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

    public void turnOff() {
         Tv.turnOff();
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
    public void turnOff(){
        statusTv = false;
        System.out.println("Tv đã tắt");
    }
}
