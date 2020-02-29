package day46;

import java.security.PublicKey;

public class SavingsAccount extends BankAccount{

//    String accountHolder;
//    long accountNumber;
//    double balance;
    double interestRate;

    public SavingsAccount(String accountHolder, long accountNumber, double balance, double interestRate) {

        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    // BAD IDEA TO HAVE MAIN HERE, JUST DOING IT ANYWAY
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount("Mohammed", 12345, 50000,4.2);
        System.out.println("s1 = " + s1);

        s1.withdraw(10000);
        System.out.println("s1 = " + s1);
    }

    // in our SavingAccount, if we withdraw amount you withdraw
    // you get 30 dollar penalty
    // so we will override the withdraw method to reflect this requirement
    public void withdraw(int amount) {
        // taking away $30 on top of what you withdraw
//        balance = balance - amount -30;
        super.withDraw(30);
        super.withDraw(amount);
    }

    @Override
    // it's optional, once being used, it will enforce overriding rule
        // if any rule does not match it will not even compile
        // so it's always good to use it prevent accidental errors
    public String toString() {
        return "SavingsAccount = " +
                "interestRate = " + interestRate +
                ", accountHolder = '" + accountHolder + '\'' +
                ", accountNumber = " + accountNumber +
                ", balance=" + balance;
    }

    @Override
    public void deposit(int amount) {

        // balance += amount + amount * interestRate;
        // calculating the interest rate and casting to int variable
        // because deposit method accept int data type not double !!!
        int actualAmount = (int) (amount + amount * interestRate);
        super.deposit(actualAmount);
    }

}
