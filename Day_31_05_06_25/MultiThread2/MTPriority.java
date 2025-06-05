package MultiThread2;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " is running with priority " + getPriority());
            Thread.yield();
        }
    }
}

public class MTPriority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Min Priority Thread");
        t2.setName("Max Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY); // 1  
        t2.setPriority(Thread.MAX_PRIORITY); // 10 Priority 

        t1.start();
        t2.start();
    }
}
