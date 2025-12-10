package goosegame;

public abstract class Cell {
    protected int numCell;
    protected Player player;
    public Cell(int numCell){
        this.numCell= numCell;
        this.player=null;
    }
    /***
     * return the number of  one cell
     */
     public int getNumCell() {
        return numCell;
    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public int  bound(int dee){
        return 0;

    }
  
    public boolean canLeave(){
        return true;
    }
    public String toSting(){
        return "je suis la cellule numero :"+this.numCell+"i containt :"+this.player;
    }
   

    
     


} 