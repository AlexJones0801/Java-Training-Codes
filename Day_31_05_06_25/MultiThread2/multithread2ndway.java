package MultiThread2;

public class multithread2ndway {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Thread t1 = new Thread(() -> {
            System.out.println("Hello T1");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println("Hum last me aayengee");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Hiii T2");
        });

        t1.start();
        t2.start();
    }
}
