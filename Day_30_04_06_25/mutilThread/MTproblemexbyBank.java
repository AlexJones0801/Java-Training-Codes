package mutilThread;

// Problem occur in mutli threading 

class withdrawThread extends Thread {
    static int totalBalance = 1000;
    int amount;

    public withdrawThread(int paisa) {
        this.amount = paisa;
    }

    public void run() {
        if (totalBalance >= amount) {
            System.out.println("aapka paisa aa jaayga " + amount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            totalBalance -= amount;
            System.out.println("Total balance: " + totalBalance);
        } else {
            System.out.println("paisa nahi hai");
        }
    }
}

public class MTproblemexbyBank {
    public static void main(String[] args) {
        withdrawThread t1 = new withdrawThread(999);
        withdrawThread t2 = new withdrawThread(1500);

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}
