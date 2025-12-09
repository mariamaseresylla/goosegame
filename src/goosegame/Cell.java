package goosegame;

public abstract class Cell {
    protected int numCell;
    protected Player pion;
    public Cell(int numCell){
        this.numCell= numCell;
        this.pion=null;
    }
    /***
     * return the number of  one cell
     */
    public  int getN(){
        return this.numCell;
    }
    
     


} 