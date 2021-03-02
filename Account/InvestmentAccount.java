package Account;

public class InvestmentAccount extends BankAccount{
    private int investment;
    private int period = 3;

    public InvestmentAccount(int balance, String owner, String accountNum, String type, int investment){
        super(balance,owner,accountNum,"Investment");
        this.investment = investment;

    }

    private void applyInvestment(){
        int appliedInvestment = balance * (investment/100);

    }

}
