package multi_threading;

class MyThread extends Thread {
    public void run() { // Pre-Built function of Thread and we cant call it directly
        System.out.println("RAM");
        try {
            Thread.sleep(4000); // Use to sleep thread
        } catch (Exception e) {
        }
        System.out.println("BALRAM");
    }
}

public class Practice_MultiThreading {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        System.out.println("SIYA");
    }
}