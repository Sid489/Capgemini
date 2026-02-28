package com.Day2.InterestCalculator;

public class RDAccount extends Account{
    private int noOfMonths;
    private double monthlyAmount;
    private int ageOfACHolder;
    public int getNoOfMonths() {
        return noOfMonths;
    }

    public void setNoOfMonths(int noOfMonths) {
        this.noOfMonths = noOfMonths;
    }

    public double getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(double monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }

    public int getAgeOfACHolder() {
        return ageOfACHolder;
    }

    public void setAgeOfACHolder(int ageOfACHolder) {
        this.ageOfACHolder = ageOfACHolder;
    }
    @Override
    double calculateInterest(){
        double rate=0;
        if (noOfMonths == 6) {
            rate = (ageOfACHolder >= 60) ? 8.00 : 7.50;
        } else if (noOfMonths == 9) {
            rate = (ageOfACHolder >= 60) ? 8.25 : 7.75;
        } else if (noOfMonths == 12) {
            rate = (ageOfACHolder >= 60) ? 8.50 : 8.00;
        } else if (noOfMonths == 15) {
            rate = (ageOfACHolder >= 60) ? 8.75 : 8.25;
        } else if (noOfMonths == 18) {
            rate = (ageOfACHolder >= 60) ? 9.00 : 8.50;
        } else if (noOfMonths >= 21) {
            rate = (ageOfACHolder >= 60) ? 9.25 : 8.75;
        }
        setInterestRate(rate);
        double p=getMonthlyAmount();
        int n=getNoOfMonths();
        return p*(n*(n+1)/2.0)*(rate/1200.0);
    }
}
