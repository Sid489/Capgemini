package com.study;
//Write a method to calculate factorial of a number. Test this method using method reference feature.
@FunctionalInterface
interface Solvable{
    int findFact(int num);
}
class Factorial{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int factorial(int num){
        if(num==1) return 1;
        return num*factorial(num-1);
    }
}
public class Exercise_5 {
    public static void main(String[] args) {
        Factorial fact=new Factorial();
        fact.setNum(9);
        Solvable solv=fact::factorial;
        System.out.println(solv.findFact(9));

    }
}
