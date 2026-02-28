package com.study;
//Write a method that uses lambda expression to accept username and password amd return true or false.
//(Hint: Use any custom values for username and password for authentication.)
@FunctionalInterface
interface Authenticable{
    boolean login(String user, String password);
}
public class Exercise_3 {
    public static void main(String[] args) {
        Authenticable auth=(user, pass)->user.equals("admin") && pass.equals("admin@123");

        System.out.println("1. Correct Pass :"+auth.login("admin","admin@123"));
    }
}
