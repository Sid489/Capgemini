package com.Day2.InterestCalculator;

public class SBAccount extends Account{
    private String accountType;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    double calculateInterest(){
        if(accountType.equalsIgnoreCase("NRI")) {
            setInterestRate(6.0);
        }
        else{
            setInterestRate(4.0);
        }
        return getAmount()*getInterestRate()/100;
    }
}
