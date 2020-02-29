package day40;

public class BankAccount {

    String accountType;
    String accountHolder;
    long accountNumber;
    public double balance;

    // setAllTheValue
    public void setAllTheValue(String newAccountType, String newAccountHolder, long newAccountNumber, double newBalance) {
        accountType = newAccountType;
        accountHolder = newAccountHolder;
        accountNumber = newAccountNumber;
        balance = newBalance;
    }

    // showAccountBalance
    public void showAccountBalance() {
        System.out.println("current balance = " + balance);
    }

    // showAccountHolderAccountType
    public void showAccountHolderAccountType() {
        System.out.println("account holder is " + accountHolder + " accountType = " + accountType);
    }

    // getBalance return the balance
    public double getBalance() {
        // after doing a lot of validation to make sure you have correct credential to view the balance
        return balance;
    }

    // deposit(amount)
    public void deposit(double amount) {
         balance = balance + amount; // balance += amount
    }

    // withdraw(amount)
    public void withdraw (double amount) {
        balance = balance - amount;
    }

    // withdraw$100Cash
    public void withdraw$100Cash() {
        withdraw(100);
    }

    // buyProduct(productPrice, count)
    public void buyProduct(double productPrice, int count) {
        balance = balance - (productPrice * count);
    }


    // toString
    public String toString() {
        return "BankAccount{" +
                "accountType='" + accountType + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
