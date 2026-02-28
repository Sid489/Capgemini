package com.Day2.InterestCalculator;

public class FDAccount extends Account{
    private int noOfDays;
    private int ageOfACHolder;

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
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
        if(getAmount()<10000000){
            if (noOfDays >= 7 && noOfDays <= 14) rate = (ageOfACHolder >= 60) ? 5.00 : 4.50;
            else if (noOfDays >= 15 && noOfDays <= 29) rate = (ageOfACHolder >= 60) ? 5.25 : 4.75;
            else if (noOfDays >= 30 && noOfDays <= 45) rate = (ageOfACHolder >= 60) ? 6.00 : 5.50;
            else if (noOfDays >= 46 && noOfDays <= 60) rate = (ageOfACHolder >= 60) ? 7.50 : 7.00;
            else if (noOfDays >= 61 && noOfDays <= 184) rate = (ageOfACHolder >= 60) ? 8.00 : 7.50;
            else if (noOfDays >= 185 && noOfDays <= 365) rate = (ageOfACHolder >= 60) ? 8.50 : 8.00;
        }
        else{
            if (noOfDays >= 7 && noOfDays <= 14) rate = 6.50;
            else if (noOfDays >= 15 && noOfDays <= 29) rate = 6.75;
            else if (noOfDays >= 30 && noOfDays <= 45) rate = 6.75;
            else if (noOfDays >= 46 && noOfDays <= 60) rate = 8.00;
            else if (noOfDays >= 61 && noOfDays <= 184) rate = 8.50;
            else if (noOfDays >= 185 && noOfDays <= 365) rate = 10.00;
        }
        setInterestRate(rate);
        return getAmount()*getInterestRate()/100;
    }
}
