package mutilThread;

// Another way of creating multi threading using interface

class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 2nd Thread");
    }
}

class diffWatofCMT {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.start();
        t2.start();
        try {
            t1.join(); // force compiler to run this thread first 
        } catch (Exception e) {
        }
        System.out.println("Main Thread");
    }
}
