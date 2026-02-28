package com.study;

@FunctionalInterface
public interface IValidate{
    boolean IsAuthenticated(String userid, String password);
}
