package goosegame;

import java.util.ArrayList;
import java.util.List;

public class Game {
    protected List<Player> thePlayers;
    protected Board board;
    public Game(Board board){
        this.board=board ;
         this.thePlayers= new ArrayList<>();
    } 

    public boolean lastCell(Player p){
       return  this.board.getCell(63)== p.getCell();

        

    }

    public void addPlay(Player p){
        this.thePlayers.add(p);
    }
     public void play(){
        int i= 1;
        
         
     }
}
