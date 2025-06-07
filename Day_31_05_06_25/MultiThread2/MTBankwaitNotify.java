package MultiThread2;

public class MTBankwaitNotify {
    int totalBalance = 1000;
    int amount;

    public synchronized void withdraw(int paisa) {
        System.out.println("Trying to withdraw: " + paisa);
        if (totalBalance < paisa) {
            System.out.println("Not enough balance. Cannot withdraw"+ paisa);
            
        } else {
            totalBalance -= paisa;
            System.out.println("Withdrawal Successful " + paisa + ",\nRemaining Balance: " + totalBalance);
        }

    }

    public synchronized void deposit(int paisa) {
        System.out.println("Depositing: " + paisa);
        totalBalance += paisa;
        System.out.println("Deposit successful. New balance: " + totalBalance);
        notify();
    }

    public static void main(String[] args) {
        MTBankwaitNotify bank = new MTBankwaitNotify();
        Thread t1 = new Thread(()-> {
            bank.withdraw(800);
        });
        
        Thread t2 = new Thread(()-> {
            bank.withdraw(500);
        });

        t1.start();
        t2.start();
    }
}