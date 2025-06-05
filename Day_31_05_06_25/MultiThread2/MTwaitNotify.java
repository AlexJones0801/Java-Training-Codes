package MultiThread2;

public class MTwaitNotify {
    Boolean isSignaled = false;

    public synchronized void sendSignal() {
        isSignaled = true;
        System.out.println("Producer: Sending signal....");
        notify();
    }

    public synchronized void waitForSignal() {
        while (!isSignaled) {
            try {
                System.out.println("Consumer: Waiting for signal");
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Consumer: Got the signal! Processing");
    }

    public static void main(String[] args) {
        MTwaitNotify obj = new MTwaitNotify();

        Thread consumer = new Thread(() -> {
            obj.waitForSignal();
        });

        Thread producer = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            obj.sendSignal();
        });

        consumer.start();
        producer.start();
    }
}
