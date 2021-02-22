package atsignJar;

public class SavingsAccount extends BankAccount{
    int interest;
    public SavingsAccount(int balance, String owner, String accountNum) {
        super(balance, owner, accountNum, "Savings");
    }
}
