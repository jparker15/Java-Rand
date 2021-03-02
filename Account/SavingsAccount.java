package Account;

public class SavingsAccount extends BankAccount {
    private int interest;

    public SavingsAccount(int balance, String owner, String accountNum, int interest) {
        super(balance, owner, accountNum, "Savings");
        this.interest = interest;
    }

    public void applyInterest(){
//        System.out.println("debug balance:" + balance);
//        System.out.println("debug  interest:" + ((double) interest / 100.0));
        //type casting
//        int amount = (int) (balance * (interest / 100.0));
//        System.out.println("debug:  amount:" + amount);
        //inlining instead of storing an amount variable
        balance += (int) (balance * (interest / 100.0)) ;
    }
}
