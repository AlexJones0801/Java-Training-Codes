class Bank {
    static String bank_name = "SBI";
    String account_holder;
}

public class Q15_Bank2 {
    
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        
        b1.account_holder = "Vicky";
        b2.account_holder = "Nikki";
        
        System.out.println("Bank name: " + Bank.bank_name);
        System.out.println("Account Holder 1: " + b1.account_holder + "\nAccount Holder 2: " + b2.account_holder);
    }
    
}