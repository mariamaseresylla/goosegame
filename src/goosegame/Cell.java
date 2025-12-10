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
    public int  Bound(int dee){
        return 0;

    }
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
   

    
     


} 