package com.study;

//Write a lambda expression which accepts x and y numbers and return x to the power y.
interface PowerOperation{
    int calculate(int x, int y);
}
public class Exercise_1 {
    public static void main(String[] args) {
         PowerOperation power= (x,y)->(int) Math.pow(x,y);
        System.out.println("2 to the power 3 is :" + power.calculate(2,3));
    }
}
