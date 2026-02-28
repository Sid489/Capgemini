package com.study;

public class User implements IValidate{
    private String userid;
    private String password;
    public User(){};
    public void addUser(String userid, String password){
        this.userid=userid;
        this.password=password;
        System.out.println("User registered successfully");
    }
    @Override
    public boolean IsAuthenticated(String inputUserId, String inputPassword){
        if(this.userid==null || this.password==null) return false;
        return this.userid.equals(inputUserId) && this.password.equals(inputPassword);
    }
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
