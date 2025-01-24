class VolatileDemo extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Thread is running...");
        }
        System.out.println("Thread stopped.");
    }

    public void stopThread() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileDemo thread = new VolatileDemo();
        thread.start();
        Thread.sleep(1000);
        thread.stopThread();
    }
}
