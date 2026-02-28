package com.study;
import java.util.*;
import org.w3c.dom.ls.LSOutput;

//Write a method that uses lambda expression to format a given string, where a space is inserted between each character of string.
// For ex., if input is "CG", then expected output is "C G"
interface Spacable{
    String putSpace(String str);
}
public class Exercise_2 {
    public static void main(String[] args) {
        String str="Hello";
        Spacable s=(input)->{
           String strNew="";
           for(char ch: input.toCharArray()){
               strNew+=ch + " ";
           }
           return strNew.trim();
        };
        System.out.println(s.putSpace(str));
    }

}
