class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    
    BankAccount(int accno, String accholder, double bal) {
        this.accountNumber = accno;
        this.accountHolder = accholder;
        this.balance = bal;
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
    
    public void deposit (double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        } else if(amount > balance) {
            System.out.println("Insufficient balance.");
        }
        else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
    
public class Q3_BankAccount {
    
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(132,"Shin",1000);
        
        b1.deposit(500);
        b1.withdraw(800);
    }
    
}