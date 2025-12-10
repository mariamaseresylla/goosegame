package goosegame;
//class cell
public abstract class Cell {
    //numero of cell
    protected int numCell;
    //the player
    protected Player player;
    //built the cell
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

    /**
     * return the player of the cell
     * @return
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * modifie the player of the cell
     * @param player the player of the cell 
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * celcul de bound of the cell 
     * @param dee the dee of the cell 
     * @return 
     */
    public int  bound(int dee){
        return 0;

    }
    /**
     * check if the player can leave the cell
     * @return if the player can leave 
     */
    public boolean canLeave(){
        return true;
    }

    /**
     * represantation of the cell
     * @return the representation of the cell
     */
    public String toSting(){
        return "je suis la cellule numero :"+this.numCell+"i containt :"+this.player;
    }
   

    
     


} 