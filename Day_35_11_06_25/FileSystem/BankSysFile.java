package FileSystem;

import java.util.*;
import java.io.*;

class Transactions {
    String type;
    double amount;

    Transactions(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String toString() {
        return type + ": Rs. " + amount;
    }

}

class Account {
    private String name;
    private int accountNumber;
    private double balance;
    ArrayList<Transactions> transaction = new ArrayList<>();

    Account(int accountNumber, String name) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transaction.add(new Transactions("Deposit", amount));

            System.out.println("Deposited successfully!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transaction.add(new Transactions("Withdrawal", amount));
            System.out.println("Withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: Rs. " + balance);
    }

    public void viewTransactions() {
        try {
            File fileRead = new File("Day_35_11_06_25/FileSystem/transaction.txt");
            Scanner sc = new Scanner(fileRead);
            
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public void saveAccount() {
        try {
            FileWriter filew = new FileWriter("Day_35_11_06_25/FileSystem/accountDetails.txt");
            filew.write("Account Number: " + getAccountNumber() + "\nAccount Holder Name: " + getName() + "\nBalance: "
                    + balance);
            filew.close();
            System.out.println("Successfuly written");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void saveTransactionHistory() {
        // This true argument used to append the data means at the end of the file
        try(FileWriter fw = new FileWriter("Day_35_11_06_25/FileSystem/transaction.txt", true)) {
            fw.write("Account Holder Name: " + getName() + "\n");
            for (Transactions t : transaction) {
                fw.write(t.toString() + "\n");
            }
            transaction.clear();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

}

class BankSysFile {
    static Scanner sc = new Scanner(System.in);
    static Account account;

    public static void main(String[] args) {
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        account = new Account(47267, name);
        account.saveAccount();
        System.out.println("Account created successfully. Account Number: " + account.getAccountNumber());

        int choice;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Check Balance\n4. View Transactions\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    account.saveTransactionHistory();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double with = sc.nextDouble();
                    account.withdraw(with);
                    account.saveTransactionHistory();
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.viewTransactions();
                    break;
                case 5:
                    System.out.println("Thank you for using the Bank App.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

    }
}