package Buoi5.StopWatch;

public class stopWatch {
    private double startTime = 0;
    private double stopTime = 0;
    private boolean running = false;

    public void Start() {
        this.startTime = System.nanoTime();
        this.running = true;
    }

    public void Stop() {
        this.stopTime = System.nanoTime();
        this.running = false;
    }

    public double getElapsedTime() { // Tính thời gian trôi qua bằng mls
        double elapsed;
        if (running) {
            elapsed = (System.nanoTime() - startTime);
        } else {
            elapsed = (stopTime - startTime);
        }
        return elapsed;
    }
}
