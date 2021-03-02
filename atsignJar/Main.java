package atsignJar;

import Account.*;

public class Main {

    public static void main(String[] args) {
        BankAccount myAcct = new BankAccount(100000,"Jar", "6969","Savings");
        CheckingAccount myChecking = new CheckingAccount(100000,"Jar", "6969", 50000);
        SavingsAccount mySavings = new SavingsAccount(300000,"Zar","2058",5);
//        System.out.println(myAcct.toString());
//        System.out.println(myChecking.toString());
        System.out.println(mySavings);
//        myAcct.deposit(1000000);
//        System.out.println(myAcct.toString());
        mySavings.deposit(100);
        System.out.println(mySavings);
//        myAcct.withdraw(1900);
        mySavings.withdraw(50);
        System.out.println(mySavings);
        mySavings.applyInterest();;
        System.out.println(mySavings);
//        myChecking.withdraw(20000);
//        System.out.println(myAcct.toString());
//        System.out.println(myChecking.toString());
//        myChecking.withdraw(50000);
//        System.out.println(myChecking.toString());
    }
}
