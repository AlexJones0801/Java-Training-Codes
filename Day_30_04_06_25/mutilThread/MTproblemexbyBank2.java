package mutilThread;

// Problem occur in mutli threading 

class withdraw extends Thread {
    static int totalBalance = 1000;
    int amount;

    public withdraw(int paisa) {
        this.amount = paisa;
    }

    public void run() {
        // Synchronized method works same as we use join method or we can see
        // synchronized run thread one by one
        synchronized (withdraw.class) {
            if (totalBalance >= amount) {
                System.out.println("aapka paisa aa jaayga " + amount);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
                totalBalance -= amount;
                System.out.println("Total balance: " + totalBalance);
            } else {
                System.out.println("paisa nahi hai");
            }

        }
    }
}

public class MTproblemexbyBank2 {
    public static void main(String[] args) {
        withdraw t1 = new withdraw(800);
        withdraw t2 = new withdraw(1200);

        t1.start();
        t2.start();
    }
}
