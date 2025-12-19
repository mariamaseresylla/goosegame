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
       return  this.board.getCell(this.board.getNbOfCells()-1)== p.getCell();

        

    }

    public void addPlay(Player p){
        Cell startCell = this.board.getCell(0);
        p.changeCell(startCell);
        startCell.setPlayer(p);
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
    public void play() {
    boolean finished = false;

    while (!finished) {
        for (Player player : this.thePlayers) {

            Cell currentCell = player.getCell();
            boolean canPlay = currentCell.canLeave();

            // Si le joueur ne peut pas jouer, on passe à la suite naturellement
            if (canPlay) {
                int dice = player.twoDiceThrow();
                int nextIndex = nextPosition(dice, player);
                Cell destCell = board.getCell(nextIndex);

                int rebound = destCell.bound(dice);
                Cell finalCell = destCell;
                if (rebound != 0) {
                    int reboundIndex = nextPosition(rebound, player);
                    finalCell = board.getCell(reboundIndex);
                }

                // Gestion des collisions
                if (finalCell.getPlayer() != null) {
                    Player other = finalCell.getPlayer();
                    currentCell.setPlayer(other);
                    other.changeCell(currentCell);
                }

                // Déplacement du joueur
                currentCell.setPlayer(null);
                player.changeCell(finalCell);
                finalCell.setPlayer(player);

                System.out.println(player + " is in cell " + finalCell.getNumCell() + ", throws " + dice +
                                   (finalCell != destCell ? " and jumps to cell " + finalCell.getNumCell() : ""));
            } else {
                System.out.println(player + " is in cell " + currentCell.getNumCell() + ", cannot play.");
            }

            //Vérification de la victoire
            if (lastCell(player)) {
                System.out.println(player + " has won!");
                finished = true;
            }
        }
    }
}
    /**public void play(){
        boolean finished= false ;
        while(!finished){
        //verifier si c est possible de quitter canleave avnat
        for(Player player :this.thePlayers){
            System.out.println("j ai"+ player.toString());
            int n=player.twoDiceThrow();
            Cell destiCell=this.board.getCell(this.nextPosition(n, player));

            if (player.getCell().canLeave()){   //si on peut bouger
                if (destiCell.getPlayer()!=null){      //si y a un joueur a la destination 
                    destiCell.getPlayer().changeCell(player.getCell()); //le jeur a la destination est renvoye a la cell u player
                    player.changeCell(destiCell);  //le player recupere sa cell de destination
                }
                else{
                    player.changeCell(destiCell);
                }
                if(destiCell.bound(n)!=0){  //gestion des consequences sur ces ca
                    int nextNum=this.nextPosition(destiCell.bound(n), player);
                    player.changeCell(this.board.getCell(nextNum));
                        
        
                }
                
         }

            }
            
        }    
        System.out.println("victoire de");
        
         
     }*/


     
}
