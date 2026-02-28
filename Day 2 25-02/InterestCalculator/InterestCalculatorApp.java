package com.Day2.InterestCalculator;
import java.util.Scanner;
public class InterestCalculatorApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean running=true;
        while(running){
            System.out.println("\n Select the option: ");
            System.out.println("1. Interest Calculator -SB");
            System.out.println("2. Interest Calculator -FD");
            System.out.println("3. Interest Calculator -RD");
            System.out.println("4. Exit");

            try {
                int ch = sc.nextInt();
                switch (ch) {
                    case 1:
                        SBAccount sb = new SBAccount();
                        System.out.print("Enter the average amount of your account: ");
                        double sbAmount = sc.nextDouble();
                        sb.setAmount(sbAmount);
                        System.out.print("Enter the type of account [NRI/Normal]: ");
                        String acType = sc.next();
                        sb.setAccountType(acType);
                        System.out.printf("Interest gained is : Rs. %.0f\n", sb.calculateInterest());
                        break;
                    case 2:
                        FDAccount fd = new FDAccount();
                        System.out.print("Enter the FD amount: ");
                        double fdAmount = sc.nextDouble();
                        fd.setAmount(fdAmount);
                        System.out.print("Enter the no. of days : ");
                        int days = sc.nextInt();
                        if (days < 0)
                            throw new InvalidValueException("Invalid number of days!! Please enter correct values.");
                        fd.setNoOfDays(days);
                        System.out.print("Enter the age of account holder: ");
                        int age = sc.nextInt();
                        if (age < 0) throw new InvalidValueException("Invalid age !! Please enter correct values.");
                        fd.setAgeOfACHolder(age);
                        System.out.printf("Interest gained is : Rs. %.0f\n", fd.calculateInterest());
                        break;
                    case 3:
                        RDAccount rd = new RDAccount();
                        System.out.print("Enter the RD monthly amount: ");
                        double rdAmount = sc.nextDouble();
                        rd.setMonthlyAmount(rdAmount);
                        System.out.print("Enter the no. of months: ");
                        int months = sc.nextInt();
                        if (months < 0)
                            throw new InvalidValueException("Invalid number of months !! Please enter correct values");
                        rd.setNoOfMonths(months);
                        System.out.print("Enter the age of account holder: ");
                        int rdAge = sc.nextInt();
                        if (rdAge < 0) throw new InvalidValueException("Invalid age !! Please enter correct values");
                        rd.setAgeOfACHolder(rdAge);
                        System.out.printf("Interest gained is : %.2f\n", rd.calculateInterest());
                        break;
                    case 4:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option !! Please select a valid number from the options.");
                }
            }
            catch(InvalidValueException e){
                System.out.println(e.getMessage());
            }catch(Exception e){
                System.out.println("Invalid input format!! Please enter numerical values");
                sc.nextLine();
            }
        }
        sc.close();
    }
}
