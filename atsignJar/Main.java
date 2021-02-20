package atsignJar;

public class Main {

    public static void main(String[] args) {
        BankAccount myAcct = new BankAccount(100000,"Jar", "6969","Savings");
        CheckingAccount myChecking = new CheckingAccount(100000,"Jar", "6969", 50000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        myAcct.deposit(1000000);
        System.out.println(myAcct.toString());
        myAcct.withdraw(1900);
        myChecking.withdraw(20000);
        System.out.println(myAcct.toString());
        System.out.println(myChecking.toString());
        myChecking.withdraw(50000);
        System.out.println(myChecking.toString());
    }
}
