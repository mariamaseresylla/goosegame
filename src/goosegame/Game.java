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

    public int nextPosition(int n,Player player){
         int positionActuuel=player.getCell().getNumCell();
         int nextPosition=n+positionActuuel;
         int sizeBoard=this.board.getNbOfCells();
        if(nextPosition>sizeBoard){
            return sizeBoard-(nextPosition-sizeBoard);
        }
        return nextPosition;
         
    }
     public void play(){
        //verifier si c est possible de quitter canleave avnat
        for(Player player :this.thePlayers){
            int n=player.twoDiceThrow();
            Cell destiCell=this.board.getCell(this.nextPosition(n, player));
            player.changeCell(destiCell);
            if(destiCell.bound(n)!=0){
                int nextNum=this.nextPosition(destiCell.bound(n), player);
                player.changeCell(this.board.getCell(nextNum));
                //a finir demain

                



            }
            
        }    
        
         
     }
}
