package Buoi5.StopWatch;

public class Main {
    public static void main(String[] args) {
        stopWatch stopWatch = new stopWatch();
        stopWatch.Start();
        System.out.println("wait");
        stopWatch.Stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
