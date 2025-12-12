package goosegame.cell;
import goosegame.*;
//class cellgoose
public class CellGoose extends Cell {
    //build cellgoose
    public CellGoose(int numCell){
        super(numCell);
    }
    /**
     * return the number of bound 
     */
    public int bound(int dee){
        return dee; //a modifier c est pas 2*dee c seulement dee relis le sujet
    }
    
}
