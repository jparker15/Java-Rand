package Account;

public class SavingsAccount extends BankAccount {

    private int interest;
    public SavingsAccount(int balance, String owner, String accountNum) {
        super(balance, owner, accountNum, "Savings");
        this.interest = interest;
    }

    public void applyInterest(){
        int amount = balance * (interest / 100);
    }
}
