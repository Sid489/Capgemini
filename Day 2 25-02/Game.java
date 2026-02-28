package com.study;

public class Game{
    private String gameName;
    private String authorName;
    private float price;
    public Game(){};
    public Game(String gameName, String authorName, float price){
        this.gameName=gameName;
        this.authorName=authorName;
        this.price=price;
    }
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Game : "+gameName+" | Author : "+authorName+" | Price : "+price;
    }
}
