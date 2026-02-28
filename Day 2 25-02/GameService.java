package com.study;

import java.util.*;

public class GameService {
    private static ArrayList<Game> games;
    public GameService(){
        games=new ArrayList<>();
        games.add(new Game("SnowBird","Danny",300f));
        games.add(new Game("FreshFood","Ram",450f));
        games.add(new Game("Batsman","Kate",400f));
        games.add(new Game("Pokiman","Steeve",600f));
        games.add(new Game("YammyTommy","Narayan",350f));
    }
    public List<Game> viewAll(){
        return games;
    }
    public String authorSearch(String author){
        for(Game game:games) {
            if (game.getAuthorName().equalsIgnoreCase(author)) return game.getGameName();
        }
        return "NOT FOUND";

    }
}
