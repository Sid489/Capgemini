package com.Day2.InterestCalculator;

abstract class Account {
    private double interestRate;
    private double amount;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) throws InvalidValueException{
        if(amount<0) throw new InvalidValueException("Invalid amount. Cannot be negative !!");
        this.amount = amount;
    }
    abstract double calculateInterest();
}
